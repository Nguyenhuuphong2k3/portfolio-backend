package com.phongdev.portfolio_backend.repository;

import com.phongdev.portfolio_backend.entity.Certificate;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CertificateRepository extends JpaRepository<Certificate, Long> {
}
