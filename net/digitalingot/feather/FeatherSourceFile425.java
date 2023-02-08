package net.digitalingot.feather;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import net.digitalingot.vendor.javax.inject.Inject;
import net.digitalingot.vendor.javax.inject.Singleton;
import org.jetbrains.annotations.NotNull;

@Singleton
class FeatherSourceFile425 implements FeatherSourceFile426 {
   @NotNull
   private final @NotNull FeatherSourceFile665 hb;
   @NotNull
   private final @NotNull FeatherSourceFile190 ep;
   @NotNull
   private @NotNull Set Rt = new HashSet();
   @NotNull
   private final @NotNull FeatherSourceFile207 hf;
   @NotNull
   private final @NotNull FeatherSourceFile308 yz;

   @Inject
   FeatherSourceFile425(@NotNull @NotNull FeatherSourceFile665 var1, @NotNull @NotNull FeatherSourceFile190 var2, @NotNull @NotNull FeatherSourceFile207 var3, @NotNull @NotNull FeatherSourceFile308 var4) {
      this.hb = var1;
      this.ep = var2;
      this.hf = var3;
      this.yz = var4;
   }

   public void fe() {
      FeatherSourceFile686.zy.oe((var1) -> {
         return this.Rt.contains(var1.fg()) ? FeatherSourceFile133.FAIL : FeatherSourceFile133.PASS;
      });
      FeatherSourceFile725.wi.oe((var1, var2) -> {
         this.xR();
      });
   }

   public @NotNull void qr(@NotNull @NotNull List var1) {
      this.Rt = (Set)var1.stream().filter((var0) -> {
         return !var0.isCore();
      }).collect(Collectors.toSet());
      Iterator var2 = this.Rt.iterator();

      while(var2.hasNext()) {
         FeatherSourceFile243 var3 = (FeatherSourceFile243)var2.next();
         this.ep.unload(this.hb.xj(var3));
      }

      this.hf.hf();
      this.yz.ga();
   }

   public void xR() {
      Set var1 = this.Rt;
      this.Rt = new HashSet();
      Iterator var2 = var1.iterator();

      while(var2.hasNext()) {
         FeatherSourceFile243 var3 = (FeatherSourceFile243)var2.next();
         FeatherSourceFile495 var4 = this.hb.xj(var3);
         if (var4.pr().vy()) {
            this.ep.load(var4);
         }
      }

      this.hf.hf();
      this.yz.ga();
   }

   public boolean oe(FeatherSourceFile243 var1) {
      return this.Rt.contains(var1);
   }

   @NotNull
   public @NotNull Set xS() {
      return this.Rt;
   }
}
