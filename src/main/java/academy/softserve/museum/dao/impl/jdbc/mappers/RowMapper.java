package academy.softserve.museum.dao.impl.jdbc.mappers;

import java.sql.ResultSet;

public interface RowMapper<T> {
    T mapRow(ResultSet resultSet);
}
