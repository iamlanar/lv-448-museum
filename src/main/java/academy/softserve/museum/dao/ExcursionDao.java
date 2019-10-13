package academy.softserve.museum.dao;

import academy.softserve.museum.entities.Excursion;
import academy.softserve.museum.entities.statistic.ExcursionStatistic;

import java.sql.Date;

public interface ExcursionDao extends Crud<Excursion> {

    ExcursionStatistic findStatistic(Date dateStart, Date dateEnd);

}
