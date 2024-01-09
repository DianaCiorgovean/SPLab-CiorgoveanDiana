package ro.uvt.info.splabciorgoveandiana.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@NoArgsConstructor(force = true)
public class Section extends BaseElement {
    @Id
    @GeneratedValue
    private Long id;
    @OneToMany(targetEntity = BaseElement.class)
    private final List<BaseElement> children = new ArrayList<>();

    public void setId(Long id) {
        this.id = id;
    }
    public Long getId() {
        return id;
    }
}

