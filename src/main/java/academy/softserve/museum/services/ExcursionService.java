package academy.softserve.museum.services;

import academy.softserve.museum.entities.Excursion;
import academy.softserve.museum.entities.statistic.ExcursionStatistic;
import java.sql.Date;
import java.util.List;
import java.util.Optional;

public interface ExcursionService {

  void save(Excursion objectToSave);

  void deleteById(long id);

  Optional<Excursion> findById(long id);

  List<Excursion> findAll();

  void update(Excursion newObject);

  ExcursionStatistic findStatistic(Date dateStart, Date dateEnd);

}
