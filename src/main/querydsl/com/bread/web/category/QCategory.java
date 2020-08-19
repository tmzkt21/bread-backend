package com.bread.web.category;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QCategory is a Querydsl query type for Category
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QCategory extends EntityPathBase<Category> {

    private static final long serialVersionUID = 1376756881L;

    public static final QCategory category = new QCategory("category");

    public final StringPath allergy = createString("allergy");

    public final ListPath<com.bread.web.bread.Bread, com.bread.web.bread.QBread> breads = this.<com.bread.web.bread.Bread, com.bread.web.bread.QBread>createList("breads", com.bread.web.bread.Bread.class, com.bread.web.bread.QBread.class, PathInits.DIRECT2);

    public final NumberPath<Long> categoryId = createNumber("categoryId", Long.class);

    public final StringPath option = createString("option");

    public QCategory(String variable) {
        super(Category.class, forVariable(variable));
    }

    public QCategory(Path<? extends Category> path) {
        super(path.getType(), path.getMetadata());
    }

    public QCategory(PathMetadata metadata) {
        super(Category.class, metadata);
    }

}

