package com.test.auth.service;

import com.test.auth.entity.SysRole;

import java.util.List;

public interface SysRoleService {

    List<SysRole> findRoleByUserId(Long id);
}
