package com.spring.api.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ping")
public class PingController {
	
	public void ping(){
		System.out.println("Tudo funcionando");
	}
	
	

}
