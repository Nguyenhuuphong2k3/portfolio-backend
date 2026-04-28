package com.phongdev.portfolio_backend.dto.request;

import lombok.Data;

@Data
public class ContactRequest {
    private String email;
    private String phone;
    private String linkedin;
    private String github;
}
