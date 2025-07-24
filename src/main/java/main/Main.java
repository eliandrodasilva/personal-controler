package main;

import model.Category;
import model.MoneyMovement;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Category category = new Category();
        category.setDescription("Food");
        // category.setDateChanged();

        MoneyMovement mov = new MoneyMovement();
        mov.setMovementDate(new Date());
        mov.setDescription("Buying food");
        mov.setType("D");
        mov.setValue(5000.);
        mov.setCategory(category);

        EntityManagerFactory emf=
                Persistence.createEntityManagerFactory("persistenciaPU");
        EntityManager em =emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(mov);
        em.persist(category);
        em.getTransaction().commit();
        em.close();
        System.out.println(mov.getId());
    }
}