package academy.softserve.museum.entities;

import java.util.List;

public class Author extends Entity {
    private String firstName;
    private String lastName;
    private List<Exhibit> exhibits;

    public Author(long id, String firstName, String lastName, List<Exhibit> exhibits) {
        super(id);
        this.firstName = firstName;
        this.lastName = lastName;
        this.exhibits = exhibits;
    }

    public Author(String firstName, String lastName, List<Exhibit> exhibits) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.exhibits = exhibits;
    }

    public Author() {
    }

    public String getFirstName() {
        return firstName;
    }

    public Author setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public String getLastName() {
        return lastName;
    }

    public Author setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public List<Exhibit> getExhibits() {
        return exhibits;
    }

    public Author setExhibits(List<Exhibit> exhibits) {
        this.exhibits = exhibits;
        return this;
    }

}
