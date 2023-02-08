package net.digitalingot.feather;

import java.io.Closeable;
import java.io.IOException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class FeatherSourceFile810 {
   public static @NotNull void lh(@Nullable @NotNull Closeable... var0) {
      Closeable[] var1 = var0;
      int var2 = var0.length;

      for(int var3 = 0; var3 < var2; ++var3) {
         Closeable var4 = var1[var3];

         try {
            if (var4 != null) {
               var4.close();
            }
         } catch (IOException var6) {
            FeatherSourceFile311.Sb.error("Failed to close closeable", var6);
         }
      }

   }
}
