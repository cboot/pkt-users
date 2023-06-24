package com.poketroll.users;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.poketroll.users")
public class UsersApplication {

  public static void main(String[] args) {
    SpringApplication.run(UsersApplication.class, args);
  }
}
