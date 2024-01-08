//package ro.uvt.info.splabciorgoveandiana;
package ro.uvt.info.splabciorgoveandiana;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import ro.uvt.info.splabciorgoveandiana.models.Book;
import ro.uvt.info.splabciorgoveandiana.LabVisitor.RenderContentVisitor;

@SpringBootApplication
public class SpLabCiorgoveanDianaApplication {
		public static void main(String[] args) {
//
			Book book = new Book("Design Patterns");
			new RenderContentVisitor().visitBook(book);
			//book.accept(new RenderContentVisitor());

		}
}




