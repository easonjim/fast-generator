package com.domain.config;

import org.apache.commons.lang.StringUtils;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * @author: jim
 * @date 2020/07/13
 **/
public class MongoCondition implements Condition {

    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        String database = context.getEnvironment().getProperty("fast.database");
        return "mongodb".equalsIgnoreCase(database);
    }
}
