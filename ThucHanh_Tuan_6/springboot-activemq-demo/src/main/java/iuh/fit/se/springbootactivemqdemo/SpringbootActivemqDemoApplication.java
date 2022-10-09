package iuh.fit.se.springbootactivemqdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jms.annotation.EnableJms;

@SpringBootApplication
@EnableJms
public class SpringbootActivemqDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootActivemqDemoApplication.class, args);
	}

}
