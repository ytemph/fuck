package com.bms.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bms.pojo.SysRole;
import com.bms.service.SysMenuService;

@Controller
@RequestMapping("menu")
public class SysMenuController {
	
	public static Logger logger = LogManager.getLogger(SysMenuController.class);

	@Autowired
	private SysMenuService menuService;
	
	@RequestMapping("get_menu")
	@ResponseBody
	public String getMenu() {
		SysRole sysRole = new SysRole();
		sysRole.setRoleID("PRS");
		return menuService.findMenuByRole(sysRole);
		//return "[{\"id\": 1,\"text\": \"Node 1\",\"state\": \"closed\",\"children\": [{\"id\": 11,\"text\": \"Node 11\"},{\"id\": 12,\"text\": \"Node 12\"}]},{\"id\": 2,\"text\":\"Node 2\",\"state\":\"closed\"},{\"id\": 3,\"text\":\"Node 3\",\"state\":\"closed\"}]";
	}

}
