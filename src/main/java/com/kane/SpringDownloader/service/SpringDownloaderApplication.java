package com.kane.SpringDownloader.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.kane"})
public class SpringDownloaderApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringDownloaderApplication.class, args);
	}

}

