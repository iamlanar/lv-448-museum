package academy.softserve.museum.services.impl;

import academy.softserve.museum.dao.impl.jdbc.JdbcTimetableDao;
import academy.softserve.museum.entities.Employee;
import academy.softserve.museum.entities.Excursion;
import academy.softserve.museum.entities.Timetable;
import academy.softserve.museum.services.TimetableService;
import java.sql.Date;
import java.util.List;
import java.util.Optional;

public class TimetableServiceImpl implements TimetableService {

  private JdbcTimetableDao jdbcTimetableDao;

  @Override
  public void save(Timetable objectToSave) {
    jdbcTimetableDao.save(objectToSave);
  }

  @Override
  public void deleteById(long id) {
    jdbcTimetableDao.deleteById(id);
  }

  @Override
  public Optional<Timetable> findById(long id) {
    return jdbcTimetableDao.findById(id);
  }

  @Override
  public List<Timetable> findAll() {
    return jdbcTimetableDao.findAll();
  }

  @Override
  public void update(Timetable newObject) {
    jdbcTimetableDao.update(newObject);
  }

  @Override
  public List<Employee> findAvailableTourGuides(Date dateStart, Date dateEnd) {
    return jdbcTimetableDao.findAvailableTourGuides(dateStart, dateEnd);
  }

  @Override
  public List<Excursion> findAvailableExcursions(Date dateStart, Date dateEnd) {
    return jdbcTimetableDao.findAvailableExcursions(dateStart, dateEnd);
  }
}
