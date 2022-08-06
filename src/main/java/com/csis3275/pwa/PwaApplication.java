package com.csis3275.pwa;

import com.csis3275.pwa.model.RoleModel;
import com.csis3275.pwa.repository.RoleRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class PwaApplication {

	public static void main(String[] args) {
		SpringApplication.run(PwaApplication.class, args);
	}

	@Bean
	CommandLineRunner init(RoleRepository roleRepository) {

		return args -> {

			RoleModel adminRole = roleRepository.findByRole("ADMIN");
			if (adminRole == null) {
				RoleModel newAdminRole = new RoleModel();
				newAdminRole.setRole("ADMIN");
				roleRepository.save(newAdminRole);
			}

			RoleModel userRole = roleRepository.findByRole("USER");
			if (userRole == null) {
				RoleModel newUserRole = new RoleModel();
				newUserRole.setRole("USER");
				roleRepository.save(newUserRole);
			}
		};

	}

}
