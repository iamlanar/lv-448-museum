package academy.softserve.museum.dao.impl.jdbc.mappers;

import academy.softserve.museum.entities.Author;

import java.sql.ResultSet;
import java.sql.SQLException;

public class AuthorRowMapper implements RowMapper<Author> {

    @Override
    public Author mapRow(ResultSet resultSet) {
        Author author = new Author();

        try {
            author.setId(resultSet.getLong("id"));
            author.setFirstName(resultSet.getString("first_name"));
            author.setLastName(resultSet.getString("last_name"));

            return author;
        }catch (SQLException e){
            throw new RuntimeException(e);
        }
    }
}
