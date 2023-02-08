package net.digitalingot.feather;

import com.google.common.reflect.TypeToken;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Type;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Map;
import net.digitalingot.vendor.javax.inject.Inject;
import net.digitalingot.vendor.javax.inject.Singleton;
import org.jetbrains.annotations.NotNull;

@Singleton
public class FeatherSourceFile636 {
   @NotNull
   public static final @NotNull Map hq = new HashMap();
   @NotNull
   private final @NotNull File oi;
   @NotNull
   private final @NotNull Gson cf;
   @NotNull
   private final @NotNull Map cx;

   @Inject
   FeatherSourceFile636(@FeatherSourceFile$lh112 Path var1, @FeatherSourceFile$lh10 @NotNull @NotNull Gson var2) {
      this.oi = var1.resolve("cosmetic_settings.json").toFile();
      this.cf = var2;

      try {
         if (!this.oi.exists()) {
            this.oi.getParentFile().mkdirs();
            this.oi.createNewFile();
         }
      } catch (IOException var5) {
         throw new RuntimeException(var5);
      }

      Type var3 = (new TypeToken() {
      }).getType();
      Object var4 = (Map)FeatherSourceFile815.ux(this.oi).lh(var2, var3);
      if (var4 == null) {
         var4 = new HashMap();
      }

      this.cx = (Map)var4;
   }

   public @NotNull @NotNull Object lh(@NotNull @NotNull String var1, @NotNull @NotNull Class var2) {
      JsonElement var3 = this.cf.toJsonTree(this.cx.get(var1));
      return this.cf.fromJson(var3, var2);
   }

   public @NotNull @NotNull void lh(@NotNull @NotNull String var1, @NotNull @NotNull FeatherSourceFile406 var2) {
      this.cx.put(var1, var2);
      this.bj();
   }

   public void bj() {
      FeatherSourceFile815.ux(this.oi).lh(this.cf, this.cx);
   }

   @NotNull
   public @NotNull Map qk() {
      return this.cx;
   }
}
