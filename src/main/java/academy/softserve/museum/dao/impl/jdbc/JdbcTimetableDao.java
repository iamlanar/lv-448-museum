package academy.softserve.museum.dao.impl.jdbc;

import academy.softserve.museum.dao.TimetableDao;
import academy.softserve.museum.dao.impl.jdbc.mappers.TimetableRowMapper;
import academy.softserve.museum.entities.Employee;
import academy.softserve.museum.entities.Excursion;
import academy.softserve.museum.entities.Timetable;

import java.sql.*;
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
        String FIND_STATISTIC = "" +
                "SELECT tt.id AS timetable_id, e.id AS employee_id, ex.id AS excursion_id, " +
                "e.first_name, e.last_name, e.position, e.login, e.password, " +
                "tt.date_start, tt.date_end, " +
                "DATE_PART('hour', date_end - date_start) * 60 + " +
                "DATE_PART('minute', date_end - date_start) AS excursion_time, " +
                "ex.name AS excursion_name " +
                "FROM employees AS e " +
                "INNER JOIN timetable AS tt " +
                "ON e.id = tt.employee_id " +
                "INNER JOIN excursion AS ex " +
                "ON tt.excursion_id = ex.id;";

        try (PreparedStatement statement = connection.prepareStatement(FIND_STATISTIC)) {
            try (ResultSet resultSet = statement.executeQuery()) {
                if (resultSet.next()) {
                    return Optional.of(new TimetableRowMapper().mapRow(resultSet));
                }

                return Optional.empty();
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    @Override
    public List<Timetable> findAll() {
        return null;
    }

    @Override
    public void update(Timetable newObject) {

    }
}
