package com.phongdev.portfolio_backend.controller;

import com.phongdev.portfolio_backend.entity.Profile;
import com.phongdev.portfolio_backend.service.ProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/profile")
@CrossOrigin("*")
public class ProfileController {

    @Autowired
    private ProfileService service;

    @GetMapping
    public Profile getProfile() {
        return service.getProfile();
    }

    @PostMapping
    public Profile save(@RequestBody Profile profile) {
        return service.save(profile);
    }
}
