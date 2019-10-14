package academy.softserve.museum.services;

import academy.softserve.museum.entities.Audience;
import academy.softserve.museum.entities.Author;
import academy.softserve.museum.entities.Employee;
import academy.softserve.museum.entities.Exhibit;
import academy.softserve.museum.entities.statistic.ExhibitStatistic;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public interface ExhibitService {

  void save(Exhibit objectToSave);

  void deleteById(long id);

  Optional<Exhibit> findById(long id);

  List<Exhibit> findAll();

  void update(Exhibit newObject);

  List<Exhibit> findByAuthor(Author author);

  List<Exhibit> findByEmployee(Employee employee);

  List<Author> findAuthorsByExhibit(Exhibit exhibit);

  Audience findAudienceByExhibit(Exhibit exhibit);

  void updateExhibitAudience(Exhibit exhibit, Audience audience);

  void addExhibitAuthor(Exhibit exhibit, Author author);

  void deleteExhibitAuthor(Exhibit exhibit, Author author);

  Map<Audience, List<Exhibit>> findAllGroupedByAudience();

  ExhibitStatistic findStatistic();

}
