package academy.softserve.museum.entities;

import java.util.List;

public class Audience extends Entity {
    private String name;
    private List<Exhibit> exhibits;

    public Audience(long id, String name, List<Exhibit> exhibits) {
        super(id);
        this.name = name;
        this.exhibits = exhibits;
    }

    public Audience(String name, List<Exhibit> exhibits) {
        this.name = name;
        this.exhibits = exhibits;
    }

    public Audience() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Exhibit> getExhibits() {
        return exhibits;
    }

    public void setExhibits(List<Exhibit> exhibits) {
        this.exhibits = exhibits;
    }

}
