package ro.uvt.info.splabciorgoveandiana;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages = "ro.uvt.info.splabciorgoveandiana.entities")
@SpringBootApplication
public class SpLabCiorgoveanDianaApplication {
		public static void main(String[] args) {
			SpringApplication.run(SpLabCiorgoveanDianaApplication.class, args);

		}
}




