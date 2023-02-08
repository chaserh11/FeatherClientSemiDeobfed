package net.digitalingot.feather;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

class FeatherSourceFile65 {
   public static final int ax = 5;
   public static final int ob = 30;
   private final AtomicInteger zg = new AtomicInteger(0);
   private final FeatherSourceFile454 sz;
   private final Map ri = new ConcurrentHashMap(12);
   private final FeatherSourceFile$lh93 pb = new FeatherSourceFile$lh93(this, 30);

   public FeatherSourceFile65(FeatherSourceFile454 var1) {
      this.sz = var1;
   }

   public int lh(String var1, String var2, String var3, FeatherSourceFile58 var4) {
      int var5 = this.zg.getAndIncrement();
      this.ri.put(var5, var4);
      this.sz.lh(var5, var1, var2, var3);
      return var5;
   }

   public void lh(int var1, boolean var2, byte[] var3) {
      FeatherSourceFile58 var4 = (FeatherSourceFile58)this.ri.remove(var1);
      if (var4 != null) {
         var4.lh(var2, var3);
      }

   }

   public void sm(int var1) {
      this.ri.remove(var1);
   }

   public void ir() {
      this.ri.clear();
      this.zg.set(0);
   }

   void zy() {
      this.ir();
      this.pb.xj();
   }

   void bd() {
      this.ir();
      this.pb.dq();
   }

   // $FF: synthetic method
   static Map lh(FeatherSourceFile65 var0) {
      return var0.ri;
   }
}
