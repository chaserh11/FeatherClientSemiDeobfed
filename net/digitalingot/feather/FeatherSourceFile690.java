package net.digitalingot.feather;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface FeatherSourceFile690 {
   int dg() default 40;

   int kf() default 70;

   int bg() default 60;

   int fd() default 10;

   int ae() default 25;

   int im() default 20;
}
