package com.mango.action;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mango.service.UserService;
import com.mango.utils.OAResult;

@Controller
public class UserAction {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping(value={"/","/login"})
	public String loginUI() {
		
		return "login/login";
	}
	
	@ResponseBody
	@RequestMapping("/checkLogin")
	public OAResult checkLogin(String username,String password,HttpSession session) {
		
		OAResult oaResult = userService.getDataByUserData(username, password);
		
		if (oaResult.getStatus()==200) {
			session.setAttribute("loginsuccess", oaResult.getData());
		}
		return oaResult;
		
	}
	
	
}
