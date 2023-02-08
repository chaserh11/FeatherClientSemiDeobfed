package net.digitalingot.feather;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.jetbrains.annotations.NotNull;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface FeatherSourceFile368 {
   boolean zc() default false;

   @NotNull
   @NotNull FeatherSourceFile575 qj() default @FeatherSourceFile575(
   bv = "",
   jc = "",
   jl = "",
   io = 0
);
}
