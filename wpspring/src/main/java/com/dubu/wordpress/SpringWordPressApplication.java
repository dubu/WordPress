package com.dubu.wordpress;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@SpringBootApplication
@Controller
public class SpringWordPressApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringWordPressApplication.class, args);
	}

	@RequestMapping("/bb")
	public String bb(){
		return  "bb";
	}

	@RequestMapping("/")
	public String defaultIndex(Map<String, Object> model){

		model.put("nickname","dubuAA");

		return  "/twentyeleven/index";
	}

}
