package com.sy.zlk.controller;

import com.sy.common.model.Role;
import com.sy.common.model.base.BaseResult;
import com.sy.zlk.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/role")
public class RoleController {
    @Autowired
    private RoleService service;
    //删除role
    @RequestMapping("/remove.do")
    public BaseResult deleteById(Integer id) {
        int i = service.deleteById ( id );
        BaseResult baseResult = new BaseResult ();
        if (i > 0) {
            baseResult.setCode ( 0 );
            baseResult.setMsg ( "删除成功" );
        } else {
            baseResult.setCode ( 1 );
            baseResult.setMsg ( "删除失败" );
        }
        return baseResult;
    }
 //查询全部role
    @RequestMapping("/list.do")
    public BaseResult findAllBy() {
        BaseResult baseResult = new BaseResult ();
        List<Role> allBy = service.findAllBy ();
        baseResult.setData ( allBy );
        return baseResult;
    }

    //分页查询role
    @RequestMapping("/page.do")
    public BaseResult findAll(Integer page, Integer limit) {
        Page<Role> all = service.findAll ( page, limit );
        BaseResult baseResult = new BaseResult ();
        baseResult.setCount ( all.getTotalPages () );
        baseResult.setCode ( 0 );
        baseResult.setData ( all.getContent () );
        baseResult.setLimit ( limit );

        baseResult.setPage ( page );
        return baseResult;

    }

    //增加和修改都用jpa的save方法
    @RequestMapping("/modify.do")
    public BaseResult modify(Role role) {
        Role save = service.save ( role );
        BaseResult baseResult = new BaseResult ();
        if (save != null) {
            baseResult.setCode ( 0 );
            baseResult.setMsg ( "修改或增加成功" );
        } else {
            baseResult.setCode ( 1 );
            baseResult.setMsg ( "修改或增加失败" );
        }
        return baseResult;
    }
}
