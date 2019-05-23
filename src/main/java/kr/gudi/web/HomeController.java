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
	

	@RequestMapping("/select")   //������ get��� post����� ���ÿ� ����
	public String select() {
		logger.info("Welcome home! The client locale is {}."+ 1 + ",");
		
		return "home";
	}
	@RequestMapping("/insert")   //������ get��� post����� ���ÿ� ����
	public String insert() {
		logger.info("Welcome home! The client locale is {}.", 1);
		
		return "home";
	}
	@RequestMapping("/")   //������ get��� post����� ���ÿ� ����
	public String update() {
		logger.info("Welcome home! The client locale is {}.", 1);
		
		return "home";
	}
	@RequestMapping("/delete")   //������ get��� post����� ���ÿ� ����
	public String delete() {
		logger.info("Welcome home! The client locale is {}.", 1);
		
		return "home";
	}
}
