package academy.softserve.museum;

import academy.softserve.museum.dao.AuthorDao;
import academy.softserve.museum.database.DaoFactory;
import academy.softserve.museum.entities.Author;

public class Main {
    public static void main(String[] args) {
        AuthorDao dao = DaoFactory.authorDao();
        dao.save(new Author("Oleh", "Kopylchak", null));

    }
}
