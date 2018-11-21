package com.mumSched.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.UsesSunHttpServer;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mumSched.model.UserProfile;
import com.mumSched.repository.UserRepository;
import com.mumSched.services.UserServices;

@Controller
public class ApplicationController {
	
	@Autowired
	private UserServices userservice;
	
	@RequestMapping("/welcome")
	public String Welcome(HttpServletRequest request) {
		request.setAttribute("mode", "MODE_HOME");
		return "welcomepage";
	}
	
	@RequestMapping("/logout")
	public String Logout(HttpSession session) {
		session.removeAttribute("session");
		return "login";
	}
	
	@RequestMapping("/register")
	public String Registration(HttpServletRequest request) {
		request.setAttribute("mode", "MODE_REGISTER");
		return "welcomepage";
	}
	
	@PostMapping("/save-user")
	public String registeruser(@ModelAttribute UserProfile user, BindingResult bindingresult, HttpServletRequest request){
		userservice.saveMyUser(user);
		request.setAttribute("mode", "MODE_HOME");
		return "welcomepage";
	}
	
	@RequestMapping(value = {"/login", "/",""})
	public String Login() {
		return "login";
	}
	
	@RequestMapping("/login-user")
	public String LoginUser(@RequestParam String username, @RequestParam String password, HttpServletRequest request, HttpServletResponse response) {
		if(userservice.LoginUser(username, password)) {
			request.setAttribute("mode", "MODE_HOME");
			HttpSession session = request.getSession();
			session.setAttribute("username", username);
			return "welcomepage";
		}else {
			request.setAttribute("error", "Invalid Username or Password");
			return "login";
		}
	}
	
	@GetMapping("/show-users")
	public String AllUsers(HttpServletRequest request) {
		request.setAttribute("users", userservice.showAllUser());
		request.setAttribute("mode", "MODE_USERS");
		return "welcomepage";
	}
	
	@RequestMapping("/view-schedule")
	public String ShowSchedule(HttpSession session, HttpServletRequest request, HttpServletResponse response) {
		request.setAttribute("username", session.getAttribute("username"));
		request.setAttribute("mode", "ADD_SCHEDULE");
		return "welcomepage";
	}
	
	
	@RequestMapping("/delete-user")
	public String deleteUser(@RequestParam int id, HttpServletRequest request) {
		
		userservice.deleteuser(id);
		request.setAttribute("users", userservice.showAllUser());
		request.setAttribute("mode", "MODE_USERS");
		return "welcomepage";
	}
	
	@RequestMapping("/edit-user")
	public String findUser(@RequestParam int id, HttpServletRequest request) {
		request.setAttribute("user", userservice.editUser(id));
		request.setAttribute("mode", "MODE_UPDATE");
		return "welcomepage";
	}

}
