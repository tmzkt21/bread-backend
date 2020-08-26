package com.bread.web.page;

import com.querydsl.jpa.impl.JPAQueryFactory;
import org.springframework.data.jpa.repository.support.QuerydslRepositorySupport;
import org.springframework.stereotype.Repository;

interface CustomPageRepository {}

@Repository
public class PageRepositoryImpl extends QuerydslRepositorySupport implements CustomPageRepository {
    private final JPAQueryFactory jpaQueryFactory;
    public PageRepositoryImpl(JPAQueryFactory jpaQueryFactory, JPAQueryFactory jpaQueryFactory1) {
        super(Page.class);
        this.jpaQueryFactory = jpaQueryFactory1;
    }
}
