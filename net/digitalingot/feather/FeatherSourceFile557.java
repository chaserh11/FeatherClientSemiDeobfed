package net.digitalingot.feather;

import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.function.Consumer;
import org.jetbrains.annotations.NotNull;

public class FeatherSourceFile557 implements FeatherSourceFile594 {
   public void lh(FeatherSourceFile639 var1, Consumer var2, Consumer var3) {
      qr(var1.gb());
      var2.accept(new FeatherSourceFile12("success"));
   }

   private static @NotNull void qr(@NotNull @NotNull String var0) {
      try {
         FeatherSourceFile844.lh((new URL(var0)).toURI());
      } catch (URISyntaxException | MalformedURLException var2) {
      }

   }

   public FeatherSourceFile754 hc() {
      return FeatherSourceFile754.OPEN_LINK;
   }
}
