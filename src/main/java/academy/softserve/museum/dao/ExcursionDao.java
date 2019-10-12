package academy.softserve.museum.dao;

import academy.softserve.museum.entities.Excursion;
import academy.softserve.museum.entities.statistic.ExcursionStatistic;

import java.sql.Date;
import java.util.List;

public interface ExcursionDao extends Crud<Excursion> {

    List<Excursion> findAvailableExcursions(Date dateStart, Date dateEnd);

    ExcursionStatistic excursionStatistic(Date dateStart, Date dateEnd);

}
