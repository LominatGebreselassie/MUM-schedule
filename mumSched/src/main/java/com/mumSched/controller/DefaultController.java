/*
package com.mumSched.controller;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class DefaultController {

	@RequestMapping(value="/",method = RequestMethod.GET)
	  public String handleRequest2(@AuthenticationPrincipal final UserDetails userDetails ) {
	
	      return "home";
	}
	
    @GetMapping("/home")
    public String home() {
        return "/home";
    }

    @GetMapping("/admin")
    public String admin() {
        return "/admin";
    }

    @GetMapping("/user")
    public String user() {
        return "/user";
    }

    @GetMapping("/about")
    public String about() {
        return "/about";
    }

 
    @GetMapping("/403")
    public String error403() {
        return "/error/403";
    }
}*/
