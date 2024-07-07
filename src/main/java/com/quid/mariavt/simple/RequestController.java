package com.quid.mariavt.simple;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/virtual")
@RequiredArgsConstructor
public class RequestController {

    private final SimpleRepository simpleRepository;

    @GetMapping("/select")
    public String select() {
        return simpleRepository.find500ms();
    }

}
