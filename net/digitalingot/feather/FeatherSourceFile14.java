package net.digitalingot.feather;

import org.cef.browser.CefFrame;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class FeatherSourceFile14 {
   private FeatherSourceFile14() {
      throw new AssertionError();
   }

   public static @NotNull boolean nc(@NotNull @NotNull CefFrame var0) {
      CefFrame var1 = var0.getParent();
      return var1 != null && var1.getParent() == null;
   }

   @Nullable
   public static @Nullable @NotNull CefFrame xj(@NotNull @NotNull CefFrame var0) {
      CefFrame var2;
      for(CefFrame var1 = var0.getParent(); var1 != null; var1 = var2) {
         var2 = var1.getParent();
         if (var2 == null) {
            return var0;
         }

         var0 = var1;
      }

      return null;
   }
}
