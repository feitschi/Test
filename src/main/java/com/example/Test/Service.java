package com.example.Test;
import java.time.LocalTime;
import java.time.LocalDate;


public class Service {

    public LocalTime getTime(){
        LocalTime now = LocalTime.now();
        return now;
    }

    public LocalDate getDate(){
        LocalDate today = LocalDate.now();
        return today;
    }

}
