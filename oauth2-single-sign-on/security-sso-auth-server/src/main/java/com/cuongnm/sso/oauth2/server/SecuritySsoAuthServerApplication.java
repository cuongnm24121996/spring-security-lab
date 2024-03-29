package com.cuongnm.sso.oauth2.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;

@SpringBootApplication
@EnableResourceServer
public class SecuritySsoAuthServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SecuritySsoAuthServerApplication.class, args);
	}

}
