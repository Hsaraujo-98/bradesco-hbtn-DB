package entities;
import javax.persistence.*;

@Entity
public class MaterialCurso {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String url;

    @OneToOne(mappedBy = "materialCurso")
    private Curso curso;

    // Getters e Setters
} 