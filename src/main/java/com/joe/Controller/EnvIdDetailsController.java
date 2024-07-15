package com.joe.Controller;

import com.joe.Entity.EnvIdDetails;
import com.joe.Repository.EnvIdDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/env-id-details")
public class EnvIdDetailsController {

    private final EnvIdDetailsRepository repository;

    @Autowired
    public EnvIdDetailsController(EnvIdDetailsRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<EnvIdDetails> getAllEnvIdDetails() {
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public EnvIdDetails getEnvIdDetailsById(@PathVariable Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("EnvIdDetails not found with id " + id));
    }

    @PostMapping
    public EnvIdDetails createEnvIdDetails(@RequestBody EnvIdDetails envIdDetails) {
        return repository.save(envIdDetails);
    }

    // Other CRUD operations as needed (PUT, DELETE, etc.)
}
