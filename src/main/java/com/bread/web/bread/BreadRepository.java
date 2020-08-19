package com.bread.web.bread;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BreadRepository extends JpaRepository<Bread,Long>, CustomBreadRepository {
}
