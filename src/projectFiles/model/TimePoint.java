package projectFiles.model;

import java.math.BigDecimal;
import java.time.LocalDate;

public class TimePoint {
    private final  LocalDate date;
    private final  BigDecimal year;
    private final  BigDecimal months;

    public TimePoint(LocalDate date, BigDecimal year, BigDecimal months) {
        this.date = date;
        this.year = year;
        this.months = months;
    }


    public LocalDate getDate() {
        return date;
    }

    public BigDecimal getYear() {
        return year;
    }

    public BigDecimal getMonths() {
        return months;
    }
}
