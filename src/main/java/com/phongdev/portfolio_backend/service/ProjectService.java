package com.phongdev.portfolio_backend.service;

import com.phongdev.portfolio_backend.dto.request.ProjectRequest;
import com.phongdev.portfolio_backend.dto.response.ProjectResponse;
import com.phongdev.portfolio_backend.entity.Project;
import com.phongdev.portfolio_backend.exception.ResourceNotFoundException;
import com.phongdev.portfolio_backend.mapper.ProjectMapper;
import com.phongdev.portfolio_backend.repository.ProjectRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProjectService {

    private final ProjectRepository repo;

    public ProjectService(ProjectRepository repo) {
        this.repo = repo;
    }

    public List<ProjectResponse> getAll() {
        return repo.findAll()
                .stream()
                .map(ProjectMapper::toResponse)
                .collect(Collectors.toList());
    }

    public ProjectResponse getById(Long id) {
        Project project = repo.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Project not found"));
        return ProjectMapper.toResponse(project);
    }

    public ProjectResponse create(ProjectRequest dto) {
        Project project = ProjectMapper.toEntity(dto);
        return ProjectMapper.toResponse(repo.save(project));
    }

    public ProjectResponse update(Long id, ProjectRequest dto) {
        Project existing = repo.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Project not found"));

        existing.setName(dto.getName());
        existing.setDescription(dto.getDescription());
        existing.setTechStack(dto.getTechStack());
        existing.setGithubUrl(dto.getGithubUrl());
        existing.setDemoUrl(dto.getDemoUrl());

        return ProjectMapper.toResponse(repo.save(existing));
    }

    public void delete(Long id) {
        if (!repo.existsById(id)) {
            throw new ResourceNotFoundException("Project not found");
        }
        repo.deleteById(id);
    }
}