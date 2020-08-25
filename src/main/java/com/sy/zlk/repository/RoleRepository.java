package com.sy.zlk.repository;


import com.sy.common.model.Role;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Transactional
public interface RoleRepository extends JpaRepository<Role,Long> {
     Long deleteById(Integer id);
     List<Role> findAllBy();
     Page<Role> findAll(Pageable pageable);


}
