package com.osiki.demojwtproject;

import com.osiki.demojwtproject.config.RsaKeyProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(RsaKeyProperties.class)
public class DemoJwtProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoJwtProjectApplication.class, args);
	}

}
