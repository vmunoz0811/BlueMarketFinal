package co.edu.unbosque.bluemarketfinal.JPA.repositories;

import co.edu.unbosque.bluemarketfinal.JPA.entities.UserApp;

import java.util.Optional;

public interface UserAppRepository {

    Optional<UserApp> findByEmail(String email);

    Optional<UserApp> save(UserApp userApp);

}
