package com.bms.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bms.mapper.SysUserMapper;
import com.bms.pojo.SysUser;
import com.bms.service.SysUserService;

@Service
public class SysUserServiceImpl implements SysUserService {
	
	@Autowired
	private SysUserMapper sysUserMapper;

	@Override
	public SysUser login(String name, String password) {
		SysUser sysUser = new SysUser();
		sysUser.setName(name);
		sysUser.setPassword(password);
		
		return sysUserMapper.login(sysUser);
	}

}
