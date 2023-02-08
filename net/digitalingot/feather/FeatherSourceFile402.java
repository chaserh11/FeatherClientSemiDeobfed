package net.digitalingot.feather;

import java.text.DecimalFormat;
import net.digitalingot.vendor.com.google.inject.Singleton;
import net.digitalingot.vendor.javax.inject.Inject;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.util.Vec3;
import net.minecraft.util.MovingObjectPosition.MovingObjectType;

@Singleton
@FeatherSourceFile3(
   jj = FeatherSourceFile243.REACH_DISPLAY,
   kl = @FeatherSourceFile414(
   jc = "feather.modulename.reachdisplay",
   jl = "https://assets.feathercdn.net/game/mods/reachdisplay.svg",
   od = "feather.moduledescription.reachdisplay",
   wr = {FeatherSourceFile$lh3.PVP, FeatherSourceFile$lh3.HUD}
)
)
@FeatherSourceFile629(
   jt = {@FeatherSourceFile503(
   al = FeatherSourceFile$lh56.class
)}
)
public class FeatherSourceFile402 extends FeatherSourceFile360 {
   private static final long Eb = 2000L;
   private static final float Ec = 0.0F;
   private static final String Ed = "No hit";
   private final Minecraft minecraft;
   private final DecimalFormat Ee = FeatherSourceFile333.gj("#.# blocks");
   private long zT;
   private float Ef = 0.0F;
   private String Eg;

   @Inject
   FeatherSourceFile402(Minecraft var1) {
      this.minecraft = var1;
   }

   public void ex() {
      FeatherSourceFile670.ws.oe((var1, var2) -> {
         if (this.uj()) {
            if (this.minecraft.field_71476_x != null) {
               if (this.minecraft.field_71476_x.field_72313_a == MovingObjectType.ENTITY) {
                  if (this.minecraft.field_71476_x.field_72308_g != null) {
                     Entity var3 = this.minecraft.field_71476_x.field_72308_g;
                     Vec3 var4 = this.minecraft.field_71476_x.field_72307_f;
                     if (var2.func_145782_y() == var3.func_145782_y()) {
                        if (var2.field_70172_ad <= 10) {
                           Entity var5 = this.minecraft.func_175606_aa();
                           Vec3 var6 = var5.func_174824_e(1.0F);
                           float var7 = (float)var4.func_72438_d(var6);
                           this.zT = System.currentTimeMillis();
                           this.Ef = var7;
                           this.bU();
                        }
                     }
                  }
               }
            }
         }
      });
      FeatherSourceFile149.oc.oe((var1) -> {
         if (var1 == FeatherSourceFile$xj20.END && this.minecraft.field_71439_g != null && this.uj()) {
            if (this.Ef != 0.0F && System.currentTimeMillis() > this.zT + 2000L) {
               this.Ef = 0.0F;
               this.bU();
            }

         }
      });
   }

   private void bU() {
      if (this.Ef == 0.0F) {
         this.Eg = "No hit";
      } else {
         this.Eg = this.Ee.format((double)this.Ef);
      }

   }

   public void pu() {
      super.pu();
      FeatherSourceFile333.lh(this.Ee, ((FeatherSourceFile$nc27)this.fS).Ej);
      this.bU();
   }

   // $FF: synthetic method
   static String lh(FeatherSourceFile402 var0) {
      return var0.Eg;
   }

   // $FF: synthetic method
   static FeatherSourceFile136 nc(FeatherSourceFile402 var0) {
      return var0.fS;
   }
}
