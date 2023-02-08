package net.digitalingot.feather;

import java.lang.ref.WeakReference;

class FeatherSourceFile$lh125 implements Runnable {
   private final WeakReference Mn;

   private FeatherSourceFile$lh125(FeatherSourceFile728 var1) {
      this.Mn = new WeakReference(var1);
   }

   public void run() {
      FeatherSourceFile728 var1 = (FeatherSourceFile728)this.Mn.get();
      if (var1 != null) {
         var1.nc(new FeatherSourceFile732((int)System.currentTimeMillis()));
      }

   }

   // $FF: synthetic method
   FeatherSourceFile$lh125(FeatherSourceFile728 var1, Object var2) {
      this(var1);
   }
}
