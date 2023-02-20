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

    public static final Logger LOGGER = LoggerFactory.getLogger(Main.class);

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        LOGGER.info("configure() executed");
        return application.sources(Main.class);
    }

    public static void main(String[] args) {
        LOGGER.info("main() executed");
        SpringApplication.run(Main.class, args);
    }

    @Override
    public void run(String... args) {
        LOGGER.info("run() started");
    }
}