package com.bread.web.Bread;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QBreadShipping is a Querydsl query type for BreadShipping
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QBreadShipping extends EntityPathBase<BreadShipping> {

    private static final long serialVersionUID = -1701505069L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QBreadShipping breadShipping = new QBreadShipping("breadShipping");

    public final QBreadOrder breadOrder;

    public final StringPath shippingDate = createString("shippingDate");

    public final NumberPath<Long> shippingId = createNumber("shippingId", Long.class);

    public final StringPath shippingName = createString("shippingName");

    public final StringPath shippingStatus = createString("shippingStatus");

    public QBreadShipping(String variable) {
        this(BreadShipping.class, forVariable(variable), INITS);
    }

    public QBreadShipping(Path<? extends BreadShipping> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QBreadShipping(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QBreadShipping(PathMetadata metadata, PathInits inits) {
        this(BreadShipping.class, metadata, inits);
    }

    public QBreadShipping(Class<? extends BreadShipping> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.breadOrder = inits.isInitialized("breadOrder") ? new QBreadOrder(forProperty("breadOrder"), inits.get("breadOrder")) : null;
    }

}

