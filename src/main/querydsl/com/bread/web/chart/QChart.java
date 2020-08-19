package com.bread.web.chart;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QChart is a Querydsl query type for Chart
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QChart extends EntityPathBase<Chart> {

    private static final long serialVersionUID = -403653519L;

    public static final QChart chart = new QChart("chart");

    public final NumberPath<Long> chartId = createNumber("chartId", Long.class);

    public final StringPath sales = createString("sales");

    public final StringPath visitor = createString("visitor");

    public QChart(String variable) {
        super(Chart.class, forVariable(variable));
    }

    public QChart(Path<? extends Chart> path) {
        super(path.getType(), path.getMetadata());
    }

    public QChart(PathMetadata metadata) {
        super(Chart.class, metadata);
    }

}

