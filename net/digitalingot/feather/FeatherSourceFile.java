package net.digitalingot.feather;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import net.digitalingot.vendor.com.google.inject.Singleton;
import net.digitalingot.vendor.javax.inject.Inject;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

@Singleton
@FeatherSourceFile3(
   jj = FeatherSourceFile243.ARMOR_STATUS,
   kl = @FeatherSourceFile414(
   jc = "feather.modulename.armorstatus",
   jl = "https://assets.feathercdn.net/game/mods/armorstatus.svg",
   od = "feather.moduledescription.armorstatus",
   wr = {FeatherSourceFile$lh3.PVP, FeatherSourceFile$lh3.HUD}
)
)
@FeatherSourceFile629(
   jt = {@FeatherSourceFile503(
   al = FeatherSourceFile.nc53.class
)}
)
public class FeatherSourceFile extends FeatherSourceFile360 {
   private static final ItemStack[] yK;
   private static final ItemStack yL;
   private final Minecraft minecraft;

   @Inject
   FeatherSourceFile(Minecraft var1) {
      this.minecraft = var1;
   }

   // $FF: synthetic method
   static FeatherSourceFile136 qr(FeatherSourceFile var0) {
      return var0.fS;
   }

   // $FF: synthetic method
   static FeatherSourceFile136 eg(FeatherSourceFile var0) {
      return var0.fS;
   }

   // $FF: synthetic method
   static FeatherSourceFile136 oy(FeatherSourceFile var0) {
      return var0.fS;
   }

   // $FF: synthetic method
   static FeatherSourceFile136 ug(FeatherSourceFile var0) {
      return var0.fS;
   }

   // $FF: synthetic method
   static FeatherSourceFile136 hv(FeatherSourceFile var0) {
      return var0.fS;
   }

   // $FF: synthetic method
   static FeatherSourceFile136 sm(FeatherSourceFile var0) {
      return var0.fS;
   }

   // $FF: synthetic method
   static FeatherSourceFile136 ly(FeatherSourceFile var0) {
      return var0.fS;
   }

   // $FF: synthetic method
   static FeatherSourceFile136 rp(FeatherSourceFile var0) {
      return var0.fS;
   }

   // $FF: synthetic method
   static FeatherSourceFile136 tx(FeatherSourceFile var0) {
      return var0.fS;
   }

   // $FF: synthetic method
   static FeatherSourceFile136 wn(FeatherSourceFile var0) {
      return var0.fS;
   }

   // $FF: synthetic method
   static FeatherSourceFile136 jh(FeatherSourceFile var0) {
      return var0.fS;
   }

   // $FF: synthetic method
   static FeatherSourceFile136 gr(FeatherSourceFile var0) {
      return var0.fS;
   }

   // $FF: synthetic method
   static FeatherSourceFile136 oh(FeatherSourceFile var0) {
      return var0.fS;
   }

   // $FF: synthetic method
   static FeatherSourceFile136 hg(FeatherSourceFile var0) {
      return var0.fS;
   }

   // $FF: synthetic method
   static FeatherSourceFile136 et(FeatherSourceFile var0) {
      return var0.fS;
   }

   // $FF: synthetic method
   static FeatherSourceFile136 yl(FeatherSourceFile var0) {
      return var0.fS;
   }

   // $FF: synthetic method
   static FeatherSourceFile136 ai(FeatherSourceFile var0) {
      return var0.fS;
   }

   // $FF: synthetic method
   static FeatherSourceFile136 ja(FeatherSourceFile var0) {
      return var0.fS;
   }

   // $FF: synthetic method
   static FeatherSourceFile136 qn(FeatherSourceFile var0) {
      return var0.fS;
   }

   // $FF: synthetic method
   static FeatherSourceFile136 er(FeatherSourceFile var0) {
      return var0.fS;
   }

   // $FF: synthetic method
   static FeatherSourceFile136 zd(FeatherSourceFile var0) {
      return var0.fS;
   }

   // $FF: synthetic method
   static FeatherSourceFile136 ps(FeatherSourceFile var0) {
      return var0.fS;
   }

   static {
      yK = new ItemStack[]{new ItemStack(Items.field_151175_af), new ItemStack(Items.field_151173_ae), new ItemStack(Items.field_151163_ad), new ItemStack(Items.field_151161_ac)};
      yL = new ItemStack(Items.field_151048_u);
   }

   @FeatherSourceFile368(
      zc = true
   )
   public static class lh126 extends FeatherSourceFile136 {
      @FeatherSourceFile571(
         lb = "color",
         jc = "feather.commonterm.textcolor",
         jm = @FeatherSourceFile655(
   kz = 0
)
      )
      public FeatherSourceFile225 hQ;
      @FeatherSourceFile571(
         lb = "damageDisplayType",
         jc = "feather.modules.armorstatus.damageDisplayType",
         kd = "value",
         jm = @FeatherSourceFile655(
   kz = 1
)
      )
      public FeatherSourceFile$lh$lh15 yP;
      @FeatherSourceFile571(
         lb = "iconLocation",
         jc = "feather.modules.armorstatus.iconLocation",
         kd = "right",
         jm = @FeatherSourceFile655(
   kz = 2
)
      )
      public FeatherSourceFile$lh$nc5 yQ;
      @FeatherSourceFile571(
         lb = "listMode",
         jc = "feather.modules.armorstatus.listMode",
         kd = "vertical",
         jm = @FeatherSourceFile655(
   kz = 3
)
      )
      public FeatherSourceFile$lh$xj4 yR;
      @FeatherSourceFile571(
         lb = "padding",
         jc = "feather.modules.armorstatus.padding",
         kd = "2",
         jm = @FeatherSourceFile655(
   kz = 4
)
      )
      @FeatherSourceFile622(
         tr = 5
      )
      public int yS;
      @FeatherSourceFile656(
         jm = @FeatherSourceFile655(
   kz = 10
)
      )
      @FeatherSourceFile600(
         xp = FeatherSourceFile637.BOTTOM_RIGHT,
         vl = 0.0,
         go = -1.0
      )
      public FeatherSourceFile89 yT;
      @FeatherSourceFile655(
         kz = 10
      )
      public FeatherSourceFile68 yU = new FeatherSourceFile68("feather.titles.show");
      @FeatherSourceFile571(
         lb = "enableItemName",
         jc = "feather.modules.armorstatus.enableItemName",
         kd = "false",
         jm = @FeatherSourceFile655(
   kz = 11
)
      )
      public boolean yV;
      @FeatherSourceFile571(
         lb = "showArmorDamage",
         jc = "feather.modules.armorstatus.showArmorDamage",
         kd = "true",
         jm = @FeatherSourceFile655(
   kz = 12
)
      )
      public boolean yW;
      @FeatherSourceFile571(
         lb = "showDamageOverlay",
         jc = "feather.modules.armorstatus.showDamageOverlay",
         kd = "true",
         jm = @FeatherSourceFile655(
   kz = 13
)
      )
      public boolean yX;
      @FeatherSourceFile571(
         lb = "showEquippedItem",
         jc = "feather.modules.armorstatus.showEquippedItem",
         kd = "true",
         jm = @FeatherSourceFile655(
   kz = 14
)
      )
      public boolean yY;
      @FeatherSourceFile571(
         lb = "showItemCount",
         jc = "feather.modules.armorstatus.showItemCount",
         kd = "true",
         jm = @FeatherSourceFile655(
   kz = 15
)
      )
      public boolean yZ;
      @FeatherSourceFile571(
         lb = "showItemDamage",
         jc = "feather.modules.armorstatus.showItemDamage",
         kd = "true",
         jm = @FeatherSourceFile655(
   kz = 16
)
      )
      public boolean zo;
      @FeatherSourceFile571(
         lb = "showMaxDamage",
         jc = "feather.modules.armorstatus.showMaxDamage",
         kd = "false",
         jm = @FeatherSourceFile655(
   kz = 17
)
      )
      public boolean zA;
   }

   public class nc53 extends FeatherSourceFile413 {
      private final List zB = new ArrayList();

      public void lh(FeatherSourceFile683 var1) {
         boolean var2 = var1 == FeatherSourceFile683.MOD_LAYOUT;
         this.yl(var2);
         this.aD();
      }

      public int rl() {
         switch (((FeatherSourceFile.lh126)FeatherSourceFile.this.fS).yR) {
            case VERTICAL:
               return ((FeatherSourceFile.lh126)FeatherSourceFile.this.fS).yV ? 130 : 45;
            case HORIZONTAL:
               int var1 = 0;

               FeatherSourceFile$nc$lh1 var3;
               for(Iterator var2 = this.zB.iterator(); var2.hasNext(); var1 += FeatherSourceFile$nc$lh1.lh(var3)) {
                  var3 = (FeatherSourceFile$nc$lh1)var2.next();
               }

               return var1 + 5;
            default:
               throw new IllegalStateException();
         }
      }

      public int fv() {
         return (((FeatherSourceFile.lh126)FeatherSourceFile.this.fS).yR == FeatherSourceFile$lh$xj4.HORIZONTAL ? 1 : (((FeatherSourceFile.lh126)FeatherSourceFile.this.fS).yY ? 5 : 4)) * (((FeatherSourceFile.lh126)FeatherSourceFile.this.fS).yV ? 22 : 16);
      }

      public int yi() {
         switch (((FeatherSourceFile.lh126)FeatherSourceFile.this.fS).yR) {
            case VERTICAL:
               return ((FeatherSourceFile.lh126)FeatherSourceFile.this.fS).yV ? 130 : 45;
            case HORIZONTAL:
               return 196;
            default:
               throw new IllegalStateException();
         }
      }

      private ItemStack nc(int var1, boolean var2) {
         if (var2) {
            if (var1 == -1 && ((FeatherSourceFile.lh126)FeatherSourceFile.this.fS).yY) {
               return FeatherSourceFile.yL;
            }

            if (var1 != -1) {
               return FeatherSourceFile.yK[var1];
            }
         } else {
            EntityPlayerSP var3 = FeatherSourceFile.this.minecraft.field_71439_g;
            if (var1 == -1 && ((FeatherSourceFile.lh126)FeatherSourceFile.this.fS).yY) {
               return var3.func_70694_bm();
            }

            if (var1 != -1) {
               return var3.field_71071_by.field_70460_b[var1];
            }
         }

         return null;
      }

      private void yl(boolean var1) {
         this.zB.clear();

         for(int var2 = 3; var2 >= -1; --var2) {
            ItemStack var3 = this.nc(var2, var1);
            if (var3 != null && var3 != null) {
               this.zB.add(new FeatherSourceFile$nc$lh1(this, var3, 16, 16, var2 > -1, (FeatherSourceFile.lh126)FeatherSourceFile.this.fS));
            }
         }

      }

      private void aD() {
         if (!this.zB.isEmpty()) {
            int var1;
            switch (((FeatherSourceFile.lh126)FeatherSourceFile.this.fS).yR) {
               case VERTICAL:
                  var1 = ((FeatherSourceFile.lh126)FeatherSourceFile.this.fS).yV ? 5 : 0;
                  int var6 = ((FeatherSourceFile.lh126)FeatherSourceFile.this.fS).yV ? 21 : 16;
                  if (((FeatherSourceFile.lh126)FeatherSourceFile.this.fS).yQ == FeatherSourceFile$lh$nc5.LEFT) {
                     for(Iterator var8 = this.zB.iterator(); var8.hasNext(); var1 += var6) {
                        FeatherSourceFile$nc$lh1 var9 = (FeatherSourceFile$nc$lh1)var8.next();
                        var9.sm(FeatherSourceFile$nc$lh1.lh(var9) + ((FeatherSourceFile.lh126)FeatherSourceFile.this.fS).yS, var1);
                     }

                     return;
                  }

                  int var7 = this.rl();

                  for(Iterator var4 = this.zB.iterator(); var4.hasNext(); var1 += var6) {
                     FeatherSourceFile$nc$lh1 var5 = (FeatherSourceFile$nc$lh1)var4.next();
                     var5.sm(var7, var1);
                  }

                  return;
               case HORIZONTAL:
                  var1 = 3;

                  FeatherSourceFile$nc$lh1 var3;
                  for(Iterator var2 = this.zB.iterator(); var2.hasNext(); var1 += FeatherSourceFile$nc$lh1.lh(var3)) {
                     var3 = (FeatherSourceFile$nc$lh1)var2.next();
                     var3.sm(var1 + FeatherSourceFile$nc$lh1.lh(var3) + ((FeatherSourceFile.lh126)FeatherSourceFile.this.fS).yS, 6);
                  }
            }

         }
      }

      public FeatherSourceFile89 hk() {
         return ((FeatherSourceFile.lh126)FeatherSourceFile.this.fS).yT;
      }

      // $FF: synthetic method
      static FeatherSourceFile852 lh(FeatherSourceFile.nc53 var0) {
         return var0.gD;
      }

      // $FF: synthetic method
      static FeatherSourceFile852 nc(FeatherSourceFile.nc53 var0) {
         return var0.gD;
      }

      // $FF: synthetic method
      static FeatherSourceFile852 xj(FeatherSourceFile.nc53 var0) {
         return var0.gD;
      }

      // $FF: synthetic method
      static FeatherSourceFile852 oe(FeatherSourceFile.nc53 var0) {
         return var0.gD;
      }

      // $FF: synthetic method
      static FeatherSourceFile852 qy(FeatherSourceFile.nc53 var0) {
         return var0.gD;
      }

      // $FF: synthetic method
      static FeatherSourceFile852 ou(FeatherSourceFile.nc53 var0) {
         return var0.gD;
      }

      // $FF: synthetic method
      static FeatherSourceFile852 pq(FeatherSourceFile.nc53 var0) {
         return var0.gD;
      }

      // $FF: synthetic method
      static FeatherSourceFile852 as(FeatherSourceFile.nc53 var0) {
         return var0.gD;
      }

      // $FF: synthetic method
      static FeatherSourceFile852 km(FeatherSourceFile.nc53 var0) {
         return var0.gD;
      }

      // $FF: synthetic method
      static FeatherSourceFile852 mq(FeatherSourceFile.nc53 var0) {
         return var0.gD;
      }

      // $FF: synthetic method
      static FeatherSourceFile852 mr(FeatherSourceFile.nc53 var0) {
         return var0.gD;
      }

      // $FF: synthetic method
      static FeatherSourceFile852 ux(FeatherSourceFile.nc53 var0) {
         return var0.gD;
      }
   }
}
