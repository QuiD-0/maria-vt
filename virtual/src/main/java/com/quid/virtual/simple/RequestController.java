package com.quid.virtual.simple;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/virtual")
public class RequestController {

    private final SimpleRepository simpleRepository;

    public RequestController(SimpleRepository simpleRepository) {
        this.simpleRepository = simpleRepository;
    }

    @GetMapping("/select")
    public String select() {
        return simpleRepository.select();
    }

}
