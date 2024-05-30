package com.spring.login.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LoginController {

//	@Autowired
//	private LoginService loginService;
	
	
	//lcoalhost://8080/login
	@GetMapping("/login")
	public String login() {
		return "login";
	}
	@PostMapping("/success")
    public String success() {
        return "success";
    }
}
