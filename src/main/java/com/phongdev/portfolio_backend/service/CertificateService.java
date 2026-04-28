package com.phongdev.portfolio_backend.service;

import com.phongdev.portfolio_backend.dto.request.CertificateRequest;
import com.phongdev.portfolio_backend.dto.response.CertificateResponse;
import com.phongdev.portfolio_backend.entity.Certificate;
import com.phongdev.portfolio_backend.mapper.CertificateMapper;
import com.phongdev.portfolio_backend.repository.CertificateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CertificateService {

    private final CertificateRepository repo;

    public CertificateService(CertificateRepository repo) {
        this.repo = repo;
    }

    public List<CertificateResponse> getAll() {
        return repo.findAll().stream()
                .map(CertificateMapper::toResponse)
                .collect(Collectors.toList());
    }

    public CertificateResponse create(CertificateRequest dto) {
        return CertificateMapper.toResponse(repo.save(CertificateMapper.toEntity(dto)));
    }

    public void delete(Long id) {
        repo.deleteById(id);
    }
}