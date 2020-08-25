package com.sy.zlk.service.impl;

import com.sy.common.model.Role;
import com.sy.zlk.repository.RoleRepository;
import com.sy.zlk.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(isolation = Isolation.DEFAULT)
public class RoleServiceImpl implements RoleService {
    @Autowired
    private RoleRepository roleRepository;

    @Override
    public int deleteById(Integer id) {
        Long aLong = roleRepository.deleteById ( id );
        int i = aLong.intValue ();
        return i;
    }

    @Override
    public List<Role> findAllBy() {
        return findAllBy ();
    }

    @Override
    public Page<Role> findAll(Integer pageNow, Integer pageSize) {
        Pageable pageable= PageRequest.of (pageNow,pageSize);
        Page<Role> all = roleRepository.findAll ( pageable );
        return all;
    }
//role增加和修改
    @Override
    public Role save(Role role) {
        Role save = roleRepository.save ( role );
        return save;
    }
}
