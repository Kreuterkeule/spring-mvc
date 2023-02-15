package com.visionthing;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class MainTests {

    public static final Logger logger = LoggerFactory.getLogger(MainTests.class);

    @Test
    void contextLoads() {
        logger.info("contextLoads() started");
        assertEquals(true, true);
    }
}
