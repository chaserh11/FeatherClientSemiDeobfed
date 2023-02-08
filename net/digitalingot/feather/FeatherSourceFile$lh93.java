package net.digitalingot.feather;

import java.util.Iterator;
import java.util.Map;

class FeatherSourceFile$lh93 {
   private final int by;
   private FeatherSourceFile433 ci;
   // $FF: synthetic field
   final FeatherSourceFile65 ss;

   public FeatherSourceFile$lh93(FeatherSourceFile65 var1, int var2) {
      this.ss = var1;
      this.ci = null;
      this.by = var2;
   }

   private void nk() {
      Map var1 = FeatherSourceFile65.lh(this.ss);
      if (!var1.isEmpty()) {
         long var2 = System.currentTimeMillis();
         Iterator var4 = var1.values().iterator();

         while(var4.hasNext()) {
            FeatherSourceFile58 var5 = (FeatherSourceFile58)var4.next();
            long var6 = (var2 - var5.iw()) / 1000L;
            if (var6 > (long)this.by) {
               var5.le();
            }
         }
      }

   }

   public void xj() {
      if (this.ci == null) {
         this.ci = FeatherSourceFile747.oe().nc(this::nk, 20L, 20L);
      }

   }

   public void dq() {
      if (this.ci != null) {
         this.ci.cancel();
         this.ci = null;
      }

   }
}
