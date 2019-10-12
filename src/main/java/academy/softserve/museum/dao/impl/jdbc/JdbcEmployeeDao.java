package academy.softserve.museum.dao.impl.jdbc;

import academy.softserve.museum.dao.EmployeeDao;
import academy.softserve.museum.entities.Employee;
import academy.softserve.museum.entities.EmployeePosition;
import academy.softserve.museum.entities.statistic.EmployeeStatistic;

import java.sql.Connection;
import java.sql.Date;
import java.util.List;
import java.util.Optional;

public class JdbcEmployeeDao implements EmployeeDao {
    private final Connection connection;

    public JdbcEmployeeDao(Connection connection) {
        this.connection = connection;
    }

    @Override
    public List<Employee> findByPosition(EmployeePosition position) {
        return null;
    }

    @Override
    public List<Employee> findAvailableTourGuides(Date dateStart, Date dateEnd) {
        return null;
    }

    @Override
    public EmployeeStatistic employeeStatistic(Date dateStart, Date dateEnd) {
        return null;
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
    public void updateById(long id, Employee newObject) {

    }
}
