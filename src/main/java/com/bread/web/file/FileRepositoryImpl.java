package com.bread.web.file;

import com.querydsl.jpa.impl.JPAQueryFactory;
import org.springframework.data.jpa.repository.support.QuerydslRepositorySupport;

interface CustomFileRepository {}

public class FileRepositoryImpl extends QuerydslRepositorySupport implements CustomFileRepository {
    private final JPAQueryFactory jpaQueryFactory;
    public FileRepositoryImpl(JPAQueryFactory jpaQueryFactory) {
        super(File.class);
        this.jpaQueryFactory = jpaQueryFactory;
    }
}
