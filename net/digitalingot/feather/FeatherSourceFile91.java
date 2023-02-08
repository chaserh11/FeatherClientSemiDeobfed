package net.digitalingot.feather;

import java.text.DecimalFormat;
import net.digitalingot.vendor.com.google.inject.Singleton;
import net.digitalingot.vendor.javax.inject.Inject;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;

@Singleton
@FeatherSourceFile3(
   jj = FeatherSourceFile243.SPEED_METER,
   kl = @FeatherSourceFile414(
   jc = "feather.modulename.speedmeter",
   jl = "https://assets.feathercdn.net/game/mods/speedmeter.svg",
   od = "feather.moduledescription.speedmeter",
   wr = {FeatherSourceFile$lh3.PVP, FeatherSourceFile$lh3.HUD},
   tp = {"Momentum", "Velocity"}
)
)
@FeatherSourceFile629(
   jt = {@FeatherSourceFile503(
   al = FeatherSourceFile$lh127.class
)}
)
public class FeatherSourceFile91 extends FeatherSourceFile360 {
   private double GT;
   private double GU = 0.0;
   private final Minecraft minecraft;
   private final DecimalFormat GV = FeatherSourceFile333.gj("#.# m/s");
   private String GW;

   @Inject
   FeatherSourceFile91(Minecraft var1) {
      this.minecraft = var1;
   }

   public void ex() {
      FeatherSourceFile149.oc.oe((var1) -> {
         if (var1 == FeatherSourceFile$xj20.END && this.minecraft.field_71439_g != null && this.uj()) {
            EntityPlayerSP var2 = this.minecraft.field_71439_g;
            double var3 = var2.field_70169_q;
            double var5 = var2.field_70166_s;
            double var7 = var3 - this.GT;
            double var9 = var5 - this.GU;
            double var11 = Math.sqrt((double)((float)(var7 * var7 + var9 * var9)));
            this.GW = this.GV.format(var11 / 0.05000000074505806);
            this.GT = var3;
            this.GU = var5;
         }
      });
   }

   // $FF: synthetic method
   static String lh(FeatherSourceFile91 var0) {
      return var0.GW;
   }

   // $FF: synthetic method
   static FeatherSourceFile136 nc(FeatherSourceFile91 var0) {
      return var0.fS;
   }
}
