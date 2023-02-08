package net.digitalingot.feather;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import net.digitalingot.vendor.javax.inject.Inject;
import net.digitalingot.vendor.javax.inject.Singleton;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.client.network.NetHandlerPlayClient;
import net.minecraft.client.network.NetworkPlayerInfo;
import org.jetbrains.annotations.NotNull;

@Singleton
public class FeatherSourceFile63 {
   @NotNull
   private final @NotNull Minecraft minecraft;
   @NotNull
   private final @NotNull FeatherSourceFile366 xK;
   @NotNull
   private final @NotNull FeatherSourceFile849 pv;
   @NotNull
   private final @NotNull FeatherSourceFile378 xL;
   @NotNull
   private final @NotNull FeatherSourceFile100 xD;
   private int xM;

   @Inject
   FeatherSourceFile63(@NotNull @NotNull Minecraft var1, @NotNull @NotNull FeatherSourceFile366 var2, @NotNull @NotNull FeatherSourceFile849 var3, @NotNull @NotNull FeatherSourceFile378 var4, @NotNull @NotNull FeatherSourceFile100 var5) {
      this.minecraft = var1;
      this.xK = var2;
      this.pv = var3;
      this.xL = var4;
      this.xD = var5;
   }

   public void fe() {
      this.xK.fe();
      this.xL.fe();
      this.xD.fe();
      this.pv.fe();
      this.pv.yh();
      FeatherSourceFile725.wi.oe((var1, var2) -> {
         EntityPlayerSP var3 = Minecraft.func_71410_x().field_71439_g;
         if (var3 == null) {
            this.pv.iT().clear();
         } else {
            this.pv.iT().keySet().removeIf((var1x) -> {
               return !var1x.equals(var3.func_110124_au());
            });
         }

      });
      FeatherSourceFile149.oc.oe((var1) -> {
         if (var1 == FeatherSourceFile$xj20.START) {
            this.V();
         }
      });
   }

   private void V() {
      if (++this.xM == 20) {
         this.xM = 0;
         NetHandlerPlayClient var1 = this.minecraft.func_147114_u();
         if (var1 != null) {
            Collection var2 = var1.func_175106_d();
            HashSet var3 = new HashSet(var2.size());
            Iterator var4 = var2.iterator();

            while(var4.hasNext()) {
               NetworkPlayerInfo var5 = (NetworkPlayerInfo)var4.next();
               var3.add(var5.func_178845_a().getId());
            }

            FeatherSourceFile848 var6 = this.pv.iU();
            if (var6 != null) {
               var6.qy(var3);
            }

         }
      }
   }

   @NotNull
   public @NotNull FeatherSourceFile849 W() {
      return this.pv;
   }

   @NotNull
   public @NotNull FeatherSourceFile378 X() {
      return this.xL;
   }

   @NotNull
   public @NotNull FeatherSourceFile100 Y() {
      return this.xD;
   }
}
