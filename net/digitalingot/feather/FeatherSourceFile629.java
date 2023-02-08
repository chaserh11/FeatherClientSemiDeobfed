package net.digitalingot.feather;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface FeatherSourceFile629 {
   FeatherSourceFile503[] jt();

   FeatherSourceFile$lh87 ms() default FeatherSourceFile$lh87.DISABLE_MODULE_IF_NO_HUD_ELEMENTS;
}
