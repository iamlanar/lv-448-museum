package academy.softserve.museum.services;

import academy.softserve.museum.entities.Audience;
import java.util.List;
import java.util.Optional;

public interface AudienceService {

  void save(Audience objectToSave);

  void deleteById(long id);

  Optional<Audience> findById(long id);

  List<Audience> findAll();

  void update(Audience newObject);

}
