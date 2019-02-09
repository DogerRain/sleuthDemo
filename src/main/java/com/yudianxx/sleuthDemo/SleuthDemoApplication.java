package com.yudianxx.sleuthDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import zipkin.server.EnableZipkinServer;
@SpringBootApplication
@EnableZipkinServer
public class SleuthDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SleuthDemoApplication.class, args);
	}

}

