package net.digitalingot.feather;

import java.util.Iterator;
import java.util.function.Consumer;
import net.digitalingot.vendor.javax.inject.Inject;
import net.digitalingot.vendor.javax.inject.Provider;
import net.digitalingot.vendor.javax.inject.Singleton;

@Singleton
public class FeatherSourceFile740 implements FeatherSourceFile594 {
   private final Provider jM;
   private final FeatherSourceFile665 hb;
   private final FeatherSourceFile207 hf;

   @Inject
   FeatherSourceFile740(Provider var1, FeatherSourceFile665 var2, FeatherSourceFile207 var3) {
      this.jM = var1;
      this.hb = var2;
      this.hf = var3;
   }

   public void lh(FeatherSourceFile753 var1, Consumer var2, Consumer var3) {
      Iterator var4 = var1.tw().iterator();

      while(var4.hasNext()) {
         FeatherSourceFile243 var5 = (FeatherSourceFile243)var4.next();
         FeatherSourceFile495 var6 = this.hb.xj(var5);
         if (var6 instanceof FeatherSourceFile360) {
            ((FeatherSourceFile596)this.jM.get()).xj((FeatherSourceFile360)var6);
         }
      }

      this.hf.jx();
      var2.accept(new FeatherSourceFile12("success"));
   }

   public FeatherSourceFile754 hc() {
      return FeatherSourceFile754.RESET_MOD_POSITIONS;
   }
}
