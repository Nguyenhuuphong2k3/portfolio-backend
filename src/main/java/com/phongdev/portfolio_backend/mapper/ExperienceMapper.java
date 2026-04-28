package com.phongdev.portfolio_backend.mapper;

import com.phongdev.portfolio_backend.dto.request.ExperienceRequest;
import com.phongdev.portfolio_backend.dto.response.ExperienceResponse;
import com.phongdev.portfolio_backend.entity.Experience;

public class ExperienceMapper {

    public static Experience toEntity(ExperienceRequest dto) {
        Experience e = new Experience();
        e.setCompany(dto.getCompany());
        e.setPosition(dto.getPosition());
        e.setStartDate(dto.getStartDate());
        e.setEndDate(dto.getEndDate());
        e.setDescription(dto.getDescription());
        return e;
    }

    public static ExperienceResponse toResponse(Experience e) {
        return ExperienceResponse.builder()
                .id(e.getId())
                .company(e.getCompany())
                .position(e.getPosition())
                .startDate(e.getStartDate())
                .endDate(e.getEndDate())
                .description(e.getDescription())
                .build();
    }
}
