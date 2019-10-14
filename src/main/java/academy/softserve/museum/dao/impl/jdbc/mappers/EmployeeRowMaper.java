package academy.softserve.museum.dao.impl.jdbc.mappers;

import academy.softserve.museum.entities.Employee;
import academy.softserve.museum.entities.EmployeePosition;

import java.sql.ResultSet;
import java.sql.SQLException;

public class EmployeeRowMaper implements RowMapper<Employee> {

    @Override
    public Employee mapRow(ResultSet resultSet) {
        Employee employee = new Employee();
        try {
            employee.setFirstName(resultSet.getString("first_name"));
            employee.setLastName("last_name");
            employee.setLogin(resultSet.getString("login"));
            employee.setPassword(resultSet.getString("password"));
            employee.setPosition(EmployeePosition.valueOf(resultSet.getString("position")));
            employee.setId(resultSet.getLong("id"));

            return employee;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}
