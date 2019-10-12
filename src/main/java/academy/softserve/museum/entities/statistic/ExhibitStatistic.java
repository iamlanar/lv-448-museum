package academy.softserve.museum.entities.statistic;

import java.util.List;
import java.util.Map;

public class ExhibitStatistic {
    private Map<String, List<Integer>> materialStatistic;
    private Map<String, List<Integer>> techniqueStatistic;

    public ExhibitStatistic(Map<String, List<Integer>> materialStatistic, Map<String, List<Integer>> techniqueStatistic) {
        this.materialStatistic = materialStatistic;
        this.techniqueStatistic = techniqueStatistic;
    }

    public ExhibitStatistic() {
    }

    public Map<String, List<Integer>> getMaterialStatistic() {
        return materialStatistic;
    }

    public ExhibitStatistic setMaterialStatistic(Map<String, List<Integer>> materialStatistic) {
        this.materialStatistic = materialStatistic;
        return this;
    }

    public Map<String, List<Integer>> getTechniqueStatistic() {
        return techniqueStatistic;
    }

    public ExhibitStatistic setTechniqueStatistic(Map<String, List<Integer>> techniqueStatistic) {
        this.techniqueStatistic = techniqueStatistic;
        return this;
    }
}
