package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class DemoApplicationIT {
    @Test
    void my_simple_integration_test() {
        System.out.println("This is a integration test!");
    }

}
