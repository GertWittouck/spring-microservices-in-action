package com.gwi.microservices.simpleservice;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class SimpleserviceApplicationTests {

	private MockMvc mockMvc;

	@BeforeEach
	void setUp() {
		mockMvc = MockMvcBuilders.standaloneSetup(SimpleserviceApplication.class).build();
	}

	@Test
	void contextLoads() {
	}

	@Test
	void hello() throws Exception {
		MvcResult mvcResult = mockMvc.perform(MockMvcRequestBuilders.get("/hello/test/user"))
				.andReturn();

		assertThat(mvcResult.getResponse()).isNotNull();
		assertThat(mvcResult.getResponse().getStatus()).isEqualTo(200);
		assertThat(mvcResult.getResponse().getContentAsString()).isEqualTo("{\"message\": \"Hello test user\"}");
	}
}
