package net.digitalingot.feather;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import net.digitalingot.vendor.javax.inject.Inject;
import net.digitalingot.vendor.javax.inject.Singleton;
import org.jetbrains.annotations.NotNull;

@Singleton
class FeatherSourceFile662 implements FeatherSourceFile657 {
   @NotNull
   private final @NotNull FeatherSourceFile144 qr;
   @NotNull
   private final @NotNull FeatherSourceFile665 hb;
   @NotNull
   private final @NotNull FeatherSourceFile718 lg;
   @NotNull
   private final @NotNull Set jP;

   @Inject
   FeatherSourceFile662(@NotNull @NotNull FeatherSourceFile144 var1, @NotNull @NotNull FeatherSourceFile665 var2, @NotNull @NotNull FeatherSourceFile718 var3, @NotNull @NotNull Set var4) {
      this.qr = var1;
      this.hb = var2;
      this.lg = var3;
      this.jP = var4;
   }

   public void fe() {
      Iterator var1 = this.jP.iterator();

      while(var1.hasNext()) {
         FeatherSourceFile495 var2 = (FeatherSourceFile495)var1.next();
         Class var3 = var2.getClass();
         FeatherSourceFile3 var4 = (FeatherSourceFile3)var3.getDeclaredAnnotation(FeatherSourceFile3.class);
         if (var4 == null) {
            throw new FeatherSourceFile584(var3, FeatherSourceFile3.class);
         }

         var2.lh(var4);
         this.mr(var2);
         this.hb.lh(var4.jj(), var2);
      }

   }

   public @NotNull void mr(@NotNull @NotNull FeatherSourceFile495 var1) {
      Class var2 = FeatherSourceFile246.lh((Class)var1.getClass(), 0);

      assert var2 != null;

      Map var3 = this.qr.yp();

      assert var3 != null;

      FeatherSourceFile243 var4 = var1.fg();
      Map var5 = (Map)var3.get(var4);
      FeatherSourceFile548 var6 = FeatherSourceFile716.INSTANCE.create((Class)var2, var5, (String)null);
      FeatherSourceFile136 var7 = (FeatherSourceFile136)var6.vh();
      FeatherSourceFile171 var8 = this.lg.hp().af();
      List var9 = var8.sq();
      var7.eP = var9.contains(var4);
      var7.hM = var1 instanceof FeatherSourceFile360;
      var1.lh(var7);
   }
}
