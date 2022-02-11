package com.lihlemaabane.springboottodo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


@SpringBootTest
class SpringBootTodoListApplicationTests {
	
	@Autowired
	MockMvc mockMvc;


	@Test
	void contextLoads() throws Exception {
		
		mockMvc.perform(get("/best/user"))
		.andExpect(status().is(200))
		.andExpect(content().string("Lihle"));

	}
	
}


