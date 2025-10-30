package com.eureka.demo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@RequestMapping("/api")
public class EurekaControllerServer {

    private final Map<Long, String> storage = new HashMap<>();
    private Long counter = 1L;

    @PostMapping
    public ResponseEntity<String> create(@RequestBody String entity) {
        storage.put(counter++, entity);
        return ResponseEntity.ok(entity);
    }

    @GetMapping
    public ResponseEntity<List<String>> findAll() {
        return ResponseEntity.ok(new ArrayList<>(storage.values()));
    }

    @GetMapping("/{id}")
    public ResponseEntity<String> responseEntityfindById(@PathVariable Long id) {
        String entity = storage.get(id);
        if (entity == null)
            return ResponseEntity.notFound().build();
        return ResponseEntity.ok(entity);
    }

    @PutMapping("/{id}")
    public ResponseEntity<String> update(@PathVariable Long id, @RequestBody String entity) {
        if (!storage.containsKey(id))
            return ResponseEntity.notFound().build();

        storage.put(id, entity);
        return ResponseEntity.ok(entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        if (!storage.containsKey(id))
            return ResponseEntity.notFound().build();

        storage.remove(id);
        return ResponseEntity.noContent().build();
    }
}
