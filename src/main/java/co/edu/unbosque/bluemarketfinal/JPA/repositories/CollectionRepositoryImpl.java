package co.edu.unbosque.bluemarketfinal.JPA.repositories;

import co.edu.unbosque.bluemarketfinal.JPA.entities.Collection;
import jakarta.persistence.EntityManager;

import java.util.Optional;

public class CollectionRepositoryImpl implements CollectionRepository {

    private EntityManager entityManager;

    public CollectionRepositoryImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public Optional<Collection> save(Collection collection) {
        try {
            entityManager.getTransaction().begin();
            entityManager.persist(collection);
            entityManager.getTransaction().commit();

            return Optional.of(collection);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return Optional.empty();
    }
}
