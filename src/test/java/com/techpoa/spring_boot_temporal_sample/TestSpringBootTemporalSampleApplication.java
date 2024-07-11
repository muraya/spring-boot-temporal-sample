package com.techpoa.spring_boot_temporal_sample;

import org.springframework.boot.SpringApplication;

public class TestSpringBootTemporalSampleApplication {

	public static void main(String[] args) {
		SpringApplication.from(SpringBootTemporalSampleApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
