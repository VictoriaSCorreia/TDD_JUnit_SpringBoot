package com.project.meetupManager.controller.dto;

import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RegistrationDTO {
    private Integer id;

    @NotEmpty
    private String name;

    @NotEmpty
    private String dateOfRegistration;

    @NotEmpty
    private String registration;
}
