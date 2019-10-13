package academy.softserve.museum.dao;

import academy.softserve.museum.entities.Employee;
import academy.softserve.museum.entities.Excursion;
import academy.softserve.museum.entities.Timetable;

import java.sql.Date;
import java.util.List;

public interface TimetableDao extends Crud<Timetable> {

    List<Employee> findAvailableTourGuides(Date dateStart, Date dateEnd);

    List<Excursion> findAvailableExcursions(Date dateStart, Date dateEnd);
}
