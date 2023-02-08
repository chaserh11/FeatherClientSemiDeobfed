package net.digitalingot.feather;

import java.util.Collection;
import java.util.Iterator;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.StatCollector;
import net.minecraft.util.StringUtils;

public class FeatherSourceFile$nc38 extends FeatherSourceFile413 {
   // $FF: synthetic field
   final FeatherSourceFile444 DR;

   public FeatherSourceFile$nc38(FeatherSourceFile444 var1) {
      this.DR = var1;
   }

   public void lh(FeatherSourceFile683 var1) {
      switch (var1) {
         case HUD_OVERLAY:
            this.render();
            return;
         case MOD_LAYOUT:
            this.bQ();
            return;
         default:
      }
   }

   private void render() {
      this.lh(FeatherSourceFile444.lh(this.DR).field_71439_g.func_70651_bq(), false);
   }

   private void bQ() {
      this.lh(FeatherSourceFile444.bN(), true);
   }

   public boolean ti() {
      return ((FeatherSourceFile$qy4)FeatherSourceFile444.nc(this.DR)).DT;
   }

   public int rl() {
      return !((FeatherSourceFile$qy4)FeatherSourceFile444.xj(this.DR)).DS.hG && !((FeatherSourceFile$qy4)FeatherSourceFile444.oe(this.DR)).DX ? 50 : 120;
   }

   public int fv() {
      return FeatherSourceFile444.lh(this.DR).field_71439_g.func_70651_bq().size() * (((FeatherSourceFile$qy4)FeatherSourceFile444.qy(this.DR)).DS.hG ? 25 : 20);
   }

   public int zu() {
      return 5 * (((FeatherSourceFile$qy4)FeatherSourceFile444.ou(this.DR)).DS.hG ? 25 : 20);
   }

   public boolean bR() {
      return this.DR.uj() && ((FeatherSourceFile$qy4)FeatherSourceFile444.pq(this.DR)).DZ;
   }

   private void lh(Collection var1, boolean var2) {
      if (!var1.isEmpty()) {
         boolean var3 = ((FeatherSourceFile$qy4)FeatherSourceFile444.as(this.DR)).DS.hG;
         int var4 = var3 ? 25 : (((FeatherSourceFile$qy4)FeatherSourceFile444.km(this.DR)).DX ? 20 : 18);
         if (var1.size() > 5 && var3) {
            var4 = 132 / (var1.size() - 1);
         }

         if (var3) {
            this.gD.nc(0, 0, this.rl(), var2 ? this.zu() : this.fv(), ((FeatherSourceFile$qy4)FeatherSourceFile444.mq(this.DR)).DS.hH.getRGB());
            if (((FeatherSourceFile$qy4)FeatherSourceFile444.mr(this.DR)).DS.hI) {
               this.gD.nc(0, 0, this.rl(), var2 ? this.zu() : this.fv(), ((FeatherSourceFile$qy4)FeatherSourceFile444.ux(this.DR)).DS.hJ.getRGB(), (float)((FeatherSourceFile$qy4)FeatherSourceFile444.si(this.DR)).DS.hK);
            }
         }

         int var5 = 0;
         boolean var7 = this.zm() + this.nt() / 2.0 <= (double)((float)(new ScaledResolution(FeatherSourceFile444.lh(this.DR))).func_78326_a() / 2.0F);
         int var6;
         if (var7) {
            var6 = var3 ? 6 : 0;
         } else {
            var6 = this.rl() - 18;
            var6 -= var3 ? 6 : 0;
         }

         for(Iterator var8 = var1.iterator(); var8.hasNext(); var5 += var4) {
            PotionEffect var9 = (PotionEffect)var8.next();
            int var10 = var5 + (var3 ? 5 : 0);
            StringBuilder var11 = new StringBuilder(FeatherSourceFile444.yz(StatCollector.func_74838_a(FeatherSourceFile444.bO().nc(var9))));
            if (!FeatherSourceFile444.bP().contains(FeatherSourceFile444.bO().lh(var9))) {
               var11.append(" ").append(FeatherSourceFile345.mx(var9.func_76458_c() + 1));
            }

            String var12 = var11.toString();
            String var13 = "**:**";
            if (!FeatherSourceFile444.bO().oe(var9)) {
               var13 = StringUtils.func_76337_a(FeatherSourceFile444.bO().xj(var9));
            }

            FeatherSourceFile444.bO().lh(var9, var6, var10);
            float var14;
            if (((FeatherSourceFile$qy4)FeatherSourceFile444.wz(this.DR)).DX) {
               if (var7) {
                  var14 = (float)((var3 ? 10 : 4) + 18);
               } else {
                  var14 = (float)(this.rl() - this.gD.vr(var12)) - 18.0F;
                  var14 -= var3 ? 10.0F : 4.0F;
               }

               this.gD.lh(var12, var14, (float)(var5 + (var3 ? 4 : 0)), ((FeatherSourceFile$qy4)FeatherSourceFile444.lt(this.DR)).DW, true);
            }

            if (this.nc(var9, var9.func_76459_b(), ((FeatherSourceFile$qy4)FeatherSourceFile444.hb(this.DR)).DU)) {
               if (var7) {
                  var14 = (float)((var3 ? 10 : 4) + 18);
               } else {
                  var14 = (float)(this.rl() - this.gD.vr(var13)) - 18.0F;
                  var14 -= var3 ? 10.0F : 4.0F;
               }

               this.gD.lh(var13, var14, (float)(var5 + (var3 ? 4 : 0) + (((FeatherSourceFile$qy4)FeatherSourceFile444.ep(this.DR)).DX ? 10 : 5)), ((FeatherSourceFile$qy4)FeatherSourceFile444.qr(this.DR)).DV, true);
            }
         }

      }
   }

   private boolean nc(PotionEffect var1, int var2, int var3) {
      if (!var1.func_82720_e() && var2 / 20 <= var3) {
         return var2 % 20 < 10;
      } else {
         return true;
      }
   }

   public FeatherSourceFile140 bS() {
      return ((FeatherSourceFile$qy4)FeatherSourceFile444.eg(this.DR)).DS;
   }

   // $FF: synthetic method
   public FeatherSourceFile89 hk() {
      return this.bS();
   }
}
