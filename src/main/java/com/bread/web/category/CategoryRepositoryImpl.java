package com.bread.web.category;

import com.querydsl.jpa.impl.JPAQueryFactory;
import org.springframework.data.jpa.repository.support.QuerydslRepositorySupport;
import org.springframework.stereotype.Repository;

interface CategoryCustomRepository {

}

@Repository
public class CategoryRepositoryImpl extends QuerydslRepositorySupport implements CategoryCustomRepository {
   private final JPAQueryFactory jpaQueryFactory;
    public CategoryRepositoryImpl(JPAQueryFactory jpaQueryFactory) {
        super(Category.class);
        this.jpaQueryFactory = jpaQueryFactory;
    }
}
