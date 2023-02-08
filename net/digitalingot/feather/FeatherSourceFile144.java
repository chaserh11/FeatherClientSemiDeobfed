package net.digitalingot.feather;

import java.io.File;
import java.nio.file.Path;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import net.digitalingot.vendor.javax.inject.Inject;
import net.digitalingot.vendor.javax.inject.Singleton;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Singleton
public class FeatherSourceFile144 {
   @NotNull
   private final @NotNull FeatherSourceFile82 iU;
   @NotNull
   private final @NotNull FeatherSourceFile119 iV;
   @NotNull
   private final @NotNull FeatherSourceFile746 iW;
   @NotNull
   private final @NotNull File iX;
   @Nullable
   private @Nullable Map iY;

   @Inject
   FeatherSourceFile144(@FeatherSourceFile$lh112 Path var1) {
      this.iU = new FeatherSourceFile82(var1.resolve("configuration"));
      this.iV = new FeatherSourceFile119(this);
      this.iW = new FeatherSourceFile746(this);
      this.iX = var1.resolve("sidebar.json").toFile();
   }

   public @NotNull void xj(@NotNull @NotNull Map var1) {
      this.iV.oe(var1);
      this.iY = var1;
   }

   public @NotNull void lh(FeatherSourceFile243 var1, @NotNull @NotNull Map var2) {
      Map var3 = (Map)this.yp().get(var1);
      if (var3 != null) {
         var3.putAll(var2);
      }

      Map var4 = var3 != null ? var3 : var2;
      this.iV.nc(var1, var4);
      if (this.iY == null) {
         this.iY = new HashMap();
      }

      this.iY.put(var1, var4);
   }

   public @NotNull void lh(FeatherSourceFile243 var1, @NotNull @NotNull FeatherSourceFile136 var2) {
      FeatherSourceFile544 var3 = FeatherSourceFile261.INSTANCE.create(var2);
      Map var4 = var3.xc();
      this.lh(var1, var4);
   }

   public @NotNull void nc(@NotNull @NotNull Collection var1) {
      if (this.iY == null) {
         this.iY = new HashMap();
      }

      Iterator var2 = var1.iterator();

      while(var2.hasNext()) {
         FeatherSourceFile495 var3 = (FeatherSourceFile495)var2.next();
         FeatherSourceFile544 var4 = FeatherSourceFile261.INSTANCE.create(var3.pr());
         Map var5 = var4.xc();
         Map var6 = (Map)this.yp().get(var3.fg());
         if (var6 != null) {
            var6.putAll(var5);
         }

         Map var7 = var6 != null ? var6 : var5;
         this.iY.put(var3.fg(), var7);
      }

      this.xj(this.iY);
   }

   public void ff() {
      this.iY = this.iW.nj();
   }

   @Nullable
   public @Nullable Map yp() {
      return this.iY;
   }

   @NotNull
   public @NotNull File gh() {
      return this.iU.xa().gh();
   }

   @NotNull
   public @NotNull File wp() {
      return this.iX;
   }

   @NotNull
   public @NotNull FeatherSourceFile82 ko() {
      return this.iU;
   }
}
