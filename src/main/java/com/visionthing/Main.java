package com.visionthing;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class Main extends SpringBootServletInitializer implements CommandLineRunner {

    public static final Logger logger = LoggerFactory.getLogger(Main.class);

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        logger.info("configure() started");
        return application.sources(Main.class);
    }

    public static void main(String[] args) {
        logger.info("main() started");
        SpringApplication.run(Main.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        logger.info("run() started");
    }
}