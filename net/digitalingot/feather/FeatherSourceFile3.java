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
public @interface FeatherSourceFile3 {
   @NotNull
   @NotNull FeatherSourceFile243 jj();

   @NotNull
   @NotNull FeatherSourceFile414 kl();
}
