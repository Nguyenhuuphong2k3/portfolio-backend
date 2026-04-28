package com.phongdev.portfolio_backend.mapper;

import com.phongdev.portfolio_backend.dto.request.SkillRequest;
import com.phongdev.portfolio_backend.dto.response.SkillResponse;
import com.phongdev.portfolio_backend.entity.Skill;

public class SkillMapper {

    public static Skill toEntity(SkillRequest dto) {
        Skill s = new Skill();
        s.setName(dto.getName());
        s.setLevel(dto.getLevel());
        return s;
    }

    public static SkillResponse toResponse(Skill s) {
        return SkillResponse.builder()
                .id(s.getId())
                .name(s.getName())
                .level(s.getLevel())
                .build();
    }
}
