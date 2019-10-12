package academy.softserve.museum.entities;

import java.util.List;

public class Exhibit extends Entity {
    private ExhibitType type;
    private String material;
    private Author author;
    private String technique;
    private Audience audience;
    private List<Author> authors;

    public Exhibit(long id, ExhibitType type, String material, Author author, String technique, Audience audience, List<Author> authors) {
        super(id);
        this.type = type;
        this.material = material;
        this.author = author;
        this.technique = technique;
        this.audience = audience;
        this.authors = authors;
    }

    public Exhibit(ExhibitType type, String material, Author author, String technique, Audience audience, List<Author> authors) {
        this.type = type;
        this.material = material;
        this.author = author;
        this.technique = technique;
        this.audience = audience;
        this.authors = authors;
    }

    public Exhibit() {
    }

    public ExhibitType getType() {
        return type;
    }

    public Exhibit setType(ExhibitType type) {
        this.type = type;
        return this;
    }

    public String getMaterial() {
        return material;
    }

    public Exhibit setMaterial(String material) {
        this.material = material;
        return this;
    }

    public Author getAuthor() {
        return author;
    }

    public Exhibit setAuthor(Author author) {
        this.author = author;
        return this;
    }

    public String getTechnique() {
        return technique;
    }

    public Exhibit setTechnique(String technique) {
        this.technique = technique;
        return this;
    }

    public Audience getAudience() {
        return audience;
    }

    public Exhibit setAudience(Audience audience) {
        this.audience = audience;
        return this;
    }

    public List<Author> getAuthors() {
        return authors;
    }

    public Exhibit setAuthors(List<Author> authors) {
        this.authors = authors;
        return this;
    }

}
