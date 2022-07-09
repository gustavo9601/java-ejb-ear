package org.gmarquezp.webapp.ear.ejb;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.context.RequestScoped;
import jakarta.enterprise.inject.Disposes;
import jakarta.enterprise.inject.Produces;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.PersistenceUnit;

@ApplicationScoped
public class ProducerResources {

    // ejemplo-jpa // nombre en el archivo persistence.xml
    @PersistenceUnit(unitName = "ejemplo-jpa")
    private EntityManagerFactory entityManagerFactory;

    @Produces
    @RequestScoped // persistira una conexion por request
    private EntityManager beanEntityManager(){
        return entityManagerFactory.createEntityManager();
    }

    public void close(@Disposes EntityManager entityManager) {
        if(entityManager.isOpen()) {
            entityManager.close();
            System.out.println("Cerrando conexion entity Manager");
        }
    }

}
