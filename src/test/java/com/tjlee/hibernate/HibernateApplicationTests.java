package com.tjlee.hibernate;

import com.tjlee.hibernate.domain.Category;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HibernateApplicationTests {

    @Test
    public void contextLoads() {
    }

//    @PersistenceUnit
//    private EntityManagerFactory emf;
//
//    @Test
//    public void contextLoads() {
//        EntityManager em1 = emf.createEntityManager();
//        Category category = new Category();
//        category.setCategoryId(1);
//        category.setName("하이");
//        em1.persist(category);
//    }
//
//    @Test
//    public void test_emf(){
//        EntityManager em1 = emf.createEntityManager();
//        Category category = new Category();
//        category.setCategoryId(2);
//        category.setName("하이2");
//        em1.persist(category);
//    }

}
