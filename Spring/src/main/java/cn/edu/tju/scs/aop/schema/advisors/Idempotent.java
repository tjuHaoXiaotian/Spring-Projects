package cn.edu.tju.scs.aop.schema.advisors;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface Idempotent {
    // marker annotation
}
