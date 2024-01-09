package ro.uvt.info.splabciorgoveandiana.entities;

import jakarta.persistence.*;
import lombok.NoArgsConstructor;
import java.util.List;

@Entity
@NoArgsConstructor(force = true)
public class Book {
    @Id
    @GeneratedValue
    private Long id;

    @ManyToMany
    private List<Author> authors;
    public void setId(Long id) {
        this.id = id;
    }
    public Long getId() {
        return id;
    }
}
