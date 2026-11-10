package com.carlesso.minierp;

import org.springframework.boot.SpringApplication;

public class TestMinierpApplication {

	public static void main(String[] args) {
		SpringApplication.from(MinierpApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
