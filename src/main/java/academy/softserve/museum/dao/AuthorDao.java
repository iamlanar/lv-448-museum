package academy.softserve.museum.dao;

import academy.softserve.museum.entities.Author;
import academy.softserve.museum.entities.Exhibit;

import java.util.List;

public interface AuthorDao extends Crud<Author> {

    List<Exhibit> findExhibitsByAuthor(Author author);

    void addExhibitAuthor(Author author, Exhibit exhibit);

    void deleteExhibitAuthor(Author author, Exhibit exhibit);

}
