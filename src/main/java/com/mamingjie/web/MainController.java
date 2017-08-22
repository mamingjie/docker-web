package com.mamingjie.web;

import java.util.Date;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

	Logger log = LoggerFactory.getLogger(MainController.class);

	@RequestMapping("/")
	public String main(Map<String, Object> model) {
		model.put("time", new Date());
		model.put("message", "hello!");
		return "welcome";
	}
}
