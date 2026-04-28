package com.phongdev.portfolio_backend.controller;

import com.phongdev.portfolio_backend.dto.request.CertificateRequest;
import com.phongdev.portfolio_backend.dto.response.CertificateResponse;
import com.phongdev.portfolio_backend.entity.Certificate;
import com.phongdev.portfolio_backend.service.CertificateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/certificate")
@CrossOrigin("*")
public class CertificateController {

    private final CertificateService service;

    public CertificateController(CertificateService service) {
        this.service = service;
    }

    @GetMapping
    public List<CertificateResponse> getAll() {
        return service.getAll();
    }

    @PostMapping
    public CertificateResponse create(@RequestBody CertificateRequest dto) {
        return service.create(dto);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}