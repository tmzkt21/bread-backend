package com.bread.web.order;

import com.bread.web.bread.Bread;
import com.querydsl.jpa.impl.JPAQueryFactory;
import org.springframework.data.jpa.repository.support.QuerydslRepositorySupport;

interface CustomBreadRepository{}

public class BreadOrderRepositoryImpl extends QuerydslRepositorySupport implements CustomBreadRepository{
    private final JPAQueryFactory jpaQueryFactory;
    public BreadOrderRepositoryImpl(JPAQueryFactory jpaQueryFactory) {
        super(Bread.class);
        this.jpaQueryFactory = jpaQueryFactory;
    }
}
