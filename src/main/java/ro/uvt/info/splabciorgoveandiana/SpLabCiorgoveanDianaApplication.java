package ro.uvt.info.splabciorgoveandiana;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import ro.uvt.info.splabciorgoveandiana.entities.*;

@SpringBootApplication
public class SpLabCiorgoveanDianaApplication {
	public static void main(String[] args) {
		SpringApplication.run(SpLabCiorgoveanDianaApplication.class, args);

		Author author = new Author("Thomas Cormen");
		Book book = new Book("Introduction to Algorithms");
		Chapter chapter = new Chapter("Chapter 1");



		book.print();
		author.print();
		chapter.print();
	}

}
