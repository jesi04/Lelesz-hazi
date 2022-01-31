package hu.Vadasz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class VadaszApplication {

	public static void main(String[] args) {
		System.err.println("A program elindul"); /* A Spring keretrendszer előtt fut le */
		SpringApplication.run(VadaszApplication.class, args);
		System.err.println("A program lezárul");

	}

}
