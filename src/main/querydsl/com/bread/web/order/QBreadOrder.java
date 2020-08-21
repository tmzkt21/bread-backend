package com.bread.web.order;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QBreadOrder is a Querydsl query type for BreadOrder
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QBreadOrder extends EntityPathBase<BreadOrder> {

    private static final long serialVersionUID = -1999740141L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QBreadOrder breadOrder = new QBreadOrder("breadOrder");

    public final com.bread.web.bread.QBread bread;

    public final StringPath orderAmount = createString("orderAmount");

    public final StringPath orderDate = createString("orderDate");

    public final NumberPath<Long> orderId = createNumber("orderId", Long.class);

    public final StringPath orderMethod = createString("orderMethod");

    public final StringPath orderStatus = createString("orderStatus");

    public final com.bread.web.shipping.QShipping shipping;

    public final com.bread.web.user.QUser user;

    public QBreadOrder(String variable) {
        this(BreadOrder.class, forVariable(variable), INITS);
    }

    public QBreadOrder(Path<? extends BreadOrder> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QBreadOrder(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QBreadOrder(PathMetadata metadata, PathInits inits) {
        this(BreadOrder.class, metadata, inits);
    }

    public QBreadOrder(Class<? extends BreadOrder> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.bread = inits.isInitialized("bread") ? new com.bread.web.bread.QBread(forProperty("bread")) : null;
        this.shipping = inits.isInitialized("shipping") ? new com.bread.web.shipping.QShipping(forProperty("shipping"), inits.get("shipping")) : null;
        this.user = inits.isInitialized("user") ? new com.bread.web.user.QUser(forProperty("user")) : null;
    }

}

