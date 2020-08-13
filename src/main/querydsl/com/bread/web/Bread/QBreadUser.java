package com.bread.web.Bread;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QBreadUser is a Querydsl query type for BreadUser
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QBreadUser extends EntityPathBase<BreadUser> {

    private static final long serialVersionUID = 640024688L;

    public static final QBreadUser breadUser = new QBreadUser("breadUser");

    public final StringPath address = createString("address");

    public final ListPath<BreadOrder, QBreadOrder> breadOrders = this.<BreadOrder, QBreadOrder>createList("breadOrders", BreadOrder.class, QBreadOrder.class, PathInits.DIRECT2);

    public final StringPath email = createString("email");

    public final StringPath name = createString("name");

    public final StringPath password = createString("password");

    public final StringPath phone = createString("phone");

    public final NumberPath<Long> userId = createNumber("userId", Long.class);

    public QBreadUser(String variable) {
        super(BreadUser.class, forVariable(variable));
    }

    public QBreadUser(Path<? extends BreadUser> path) {
        super(path.getType(), path.getMetadata());
    }

    public QBreadUser(PathMetadata metadata) {
        super(BreadUser.class, metadata);
    }

}

