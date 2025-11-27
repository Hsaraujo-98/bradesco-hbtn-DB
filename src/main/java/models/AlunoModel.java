package models;
import entities.Aluno;
import javax.persistence.*;
import java.util.List;

public class AlunoModel {
    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("gestao-cursos-jpa");

    public void create(Aluno aluno) {
        EntityManager em = emf.createEntityManager();
        try {
            em.getTransaction().begin();
            em.persist(aluno);
            em.getTransaction().commit();
        } finally {
            em.close();
        }
    }

    public Aluno findById(Long id) {
        EntityManager em = emf.createEntityManager();
        return em.find(Aluno.class, id);
    }

    public List<Aluno> findAll() {
        EntityManager em = emf.createEntityManager();
        return em.createQuery("FROM Aluno", Aluno.class).getResultList();
    }

    public void update(Aluno aluno) {
        EntityManager em = emf.createEntityManager();
        try {
            em.getTransaction().begin();
            em.merge(aluno);
            em.getTransaction().commit();
        } finally {
            em.close();
        }
    }

    public void delete(Aluno aluno) {
        EntityManager em = emf.createEntityManager();
        try {
            em.getTransaction().begin();
            aluno = em.merge(aluno);
            em.remove(aluno);
            em.getTransaction().commit();
        } finally {
            em.close();
        }
    }
} 