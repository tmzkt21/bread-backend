package com.bread.web.order;

import com.bread.web.bread.Bread;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BreadOrderRepository extends JpaRepository<Bread,Long>, CustomBreadRepository {
}
