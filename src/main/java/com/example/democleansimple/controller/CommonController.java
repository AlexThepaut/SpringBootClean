package com.example.democleansimple.controller;

import com.example.democleansimple.service.CommonService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

public abstract class CommonController<I, E, T> {
    abstract CommonService<I, E, T> service();

    @GetMapping()
    ResponseEntity<Object> getAll() {
        try {
            var result = service().getAll();

            if (result.isEmpty()) return ResponseEntity.noContent().build();

            return ResponseEntity.ok(result);
        } catch (Exception e) {
            return ResponseEntity.internalServerError().build();
        }
    }
}
