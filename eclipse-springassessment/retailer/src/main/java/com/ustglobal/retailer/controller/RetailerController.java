package com.ustglobal.retailer.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttribute;

import com.ustglobal.retailer.dto.Product;
import com.ustglobal.retailer.dto.RetailerBean;
import com.ustglobal.retailer.service.RetailerService;

@Controller
public class RetailerController {
	
	@Autowired
	private RetailerService service;
	
	@GetMapping("/login")
	public String loginPage() {
		return "login";
	}
	@PostMapping("/login")
	public String login(int id, String password,HttpServletRequest request) {
		RetailerBean bean = service.login(id, password);
		if(bean==null) {
			request.setAttribute("msg", "Invalid Credentials");
			return "login";
		}else {
			HttpSession session = request.getSession();
			session.setAttribute("bean", bean);
			return "home";
			
		}
	}// end of login()
	@GetMapping("/register")
	public String registerPage() {
		return "register";
	}
	@PostMapping("/register")
	public String register(RetailerBean bean,ModelMap map) {
		int check = service.createProfile(bean);
		if(check>0) {
			map.addAttribute("msg", "You are Registered and ID is "+check);
		}else {
			map.addAttribute("msg", "Email is repeated");
		}
		return "login";
		
		
	}//end of register
	
	@GetMapping("/home")
	public String home(ModelMap map,@SessionAttribute(name="bean", required=false) Product bean) {
		if(bean==null) { 
			map.addAttribute("msg", "Login First");
			return "login";
		}else {
			return "home";
		}
		
	}
	
	@PostMapping(path="/home")
	public String home() {
		return "home";
		}// end of home()
	
	@GetMapping("/search")
	public String search(@RequestParam("pid")int pid,ModelMap map) {
		Product bean = service.search(pid);
		if(bean==null) {
			map.addAttribute("msg","Data not found");
		}else {
			map.addAttribute("bean",bean);
		}
		return "home";
		
	}// end of search
	@GetMapping("/changepassword")
	public String changePassword(HttpServletRequest request) {
		HttpSession session = request.getSession(false);
		if(session!=null) {
		return "changepassword";
		}else {
			return "login";
		}
	}
	
	@PostMapping("/changepassword")
	public String changePassword(ModelMap map,String password,String confirmpassword,@SessionAttribute(name="bean")RetailerBean bean) {
		if(password.equals(confirmpassword)) {
			service.changePassword(bean.getId(), password);
			map.addAttribute("msg", "Password changed");
		}else {
			map.addAttribute("msg", "Password not matching");
		}
		return "home";
	}
	
	
	@GetMapping("/logout")
	public String logout(HttpSession session) {
		session.invalidate();
		return "login";
		
	}//end of logout
	
}
