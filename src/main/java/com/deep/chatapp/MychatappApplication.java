package com.deep.chatapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.deep.chatapp")
public class MychatappApplication {
    public static void main(String[] args) {
        SpringApplication.run(MychatappApplication.class, args);
    }
}

/*
@SpringBootApplication
public class MychatappApplication {

	public static void main(String[] args) {
		SpringApplication.run(MychatappApplication.class, args);
		System.out.println("Chat Server Started...");

	}

}
*/
