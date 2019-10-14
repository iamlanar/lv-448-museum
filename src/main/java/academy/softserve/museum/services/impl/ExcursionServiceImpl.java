package academy.softserve.museum.services.impl;

import academy.softserve.museum.dao.impl.jdbc.JdbcExcursionDao;
import academy.softserve.museum.entities.Excursion;
import academy.softserve.museum.entities.statistic.ExcursionStatistic;
import academy.softserve.museum.services.ExcursionService;
import java.sql.Date;
import java.util.List;
import java.util.Optional;

public class ExcursionServiceImpl implements ExcursionService {

  private JdbcExcursionDao jdbcExcursionDao;

  @Override
  public void save(Excursion objectToSave) {
    jdbcExcursionDao.save(objectToSave);
  }

  @Override
  public void deleteById(long id) {
    jdbcExcursionDao.deleteById(id);
  }

  @Override
  public Optional<Excursion> findById(long id) {
    return jdbcExcursionDao.findById(id);
  }

  @Override
  public List<Excursion> findAll() {
    return jdbcExcursionDao.findAll();
  }

  @Override
  public void update(Excursion newObject) {
    jdbcExcursionDao.update(newObject);
  }

  @Override
  public ExcursionStatistic findStatistic(Date dateStart, Date dateEnd) {
    return jdbcExcursionDao.findStatistic(dateStart, dateEnd);
  }
}
