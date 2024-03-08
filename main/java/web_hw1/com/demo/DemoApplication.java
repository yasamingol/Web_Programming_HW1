package web_hw1.com.demo;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class DemoApplication {


	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		RestTemplate restTemplate = new RestTemplate();


		String sum_result = restTemplate.getForObject("http://localhost:8080/calc/sum/10/5", String.class);
		String div_result = restTemplate.getForObject("http://localhost:8080/calc/div/10/5", String.class);
		String mult_result = restTemplate.getForObject("http://localhost:8080/calc/mult/10/5", String.class);
		String sub_result = restTemplate.getForObject("http://localhost:8080/calc/subtract/10/5", String.class);


		System.out.println("Sum: " + sum_result);
		System.out.println("Division: " + div_result);
		System.out.println("Multiplication: " + mult_result);
		System.out.println("Subtraction: " + sub_result);
	}

}
