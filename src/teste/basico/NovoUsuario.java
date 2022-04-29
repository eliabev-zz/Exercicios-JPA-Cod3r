package teste.basico;

import modelo.basico.Usuario;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class NovoUsuario {
    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("exercicios-jpa");
        EntityManager em = emf.createEntityManager();

        Usuario first = new Usuario("Ropaniel", "email@email.com");
        Usuario second = new Usuario("Roberto Chagas", "roberto.c@email.com");
        Usuario third = new Usuario("Fernando Silveira", "silveira_f@email.com");
        Usuario fourth = new Usuario("Laura Batista", "laura.batista@email.com");
        Usuario fifth = new Usuario("Jessica Moreira", "jesseira@email.com");

        em.getTransaction().begin();
        em.persist(second);
        em.persist(first);
        em.persist(third);
        em.persist(fourth);
        em.persist(fifth);
        em.getTransaction().commit();

        em.close();
        emf.close();
    }
}
