package academy.softserve.museum.dao.impl.jdbc;

import academy.softserve.museum.dao.ExcursionDao;
import academy.softserve.museum.entities.Excursion;
import academy.softserve.museum.entities.statistic.ExcursionStatistic;
import java.sql.Connection;
import java.sql.Date;
import java.util.List;
import java.util.Optional;

public class JdbcExcursionDao implements ExcursionDao {
    private Connection connection;

    public JdbcExcursionDao(Connection connection) {
        this.connection = connection;
    }


    @Override
    public ExcursionStatistic findStatistic(Date dateStart, Date dateEnd) {
        return null;
    }

    @Override
    public void save(Excursion objectToSave) {

    }

    @Override
    public void deleteById(long id) {

    }

    @Override
    public Optional<Excursion> findById(long id) {
        return Optional.empty();
    }

    @Override
    public List<Excursion> findAll() {
        return null;
    }

    @Override
    public void update(Excursion newObject) {

    }
}
