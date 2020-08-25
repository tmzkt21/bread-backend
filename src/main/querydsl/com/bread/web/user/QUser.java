package com.bread.web.user;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QUser is a Querydsl query type for User
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QUser extends EntityPathBase<User> {

    private static final long serialVersionUID = 513939377L;

    public static final QUser user = new QUser("user");

    public final StringPath addr = createString("addr");

    public final ListPath<com.bread.web.order.BreadOrder, com.bread.web.order.QBreadOrder> breadOrder = this.<com.bread.web.order.BreadOrder, com.bread.web.order.QBreadOrder>createList("breadOrder", com.bread.web.order.BreadOrder.class, com.bread.web.order.QBreadOrder.class, PathInits.DIRECT2);

    public final ListPath<com.bread.web.order.BreadOrder, com.bread.web.order.QBreadOrder> breadOrders = this.<com.bread.web.order.BreadOrder, com.bread.web.order.QBreadOrder>createList("breadOrders", com.bread.web.order.BreadOrder.class, com.bread.web.order.QBreadOrder.class, PathInits.DIRECT2);

    public final StringPath detailAddr = createString("detailAddr");

    public final StringPath email = createString("email");

    public final StringPath name = createString("name");

    public final StringPath password = createString("password");

    public final StringPath phone = createString("phone");

    public final StringPath sales = createString("sales");

    public final StringPath userId = createString("userId");

    public final NumberPath<Long> userNo = createNumber("userNo", Long.class);

    public QUser(String variable) {
        super(User.class, forVariable(variable));
    }

    public QUser(Path<? extends User> path) {
        super(path.getType(), path.getMetadata());
    }

    public QUser(PathMetadata metadata) {
        super(User.class, metadata);
    }

}

