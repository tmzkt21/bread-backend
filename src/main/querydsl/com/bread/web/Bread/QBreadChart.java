package com.bread.web.Bread;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QBreadChart is a Querydsl query type for BreadChart
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QBreadChart extends EntityPathBase<BreadChart> {

    private static final long serialVersionUID = -1651025959L;

    public static final QBreadChart breadChart = new QBreadChart("breadChart");

    public final NumberPath<Long> chartId = createNumber("chartId", Long.class);

    public final StringPath sales = createString("sales");

    public final StringPath visitor = createString("visitor");

    public QBreadChart(String variable) {
        super(BreadChart.class, forVariable(variable));
    }

    public QBreadChart(Path<? extends BreadChart> path) {
        super(path.getType(), path.getMetadata());
    }

    public QBreadChart(PathMetadata metadata) {
        super(BreadChart.class, metadata);
    }

}

