package com.phongdev.portfolio_backend.mapper;

import com.phongdev.portfolio_backend.dto.request.CertificateRequest;
import com.phongdev.portfolio_backend.dto.response.CertificateResponse;
import com.phongdev.portfolio_backend.entity.Certificate;

public class CertificateMapper {

    public static Certificate toEntity(CertificateRequest dto) {
        Certificate c = new Certificate();
        c.setName(dto.getName());
        c.setOrganization(dto.getOrganization());
        c.setIssueDate(dto.getIssueDate());
        return c;
    }

    public static CertificateResponse toResponse(Certificate c) {
        return CertificateResponse.builder()
                .id(c.getId())
                .name(c.getName())
                .organization(c.getOrganization())
                .issueDate(c.getIssueDate())
                .build();
    }
}
