package net.digitalingot.feather;

import net.digitalingot.vendor.javax.inject.Inject;
import net.minecraft.client.Minecraft;
import net.minecraft.client.network.NetHandlerPlayClient;
import org.jetbrains.annotations.NotNull;

public class FeatherSourceFile98 extends FeatherSourceFile791 {
   private static final long Hf = 20L;
   private final Minecraft minecraft;
   private final FeatherSourceFile434 xj;
   private FeatherSourceFile433 ci = null;

   @Inject
   FeatherSourceFile98(@NotNull @NotNull FeatherSourceFile428 var1, Minecraft var2, FeatherSourceFile434 var3) {
      super(var1);
      this.minecraft = var2;
      this.xj = var3;
   }

   public boolean dE() {
      return this.dO().Hl;
   }

   public void pu() {
      if (this.uj()) {
         this.dG();
      }
   }

   public void ml() {
      super.ml();
      this.dG();
   }

   public void ze() {
      super.ze();
      this.dF();
   }

   private void dF() {
      if (this.ci != null) {
         this.ci.cancel();
         this.ci = null;
      }

   }

   private void dG() {
      this.dF();
      this.ci = this.xj.lh(() -> {
         if (this.uj()) {
            NetHandlerPlayClient var1 = this.minecraft.func_147114_u();
            if (var1 != null) {
               FeatherSourceFile709.lh("/tip all");
            }

         }
      }, 0L, (long)this.dO().Hm * 20L);
   }
}
