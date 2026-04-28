package com.phongdev.portfolio_backend.dto.response;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ContactResponse {
    private Long id;
    private String email;
    private String phone;
    private String linkedin;
    private String github;
}
