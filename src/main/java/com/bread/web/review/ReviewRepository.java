package com.bread.web.review;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ReviewRepository extends JpaRepository<Review,Long>, CustomReviewRepository {
    Optional<Review> findByDate(String date);
    Optional<Review> findByCategory(String categoly);
}
