package net.digitalingot.feather;

import java.io.File;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.Path;
import org.jetbrains.annotations.NotNull;

public class FeatherSourceFile815 {
   @NotNull
   public static @NotNull @NotNull FeatherSourceFile436 xj(@NotNull @NotNull InputStream var0) {
      return new FeatherSourceFile436(var0);
   }

   @NotNull
   public static @NotNull @NotNull FeatherSourceFile435 lh(@NotNull @NotNull URL var0) {
      return new FeatherSourceFile435(var0);
   }

   @NotNull
   public static @NotNull @NotNull FeatherSourceFile435 xz(@NotNull @NotNull String var0) {
      try {
         return lh(new URL(var0));
      } catch (MalformedURLException var2) {
         throw new IllegalArgumentException("Illegal URL", var2);
      }
   }

   @NotNull
   public static @NotNull @NotNull FeatherSourceFile437 ux(@NotNull @NotNull File var0) {
      return new FeatherSourceFile437(var0);
   }

   @NotNull
   public static @NotNull @NotNull FeatherSourceFile437 ou(@NotNull @NotNull Path var0) {
      return new FeatherSourceFile437(var0.toFile());
   }

   @NotNull
   public static @NotNull @NotNull FeatherSourceFile437 dz(@NotNull @NotNull String var0) {
      return new FeatherSourceFile437(new File(var0));
   }

   @NotNull
   public static @NotNull @NotNull FeatherSourceFile438 hm(@NotNull @NotNull String var0) {
      return new FeatherSourceFile438(var0);
   }
}
