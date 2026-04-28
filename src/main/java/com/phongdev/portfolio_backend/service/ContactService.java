package com.phongdev.portfolio_backend.service;

import com.phongdev.portfolio_backend.dto.request.ContactRequest;
import com.phongdev.portfolio_backend.dto.response.ContactResponse;
import com.phongdev.portfolio_backend.entity.Contact;
import com.phongdev.portfolio_backend.mapper.ContactMapper;
import com.phongdev.portfolio_backend.repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContactService {

    private final ContactRepository repo;

    public ContactService(ContactRepository repo) {
        this.repo = repo;
    }

    public ContactResponse get() {
        Contact c = repo.findAll().stream().findFirst().orElse(null);
        return c == null ? null : ContactMapper.toResponse(c);
    }

    public ContactResponse save(ContactRequest dto) {
        return ContactMapper.toResponse(repo.save(ContactMapper.toEntity(dto)));
    }
}