package com.sy;


import com.sy.common.model.Role;

import com.sy.zlk.repository.RoleRepository;
import com.sy.zlk.repository.UserRepository;
import com.sy.zlk.service.RoleService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;


@SpringBootTest(classes = ProjectApplication.class)
class ProjectApplicationTests {
@Autowired
UserRepository repository;
@Autowired
RoleRepository roleRepository;
@Autowired
    RoleService service;
    @Test
    void contextLoads() {

        int i = service.deleteById ( 6 );
        System.out.println (i);
    }
    @Test
     void save() {
        Pageable pageable = PageRequest.of ( 0, 4 );
        Page<Role> all = roleRepository.findAll ( pageable );
        Iterator<Role> iterator = all.iterator ();
        System.out.println ( all.getSize () );
        while (iterator.hasNext ()) {
            System.out.println ( iterator.next ().getId () );
        }
    }
        @Test
        void saveall() throws ParseException {
            Role role=new Role ();
            role.setId ( 2 );
            role.setCreateBy ( "admin" );
            role.setRoleCode ( "s1_role06" );
            role.setRoleName ( "游客" );
            SimpleDateFormat sdf=new SimpleDateFormat ( "yyyy-MM-dd" );

            role.setCreateDate (    sdf.parse ( "2014-04-08" ) );
            role.setIsStart ( 0 );
            Role save = roleRepository.save ( role );
            System.out.println (save);

    }

}
