package tn.alfacomputers.chahrazed;

import tn.alfacomputers.Controllers.RoomController;
import tn.alfacomputers.Controllers.UserController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

//@EnableAutoConfiguration
@ComponentScan(basePackageClasses =  UserController.class)
@ComponentScan(basePackageClasses = RoomController.class)
@EntityScan("tn/alfacomputers/entities")
@EnableJpaRepositories("tn/alfacomputers/repositories")
@SpringBootApplication
public class ChahrazedApplication {
	private static final Logger log = LoggerFactory.getLogger(ChahrazedApplication.class);


	public static void main(String[] args) {
		SpringApplication.run(ChahrazedApplication.class, args);
	}

}
