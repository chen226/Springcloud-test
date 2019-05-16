package com.test.auth.security;

import com.chj.common.utils.BeanMapper;
import com.test.auth.entity.SysRole;
import com.test.auth.entity.SysUser;
import com.test.auth.service.SysRoleService;
import com.test.auth.service.SysUserService;
import com.test.auth.vo.SysRoleVo;
import com.test.auth.vo.SysUserVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.DisabledException;
import org.springframework.security.authentication.LockedException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * @author chenhj
 * @version V1.0
 * @Description: oauth用户实现
 * @date 2018/1/16.
 */
@Service
public class SecurityUserDetailsServiceImpl implements UserDetailsService {
    @Autowired
    private SysUserService sysUserService;
    @Autowired
    private SysRoleService sysRoleService;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        SysUserVo user =  sysUserService.findUserByUserName(username);
        if(user==null){
            throw new UsernameNotFoundException("用户不存在");
        }
        if(!user.isEnabled()){
            throw new DisabledException("账户不可用");
        }
        /*预留*/
        if(!user.isEnabled()){
            throw new LockedException("账户锁定");
        }
        List<SysRole> sysRoleList=sysRoleService.findRoleByUserId(user.getId());
        user.setAuthorities(BeanMapper.mapAsList(sysRoleList,SysRoleVo.class));
        return user;
    }

}
