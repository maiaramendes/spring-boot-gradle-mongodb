package br.application;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Profile;

@Profile("test")
@SpringBootTest(classes = SpringGradleApplication.class)
class SpringGradleApplicationTests {

	@Test
	void contextLoads() {
	}

}
