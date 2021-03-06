package com.wxx.springbootvue.system.service;

import com.github.pagehelper.PageInfo;
import com.wxx.springbootvue.system.domain.po.Role;
import com.wxx.springbootvue.system.domain.po.User;
import org.springframework.security.core.GrantedAuthority;

import java.util.Collection;
import java.util.List;

/**
 * @author 她爱微笑
 * @date 2020/3/14
 */
public interface RoleService {

    /**
     * 获取角色列表
     * @return
     */
    List<Role> getRoleList();

    /**
     * 分页查询角色信息
     * @param pageInfo 分页对象
     * @return /
     */
    List<Role> getRoleList(PageInfo pageInfo);

    /**
     * 获取当前用户被授予的权限
     * @param user
     * @return
     */
    Collection<GrantedAuthority> getGrantedAuthorities(User user);
}
