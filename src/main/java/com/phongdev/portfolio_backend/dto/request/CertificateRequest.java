package com.phongdev.portfolio_backend.dto.request;

import lombok.Data;

import java.time.LocalDate;

@Data
public class CertificateRequest {
    private String name;
    private String organization;
    private LocalDate issueDate;
}