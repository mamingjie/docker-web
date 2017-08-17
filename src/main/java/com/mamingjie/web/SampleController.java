package com.mamingjie.web;

import com.mamingjie.domain.User;
import com.mamingjie.domain.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SampleController {

	Logger log = LoggerFactory.getLogger(SampleController.class);

	@Autowired
	UserRepository userRepository;

	@RequestMapping("/")
	@ResponseBody
	public String main() {
		return "hello!";
	}

	@RequestMapping("/test")
	@ResponseBody
	public String test() {
		System.out.println("13");
		return "test!";
	}

	@RequestMapping("/findUser")
	@ResponseBody
	public User findUser(String name, Integer sex) {
		System.out.println("13");
		User user = userRepository.findByNameAndSex(name, sex);
		log.debug("user: ", user);
		return user;
	}
}
