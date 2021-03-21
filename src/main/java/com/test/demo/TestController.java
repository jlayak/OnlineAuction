package com.test.demo;

import org.slf4j.ILoggerFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

        public static final Logger logger= LoggerFactory.getLogger(TestController.class);

        @GetMapping("/demo")
        public String index() {
            logger.debug("Inside controller");
            return "Greetings from Spring Boot!";
        }



    }

