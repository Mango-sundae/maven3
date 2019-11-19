package com.mango.action;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainAction {

	
	@RequestMapping("/main")
	public String mainUI() {
		
		return "main/main";
		
	}
	
	@RequestMapping("/main/top")
	public String topUI() {
		
		return "main/top";
		
	}
	
	@RequestMapping("/main/left")
	public String leftUI() {
		
		return "main/left";
		
	}
	
	@RequestMapping("/main/center")
	public String centerUI() {
		
		return "main/center";
		
	}
	
	@RequestMapping("/main/down")
	public String downUI() {
		
		return "main/down";
		
	}
}
