package net.digitalingot.feather;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;
import java.util.stream.Collectors;
import net.digitalingot.vendor.javax.inject.Inject;
import net.digitalingot.vendor.javax.inject.Provider;
import net.digitalingot.vendor.javax.inject.Singleton;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ResourceLocation;

@Singleton
public class FeatherSourceFile549 {
   private static final ResourceLocation KM = new ResourceLocation("feather:textures/gui/voice_icon.png");
   private static final int KN = 512;
   private static final int KO = 512;
   private static final int KP = 1677721600;
   private final Minecraft minecraft;
   private final FeatherSourceFile111 JU;
   private final FeatherSourceFile70 JT;
   private final Set KQ;
   private final Set KR;
   private final FeatherSourceFile434 bh;
   private final FeatherSourceFile736 Ku;
   private final Provider KS;
   private FeatherSourceFile433 KT;

   @Inject
   FeatherSourceFile549(Minecraft var1, FeatherSourceFile111 var2, FeatherSourceFile70 var3, FeatherSourceFile736 var4, FeatherSourceFile434 var5, Provider var6) {
      this.minecraft = var1;
      this.JU = var2;
      this.JT = var3;
      this.bh = var5;
      this.Ku = var4;
      this.KS = var6;
      this.KQ = new HashSet();
      this.KR = new HashSet();
   }

   public void eW() {
      this.KQ.clear();
      this.KR.clear();
      this.KT = this.bh.lh(() -> {
         if (this.minecraft.field_71439_g != null && ((FeatherSourceFile717)this.KS.get()).se()) {
            Set var1 = (Set)this.Ku.F().stream().filter((var1x) -> {
               return !this.KR.contains(var1x) && !this.KQ.contains(var1x);
            }).collect(Collectors.toSet());
            if (var1.size() != 0) {
               this.KR.addAll(var1);
               FeatherSourceFile215 var2 = new FeatherSourceFile215(var1);
               ((FeatherSourceFile717)this.KS.get()).lh((FeatherSourceFile305)var2);
            }
         }
      }, 0L, 60L);
   }

   public void eX() {
      this.KQ.clear();
      this.KR.clear();
      this.KT.cancel();
      this.KT = null;
   }

   public void fe() {
      FeatherSourceFile185.ws.oe((var1, var2, var3, var4) -> {
         if (((FeatherSourceFile717)this.KS.get()).se()) {
            boolean var5 = this.KQ.contains(var1);
            boolean var6 = this.JU.gA();
            boolean var7 = var1.equals(this.minecraft.field_71439_g.func_110124_au());
            if (var7 || var5) {
               if (!var7 || var6) {
                  boolean var8 = this.JT.hb(var1);
                  int var9 = !var8 && var5 ? var4 & 16777215 | 1677721600 : var4;
                  FeatherSourceFile843.wq();
                  FeatherSourceFile843.hF();
                  FeatherSourceFile843.lh(0, KM);
                  FeatherSourceFile841.vK().lh(var2 + 1 - 2, var3 - 1, 0.0F, 0.0F, 512, 512, 10, 10, 512.0F, 512.0F, var9);
               }
            }
         }
      });
      FeatherSourceFile555.ws.oe((var1, var2) -> {
         if (((FeatherSourceFile717)this.KS.get()).se()) {
            if (var1 == this.minecraft.field_71439_g) {
               this.KR.clear();
               this.KQ.clear();
            }
         }
      });
      FeatherSourceFile34.yv.oe((var1) -> {
         if (((FeatherSourceFile717)this.KS.get()).se()) {
            if (var1 instanceof EntityPlayer) {
               UUID var2 = var1.func_110124_au();
               this.KQ.remove(var2);
               this.KR.remove(var2);
            }
         }
      });
   }

   public void oe(Set var1) {
      this.KQ.addAll(var1);
   }
}
