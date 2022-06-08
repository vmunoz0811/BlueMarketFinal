package co.edu.unbosque.bluemarketfinal.JPA.repositories;

import co.edu.unbosque.bluemarketfinal.JPA.entities.WalletHistory;

import java.util.Optional;

public interface WalletHistoryRepository {

    Optional<WalletHistory> save(WalletHistory walletHistory);

}
