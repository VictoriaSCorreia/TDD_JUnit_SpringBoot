package com.project.meetupManager.repository;
import com.project.meetupManager.model.Registration;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(SpringExtension.class)
@ActiveProfiles("test")
@DataJpaTest
public class RegistrationRepositoryTest {

    @Autowired
    TestEntityManager testEntityManager;

    @Autowired
    RegistrationRepository repository;

    @Test
    @DisplayName("Should return true when exists an registration already created.")
    public void returnTrueWhenRegistrationExists() {

        String registration = "123";

        Registration registration_class_attribute = createNewRegistration(registration);
        testEntityManager.persist(registration_class_attribute);
        boolean exists = repository.existsByRegistration(registration);

        assertThat(exists).isTrue(); // Test

    }

    @Test
    @DisplayName("Should return false when doesn't exists an registration_attribute with a registration already created.")
    public void returnFalseWhenRegistrationAttributeDoesntExists() {

        String registration = "123";
        boolean exists = repository.existsByRegistration(registration);

        assertThat(exists).isFalse(); // Test

    }

    public static Registration createNewRegistration(String registration) {
        return Registration.builder()
                .name("vic")
                .dateOfRegistration("15/03/2024")
                .registration(registration).build();
    }
}
