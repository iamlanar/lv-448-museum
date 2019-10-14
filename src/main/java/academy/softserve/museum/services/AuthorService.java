package academy.softserve.museum.services;

import academy.softserve.museum.entities.Author;
import academy.softserve.museum.entities.Exhibit;
import java.util.List;
import java.util.Optional;

public interface AuthorService {

  List<Exhibit> findExhibitsByAuthor(Author author);

  void addExhibitAuthor(Author author, Exhibit exhibit);

  void deleteExhibitAuthor(Author author, Exhibit exhibit);

  void save(Author objectToSave);

  void deleteById(long id);

  Optional<Author> findById(long id);

  List<Author> findAll();

  void update(Author newObject);

}
