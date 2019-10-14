package academy.softserve.museum.dao.impl.jdbc.mappers;

import academy.softserve.museum.entities.Audience;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AudienceRowMapper implements RowMapper<Audience> {

  @Override
  public Audience mapRow(ResultSet resultSet) {
    Audience audience = new Audience();

    try {
      audience.setId(resultSet.getLong("id"));
      audience.setName(resultSet.getString("name"));
      return audience;
    } catch (SQLException e) {
      throw new RuntimeException(e);
    }
  }
}
