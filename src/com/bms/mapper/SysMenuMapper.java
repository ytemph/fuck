package com.bms.mapper;

import java.util.List;

import com.bms.pojo.SysMenu;
import com.bms.pojo.SysRole;

public interface SysMenuMapper {
	
	public List<SysMenu> findMenuByRole(SysRole sysRole);

}
