package com.gwi.microservices.simpleservice;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MockMvcBuilder;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.result.StatusResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.assertj.core.api.Assertions.*;

@SpringBootTest
class SimpleserviceApplicationTests {

	private SimpleserviceApplication testable;

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
