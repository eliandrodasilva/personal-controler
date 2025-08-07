package dao;

import model.MoneyMovement;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

public class MovementDAO {
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("persistenciaPU");

    public MoneyMovement insert(MoneyMovement movement) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(movement);
        em.getTransaction().commit();
        em.close();
        return movement;
    }

    public MoneyMovement change() {
        return null;
    }

    public void remove() {

    }

    public MoneyMovement searchFromID(Long id) {
        return null;
    }

    public List<MoneyMovement> searchAll() {
        return null;
    }
}
