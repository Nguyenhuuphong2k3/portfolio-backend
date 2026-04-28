package com.phongdev.portfolio_backend.mapper;

import com.phongdev.portfolio_backend.dto.request.ProjectRequest;
import com.phongdev.portfolio_backend.dto.response.ProjectResponse;
import com.phongdev.portfolio_backend.entity.Project;

public class ProjectMapper {

    public static Project toEntity(ProjectRequest dto) {
        Project p = new Project();
        p.setName(dto.getName());
        p.setDescription(dto.getDescription());
        p.setTechStack(dto.getTechStack());
        p.setGithubUrl(dto.getGithubUrl());
        p.setDemoUrl(dto.getDemoUrl());
        return p;
    }

    public static ProjectResponse toResponse(Project p) {
        return ProjectResponse.builder()
                .id(p.getId())
                .name(p.getName())
                .description(p.getDescription())
                .techStack(p.getTechStack())
                .githubUrl(p.getGithubUrl())
                .demoUrl(p.getDemoUrl())
                .build();
    }
}
