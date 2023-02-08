package net.digitalingot.feather;

import net.digitalingot.vendor.javax.inject.Inject;
import net.digitalingot.vendor.javax.inject.Provider;
import net.digitalingot.vendor.javax.inject.Singleton;

@Singleton
public class FeatherSourceFile111 {
   private final Provider LU;
   private FeatherSourceFile177 LV;

   @Inject
   FeatherSourceFile111(Provider var1) {
      this.LU = var1;
   }

   public void fY() {
      if (this.LV != null) {
         this.fZ();
      }

      this.LV = (FeatherSourceFile177)this.LU.get();
      this.LV.start();
   }

   public void fZ() {
      this.LV.close();
      this.LV = null;
   }

   public boolean gA() {
      return this.LV != null && this.LV.gA();
   }
}
