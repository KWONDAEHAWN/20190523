package kr.gudi.web;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.gudi.web.HomeController;

@Controller
@RequestMapping("/board")
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	

	@RequestMapping("/select")   //없으면 get방식 post방식을 동시에 써줌
	public String select() {
		logger.info("Welcome home! The client locale is {}."+ 1 + ",");
		
		return "home";
	}
	@RequestMapping("/insert")   //없으면 get방식 post방식을 동시에 써줌
	public String insert() {
		logger.info("Welcome home! The client locale is {}.", 1);
		
		return "home";
	}
	@RequestMapping("/")   //없으면 get방식 post방식을 동시에 써줌
	public String update() {
		logger.info("Welcome home! The client locale is {}.", 1);
		
		return "home";
	}
	@RequestMapping("/delete")   //없으면 get방식 post방식을 동시에 써줌
	public String delete() {
		logger.info("Welcome home! The client locale is {}.", 1);
		
		return "home";
	}
}
