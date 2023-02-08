package net.digitalingot.feather;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD})
public @interface FeatherSourceFile600 {
   String st() default "";

   boolean zc() default true;

   double vl() default 0.0;

   double go() default 0.0;

   FeatherSourceFile637 xp() default FeatherSourceFile637.TOP_LEFT;

   double dc() default 1.0;
}
