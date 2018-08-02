package com.addonusa.rmsapp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sun.javafx.collections.MappingChange.Map;

@Controller
public class HomeController {
	
	  @RequestMapping("/")
	    public String homett(Map<String, Object> model) {
	        return "Addon";
	    }
	}