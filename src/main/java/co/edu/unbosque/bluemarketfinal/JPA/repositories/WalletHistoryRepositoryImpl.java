package co.edu.unbosque.bluemarketfinal.JPA.repositories;

import co.edu.unbosque.bluemarketfinal.JPA.entities.WalletHistory;
import jakarta.persistence.EntityManager;

import java.util.Optional;

public class WalletHistoryRepositoryImpl implements WalletHistoryRepository {

    private EntityManager entityManager;

    public WalletHistoryRepositoryImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public Optional<WalletHistory> save(WalletHistory walletHistory) {
        try {
            entityManager.getTransaction().begin();
            entityManager.persist(walletHistory);
            entityManager.getTransaction().commit();

            return Optional.of(walletHistory);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return Optional.empty();
    }

}
