package academy.softserve.museum.dao.impl.jdbc;

import academy.softserve.museum.dao.EmployeeDao;
import academy.softserve.museum.dao.impl.jdbc.mappers.EmployeeRowMaper;
import academy.softserve.museum.dao.impl.jdbc.mappers.EmployeeStatisticRowMapper;
import academy.softserve.museum.entities.Audience;
import academy.softserve.museum.entities.Employee;
import academy.softserve.museum.entities.EmployeePosition;
import academy.softserve.museum.entities.statistic.EmployeeStatistic;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class JdbcEmployeeDao implements EmployeeDao {
    private final Connection connection;

    public JdbcEmployeeDao(Connection connection) {
        this.connection = connection;
    }

    @Override
    public List<Employee> findByPosition(EmployeePosition position) {
        String FIND_BY_POSITION = "SELECT * FROM employees WHERE position = ?";
        List<Employee> employees = new ArrayList<>();
        EmployeeRowMaper rowMaper = new EmployeeRowMaper();

        try (PreparedStatement statement = connection.prepareStatement(FIND_BY_POSITION)) {
            statement.setString(1, position.toString());

            try (ResultSet resultSet = statement.executeQuery()) {

                while (resultSet.next()) {
                    employees.add(rowMaper.mapRow(resultSet));
                }

                return employees;
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public EmployeeStatistic findStatistic(Date dateStart, Date dateEnd) {
        String FIND_STATISTIC =
                "SELECT e.id, e.first_name, e.last_name, e.position, e.login, e.password, " +
                        "SUM(DATE_PART('hour', date_end - date_start) * 60 + " +
                        "DATE_PART('minute', date_end - date_start)) AS excursion_time\n" +
                        "FROM employees AS e " +
                        "INNER JOIN timetable AS tt " +
                        "ON e.id = tt.employee_id " +
                        "WHERE date_start > ? and date_end < ? " +
                        "GROUP BY e.id, e.first_name, e.last_name, e.position, e.login, e.password; ";

        EmployeeStatisticRowMapper employeeStatisticRowMapper = new EmployeeStatisticRowMapper();
        EmployeeStatistic employeeStatistic;

        try (PreparedStatement statement = connection.prepareStatement(FIND_STATISTIC)) {
            statement.setDate(1, dateStart);
            statement.setDate(2, dateEnd);

            try (ResultSet resultSet = statement.executeQuery()) {
                employeeStatistic = employeeStatisticRowMapper.mapRow(resultSet);
                employeeStatistic.setDateStart(dateStart);
                employeeStatistic.setDateEnd(dateEnd);

                return employeeStatistic;
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    @Override
    public Audience findAudienceByEmployee(Employee employee) {
        String FIND_AUDIENCE_BY_EMPLOYEE = "SELECT * FROM audiences WHERE id = ?";

        try (PreparedStatement statement = connection.prepareStatement(FIND_AUDIENCE_BY_EMPLOYEE)) {

            try(ResultSet resultSet = statement.executeQuery()){

            }

        }catch (SQLException e){
            throw new RuntimeException(e);
        }

    }

    @Override
    public void updateEmployeeAudience(Employee employee, Audience audience) {

    }

    @Override
    public void save(Employee objectToSave) {

    }

    @Override
    public void deleteById(long id) {

    }

    @Override
    public Optional<Employee> findById(long id) {
        return Optional.empty();
    }

    @Override
    public List<Employee> findAll() {
        return null;
    }

    @Override
    public void update(Employee newObject) {

    }
}
