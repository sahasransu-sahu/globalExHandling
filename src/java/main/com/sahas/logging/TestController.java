package com.sahas.logging;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping(value = "/hitme")
    void hitMe() {
        throw new RuntimeException("Runtime Exception has occured");
    }
}
