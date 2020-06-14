package com.sermicro.backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

/**
 * Request controller.
 */
@RestController
public class RequestCounterController {

    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/requests")
    public Long getRequestCount() {
        return counter.incrementAndGet();
    }
}
