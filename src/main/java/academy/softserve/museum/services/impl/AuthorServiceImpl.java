package academy.softserve.museum.services.impl;

import academy.softserve.museum.dao.impl.jdbc.JdbcAuthorDao;
import academy.softserve.museum.entities.Author;
import academy.softserve.museum.entities.Exhibit;
import academy.softserve.museum.services.AuthorService;
import java.util.List;
import java.util.Optional;

public class AuthorServiceImpl implements AuthorService {

  private JdbcAuthorDao jdbcAuthorDao;

  @Override
  public List<Exhibit> findExhibitsByAuthor(Author author) {
    return jdbcAuthorDao.findExhibitsByAuthor(author);
  }

  @Override
  public void addExhibitAuthor(Author author, Exhibit exhibit) {
    jdbcAuthorDao.addExhibitAuthor(author, exhibit);
  }

  @Override
  public void deleteExhibitAuthor(Author author, Exhibit exhibit) {
    jdbcAuthorDao.deleteExhibitAuthor(author, exhibit);
  }

  @Override
  public void save(Author objectToSave) {
    jdbcAuthorDao.save(objectToSave);
  }

  @Override
  public void deleteById(long id) {
    jdbcAuthorDao.deleteById(id);
  }

  @Override
  public Optional<Author> findById(long id) {
    return jdbcAuthorDao.findById(id);
  }

  @Override
  public List<Author> findAll() {
    return jdbcAuthorDao.findAll();
  }

  @Override
  public void update(Author newObject) {
    jdbcAuthorDao.update(newObject);
  }
}
