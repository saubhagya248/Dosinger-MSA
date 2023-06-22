package com.Dosinger.userservice;


import org.junit.jupiter.api.Test;

import com.Dosinger.userservice.Controller.userController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;

import org.springframework.beans.factory.annotation.Value;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class ContextTest {

	@Autowired
	userController controller;


	//test the context if the app is able to load the controller
	@Test
	void contextLoads() {
		assertThat(controller).isNotNull();
	}

}
