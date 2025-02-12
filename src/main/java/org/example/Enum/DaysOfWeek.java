package org.example.Enum;

public class DaysOfWeek {
    private Days days;

    public DaysOfWeek(Days days) {
        this.days = days;
    }

    public static String getDayType(Days day) {
        if(day == Days.SATURDAY || day == Days.SUNDAY) {
            return "Weekend";
        } else {
            return day.name();
        }
    }
}
