package com.bread.web.registration;

import com.querydsl.jpa.impl.JPAQueryFactory;
import org.springframework.data.jpa.repository.support.QuerydslRepositorySupport;
import org.springframework.stereotype.Repository;

interface CustomRegistrationRepository {

}

@Repository
public class RegistrationRepositoryImpl extends QuerydslRepositorySupport implements CustomRegistrationRepository {
   private final JPAQueryFactory jpaQueryFactory;
    public RegistrationRepositoryImpl(JPAQueryFactory jpaQueryFactory, JPAQueryFactory jpaQueryFactory1) {
        super(Registration.class);
        this.jpaQueryFactory = jpaQueryFactory;
    }
}
