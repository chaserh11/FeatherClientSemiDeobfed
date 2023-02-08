package net.digitalingot.feather;

import net.digitalingot.vendor.com.google.inject.Singleton;
import net.digitalingot.vendor.javax.inject.Inject;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.MovingObjectPosition.MovingObjectType;

@Singleton
@FeatherSourceFile3(
   jj = FeatherSourceFile243.COMBO_DISPLAY,
   kl = @FeatherSourceFile414(
   jc = "feather.modulename.combodisplay",
   jl = "https://assets.feathercdn.net/game/mods/combodisplay.svg",
   od = "feather.moduledescription.combodisplay",
   wr = {FeatherSourceFile$lh3.PVP, FeatherSourceFile$lh3.HUD}
)
)
@FeatherSourceFile629(
   jt = {@FeatherSourceFile503(
   al = FeatherSourceFile$nc16.class
)}
)
public class FeatherSourceFile61 extends FeatherSourceFile360 {
   private static final long zR = 2000L;
   private static final long zS = 500L;
   private final Minecraft minecraft;
   private long zT;
   private int zU = 0;
   private int zV;

   @Inject
   FeatherSourceFile61(Minecraft var1) {
      this.minecraft = var1;
   }

   public void ex() {
      FeatherSourceFile670.ws.oe((var1, var2) -> {
         if (this.uj() && var2 instanceof EntityPlayer) {
            if (this.minecraft.field_71476_x != null) {
               if (this.minecraft.field_71476_x.field_72313_a == MovingObjectType.ENTITY) {
                  if (this.minecraft.field_71476_x.field_72308_g != null && this.minecraft.field_71476_x.field_72308_g.func_145782_y() == var2.func_145782_y()) {
                     if (this.zV != var2.func_145782_y()) {
                        this.zU = 0;
                     }

                     this.zV = var2.func_145782_y();
                     this.zT = System.currentTimeMillis();
                  }
               }
            }
         }
      });
      FeatherSourceFile181.ws.oe((var1) -> {
         if (this.uj() && this.minecraft.field_71439_g != null) {
            int var2 = var1.func_145782_y();
            if (var2 == this.minecraft.field_71439_g.func_145782_y()) {
               this.zU = 0;
            } else if (this.zV == var2 && System.currentTimeMillis() - this.zT < 500L) {
               ++this.zU;
            }

         }
      });
      FeatherSourceFile149.oc.oe((var1) -> {
         if (var1 == FeatherSourceFile$xj20.END && this.minecraft.field_71439_g != null && this.uj()) {
            if (System.currentTimeMillis() > this.zT + 2000L) {
               this.zU = 0;
            }

         }
      });
   }

   // $FF: synthetic method
   static int lh(FeatherSourceFile61 var0) {
      return var0.zU;
   }

   // $FF: synthetic method
   static FeatherSourceFile136 nc(FeatherSourceFile61 var0) {
      return var0.fS;
   }

   // $FF: synthetic method
   static FeatherSourceFile136 xj(FeatherSourceFile61 var0) {
      return var0.fS;
   }

   // $FF: synthetic method
   static FeatherSourceFile136 oe(FeatherSourceFile61 var0) {
      return var0.fS;
   }
}
