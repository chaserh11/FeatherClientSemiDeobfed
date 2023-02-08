package net.digitalingot.feather;

import java.lang.reflect.Field;
import org.jetbrains.annotations.NotNull;

public class FeatherSourceFile646 implements FeatherSourceFile518 {
   @NotNull
   public @NotNull @NotNull @NotNull Enum pq(@NotNull @NotNull String var1, @NotNull @NotNull Class var2) {
      Enum[] var3 = (Enum[])var2.getEnumConstants();
      int var4 = var3.length;

      for(int var5 = 0; var5 < var4; ++var5) {
         Enum var6 = var3[var5];

         Field var7;
         try {
            var7 = var2.getDeclaredField(var6.name());
         } catch (NoSuchFieldException var9) {
            throw new IllegalStateException(var9);
         }

         FeatherSourceFile558 var8 = (FeatherSourceFile558)var7.getDeclaredAnnotation(FeatherSourceFile558.class);
         if (var8 == null) {
            throw new IllegalStateException("Enum constant \"" + var6.name() + "\" in enum \"" + var2.getName() + "\" not annotated with @EnumValue");
         }

         if (var8.lb().equals(var1)) {
            return var6;
         }
      }

      throw new FeatherSourceFile277("Enum constant \"" + var1 + "\" not found in enum \"" + var2.getName() + "\"");
   }

   @NotNull
   public @NotNull @NotNull String lh(@NotNull @NotNull Enum var1) {
      Class var2 = var1.getDeclaringClass();

      Field var3;
      try {
         var3 = var2.getDeclaredField(var1.name());
      } catch (NoSuchFieldException var5) {
         throw new IllegalStateException(var5);
      }

      FeatherSourceFile558 var4 = (FeatherSourceFile558)var3.getDeclaredAnnotation(FeatherSourceFile558.class);
      if (var4 == null) {
         throw new IllegalStateException("Enum constant \"" + var1.name() + "\" in enum \"" + var2.getName() + "\" not annotated with @EnumValue");
      } else {
         return var4.lb();
      }
   }

   // $FF: synthetic method
   @NotNull
   public @NotNull @NotNull String km(@NotNull @NotNull Object var1) {
      return this.lh((Enum)var1);
   }

   // $FF: synthetic method
   @NotNull
   public @NotNull @NotNull @NotNull Object nc(@NotNull @NotNull String var1, @NotNull @NotNull Class var2) {
      return this.pq(var1, var2);
   }
}
