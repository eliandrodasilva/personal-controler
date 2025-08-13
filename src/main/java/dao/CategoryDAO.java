package dao;

import model.Category;
import persistence.EMF;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import java.util.List;

public class CategoryDAO {
    EntityManagerFactory emf = EMF.getEMF();

    public Category insert(Category category) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(category);
        em.getTransaction().commit();
        em.close();
        return category;
    }

    // category objects needs id
    public Category change(Category category) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.merge(category);
        em.getTransaction().commit();
        em.close();
        return category;
    }

    public void remove(Category category) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.remove(category);
        em.getTransaction().commit();
        em.close();
    }

    public Category searchFromID(Long id) {
        EntityManager em = emf.createEntityManager();
        Category category = em.find(Category.class, id);
        em.close();
        return category;
    }

    public List<Category> searchAll() {
        EntityManager em = emf.createEntityManager();
        Query query = em.createQuery("from Category");
        List<Category> categoryList = query.getResultList();
        em.close();
        return categoryList;
    }
}
