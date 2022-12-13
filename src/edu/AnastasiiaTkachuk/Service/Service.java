package edu.AnastasiiaTkachuk.Service;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Service {
    public static LocalDateTime getDateTime(String date){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        LocalDateTime dateTime = LocalDateTime.parse(date, formatter);
        return dateTime;
    }
}
