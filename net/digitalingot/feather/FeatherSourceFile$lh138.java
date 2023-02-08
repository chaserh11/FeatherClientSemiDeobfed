package net.digitalingot.feather;

import com.google.common.collect.Iterables;
import java.util.List;
import net.minecraft.client.resources.ResourcePackRepository.Entry;

public class FeatherSourceFile$lh138 extends FeatherSourceFile624 {
   private final FeatherSourceFile355 Du;
   // $FF: synthetic field
   final FeatherSourceFile589 Dv;

   public FeatherSourceFile$lh138(FeatherSourceFile589 var1) {
      this.Dv = var1;
      this.Du = new FeatherSourceFile355();
   }

   protected void oe(FeatherSourceFile683 var1) {
      switch (var1) {
         case MOD_LAYOUT:
            this.aF();
            break;
         case HUD_OVERLAY:
            this.bK();
      }

   }

   private void bK() {
      List var1 = FeatherSourceFile589.lh(this.Dv).func_110438_M().func_110613_c();
      if (var1.size() != 0) {
         Entry var2 = (Entry)Iterables.getLast(var1);
         boolean var3 = ((FeatherSourceFile$nc56)FeatherSourceFile589.nc(this.Dv)).Dw;
         boolean var4 = ((FeatherSourceFile$nc56)FeatherSourceFile589.xj(this.Dv)).DB;
         if (var3) {
            this.Du.lh(var2);
            this.gD.pq(0, 0, 22, 22);
         }

         int var5 = var3 ? 22 : 0;
         this.Du.lh(this.gD, (Entry)var2, (float)(var5 + 2), var4 ? 1.0F : (float)this.fv() / 2.0F - (float)FeatherSourceFile589.lh(this.Dv).field_71466_p.field_78288_b / 2.0F, ((FeatherSourceFile$nc56)FeatherSourceFile589.oe(this.Dv)).Dy, ((FeatherSourceFile$nc56)FeatherSourceFile589.qy(this.Dv)).Dz);
         if (var4) {
            this.Du.lh(this.gD, (Entry)var2, (float)(var5 + 2), 12.0F, ((FeatherSourceFile$nc56)FeatherSourceFile589.ou(this.Dv)).DC.getRGB(), ((FeatherSourceFile$nc56)FeatherSourceFile589.pq(this.Dv)).DD);
         }

      }
   }

   private void aF() {
      boolean var1 = ((FeatherSourceFile$nc56)FeatherSourceFile589.as(this.Dv)).Dw;
      boolean var2 = ((FeatherSourceFile$nc56)FeatherSourceFile589.km(this.Dv)).DB;
      if (var1) {
         this.Du.yG();
         this.gD.pq(0, 0, 22, 22);
      }

      int var3 = var1 ? 22 : 0;
      this.gD.lh("Feather", (float)(var3 + 2), var2 ? 1.0F : (float)this.fv() / 2.0F - (float)FeatherSourceFile589.lh(this.Dv).field_71466_p.field_78288_b / 2.0F, ((FeatherSourceFile$nc56)FeatherSourceFile589.mq(this.Dv)).Dy, ((FeatherSourceFile$nc56)FeatherSourceFile589.mr(this.Dv)).Dz);
      if (var2) {
         this.gD.lh("Pack Display", (float)(var3 + 2), 12.0F, ((FeatherSourceFile$nc56)FeatherSourceFile589.ux(this.Dv)).DC.getRGB(), ((FeatherSourceFile$nc56)FeatherSourceFile589.si(this.Dv)).DD, false);
      }

   }

   public Object ov() {
      return "Pack Display";
   }

   public boolean mu() {
      return false;
   }

   public int rl() {
      return this.zb = 157 + (((FeatherSourceFile$nc56)FeatherSourceFile589.wz(this.Dv)).Dw ? 22 : 0);
   }

   public int fv() {
      return this.pp = 22;
   }

   public FeatherSourceFile374 bp() {
      return ((FeatherSourceFile$nc56)FeatherSourceFile589.lt(this.Dv)).zW;
   }

   // $FF: synthetic method
   public FeatherSourceFile89 hk() {
      return this.bp();
   }
}
