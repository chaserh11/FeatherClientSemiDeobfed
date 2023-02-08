package net.digitalingot.feather;

import java.util.UUID;
import net.digitalingot.vendor.javax.inject.Inject;
import net.digitalingot.vendor.javax.inject.Provider;
import net.minecraft.client.gui.GuiChat;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class FeatherSourceFile615 {
   private static final ResourceLocation vH = new ResourceLocation("feather:textures/gui/feather_logo.png");
   private static final int vI = 322;
   private static final int vJ = 97;
   private static final ResourceLocation vK = new ResourceLocation("feather:textures/gui/feather_icon.png");
   private static final int vL = 173;
   private static final int vM = 257;
   private final Provider gw;
   @NotNull
   private final @NotNull FeatherSourceFile849 pv;

   @Inject
   FeatherSourceFile615(@NotNull @NotNull FeatherSourceFile849 var1, Provider var2) {
      this.pv = var1;
      this.gw = var2;
   }

   public void fe() {
      FeatherSourceFile134.je.oe((var1) -> {
         if (((FeatherSourceFile372)var1).isMinecraftScreen()) {
            boolean var2 = var1 instanceof GuiChat;
            if (!var2) {
               this.ug(var1.field_146294_l, var1.field_146295_m);
            }

         }
      });
      FeatherSourceFile159.vi.oe((var1, var2) -> {
         UUID var3 = var1.func_110124_au();
         Integer var4 = this.mq(var3);
         if (var4 != null) {
            var2.ou(var2.qf() + 4);
            var2.as(4);
         }

      });
      FeatherSourceFile159.ya.oe((var1, var2) -> {
         int var3 = var2.qf();
         int var4 = var2.mi();
         this.lh(var1, var3, var4);
      });
   }

   @Nullable
   private @Nullable Integer mq(UUID var1) {
      FeatherSourceFile$lh$xj.nc.xj var2 = (FeatherSourceFile$lh$xj.nc.xj)this.pv.iT().get(var1);
      if (var2 != null && var2.jM()) {
         switch (var2.jS().jU()) {
            case OWNER:
            case DEVELOPER:
               return -65531;
            case ADMIN:
               return -6595917;
            case STAFF:
               return -16747009;
            case PRO:
               return -459710;
            case PARTNER:
               return -10496;
            case CREATOR:
               return -13445665;
            default:
               return -1;
         }
      } else {
         return null;
      }
   }

   public int lh(UUID var1, int var2, int var3) {
      Integer var4 = this.mq(var1);
      if (var4 != null) {
         FeatherSourceFile843.lh(0, vK);
         FeatherSourceFile841.vK().lh(var2, var3, 0.0F, 0.0F, 173, 257, 6, 8, 173.0F, 257.0F, var4);
         return 9;
      } else {
         return 0;
      }
   }

   public void lh(Entity var1, int var2, int var3) {
      UUID var4 = var1.func_110124_au();
      Integer var5 = this.mq(var4);
      if (var5 != null) {
         FeatherSourceFile843.ck(true);
         FeatherSourceFile843.hI();
         FeatherSourceFile843.hP();
         ((FeatherSourceFile185)FeatherSourceFile185.ws.sx()).renderLogo(var4, var2, var3, var5);
         var2 = -var2;
         FeatherSourceFile843.lh(0, vK);
         FeatherSourceFile841.vK().lh(var2 + 1, var3, 0.0F, 0.0F, 173, 257, 5, 7, 173.0F, 257.0F, var1.func_70093_af() ? var5 & 16777215 | 1677721600 : var5);
         FeatherSourceFile843.ck(false);
         FeatherSourceFile843.hJ();
         FeatherSourceFile843.hO();
      }

   }

   public void ug(int var1, int var2) {
      boolean var3 = true;
      boolean var4 = true;
      FeatherSourceFile843.hH();
      FeatherSourceFile843.hJ();
      FeatherSourceFile843.wq();
      FeatherSourceFile843.hF();
      FeatherSourceFile843.lh(0, vH);
      FeatherSourceFile841.vK().lh(var1 - 80 - 5, var2 - 24 - 5, 0.0F, 0.0F, 322, 257, 80, 24, 322.0F, 257.0F, ((FeatherSourceFile$lh133)((FeatherSourceFile486)this.gw.get()).pr()).tF.getRGB());
      FeatherSourceFile843.hI();
   }
}
