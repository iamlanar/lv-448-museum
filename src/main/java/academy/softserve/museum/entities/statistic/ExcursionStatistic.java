package academy.softserve.museum.entities.statistic;

import academy.softserve.museum.entities.Excursion;

import java.sql.Date;
import java.util.Map;

public class ExcursionStatistic {
    private Map<Excursion, Integer> excursionCountMap;
    private Date dateStart;
    private Date dateEnd;

    public ExcursionStatistic(Map<Excursion, Integer> excursionCountMap, Date dateStart, Date dateEnd) {
        this.excursionCountMap = excursionCountMap;
        this.dateStart = dateStart;
        this.dateEnd = dateEnd;
    }

    public ExcursionStatistic() {
    }

    public Map<Excursion, Integer> getExcursionCountMap() {
        return excursionCountMap;
    }

    public ExcursionStatistic setExcursionCountMap(Map<Excursion, Integer> excursionCountMap) {
        this.excursionCountMap = excursionCountMap;
        return this;
    }

    public Date getDateStart() {
        return dateStart;
    }

    public ExcursionStatistic setDateStart(Date dateStart) {
        this.dateStart = dateStart;
        return this;
    }

    public Date getDateEnd() {
        return dateEnd;
    }

    public ExcursionStatistic setDateEnd(Date dateEnd) {
        this.dateEnd = dateEnd;
        return this;
    }
}
