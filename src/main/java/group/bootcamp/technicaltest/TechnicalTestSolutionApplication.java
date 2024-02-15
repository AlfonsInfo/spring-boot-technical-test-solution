package group.bootcamp.technicaltest;

import jakarta.annotation.PostConstruct;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.TimeZone;

@SpringBootApplication
public class TechnicalTestSolutionApplication {

	@PostConstruct
	public void initTime()
	{
		TimeZone.getTimeZone("Asia/Jakarta");
	}

	public static void main(String[] args) {
		SpringApplication.run(TechnicalTestSolutionApplication.class, args);
	}

}
