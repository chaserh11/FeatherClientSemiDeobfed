package net.digitalingot.feather;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import net.digitalingot.vendor.javax.inject.Inject;
import net.digitalingot.vendor.javax.inject.Singleton;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import org.jetbrains.annotations.NotNull;

@Singleton
public class FeatherSourceFile378 {
   @NotNull
   private final @NotNull Minecraft minecraft;
   @NotNull
   private final @NotNull FeatherSourceFile849 pv;
   @NotNull
   private final @NotNull FeatherSourceFile336 ud;
   @NotNull
   private final @NotNull FeatherSourceFile663 sK;
   @NotNull
   private final @NotNull FeatherSourceFile394 vU;
   @NotNull
   private final @NotNull FeatherSourceFile492 vV;
   @NotNull
   private final @NotNull FeatherSourceFile87 pg;
   private int vW = 0;

   @Inject
   FeatherSourceFile378(@NotNull @NotNull Minecraft var1, @NotNull @NotNull FeatherSourceFile849 var2, @NotNull @NotNull FeatherSourceFile336 var3, @NotNull @NotNull FeatherSourceFile663 var4, @NotNull @NotNull FeatherSourceFile394 var5, @NotNull @NotNull FeatherSourceFile492 var6, @NotNull @NotNull FeatherSourceFile87 var7) {
      this.minecraft = var1;
      this.pv = var2;
      this.ud = var3;
      this.sK = var4;
      this.vU = var5;
      this.vV = var6;
      this.pg = var7;
   }

   public void fe() {
      this.ud.fe();
      this.sK.lh(this.vU);
      this.sK.lh(this.vV);
      this.pg.px();
      FeatherSourceFile725.wi.oe((var1, var2) -> {
         this.G();
      });
      FeatherSourceFile149.oc.oe((var1) -> {
         if (var1 == FeatherSourceFile$xj20.START) {
            this.H();
         }
      });
   }

   private void G() {
      UUID var1 = this.minecraft.func_110432_I().func_148256_e().getId();
      this.ud.qp().keySet().removeIf((var1x) -> {
         return !var1x.equals(var1);
      });
      FeatherSourceFile848 var2 = this.pv.iU();
      if (var2 != null) {
         var2.G();
      }

   }

   private void H() {
      EntityPlayerSP var1 = this.minecraft.field_71439_g;
      if (var1 != null) {
         if (++this.vW == 20) {
            this.vW = 0;
            FeatherSourceFile848 var2 = this.pv.iU();
            if (var2 != null) {
               World var3 = var1.field_70170_p;
               if (var3 != null) {
                  List var4 = var3.func_175661_b(EntityPlayer.class, (var1x) -> {
                     return var1x != var1;
                  });
                  ArrayList var5 = new ArrayList(var4.size());
                  Iterator var6 = var4.iterator();

                  while(var6.hasNext()) {
                     EntityPlayer var7 = (EntityPlayer)var6.next();
                     if (var7 != var1) {
                        var5.add(var7.func_110124_au());
                     }
                  }

                  var2.lh((List)var5, (Set)this.ud.qp().keySet());
               }
            }
         }
      }
   }
}
