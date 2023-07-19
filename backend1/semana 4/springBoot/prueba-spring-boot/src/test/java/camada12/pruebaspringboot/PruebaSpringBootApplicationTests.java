package camada12.pruebaspringboot;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootTest

@RestController

class PruebaSpringBootApplicationTests {

	@Test
	void contextLoads() {
	}

	@GetMapping("/")
	public String saludar(){
		return "Hola";
	}

}
