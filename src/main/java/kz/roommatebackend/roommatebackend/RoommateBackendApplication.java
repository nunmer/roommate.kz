package kz.roommatebackend.roommatebackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;


@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })
public class RoommateBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(RoommateBackendApplication.class, args);
	}

}
