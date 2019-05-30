package org.slipover.demo.web.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/json")
public class DemoJsonController {

    @Value("${spring.application.name:spring-boot-demo}")
    private String applicationName;

    @RequestMapping("/application/name")
    public String getApplicationName() {
        return applicationName;
    }

}
