package com.mamingjie.web;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mamingjie.criteria.UserSearchCriteria;
import com.mamingjie.domain.User;
import com.mamingjie.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {

	@Autowired
	UserService userService;

	@RequestMapping("/manage")
	public String manage(Map<String, Object> model) {
		model.put("loginUser", userService.findUserById(1L));
		return "user/manage";
	}

	@RequestMapping("/add")
	public @ResponseBody User add(User user) {
		return userService.saveUser(user);
	}

	@RequestMapping("/find")
	public @ResponseBody Page<User> find(UserSearchCriteria criteria) {
		return userService.findUser(criteria);
	}
}
