package com.phongdev.portfolio_backend.service;

import com.phongdev.portfolio_backend.dto.request.SkillRequest;
import com.phongdev.portfolio_backend.dto.response.SkillResponse;
import com.phongdev.portfolio_backend.entity.Skill;
import com.phongdev.portfolio_backend.mapper.SkillMapper;
import com.phongdev.portfolio_backend.repository.SkillRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class SkillService {

    private final SkillRepository repo;

    public SkillService(SkillRepository repo) {
        this.repo = repo;
    }

    public List<SkillResponse> getAll() {
        return repo.findAll().stream()
                .map(SkillMapper::toResponse)
                .collect(Collectors.toList());
    }

    public SkillResponse create(SkillRequest dto) {
        return SkillMapper.toResponse(repo.save(SkillMapper.toEntity(dto)));
    }

    public void delete(Long id) {
        repo.deleteById(id);
    }
}