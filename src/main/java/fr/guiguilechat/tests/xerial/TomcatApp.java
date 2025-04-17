package fr.guiguilechat.tests.xerial;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootApplication
public class TomcatApp extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(TomcatApp.class, args);
	}

}
