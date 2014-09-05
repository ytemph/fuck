package com.bms.service.impl;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bms.mapper.SysMenuMapper;
import com.bms.pojo.SysMenu;
import com.bms.pojo.SysRole;
import com.bms.service.SysMenuService;
import com.bms.util.SysUtil;

@Service
public class SysMenuServiceImpl implements SysMenuService {
	
	public static Logger logger = LogManager.getLogger(SysMenuServiceImpl.class);
	
	@Autowired
	private SysMenuMapper sysMenuMapper;

	public void fuck() {
		System.out.println("Fuck");
	}

	@Override
	public String findMenuByRole(SysRole sysRole) {
		List<SysMenu> menus = sysMenuMapper.findMenuByRole(sysRole);
		String menuString = null;
		try {
			menuString = SysUtil.menuTurnJsonForEasyUI(menus);
		} catch (Exception e) {
			logger.error("Error in SysMenuServiceImpl.findMenuByRole() while turn the menus to json!", e);
		}
		return menuString;
	}

}
