package academy.softserve.museum.dao.impl.jdbc;

import academy.softserve.museum.dao.TimetableDao;
import academy.softserve.museum.entities.Employee;
import academy.softserve.museum.entities.Excursion;
import academy.softserve.museum.entities.Timetable;

import java.sql.Connection;
import java.sql.Date;
import java.util.List;
import java.util.Optional;

public class JdbcTimetableDao implements TimetableDao {
    private final Connection connection;

    public JdbcTimetableDao(Connection connection) {
        this.connection = connection;
    }

    @Override
    public List<Employee> findAvailableTourGuides(Date dateStart, Date dateEnd) {
        return null;
    }

    @Override
    public List<Excursion> findAvailableExcursions(Date dateStart, Date dateEnd) {
        return null;
    }

    @Override
    public void save(Timetable objectToSave) {

    }

    @Override
    public void deleteById(long id) {

    }

    @Override
    public Optional<Timetable> findById(long id) {
        return null;
    }

    @Override
    public List<Timetable> findAll() {
        return null;
    }

    @Override
    public void update(Timetable newObject) {

    }
}
