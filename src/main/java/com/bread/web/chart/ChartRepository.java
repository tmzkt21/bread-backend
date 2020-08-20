package com.bread.web.chart;

import com.bread.web.user.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ChartRepository extends JpaRepository<Chart,Long>, CustomChartRepository {
//SELECT * FROM user where user.name LIKE '이중두';
    @Query("select count(a) from User a ")
    public Long userTotal();
}
