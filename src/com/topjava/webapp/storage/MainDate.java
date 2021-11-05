package com.topjava.webapp.storage;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class MainDate {
    public static void main(String[] args) {
        Date date = new Date();
        long start = System.currentTimeMillis();
        System.out.println(date);
        System.out.println(System.currentTimeMillis() - start);

        Calendar calendar = Calendar.getInstance();
        calendar.setTimeZone(TimeZone.getTimeZone("America/Los_Angeles"));
        System.out.println(calendar.getTime());

        LocalDate ld = LocalDate.now();
        LocalTime lt = LocalTime.now();
        LocalDateTime ldt = LocalDateTime.now();
        LocalDateTime ldt2 = LocalDateTime.of(ld, lt);
        System.out.println(ldt + "\n" + ldt2);

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yy");
        System.out.println(sdf.format(date));

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yy");
        System.out.println(dtf.format(ldt));
    }
}
