package com.bread.web.registration;

import com.bread.web.registration.Registration;
import com.bread.web.utils.GenericService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

interface RegistrationService extends GenericService<Registration> {

}
@Service
@AllArgsConstructor
public class RegistrationServiceImpl implements RegistrationService {
    final private RegistrationRepository registrationRepository;

    @Override
    public Optional<Registration> findById(String id) {
        return Optional.empty();
    }

    @Override
    public Iterable<Registration> findAll() {
        return null;
    }

    @Override
    public int count() {
        return 0;
    }

    @Override
    public void delete(String id) {

    }

    @Override
    public boolean exists(String id) {
        return false;
    }
}
