package session.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages="session.boot")
public class BootSessionApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootSessionApplication.class, args);
	}

}
