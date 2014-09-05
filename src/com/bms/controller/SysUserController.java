package com.bms.controller;

import java.io.StringWriter;
import java.io.Writer;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bms.pojo.SysUser;
import com.bms.service.SysUserService;
import com.fasterxml.jackson.databind.ObjectMapper;

@Controller
@RequestMapping("user")
public class SysUserController {
	
	public static Logger logger = LogManager.getLogger(SysUserController.class);

	@Autowired
	private SysUserService sysUserService;
	
	@RequestMapping("login")
	@ResponseBody
	public String login(@RequestParam String name, 
						@RequestParam String password) {
		Writer writer = null;
		try {
			SysUser sysUser = sysUserService.login(name, password);
			
			ObjectMapper mapper = new ObjectMapper();
			writer = new StringWriter();
			mapper.writeValue(writer, sysUser);
		} catch (Exception e) {
			logger.error("Error in SysUserController.login while change a SysUser to Json!", e);
		}
		
		return writer.toString();
	}
	
}
