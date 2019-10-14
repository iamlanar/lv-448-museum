package academy.softserve.museum.dao.impl.jdbc;

import academy.softserve.museum.dao.AudienceDao;
import academy.softserve.museum.entities.Audience;
import java.sql.Connection;
import java.util.List;
import java.util.Optional;

public class JdbcAudienceDao implements AudienceDao {

  private Connection connection;

  public JdbcAudienceDao(Connection connection) {
    this.connection = connection;
  }

  @Override
  public void save(Audience objectToSave) {

  }

  @Override
  public void deleteById(long id) {

  }

  @Override
  public Optional<Audience> findById(long id) {
    return Optional.empty();
  }

  @Override
  public List<Audience> findAll() {
    return null;
  }

  @Override
  public void update(Audience newObject) {

  }
}
