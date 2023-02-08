package net.digitalingot.feather;

import com.google.common.reflect.TypeToken;
import java.io.File;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import net.digitalingot.vendor.javax.inject.Inject;
import net.digitalingot.vendor.javax.inject.Singleton;
import org.jetbrains.annotations.NotNull;

@Singleton
public class FeatherSourceFile633 {
   @NotNull
   private final @NotNull FeatherSourceFile700 ch;
   @NotNull
   private final @NotNull File iZ;
   @NotNull
   private final @NotNull List KZ = new ArrayList();

   @Inject
   FeatherSourceFile633(@NotNull @NotNull FeatherSourceFile700 var1, @FeatherSourceFile$xj15 Path var2) {
      this.ch = var1;
      this.iZ = var2.resolve("muted.json").toFile();
   }

   public void fe() {
      if (this.iZ.exists()) {
         List var1 = (List)FeatherSourceFile815.ux(this.iZ).lh((new TypeToken() {
         }).getType());
         this.KZ.addAll(var1);
      }

   }

   @NotNull
   public @NotNull List fL() {
      return this.KZ;
   }

   public @NotNull boolean eg(@NotNull @NotNull UUID var1) {
      FeatherSourceFile384 var2 = new FeatherSourceFile384(var1, this.ch.lh(var1));
      if (!this.KZ.contains(var2)) {
         this.KZ.add(var2);
         this.rp();
         return true;
      } else {
         return false;
      }
   }

   public @NotNull boolean oy(@NotNull @NotNull UUID var1) {
      if (this.KZ.removeIf((var1x) -> {
         return var1x.oa().equals(var1);
      })) {
         this.rp();
         return true;
      } else {
         return false;
      }
   }

   private void rp() {
      this.iZ.getParentFile().mkdirs();
      FeatherSourceFile815.ux(this.iZ).wU().wz(this.KZ);
   }
}
