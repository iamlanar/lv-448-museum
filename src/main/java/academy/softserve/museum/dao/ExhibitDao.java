package academy.softserve.museum.dao;

import academy.softserve.museum.entities.*;
import academy.softserve.museum.entities.statistic.ExhibitStatistic;

import java.util.List;
import java.util.Map;

public interface ExhibitDao extends Crud<Exhibit> {

    List<Exhibit> findByAuthor(Author author);

    List<Exhibit> findByEmployee(Employee employee);

    List<Author> findAuthorsByExhibit(Exhibit exhibit);

    Audience findAudienceByExhibit(Exhibit exhibit);

    void updateExhibitAudience(Exhibit exhibit, Audience audience);

    void addExhibitAuthor(Exhibit exhibit, Author author);

    void deleteExhibitAuthor(Exhibit exhibit, Author author);

    Map<Audience, List<Exhibit>> findAllGroupedByAudience(Audience audience);

    ExhibitStatistic findStatistic();

}
