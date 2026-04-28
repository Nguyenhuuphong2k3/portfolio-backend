package com.phongdev.portfolio_backend.repository;

import com.phongdev.portfolio_backend.entity.Profile;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfileRepository extends JpaRepository<Profile, Long> {
}
