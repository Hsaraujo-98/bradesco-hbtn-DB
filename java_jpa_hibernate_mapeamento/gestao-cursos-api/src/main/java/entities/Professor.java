package entities;
import javax.persistence.*;
import java.util.*;

@Entity
public class Professor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nomeCompleto;
    private String matricula;
    private String email;

    @OneToMany(mappedBy = "professor")
    private List<Curso> cursos = new ArrayList<>();

    // Getters e Setters
} 