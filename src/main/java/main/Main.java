package main;

import model.MoneyMovement;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        MoneyMovement mov = new MoneyMovement();
        mov.setMovementDate(new Date());
        mov.setDescription("Computer purchase");
        mov.setType("D");
        mov.setValue(5000.);

        EntityManagerFactory emf=
                Persistence.createEntityManagerFactory("persistenciaPU");
        EntityManager em =emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(mov);
        em.getTransaction().commit();
        em.close();
        System.out.println(mov.getId());
    }
}