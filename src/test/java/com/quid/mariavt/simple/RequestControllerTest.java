package com.quid.mariavt.simple;

import org.junit.jupiter.api.Test;
import org.springframework.web.client.RestClient;

class RequestControllerTest {

    private final RestClient restClient = RestClient.builder().build();

    @Test
    void select() {
        restClient.get()
            .uri("http://localhost:8080/request/500ms")
            .retrieve()
            .body(String.class);
    }

}