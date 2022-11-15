package com.iamvickyav.dockerdemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MyController {
	private static final Logger log = LoggerFactory.getLogger(MyController.class);

    @RequestMapping(value = "/index")
    public String hello(Model model, @RequestParam(value="name") String name) {
		log.info("----------hello----- name-------"+name);

        model.addAttribute("name", name);
        return "index";
    }
}


