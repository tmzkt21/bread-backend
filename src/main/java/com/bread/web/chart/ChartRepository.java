package com.bread.web.chart;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ChartRepository extends JpaRepository<Chart,Long>, CustomChartRepository {
}
