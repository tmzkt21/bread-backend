package com.bread.web.registration;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QRegistration is a Querydsl query type for Registration
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QRegistration extends EntityPathBase<Registration> {

    private static final long serialVersionUID = 2019725681L;

    public static final QRegistration registration = new QRegistration("registration");

    public final StringPath registrationDescription = createString("registrationDescription");

    public final NumberPath<Long> registrationId = createNumber("registrationId", Long.class);

    public final StringPath registrationImage = createString("registrationImage");

    public final StringPath registrationName = createString("registrationName");

    public final StringPath registrationPrice = createString("registrationPrice");

    public QRegistration(String variable) {
        super(Registration.class, forVariable(variable));
    }

    public QRegistration(Path<? extends Registration> path) {
        super(path.getType(), path.getMetadata());
    }

    public QRegistration(PathMetadata metadata) {
        super(Registration.class, metadata);
    }

}

