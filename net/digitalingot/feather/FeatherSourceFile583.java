package net.digitalingot.feather;

import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class FeatherSourceFile583 {
   private static final long GM;
   private static final double GN = 0.01;
   private final FeatherSourceFile$lh16 GO;
   private final FeatherSourceFile$nc5 GP;
   private final FeatherSourceFile$nc5 GQ;

   public FeatherSourceFile583(@NotNull @NotNull FeatherSourceFile495 var1) {
      this(var1, (FeatherSourceFile$lh16)null);
   }

   public FeatherSourceFile583(@NotNull @NotNull FeatherSourceFile495 var1, @Nullable @Nullable FeatherSourceFile$lh16 var2) {
      this.GP = new FeatherSourceFile$nc5();
      this.GQ = new FeatherSourceFile$nc5();
      this.GO = var2;
      FeatherSourceFile149.oc.oe((var2x) -> {
         if (var1.uj()) {
            if (var2x == FeatherSourceFile$xj20.END) {
               this.dB();
            }
         }
      });
      FeatherSourceFile609.xw.oe((var2x, var3, var4) -> {
         if (var1.uj()) {
            if (var3 != 0) {
               long var5 = System.currentTimeMillis();
               if (var2x == 0) {
                  FeatherSourceFile$nc5.nc(this.GP, var5);
               } else if (var2x == 1) {
                  FeatherSourceFile$nc5.nc(this.GQ, var5);
               }

            }
         }
      });
   }

   private void dB() {
      long var1 = System.currentTimeMillis() - GM;
      double var3 = FeatherSourceFile$nc5.lh(this.GP, var1);
      double var5 = FeatherSourceFile$nc5.lh(this.GQ, var1);
      if ((var3 != 0.0 || var5 != 0.0) && this.GO != null) {
         this.GO.oe(var3, var5);
      }

   }

   public double dC() {
      return (double)FeatherSourceFile$nc5.lh(this.GP).size();
   }

   public double dD() {
      return (double)FeatherSourceFile$nc5.lh(this.GQ).size();
   }

   static {
      GM = TimeUnit.SECONDS.toMillis(1L);
   }
}
