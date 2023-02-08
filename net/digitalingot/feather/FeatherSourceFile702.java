package net.digitalingot.feather;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface FeatherSourceFile702 {
   String bn();

   String kd() default "";

   String cb() default "";

   int fk() default -9999;

   int tr() default -9999;

   boolean ju() default false;
}
