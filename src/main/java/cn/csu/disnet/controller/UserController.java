package cn.csu.disnet.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.csu.disnet.dao.UserDao;

@Controller
public class UserController {
	
	@Autowired
	private UserDao userDao;
	
	/*
	 * 查找所用的用户
	 */
	@RequestMapping(value="/getAllUsers")
	public String getAllUsers() {
		
		System.out.println("获取所用用户——controller");
		userDao.findAllUsers();
		
		return "result";
	}
	

}
