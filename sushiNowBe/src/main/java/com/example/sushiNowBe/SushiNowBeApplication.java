package com.example.sushiNowBe;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class SushiNowBeApplication {

	public static void main(String[] args) {
		SpringApplication.run(SushiNowBeApplication.class, args);
	}

}
