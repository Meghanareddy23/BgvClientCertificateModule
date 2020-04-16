package com.BGV;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.BGV.BgvController.ClientController;
import com.BGV.BgvRepository.ClientRepository;

@SpringBootApplication
/*@ComponentScan(basePackageClasses=ClientController.class)
@EnableJpaRepositories(basePackageClasses=ClientRepository.class)*/
public class BackgroundVerificationApplication {

	public static void main(String[] args) {
		SpringApplication.run(BackgroundVerificationApplication.class, args);
	}

}
