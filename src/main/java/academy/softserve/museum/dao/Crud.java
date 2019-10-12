package academy.softserve.museum.dao;

import java.util.List;
import java.util.Optional;

public interface Crud<T> {

    void save(T objectToSave);

    void deleteById(long id);

    Optional<T> findById(long id);

    List<T> findAll();

    void updateById(long id, T newObject);

}
