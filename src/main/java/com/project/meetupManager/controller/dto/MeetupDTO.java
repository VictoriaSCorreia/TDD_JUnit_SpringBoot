package com.project.meetupManager.controller.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class MeetupDTO {
    private Integer id;

    private String registrationAttribute;

    private String event;

    private RegistrationDTO registration;
}