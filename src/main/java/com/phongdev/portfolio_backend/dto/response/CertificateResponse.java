package com.phongdev.portfolio_backend.dto.response;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;

@Data
@Builder
public class CertificateResponse {
    private Long id;
    private String name;
    private String organization;
    private LocalDate issueDate;
}
