package com.bread.web.bread;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QBread is a Querydsl query type for Bread
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QBread extends EntityPathBase<Bread> {

    private static final long serialVersionUID = -90504411L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QBread bread = new QBread("bread");

    public final StringPath breadDescription = createString("breadDescription");

    public final NumberPath<Long> breadId = createNumber("breadId", Long.class);

    public final StringPath breadImage = createString("breadImage");

    public final StringPath breadName = createString("breadName");

    public final ListPath<com.bread.web.order.BreadOrder, com.bread.web.order.QBreadOrder> breadOrders = this.<com.bread.web.order.BreadOrder, com.bread.web.order.QBreadOrder>createList("breadOrders", com.bread.web.order.BreadOrder.class, com.bread.web.order.QBreadOrder.class, PathInits.DIRECT2);

    public final StringPath breadPrice = createString("breadPrice");

    public final com.bread.web.category.QCategory category;

    public QBread(String variable) {
        this(Bread.class, forVariable(variable), INITS);
    }

    public QBread(Path<? extends Bread> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QBread(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QBread(PathMetadata metadata, PathInits inits) {
        this(Bread.class, metadata, inits);
    }

    public QBread(Class<? extends Bread> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.category = inits.isInitialized("category") ? new com.bread.web.category.QCategory(forProperty("category")) : null;
    }

}

