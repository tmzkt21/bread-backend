package com.bread.web.registration;

import org.springframework.data.jpa.repository.JpaRepository;

public interface RegistrationRepository extends JpaRepository<Registration,Long>, CustomRegistrationRepository {
}
