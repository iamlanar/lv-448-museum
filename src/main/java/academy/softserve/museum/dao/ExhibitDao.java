package academy.softserve.museum.dao;

import academy.softserve.museum.entities.*;
import academy.softserve.museum.entities.statistic.ExhibitStatistic;

import java.util.List;
import java.util.Map;

public interface ExhibitDao extends Crud<Exhibit> {

    List<Exhibit> findByAuthor(Author author);

    List<Exhibit> findByEmployee(Employee audienceManager);

    Map<Audience, List<Exhibit>> findAllGroupedByAudience(Audience audience);

    ExhibitStatistic exhibitStatistic();

}
