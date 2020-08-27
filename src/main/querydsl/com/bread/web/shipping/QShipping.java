package com.bread.web.shipping;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QShipping is a Querydsl query type for Shipping
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QShipping extends EntityPathBase<Shipping> {

    private static final long serialVersionUID = -240031087L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QShipping shipping = new QShipping("shipping");

    public final com.bread.web.order.QBreadOrder breadOrder;

    public final StringPath shippingBreadName = createString("shippingBreadName");

    public final StringPath shippingDate = createString("shippingDate");

    public final NumberPath<Long> shippingId = createNumber("shippingId", Long.class);

    public final StringPath shippingName = createString("shippingName");

    public final StringPath shippingStatus = createString("shippingStatus");

    public QShipping(String variable) {
        this(Shipping.class, forVariable(variable), INITS);
    }

    public QShipping(Path<? extends Shipping> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QShipping(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QShipping(PathMetadata metadata, PathInits inits) {
        this(Shipping.class, metadata, inits);
    }

    public QShipping(Class<? extends Shipping> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.breadOrder = inits.isInitialized("breadOrder") ? new com.bread.web.order.QBreadOrder(forProperty("breadOrder"), inits.get("breadOrder")) : null;
    }

}

