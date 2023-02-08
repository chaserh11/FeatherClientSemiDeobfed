package net.digitalingot.feather.mixin.client;

import java.util.List;
import net.digitalingot.feather.FeatherSourceFile$lh2;
import net.digitalingot.feather.FeatherSourceFile598;
import net.minecraft.client.gui.FontRenderer;
import net.minecraftforge.fml.client.config.GuiUtils;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyVariable;
import org.spongepowered.asm.mixin.injection.Slice;
import org.spongepowered.asm.mixin.injection.At.Shift;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({GuiUtils.class})
public abstract class FeatherSourceFile87 {
   @Unique
   private static int Wo;
   @Unique
   private static int Wp;
   @Unique
   private static int Wq;
   @Unique
   private static int Wr;

   @ModifyVariable(
      method = {"drawHoveringText(Ljava/util/List;IIIIILnet/minecraft/client/gui/FontRenderer;)V"},
      at = @At(
   value = "CONSTANT",
   args = {"intValue=-267386864"},
   ordinal = 0
),
      ordinal = 5,
      require = 1,
      allow = 1,
      remap = false
   )
   private static int qf(int var0) {
      Wq = var0;
      return var0;
   }

   @ModifyVariable(
      method = {"drawHoveringText(Ljava/util/List;IIIIILnet/minecraft/client/gui/FontRenderer;)V"},
      at = @At(
   value = "CONSTANT",
   args = {"intValue=-267386864"},
   ordinal = 0
),
      ordinal = 9,
      require = 1,
      allow = 1,
      remap = false
   )
   private static int mi(int var0) {
      Wr = var0;
      return var0;
   }

   @ModifyVariable(
      method = {"drawHoveringText(Ljava/util/List;IIIIILnet/minecraft/client/gui/FontRenderer;)V"},
      at = @At(
   value = "CONSTANT",
   args = {"intValue=-267386864"},
   ordinal = 0
),
      ordinal = 7,
      require = 1,
      allow = 1,
      remap = false
   )
   private static int kt(int var0) {
      Wo = var0;
      return var0;
   }

   @ModifyVariable(
      method = {"drawHoveringText(Ljava/util/List;IIIIILnet/minecraft/client/gui/FontRenderer;)V"},
      at = @At(
   value = "CONSTANT",
   args = {"intValue=-267386864"},
   ordinal = 0
),
      ordinal = 8,
      require = 1,
      allow = 1,
      remap = false
   )
   private static int sx(int var0) {
      Wp = var0;
      return var0;
   }

   @Inject(
      method = {"drawHoveringText(Ljava/util/List;IIIIILnet/minecraft/client/gui/FontRenderer;)V"},
      at = {@At(
   value = "CONSTANT",
   args = {"intValue=-267386864"},
   ordinal = 0,
   shift = Shift.AFTER,
   by = 2
)},
      require = 1,
      allow = 1,
      remap = false
   )
   private static void lh(List var0, int var1, int var2, int var3, int var4, int var5, FontRenderer var6, CallbackInfo var7) {
      ((FeatherSourceFile598)FeatherSourceFile598.qw.sx()).render((Void)null, FeatherSourceFile$lh2.le, Wo, Wp, Wq, Wr);
   }

   @Inject(
      method = {"drawHoveringText(Ljava/util/List;IIIIILnet/minecraft/client/gui/FontRenderer;)V"},
      slice = {@Slice(
   from = @At(
   value = "CONSTANT",
   args = {"intValue=1344798847"},
   ordinal = 0
)
)},
      at = {@At(
   value = "CONSTANT",
   args = {"intValue=0"},
   ordinal = 0,
   shift = Shift.BEFORE,
   by = 2
)},
      require = 1,
      allow = 1,
      remap = false
   )
   private static void nc(List var0, int var1, int var2, int var3, int var4, int var5, FontRenderer var6, CallbackInfo var7) {
      ((FeatherSourceFile598)FeatherSourceFile598.bf.sx()).render((Void)null, FeatherSourceFile$lh2.le, Wo, Wp, Wq, Wr);
   }

   @Inject(
      method = {"drawHoveringText(Ljava/util/List;IIIIILnet/minecraft/client/gui/FontRenderer;)V"},
      at = {@At("TAIL")},
      remap = false
   )
   private static void xj(List var0, int var1, int var2, int var3, int var4, int var5, FontRenderer var6, CallbackInfo var7) {
      if (!var0.isEmpty()) {
         ((FeatherSourceFile598)FeatherSourceFile598.je.sx()).render((Void)null, FeatherSourceFile$lh2.le, Wo, Wp, Wq, Wr);
      }

   }
}
