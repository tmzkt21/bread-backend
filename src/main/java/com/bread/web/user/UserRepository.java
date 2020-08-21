package com.bread.web.user;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long>, CustomUserRepository {

    Optional<User> findByUserId(String userId);

//    @Query("select u.visitor,u.sales FROM User u WHERE u.name LIKE %:name%")
//    Optional<User> findByName(@Param("name") String name);
    @Query("select u.sales FROM User u WHERE u.name LIKE %:name%")
    Optional<User> findByName(@Param("name") String name);



}