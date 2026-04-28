package com.phongdev.portfolio_backend.dto.request;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class ProjectRequest {

    @NotBlank(message = "Name is required")
    private String name;

    private String description;
    private String techStack;
    private String githubUrl;
    private String demoUrl;
}
