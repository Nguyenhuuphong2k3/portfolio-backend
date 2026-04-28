package com.phongdev.portfolio_backend.controller;

import com.phongdev.portfolio_backend.dto.request.ContactRequest;
import com.phongdev.portfolio_backend.dto.response.ContactResponse;
import com.phongdev.portfolio_backend.entity.Contact;
import com.phongdev.portfolio_backend.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/contact")
@CrossOrigin("*")
public class ContactController {

    private final ContactService service;

    public ContactController(ContactService service) {
        this.service = service;
    }

    @GetMapping
    public ContactResponse get() {
        return service.get();
    }

    @PostMapping
    public ContactResponse save(@RequestBody ContactRequest dto) {
        return service.save(dto);
    }
}