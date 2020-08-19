package com.bread.web.chart;

import com.querydsl.jpa.impl.JPAQueryFactory;
import org.springframework.data.jpa.repository.support.QuerydslRepositorySupport;

interface CustomChartRepository {}

public class ChartRepositoryImpl extends QuerydslRepositorySupport implements CustomChartRepository {
   private final JPAQueryFactory jpaQueryFactory;
    public ChartRepositoryImpl( JPAQueryFactory jpaQueryFactory) {
        super(Chart.class);
        this.jpaQueryFactory = jpaQueryFactory;
    }
}
