//package ro.uvt.info.splabciorgoveandiana;
package ro.uvt.info.splabciorgoveandiana;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import ro.uvt.info.splabciorgoveandiana.difexample.ClientComponent;
import ro.uvt.info.splabciorgoveandiana.difexample.SingletonComponent;
import ro.uvt.info.splabciorgoveandiana.difexample.TransientComponent;
import ro.uvt.info.splabciorgoveandiana.models.Book;
import ro.uvt.info.splabciorgoveandiana.models.RenderContentVisitor;

@SpringBootApplication
public class SpLabCiorgoveanDianaApplication {
		public static void main(String[] args) {
//
			Book book = new Book("Design Patterns");
			new RenderContentVisitor().visitBook(book);
			//book.accept(new RenderContentVisitor());

		}
}




