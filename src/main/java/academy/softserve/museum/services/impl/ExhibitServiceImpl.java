package academy.softserve.museum.services.impl;

import academy.softserve.museum.dao.ExhibitDao;
import academy.softserve.museum.entities.Audience;
import academy.softserve.museum.entities.Author;
import academy.softserve.museum.entities.Employee;
import academy.softserve.museum.entities.Exhibit;
import academy.softserve.museum.entities.statistic.ExhibitStatistic;
import academy.softserve.museum.services.ExhibitService;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class ExhibitServiceImpl implements ExhibitService {

  private ExhibitDao exhibitDao;

  @Override
  public void save(Exhibit objectToSave) {
    exhibitDao.save(objectToSave);
  }

  @Override
  public void deleteById(long id) {
    exhibitDao.deleteById(id);
  }

  @Override
  public Optional<Exhibit> findById(long id) {
    return exhibitDao.findById(id);
  }

  @Override
  public List<Exhibit> findAll() {
    return exhibitDao.findAll();
  }

  @Override
  public void update(Exhibit newObject) {
    exhibitDao.update(newObject);
  }

  @Override
  public List<Exhibit> findByAuthor(Author author) {
    return exhibitDao.findByAuthor(author);
  }

  @Override
  public List<Exhibit> findByEmployee(Employee employee) {
    return exhibitDao.findByEmployee(employee);
  }

  @Override
  public List<Author> findAuthorsByExhibit(Exhibit exhibit) {
    return exhibitDao.findAuthorsByExhibit(exhibit);
  }

  @Override
  public Audience findAudienceByExhibit(Exhibit exhibit) {
    return exhibitDao.findAudienceByExhibit(exhibit);
  }

  @Override
  public void updateExhibitAudience(Exhibit exhibit, Audience audience) {
    exhibitDao.updateExhibitAudience(exhibit, audience);
  }

  @Override
  public void addExhibitAuthor(Exhibit exhibit, Author author) {
    exhibitDao.addExhibitAuthor(exhibit, author);
  }

  @Override
  public void deleteExhibitAuthor(Exhibit exhibit, Author author) {
    exhibitDao.deleteExhibitAuthor(exhibit, author);
  }

  @Override
  public Map<Audience, List<Exhibit>> findAllGroupedByAudience(Audience audience) {
    return exhibitDao.findAllGroupedByAudience(audience);
  }

  @Override
  public ExhibitStatistic findStatistic() {
    return exhibitDao.findStatistic();
  }
}
