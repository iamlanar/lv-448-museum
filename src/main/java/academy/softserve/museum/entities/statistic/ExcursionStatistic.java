package academy.softserve.museum.entities.statistic;

import java.sql.Date;

public class ExcursionStatistic {
    private long excursionCount;
    private Date dateStart;
    private Date dateEnd;

    public ExcursionStatistic(long excursionCount, Date dateStart, Date dateEnd) {
        this.excursionCount = excursionCount;
        this.dateStart = dateStart;
        this.dateEnd = dateEnd;
    }

    public ExcursionStatistic() {
    }

    public long getExcursionCount() {
        return excursionCount;
    }

    public ExcursionStatistic setExcursionCount(long excursionCount) {
        this.excursionCount = excursionCount;
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
