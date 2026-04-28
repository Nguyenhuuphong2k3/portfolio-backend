package com.phongdev.portfolio_backend.repository;

import com.phongdev.portfolio_backend.entity.Experience;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExperienceRepository extends JpaRepository<Experience, Long> {
}
