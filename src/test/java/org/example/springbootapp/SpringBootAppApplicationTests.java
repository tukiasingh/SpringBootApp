package org.example.springbootapp;

import org.example.springbootapp.controller.SpringBootAppController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringBootAppApplicationTests {
    @Autowired
    SpringBootAppController springBootAppController;

    @Test
    void contextLoads() {
        assert springBootAppController != null;
    }

}
