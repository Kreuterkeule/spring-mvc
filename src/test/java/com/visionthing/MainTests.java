package com.visionthing;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class MainTests {

    public static final Logger LOGGER = LoggerFactory.getLogger(MainTests.class);

    @Autowired
    static HomeController CONTROLLER =  new HomeController();

    @Test
    void contextLoads() {
        LOGGER.info("contextLoads() executed");
        assertThat(CONTROLLER).isNotNull();
    }

    @Test
    void getROOTOutputTest() {
        // given
        String expectedOutput = "<p style='color: green;'>Hello, World!</p>";
        // when
        String actualOutput = CONTROLLER.homePage();
        // then
        assertEquals(expectedOutput, actualOutput);
        // Output = Hello, World!
    }
}
