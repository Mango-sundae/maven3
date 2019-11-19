package com.mango.action;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ExitSystemAction {
	
	@RequestMapping("/exitSystem")
	public void exitSystemUI(HttpSession session, HttpServletResponse response, HttpServletRequest request) throws Exception {
		
		session.invalidate();
		
		response.getWriter().println("<script>window.top.location='"+request.getContextPath()+"/login'</script>");
	}
	
}
