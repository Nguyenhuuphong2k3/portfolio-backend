package com.phongdev.portfolio_backend.controller;


import com.phongdev.portfolio_backend.dto.request.ExperienceRequest;
import com.phongdev.portfolio_backend.dto.response.ExperienceResponse;
import com.phongdev.portfolio_backend.service.ExperienceService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/experience")
@CrossOrigin("*")
public class ExperienceController {

    private final ExperienceService service;

    public ExperienceController(ExperienceService service) {
        this.service = service;
    }

    @GetMapping
    public List<ExperienceResponse> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public ExperienceResponse getById(@PathVariable Long id) {
        return service.getById(id);
    }

    @PostMapping
    public ExperienceResponse create(@Valid @RequestBody ExperienceRequest dto) {
        return service.create(dto);
    }

    @PutMapping("/{id}")
    public ExperienceResponse update(@PathVariable Long id,
                                     @Valid @RequestBody ExperienceRequest dto) {
        return service.update(id, dto);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}