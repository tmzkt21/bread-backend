package com.bread.web.Bread;

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

    private static final long serialVersionUID = 1577364229L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QBread bread = new QBread("bread");

    public final QBreadCategory breadCategory;

    public final StringPath breadDescription = createString("breadDescription");

    public final NumberPath<Long> breadId = createNumber("breadId", Long.class);

    public final StringPath breadName = createString("breadName");

    public final StringPath breadNumberPrice = createString("breadNumberPrice");

    public final ListPath<BreadOrder, QBreadOrder> breadOrders = this.<BreadOrder, QBreadOrder>createList("breadOrders", BreadOrder.class, QBreadOrder.class, PathInits.DIRECT2);

    public final StringPath breadPhotography = createString("breadPhotography");

    public final StringPath breadPrice = createString("breadPrice");

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
        this.breadCategory = inits.isInitialized("breadCategory") ? new QBreadCategory(forProperty("breadCategory")) : null;
    }

}

