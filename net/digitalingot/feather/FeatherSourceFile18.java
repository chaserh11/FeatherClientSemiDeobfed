package net.digitalingot.feather;

import java.util.function.Consumer;
import net.digitalingot.vendor.javax.inject.Inject;

public class FeatherSourceFile18 {
   public static final FeatherSourceFile$lh69 lh;
   private final FeatherSourceFile253 nc;
   private final FeatherSourceFile434 xj;
   private FeatherSourceFile$lh69 oe;

   @Inject
   FeatherSourceFile18(FeatherSourceFile253 var1, FeatherSourceFile434 var2) {
      this.nc = var1;
      this.xj = var2;
   }

   public void lh() {
      if (lh != FeatherSourceFile$lh69.IDE) {
         this.xj.nc(() -> {
            if (this.oe != null && this.oe.getPriority() >= lh.getPriority()) {
               FeatherSourceFile311.Sb.info("Passed DRM check");
            } else {
               FeatherSourceFile311.Sb.error("DRM check failed.");
            }

         }, 40L);
         this.nc.nc(new FeatherSourceFile231(), new Consumer() {
            public void lh(FeatherSourceFile474 var1) {
               FeatherSourceFile18.this.oe = var1.vn();
            }

            // $FF: synthetic method
            public void accept(Object var1) {
               this.lh((FeatherSourceFile474)var1);
            }
         }, (Consumer)null);
      }
   }

   static {
      lh = FeatherSourceFile$lh69.RELEASE;
   }
}
