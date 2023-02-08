package net.digitalingot.feather;

import java.util.HashSet;
import java.util.Set;
import net.digitalingot.vendor.com.google.inject.Inject;
import net.digitalingot.vendor.com.google.inject.Singleton;
import org.jetbrains.annotations.Nullable;

@Singleton
public class FeatherSourceFile143 extends FeatherSourceFile560 {
   private final String oj;
   private final FeatherSourceFile213 rx;
   private boolean dh;
   private final FeatherSourceFile142 ks = new FeatherSourceFile142();
   private final FeatherSourceFile776 wz;
   private FeatherSourceFile$lh121 su;
   private Set mt;

   @Inject
   public FeatherSourceFile143(FeatherSourceFile687 var1, @FeatherSourceFile$xj String var2, FeatherSourceFile776 var3, FeatherSourceFile213 var4) {
      super(var1, var1.eg(var2));
      this.oj = var2;
      this.wz = var3;
      this.rx = var4;
   }

   protected void uo() {
      this.yu();
      super.uo();
   }

   protected void wi() {
      if (!this.dh) {
         super.wi();
      }

   }

   public void func_73863_a(int var1, int var2, float var3) {
      if (this.dh) {
         this.ks.pq(var3);
      }

      super.func_73863_a(var1, var2, var3);
      this.wz.ul();
   }

   protected void qr(int var1) {
      if (!this.hv(var1)) {
         super.lh(var1, false);
      }
   }

   protected void eg(int var1) {
      if (!this.pm()) {
         super.eg(var1);
      }
   }

   protected void nc(int var1, int var2, int var3) {
      if (!this.ug(var3)) {
         super.nc(var1, var2, var3);
      }
   }

   protected void xj(int var1, int var2, int var3) {
      if (!this.pm()) {
         super.xj(var1, var2, var3);
      }
   }

   protected float vi() {
      return FeatherSourceFile851.iP();
   }

   protected void pq(int var1, int var2) {
      super.pq(var1, var2);
      this.ym();
   }

   public void ym() {
      this.rx.mv();
   }

   public boolean kj() {
      return this.dh;
   }

   public void oy(boolean var1) {
      this.dh = var1;
   }

   private void yu() {
      String var1 = this.nn.getURL();
      if (var1 == null || var1.isEmpty()) {
         this.nn.loadURL(this.oj);
      }

   }

   public @Nullable void lh(@Nullable FeatherSourceFile$lh121 var1) {
      this.mt = new HashSet();
      this.su = var1;
   }

   private boolean pm() {
      if (this.su == null) {
         return false;
      } else {
         this.su.respond(this.mt.stream().mapToInt((var0) -> {
            return var0;
         }).toArray());
         this.mt = null;
         this.su = null;
         return true;
      }
   }

   private boolean ug(int var1) {
      if (this.su != null) {
         this.mt.add(var1 + 100001);
         return true;
      } else {
         return false;
      }
   }

   private boolean hv(int var1) {
      if (this.su == null) {
         return false;
      } else {
         this.mt.add(var1);
         if (var1 == 1) {
            this.pm();
         }

         return true;
      }
   }
}
