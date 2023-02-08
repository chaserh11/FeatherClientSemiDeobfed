package net.digitalingot.feather;

import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.jetbrains.annotations.NotNull;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
@Inherited
public @interface FeatherSourceFile414 {
   @NotNull
   @NotNull String jc();

   @NotNull
   @NotNull String jl();

   @NotNull
   @NotNull String od();

   @NotNull
   @NotNull String[] tp() default {};

   @NotNull
   @NotNull FeatherSourceFile$lh3[] wr();

   @NotNull
   @NotNull FeatherSourceFile$lh55 ds() default @FeatherSourceFile$lh55;
}
