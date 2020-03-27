package ua.lviv.iot.spring.first.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan({ "ua.lviv.iot.spring.first.dataaccess", "ua.lviv.iot.spring.first.business",
    "ua.lviv.iot.spring.first.rest.controller", "ua.lviv.iot.spring.first.rest" })
@EnableJpaRepositories("ua.lviv.iot.spring.first.dataaccess")
public class RestApplication {

  public static void main(String[] args) {
    //System.setProperty("java.awt.headless", "false");
    SpringApplication.run(RestApplication.class, args);
  }

}
