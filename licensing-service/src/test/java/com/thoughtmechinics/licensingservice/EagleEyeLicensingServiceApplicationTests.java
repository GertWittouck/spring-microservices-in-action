package com.thoughtmechinics.licensingservice;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class EagleEyeLicensingServiceApplicationTests {

	@Test
	void contextLoads() {
		String loadingMessage = "Test context loads";
		assertThat(loadingMessage).isEqualTo("Test context loads");
	}

}
