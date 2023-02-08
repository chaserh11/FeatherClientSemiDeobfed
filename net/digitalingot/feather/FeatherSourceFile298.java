package net.digitalingot.feather;

import net.digitalingot.vendor.javax.inject.Inject;
import net.digitalingot.vendor.javax.inject.Singleton;
import net.minecraft.client.Minecraft;
import net.minecraft.client.network.NetHandlerPlayClient;
import net.minecraft.client.network.NetworkPlayerInfo;
import net.minecraft.entity.player.EntityPlayer;

@Singleton
public class FeatherSourceFile298 {
   private final FeatherSourceFile294 TX = new FeatherSourceFile294();
   private final Minecraft minecraft;
   private final FeatherSourceFile434 xj;
   private boolean TY = true;

   @Inject
   public FeatherSourceFile298(Minecraft var1, FeatherSourceFile434 var2) {
      this.minecraft = var1;
      this.xj = var2;
      FeatherSourceFile149.oc.oe((var1x) -> {
         if (var1x == FeatherSourceFile$xj20.START) {
            this.TX.wY();
         }

      });
   }

   public void zU() {
      this.TX.lh(this.minecraft.func_147104_D(), () -> {
         if (!this.TY) {
            this.xj.nc(this::zU, 300L);
         }

      });
   }

   public int qy(EntityPlayer var1) {
      if (this.minecraft.field_71439_g != null && this.minecraft.func_147104_D() != null && var1 != null) {
         NetHandlerPlayClient var2 = this.minecraft.func_147114_u();
         if (var2 == null) {
            this.TY = true;
            return 0;
         } else {
            NetworkPlayerInfo var3 = var2.func_175102_a(var1.func_146103_bH().getId());
            if (var3 == null) {
               this.TY = true;
               return 0;
            } else {
               int var4 = var3.func_178853_c();
               if (var4 == 1) {
                  if (this.TY) {
                     this.TY = false;
                     this.xj.nc(this::zU, 0L);
                  }

                  return (int)this.minecraft.func_147104_D().field_78844_e;
               } else {
                  this.TY = true;
                  return var4;
               }
            }
         }
      } else {
         this.TY = true;
         return 0;
      }
   }

   public int bL() {
      return this.qy(this.minecraft.field_71439_g);
   }
}
