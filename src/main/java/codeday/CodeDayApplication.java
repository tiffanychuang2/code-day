package codeday;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class CodeDayApplication {

	public static void main(String[] args) {
		SpringApplication.run(CodeDayApplication.class, args);
	}

}
