package net.digitalingot.feather;

import net.minecraft.client.gui.GuiIngame;

public class FeatherSourceFile$nc19 extends FeatherSourceFile413 {
   // $FF: synthetic field
   final FeatherSourceFile172 zQ;

   public FeatherSourceFile$nc19(FeatherSourceFile172 var1) {
      this.zQ = var1;
   }

   public int rl() {
      return 182;
   }

   public void lh(FeatherSourceFile683 var1) {
      if (var1 == FeatherSourceFile683.MOD_LAYOUT) {
         this.aF();
      }

   }

   private void aF() {
      int var1 = this.rl();
      int var2 = (int)(0.8 * (double)((float)(var1 + 1)));
      boolean var3 = false;
      boolean var4 = true;
      FeatherSourceFile843.lh(0, GuiIngame.field_110324_m);
      this.gD.pq(0, 12, 0, 74, var1, 5);
      this.gD.pq(0, 12, 0, 74, var1, 5);
      if (var2 > 0) {
         this.gD.pq(0, 12, 0, 79, var2, 5);
      }

      String var5 = "Feather";
      int var6 = (var1 - this.gD.vr("Feather")) / 2;
      this.gD.lh("Feather", (float)var6, 3.0F, ((FeatherSourceFile$lh33)FeatherSourceFile172.lh(this.zQ)).zP ? ((FeatherSourceFile$lh33)FeatherSourceFile172.nc(this.zQ)).hQ.lm() : 16777215, ((FeatherSourceFile$lh33)FeatherSourceFile172.xj(this.zQ)).hR);
      this.pp = 19;
   }

   public FeatherSourceFile89 hk() {
      return ((FeatherSourceFile$lh33)FeatherSourceFile172.oe(this.zQ)).yT;
   }
}
