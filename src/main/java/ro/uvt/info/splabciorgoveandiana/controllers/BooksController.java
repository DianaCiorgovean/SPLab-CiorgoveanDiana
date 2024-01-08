package ro.uvt.info.splabciorgoveandiana.controllers;
import org.springframework.web.bind.annotation.*;
import ro.uvt.info.splabciorgoveandiana.models.*;
import java.util.ArrayList;
import java.util.List;
@RestController
@RequestMapping("/books")
public class BooksController {

    private List<Book> books = new ArrayList<>();

        // GET /books
        @GetMapping
        public List<Book> getAllBooks() {
            return books;
        }

        // GET /books/{id}
        @GetMapping("/{id}")
        public Book getBookById(@PathVariable int id) {
            return findBookById(id);
        }

        // POST /books
        @PostMapping
        public Book createBook(@RequestBody Book book) {
            book.setId(generateUniqueId());
            books.add(book);
            return book;
        }

        // PUT /books/{id}
        @PutMapping("/{id}")
        public Book updateBook(@PathVariable int id, @RequestBody Book updatedBook) {
            Book existingBook = findBookById(id);
            existingBook.setTitle(updatedBook.getTitle());
            existingBook.setAuthor(updatedBook.getAuthor());
            return existingBook;
        }

        // DELETE /books/{id}
        @DeleteMapping("/{id}")
        public void deleteBook(@PathVariable int id) {
            Book book = findBookById(id);
            books.remove(book);
        }

        private Book findBookById(int id) {
            return books.stream()
                    .filter(book -> book.getId() == id)
                    .findFirst()
                    .orElseThrow(() -> new RuntimeException("Book not found with id: " + id));
        }

        private int generateUniqueId() {
            return books.size() + 1;
        }
    }

