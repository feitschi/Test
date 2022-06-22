package com.example.Test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.LocalTime;

@RestController
public class Controller {

    Service service = new Service();

    @GetMapping("/api/time")
    public LocalTime localTime(){
        return service.getTime();
    }

    @GetMapping("/api/date")
    public LocalDate localDate(){
        return service.getDate();
    }

}