package main;

import dao.CategoryDAO;
import dao.MovementDAO;
import model.Category;
import model.MoneyMovement;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        CategoryDAO categoryDAO = new CategoryDAO();
        MovementDAO movementDAO = new MovementDAO();

        Category category = new Category();
        category.setDescription("Wealth");
        // category.setDateChanged();
        categoryDAO.insert(category);

//        Category category1 = categoryDAO.searchFromID(2L);
//        System.out.println(category1.getDescription());
//        category1.setDescription("Minecraft");
//        categoryDAO.change(category1);
//        List<Category> categoryList = categoryDAO.searchAll();
//        for(Category cat:categoryList) {
//            System.out.println(cat.getDescription());
//        }

//        MoneyMovement movement = new MoneyMovement();
//        movement.setMovementDate(new Date());
//        movement.setDescription("Buying food");
//        movement.setType("D");
//        movement.setValue(5000.);
//        movement.setCategory(category);

        // movementDAO.insert(movement);

//        System.out.println(movement.getId());
    }
}