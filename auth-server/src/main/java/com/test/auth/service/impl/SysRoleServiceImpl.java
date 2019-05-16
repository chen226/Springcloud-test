package com.test.auth.service.impl;

import com.chj.common.utils.BeanMapper;
import com.test.auth.entity.SysRole;
import com.test.auth.entity.SysUser;
import com.test.auth.repository.SysRoleMapper;
import com.test.auth.repository.SysUserMapper;
import com.test.auth.service.SysRoleService;
import com.test.auth.vo.SysUserVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author chenhj
 */
@Slf4j
@Service
public class SysRoleServiceImpl implements SysRoleService {
    @Autowired
    private SysRoleMapper sysRoleMapper;

    @Override
    public List<SysRole> findRoleByUserId(Long userId) {
        return sysRoleMapper.findRoleByUserId(userId);
    }
}
