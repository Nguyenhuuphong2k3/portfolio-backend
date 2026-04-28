package com.phongdev.portfolio_backend.mapper;

import com.phongdev.portfolio_backend.dto.request.ContactRequest;
import com.phongdev.portfolio_backend.dto.response.ContactResponse;
import com.phongdev.portfolio_backend.entity.Contact;

public class ContactMapper {

    public static Contact toEntity(ContactRequest dto) {
        Contact c = new Contact();
        c.setEmail(dto.getEmail());
        c.setPhone(dto.getPhone());
        c.setLinkedin(dto.getLinkedin());
        c.setGithub(dto.getGithub());
        return c;
    }

    public static ContactResponse toResponse(Contact c) {
        return ContactResponse.builder()
                .id(c.getId())
                .email(c.getEmail())
                .phone(c.getPhone())
                .linkedin(c.getLinkedin())
                .github(c.getGithub())
                .build();
    }
}
