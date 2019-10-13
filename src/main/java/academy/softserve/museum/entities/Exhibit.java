package academy.softserve.museum.entities;

import java.util.List;

public class Exhibit extends Entity {
    private ExhibitType type;
    private String material;
    private String technique;

    public Exhibit(long id, ExhibitType type, String material, String technique) {
        super(id);
        this.type = type;
        this.material = material;
        this.technique = technique;
    }

    public Exhibit(ExhibitType type, String material, String technique) {
        this.type = type;
        this.material = material;
        this.technique = technique;
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

    public String getTechnique() {
        return technique;
    }

    public Exhibit setTechnique(String technique) {
        this.technique = technique;
        return this;
    }

}
