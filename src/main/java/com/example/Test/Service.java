package com.example.Test;
import java.time.LocalTime;


public class Service {
    public LocalTime getTime(){
        LocalTime now = LocalTime.now();
        return now;
    }

}
