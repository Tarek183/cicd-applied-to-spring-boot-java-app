package com.cicd.cicdappliedtospringbootjavaapp;

import com.cicd.cicdappliedtospringbootjavaapp.controller.HelloController;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CicdAppliedToSpringBootJavaAppApplicationTests {

	@Autowired
	private HelloController helloController;

	@Test
	void contextLoads() {
		Assert.assertEquals("Hello World from DZONE",helloController.home() );
	}

}