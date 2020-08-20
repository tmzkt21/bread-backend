package com.bread.web.chart;

import static  com.bread.web.user.QUser.user;
import com.querydsl.jpa.impl.JPAQueryFactory;
import org.springframework.data.jpa.repository.support.QuerydslRepositorySupport;
import org.springframework.stereotype.Service;


interface CustomChartRepository {
//        Long userTotalCount();
}
@Service
public class ChartRepositoryImpl extends QuerydslRepositorySupport implements CustomChartRepository {
   private final JPAQueryFactory jpaQueryFactory;

    public ChartRepositoryImpl(JPAQueryFactory jpaQueryFactory) {
        super(Chart.class);
        this.jpaQueryFactory = jpaQueryFactory;
    }

//    @Override
//    public Long userTotalCount() {
//        System.out.println("userTotal");
//     //   Map<String,Long> result = new HashMap<>();
//       Long userResult= jpaQueryFactory.selectFrom(user).where(user.name.like("이중두")).fetchCount();
//
//      //  result.put("totalUser",userResult);
//        return userResult;
//    }
}
