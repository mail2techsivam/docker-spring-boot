package com.example.demo.service;

import java.util.Date;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestService {

	@RequestMapping("/rest/test")
	public String sendTestDta() {

		return "Test : " + new Date();
	}
}
