package com.code.september.eureka.client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
@RestController
public class SeptemberEurekaClientApplication {

//	@Autowired
//	private Config1 config;


	@Value("${foo}")
	String foo;

	public static void main(String[] args) {
		SpringApplication.run(SeptemberEurekaClientApplication.class, args);


	}



	@Value("${server.port}")
	String port;

	@RequestMapping("/hi")
	public String home(@RequestParam(value = "name", defaultValue = "forezp") String name) {
//		System.out.println(config.getMessage());
		System.out.println(foo);
		return "hi " + name + " ,i am from port:" + port;
	}


	@RequestMapping("/hello")
	public String hello(@RequestParam(value = "name", defaultValue = "forezp") String name) {
		return "hi " + name + " ,i am from port:" + port;
	}
}
