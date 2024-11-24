package FSW.Practical;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@ComponentScan(basePackages = "Controller")
@ComponentScan(basePackages = "Service")
@EnableMongoRepositories(basePackages = "Repository")
//@ComponentScan(basePackages = "Entity")
public class PracticalApplication {

	public static void main(String[] args) {
		SpringApplication.run(PracticalApplication.class, args);
		System.out.println("Initial Start!!!");
	}
}
