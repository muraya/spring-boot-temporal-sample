package com.techpoa.spring_boot_temporal_sample;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;

@Import(TestcontainersConfiguration.class)
@SpringBootTest
class SpringBootTemporalSampleApplicationTests {

	@Test
	void contextLoads() {
	}

}
