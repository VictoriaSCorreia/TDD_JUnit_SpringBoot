package com.project.meetupManager.service.impl;

import com.project.meetupManager.exception.BusinessException;
import com.project.meetupManager.model.Registration;
import com.project.meetupManager.repository.RegistrationRepository;
import com.project.meetupManager.service.RegistrationService;
import org.springframework.stereotype.Service;

@Service
public class RegistrationServiceImpl implements RegistrationService {
    RegistrationRepository repository;

    public RegistrationServiceImpl(RegistrationRepository repository) {
        this.repository = repository;
    }

    public Registration save(Registration registration) {
        if (repository.existsByRegistration(registration.getRegistration())) {
            throw new BusinessException("Registration Already created");
        }
        return repository.save(registration);
    }
}
