package com.example.brief6.config;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class EntityManagerConfig {
    private static EntityManager entityManager = null;
    static {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("mypack");
        entityManager = entityManagerFactory.createEntityManager();
    }
    public static EntityManager getEntityManager(){
        return entityManager;
    }
}