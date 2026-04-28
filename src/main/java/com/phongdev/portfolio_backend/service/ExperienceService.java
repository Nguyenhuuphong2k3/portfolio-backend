package com.phongdev.portfolio_backend.service;


import com.phongdev.portfolio_backend.dto.request.ExperienceRequest;
import com.phongdev.portfolio_backend.dto.response.ExperienceResponse;
import com.phongdev.portfolio_backend.entity.Experience;
import com.phongdev.portfolio_backend.exception.ResourceNotFoundException;
import com.phongdev.portfolio_backend.mapper.ExperienceMapper;
import com.phongdev.portfolio_backend.repository.ExperienceRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ExperienceService {

    private final ExperienceRepository repo;

    public ExperienceService(ExperienceRepository repo) {
        this.repo = repo;
    }

    public List<ExperienceResponse> getAll() {
        return repo.findAll()
                .stream()
                .map(ExperienceMapper::toResponse)
                .collect(Collectors.toList());
    }

    public ExperienceResponse getById(Long id) {
        Experience e = repo.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Experience not found"));
        return ExperienceMapper.toResponse(e);
    }

    public ExperienceResponse create(ExperienceRequest dto) {
        return ExperienceMapper.toResponse(repo.save(ExperienceMapper.toEntity(dto)));
    }

    public ExperienceResponse update(Long id, ExperienceRequest dto) {
        Experience e = repo.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Experience not found"));

        e.setCompany(dto.getCompany());
        e.setPosition(dto.getPosition());
        e.setStartDate(dto.getStartDate());
        e.setEndDate(dto.getEndDate());
        e.setDescription(dto.getDescription());

        return ExperienceMapper.toResponse(repo.save(e));
    }

    public void delete(Long id) {
        if (!repo.existsById(id)) {
            throw new ResourceNotFoundException("Experience not found");
        }
        repo.deleteById(id);
    }
}