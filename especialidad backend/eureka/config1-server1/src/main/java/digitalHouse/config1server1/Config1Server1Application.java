package digitalHouse.config1server1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class Config1Server1Application {

	public static void main(String[] args) {
		SpringApplication.run(Config1Server1Application.class, args);
	}

}
