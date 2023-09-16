package com.yourname.datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class DateTimeExamples {

    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        System.out.println("Current date and time: " + now);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedNow = now.format(formatter);
        System.out.println("Formatted date and time: " + formattedNow);

        LocalDate today = LocalDate.now();
        LocalDate nextMonth = today.plus(1, ChronoUnit.MONTHS);
        System.out.println("Date next month: " + nextMonth);

        LocalTime timeNow = LocalTime.now();
        LocalTime inTwoHours = timeNow.plus(2, ChronoUnit.HOURS);
        System.out.println("Time in two hours: " + inTwoHours);
    }
}
