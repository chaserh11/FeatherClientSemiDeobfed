package net.digitalingot.feather;

import net.digitalingot.vendor.com.google.inject.Singleton;
import net.digitalingot.vendor.javax.inject.Inject;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.client.settings.GameSettings;

@Singleton
@FeatherSourceFile3(
   jj = FeatherSourceFile243.PERSPECTIVE,
   kl = @FeatherSourceFile414(
   jc = "feather.modulename.perspective",
   jl = "https://assets.feathercdn.net/game/mods/perspective.svg",
   od = "feather.moduledescription.perspective",
   wr = {FeatherSourceFile$lh3.PVP},
   tp = {"Freelook"}
)
)
public class FeatherSourceFile768 extends FeatherSourceFile495 {
   private final Minecraft minecraft;
   private final FeatherSourceFile55 kQ;
   private float pD = 0.0F;
   private float pE = 0.0F;
   private boolean pF = false;
   private int pG = 0;

   @Inject
   FeatherSourceFile768(Minecraft var1, FeatherSourceFile55 var2) {
      this.minecraft = var1;
      this.kQ = var2;
   }

   public void ex() {
      FeatherSourceFile725.wi.oe((var1, var2) -> {
         if (this.uj()) {
            this.pF = false;
         }
      });
      this.kQ.lh(() -> {
         return ((FeatherSourceFile$lh23)this.fS).pH;
      }, () -> {
         if (this.uj()) {
            GameSettings var1 = this.minecraft.field_71474_y;
            this.pF = !this.pF;
            EntityPlayerSP var2 = this.minecraft.field_71439_g;
            this.pE = var2.field_70177_z;
            this.pD = var2.field_70125_A;
            if (this.pF) {
               this.pG = var1.field_74320_O;
               var1.field_74320_O = 1;
            } else {
               var1.field_74320_O = this.pG;
            }

            this.xd();
         }
      }, () -> {
         if (((FeatherSourceFile$lh23)this.fS).pK && this.pF) {
            GameSettings var1 = this.minecraft.field_71474_y;
            this.pF = false;
            var1.field_74320_O = this.pG;
            this.xd();
         }
      });
      FeatherSourceFile609.cm.oe((var1, var2, var3, var4) -> {
         this.ep(var1, var2);
      });
      FeatherSourceFile609.xw.oe((var1, var2, var3) -> {
         this.ep(var1 + 100001, -1);
      });
   }

   public void nc(float var1, float var2) {
      this.pE += var1 * (((FeatherSourceFile$lh23)this.fS).pJ ? -0.15F : 0.15F);
      this.pD += var2 * (((FeatherSourceFile$lh23)this.fS).pI ? 0.15F : -0.15F);
      if (this.pD < -90.0F) {
         this.pD = -90.0F;
      } else if (this.pD > 90.0F) {
         this.pD = 90.0F;
      }

   }

   public float ld() {
      return this.pD;
   }

   public float fi() {
      return this.pE;
   }

   public boolean cy() {
      return this.pF;
   }

   private void xd() {
      GameSettings var1 = this.minecraft.field_71474_y;
      this.minecraft.field_71438_f.func_174979_m();
   }

   private void ep(int var1, int var2) {
      if (this.uj()) {
         if (var2 != -1) {
            GameSettings var3 = this.minecraft.field_71474_y;
            boolean var4 = var3.field_151457_aa.func_151463_i() == var1;
            if (var4) {
               this.pF = false;
            }
         }

      }
   }
}
