package academy.softserve.museum.dao.impl.jdbc;

import academy.softserve.museum.dao.AuthorDao;
import academy.softserve.museum.entities.Author;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

public class JdbcAuthorDao implements AuthorDao {
    private final Connection connection;

    public JdbcAuthorDao(Connection connection) {
        this.connection = connection;
    }

    @Override
    public void save(Author objectToSave) {
        String INSERT_AUTHOR = "INSERT INTO autors(first_name, last_name) values (?, ?)";

        try (PreparedStatement statement = connection.prepareStatement(INSERT_AUTHOR)) {
            statement.setString(1, objectToSave.getFirstName());
            statement.setString(2, objectToSave.getLastName());

            statement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
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
    public void updateById(long id, Author newObject) {

    }

}
