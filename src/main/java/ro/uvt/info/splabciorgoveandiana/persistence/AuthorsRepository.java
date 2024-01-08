package ro.uvt.info.splabciorgoveandiana.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ro.uvt.info.splabciorgoveandiana.models.*;

@Repository
public interface AuthorsRepository extends JpaRepository<Book, Integer> {
}