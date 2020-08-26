package com.bread.web.page;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QPage is a Querydsl query type for Page
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QPage extends EntityPathBase<Page> {

    private static final long serialVersionUID = 1058124337L;

    public static final QPage page = new QPage("page");

    public final StringPath amount = createString("amount");

    public final StringPath buyerName = createString("buyerName");

    public final StringPath buyerTame = createString("buyerTame");

    public final StringPath name = createString("name");

    public final NumberPath<Long> pageId = createNumber("pageId", Long.class);

    public QPage(String variable) {
        super(Page.class, forVariable(variable));
    }

    public QPage(Path<? extends Page> path) {
        super(path.getType(), path.getMetadata());
    }

    public QPage(PathMetadata metadata) {
        super(Page.class, metadata);
    }

}

