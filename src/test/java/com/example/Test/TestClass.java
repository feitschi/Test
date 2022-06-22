package com.example.Test;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.assertj.core.api.Assertions.assertThat;

import java.time.LocalDate;
import java.time.LocalTime;

@SpringBootTest
public class TestClass {
    Service service = new Service();

    @Test
    public void test_TimeGreater(){
        LocalTime lt = LocalTime.of(00, 00, 00, 00000);

        assertThat(service.getTime()).isAfter(lt);
    }

    public void test_DateGreater(){
        LocalDate ld = LocalDate.of(2000, 01, 01);
        assertThat(service.getDate()).isAfter(ld);
    }

}
