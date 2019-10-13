package academy.softserve.museum.dao;

import academy.softserve.museum.entities.Audience;
import academy.softserve.museum.entities.Employee;
import academy.softserve.museum.entities.EmployeePosition;
import academy.softserve.museum.entities.statistic.EmployeeStatistic;

import java.sql.Date;
import java.util.List;

public interface EmployeeDao extends Crud<Employee> {

    List<Employee> findByPosition(EmployeePosition position);

    EmployeeStatistic findStatistic(Date dateStart, Date dateEnd);

    Audience findAudienceByEmployee(Employee employee);

    void updateEmployeeAudience(Employee employee, Audience audience);

}
