package com.bwf.controller;



import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bwf.entity.User;

@Controller
@RequestMapping(value="user")
public class UserController {

	@RequestMapping(value={"inde","ind"},
					method={RequestMethod.GET,RequestMethod.POST}
			)
	public String index(){
			
		return "test";
	}
	
	@RequestMapping(value="test")
	public String test(){
		System.out.println("test111111");
		return"test1";
	}
	@RequestMapping(value="add",
					method=RequestMethod.GET
			)
	public String add(){
		
		return"user/add";
	}
	@RequestMapping(value="adduser" ,
			method=RequestMethod.POST ,
			consumes="application/json"
			)

	public void adduser(@RequestBody User user){
		System.out.println("adduser");
		System.out.println(user);
	}
	
	@RequestMapping(value="addAjax",method=RequestMethod.GET)
	public String userAjax(){
		return "user/addAjax";
	}
}
