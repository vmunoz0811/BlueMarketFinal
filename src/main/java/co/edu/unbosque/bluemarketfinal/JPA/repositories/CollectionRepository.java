package co.edu.unbosque.bluemarketfinal.JPA.repositories;

import co.edu.unbosque.bluemarketfinal.JPA.entities.Collection;

import java.util.Optional;

public interface CollectionRepository {

    Optional<Collection> save(Collection collection);

}
