package com.visionthing;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.stereotype.Controller;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class MainTests {

    public static final Logger logger = LoggerFactory.getLogger(MainTests.class);

    @Test
    void contextLoads() {
        logger.info("contextLoads() executed");
        assertEquals(true, true);
    }

    @Test
    void getROOTOutputTest() {
        // given
        String expectedOutput = "<p style='color: green;'>Hello, World!</p>";
        // when
        HomeController controller =  new HomeController();
        String actualOutput = controller.homePage();
        // then
        assertEquals(expectedOutput, actualOutput);
        // Output = Hello, World!
    }
}
