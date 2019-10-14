package academy.softserve.museum.services.impl;

import academy.softserve.museum.dao.impl.jdbc.JdbcAudienceDao;
import academy.softserve.museum.entities.Audience;
import academy.softserve.museum.services.AudienceService;
import java.util.List;
import java.util.Optional;

public class AudienceServiceImpl implements AudienceService {

  private JdbcAudienceDao jdbcAudienceDao;

  @Override
  public void save(Audience objectToSave) {
    jdbcAudienceDao.save(objectToSave);
  }

  @Override
  public void deleteById(long id) {
    jdbcAudienceDao.deleteById(id);
  }

  @Override
  public Optional<Audience> findById(long id) {
    return jdbcAudienceDao.findById(id);
  }

  @Override
  public List<Audience> findAll() {
    return jdbcAudienceDao.findAll();
  }

  @Override
  public void update(Audience newObject) {
    jdbcAudienceDao.update(newObject);
  }
}
