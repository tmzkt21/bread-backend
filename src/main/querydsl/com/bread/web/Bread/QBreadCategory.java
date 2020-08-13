package com.bread.web.Bread;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QBreadCategory is a Querydsl query type for BreadCategory
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QBreadCategory extends EntityPathBase<BreadCategory> {

    private static final long serialVersionUID = -1134758109L;

    public static final QBreadCategory breadCategory = new QBreadCategory("breadCategory");

    public final StringPath allergy = createString("allergy");

    public final ListPath<Bread, QBread> breads = this.<Bread, QBread>createList("breads", Bread.class, QBread.class, PathInits.DIRECT2);

    public final NumberPath<Long> chartId = createNumber("chartId", Long.class);

    public final StringPath option = createString("option");

    public QBreadCategory(String variable) {
        super(BreadCategory.class, forVariable(variable));
    }

    public QBreadCategory(Path<? extends BreadCategory> path) {
        super(path.getType(), path.getMetadata());
    }

    public QBreadCategory(PathMetadata metadata) {
        super(BreadCategory.class, metadata);
    }

}

