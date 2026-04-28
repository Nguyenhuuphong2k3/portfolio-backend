package com.phongdev.portfolio_backend.dto.request;

import lombok.Data;
import java.time.LocalDate;

@Data
public class ExperienceRequest {
    private String company;
    private String position;
    private LocalDate startDate;
    private LocalDate endDate;
    private String description;
}
