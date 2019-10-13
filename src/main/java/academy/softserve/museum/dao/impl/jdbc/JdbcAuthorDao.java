package academy.softserve.museum.dao.impl.jdbc;

import academy.softserve.museum.dao.AuthorDao;
import academy.softserve.museum.entities.Author;
import academy.softserve.museum.entities.Exhibit;

import java.sql.Connection;
import java.util.List;
import java.util.Optional;

public class JdbcAuthorDao implements AuthorDao {
    private final Connection connection;

    public JdbcAuthorDao(Connection connection) {
        this.connection = connection;
    }

    @Override
    public List<Exhibit> findExhibitsByAuthor(Author author) {
        return null;
    }

    @Override
    public void addExhibitAuthor(Author author, Exhibit exhibit) {

    }

    @Override
    public void deleteExhibitAuthor(Author author, Exhibit exhibit) {

    }

    @Override
    public void save(Author objectToSave) {

    }

    @Override
    public void deleteById(long id) {

    }

    @Override
    public Optional<Author> findById(long id) {
        return Optional.empty();
    }

    @Override
    public List<Author> findAll() {
        return null;
    }

    @Override
    public void update(Author newObject) {

    }
}
