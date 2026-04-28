package com.phongdev.portfolio_backend.controller;

import com.phongdev.portfolio_backend.dto.request.SkillRequest;
import com.phongdev.portfolio_backend.dto.response.SkillResponse;
import com.phongdev.portfolio_backend.entity.Skill;
import com.phongdev.portfolio_backend.service.SkillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/skill")
@CrossOrigin("*")
public class SkillController {

    private final SkillService service;

    public SkillController(SkillService service) {
        this.service = service;
    }

    @GetMapping
    public List<SkillResponse> getAll() {
        return service.getAll();
    }

    @PostMapping
    public SkillResponse create(@RequestBody SkillRequest dto) {
        return service.create(dto);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}