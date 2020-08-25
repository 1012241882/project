package com.sy.zlk.service;

import com.sy.common.model.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;


public interface RoleService {
    int deleteById(Integer id);
    List<Role> findAllBy();
    Page<Role> findAll(Integer pageNow,Integer pageSize);
    Role save(Role role);

}
