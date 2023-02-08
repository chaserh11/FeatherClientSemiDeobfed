package net.digitalingot.feather;

import net.minecraft.client.Minecraft;
import net.minecraft.util.ResourceLocation;

public class FeatherSourceFile$lh24 extends FeatherSourceFile624 {
   private ResourceLocation EG;
   // $FF: synthetic field
   final FeatherSourceFile47 EH;

   public FeatherSourceFile$lh24(FeatherSourceFile47 var1) {
      this.EH = var1;
   }

   public boolean vf() {
      return FeatherSourceFile47.lh(this.EH).func_147104_D() != null;
   }

   public Object ov() {
      return FeatherSourceFile47.lh(this.EH).func_147104_D() != null ? FeatherSourceFile47.lh(this.EH).func_147104_D().field_78845_b : null;
   }

   public String uh() {
      return "feathermc.com";
   }

   public int rl() {
      return this.zb = super.rl() + (((FeatherSourceFile$nc9)FeatherSourceFile47.nc(this.EH)).Dw ? this.bp().hP + 6 : 0);
   }

   public int fv() {
      return ((FeatherSourceFile$nc9)FeatherSourceFile47.xj(this.EH)).Dw ? Math.max(super.fv(), this.bp().hP) : super.fv();
   }

   public int ok() {
      return 150;
   }

   protected void oe(FeatherSourceFile683 var1) {
      int var2 = this.bp().hP;
      if (((FeatherSourceFile$nc9)FeatherSourceFile47.oe(this.EH)).Dw) {
         int var3 = ((FeatherSourceFile$nc9)FeatherSourceFile47.qy(this.EH)).Dw ? var2 + 3 : 0;
         this.gD.lh(this.s, (float)var3, (float)var2 / 2.0F - (float)Minecraft.func_71410_x().field_71466_p.field_78288_b / 2.0F, this.bp().hQ, this.bp().hR);
         if (FeatherSourceFile47.lh(this.EH).func_147104_D() != null && (FeatherSourceFile47.ou(this.EH) == null || !FeatherSourceFile47.ou(this.EH).equals(FeatherSourceFile47.lh(this.EH).func_147104_D().field_78845_b))) {
            FeatherSourceFile47.lh(this.EH, FeatherSourceFile47.lh(this.EH).func_147104_D().field_78845_b);
            if (FeatherSourceFile47.ou(this.EH) != null && !FeatherSourceFile47.ou(this.EH).isEmpty()) {
               FeatherSourceFile292.nc(FeatherSourceFile47.lh(this.EH).func_147104_D(), () -> {
                  FeatherSourceFile311.Sb.info("Received icon! Uploading...");
                  this.EG = new ResourceLocation("servers/" + FeatherSourceFile47.ou(this.EH) + "/icon");
                  FeatherSourceFile292.nc(this.EG, FeatherSourceFile47.lh(this.EH).func_147104_D().func_147409_e());
               });
            } else {
               this.EG = null;
            }
         }

         FeatherSourceFile843.lh(0, this.EG == null ? FeatherSourceFile47.cA() : this.EG);
         this.gD.pq(0, 0, var2, var2);
      } else {
         super.oe(var1);
      }

   }

   public boolean mu() {
      return false;
   }

   public FeatherSourceFile374 bp() {
      return ((FeatherSourceFile$nc9)FeatherSourceFile47.pq(this.EH)).zW;
   }

   // $FF: synthetic method
   public FeatherSourceFile89 hk() {
      return this.bp();
   }
}
