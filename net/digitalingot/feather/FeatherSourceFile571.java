package net.digitalingot.feather;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.jetbrains.annotations.NotNull;

@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface FeatherSourceFile571 {
   @NotNull
   @NotNull String lb();

   @NotNull
   @NotNull String jc();

   @NotNull
   @NotNull String kd() default "";

   @NotNull
   @NotNull FeatherSourceFile163 dy() default @FeatherSourceFile163(
   lb = ""
);

   @NotNull
   @NotNull FeatherSourceFile655 jm();
}
