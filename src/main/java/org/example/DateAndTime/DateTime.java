package org.example.DateAndTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class DateTime {
    public static void main(String[] args) {
/*        Instant instant = Instant.now();
        System.out.println(instant);*/

        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);

        LocalDateTime plusTwoWeekDate = now.plusWeeks(2);
        System.out.println(plusTwoWeekDate);

        boolean after = now.isAfter(plusTwoWeekDate);
        System.out.println(after);

        boolean before = now.isBefore(plusTwoWeekDate);
        System.out.println(before);

        if (now.isBefore(plusTwoWeekDate)) {
            System.out.println("Current date is before the future date.");
        } else if (now.isAfter(plusTwoWeekDate)) {
            System.out.println("Current date is after the future date.");
        } else {
            System.out.println("Current date is the same as the future date.");
        }

        LocalDate date1 = LocalDate.of(2025, 2, 17);
        LocalDate date2 = LocalDate.of(2025, 3, 3);

        long days = ChronoUnit.DAYS.between(date1, date2);
        System.out.println(days);
    }
}
