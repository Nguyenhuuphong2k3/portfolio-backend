package com.phongdev.portfolio_backend.service;

import com.phongdev.portfolio_backend.entity.Profile;
import com.phongdev.portfolio_backend.repository.ProfileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProfileService {

    @Autowired
    private ProfileRepository repo;

    public Profile getProfile() {
        return repo.findAll().stream().findFirst().orElse(null);
    }

    public Profile save(Profile profile) {
        return repo.save(profile);
    }
}
