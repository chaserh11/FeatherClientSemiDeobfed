package net.digitalingot.feather;

import com.google.gson.Gson;
import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import net.digitalingot.vendor.javax.inject.Inject;
import net.digitalingot.vendor.javax.inject.Singleton;
import org.jetbrains.annotations.NotNull;

@Singleton
public class FeatherSourceFile718 {
   @NotNull
   private final @NotNull FeatherSourceFile158 oz;
   @NotNull
   private final @NotNull File oi;
   @NotNull
   private final @NotNull Gson cf;

   @Inject
   FeatherSourceFile718(@FeatherSourceFile$lh112 Path var1, @FeatherSourceFile$lh10 @NotNull @NotNull Gson var2) {
      this.oi = var1.resolve("client_preferences.json").toFile();

      try {
         if (!this.oi.exists()) {
            this.oi.getParentFile().mkdirs();
            this.oi.createNewFile();
         }
      } catch (IOException var6) {
         FeatherSourceFile311.Sb.error("Error while trying to create preferences file", var6);
      }

      FeatherSourceFile158 var3;
      try {
         var3 = (FeatherSourceFile158)FeatherSourceFile815.ux(this.oi).lh(var2, FeatherSourceFile158.class);
      } catch (Exception var5) {
         var3 = this.so();
      }

      if (var3 == null) {
         var3 = this.so();
      }

      this.lh(var3);
      this.cf = var2;
      this.oz = var3;
   }

   private void lh(FeatherSourceFile158 var1) {
      FeatherSourceFile171 var2 = var1.af();
      if (var2.sq() == null) {
         var2.ou(new ArrayList());
      }

      if (var2.hw() == null) {
         var2.pq(new ArrayList());
      }

      if (var2.br() == null) {
         var2.xj(false);
      }

      if (var2.dw() == null) {
         var2.xm("https://assets.feathercdn.net/game/modpreview/background1.webp");
      }

   }

   public void rp() {
      FeatherSourceFile815.ux(this.oi).lh(this.cf, this.oz);
   }

   @NotNull
   private @NotNull FeatherSourceFile158 so() {
      FeatherSourceFile171 var1 = new FeatherSourceFile171(false, false, new ArrayList(), new ArrayList(), false, "https://assets.feathercdn.net/game/modpreview/background1.webp");
      FeatherSourceFile8 var2 = new FeatherSourceFile8(new ArrayList(), new ArrayList());
      return new FeatherSourceFile158(var1, var2);
   }

   @NotNull
   public @NotNull FeatherSourceFile158 hp() {
      return this.oz;
   }
}
