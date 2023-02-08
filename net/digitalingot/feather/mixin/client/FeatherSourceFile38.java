package net.digitalingot.feather.mixin.client;

import java.util.Collection;
import java.util.Collections;
import net.digitalingot.feather.FeatherSourceFile$qy4;
import net.digitalingot.feather.FeatherSourceFile444;
import net.digitalingot.feather.FeatherSourceFile465;
import net.digitalingot.feather.FeatherSourceFile665;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.renderer.InventoryEffectRenderer;
import net.minecraft.inventory.Container;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin({InventoryEffectRenderer.class})
public abstract class FeatherSourceFile38 extends GuiContainer {
   @Unique
   private static final FeatherSourceFile465 WN = FeatherSourceFile665.nc(FeatherSourceFile444.class);

   public FeatherSourceFile38(Container var1) {
      super(var1);
   }

   @Redirect(
      method = {"updateActivePotionEffects"},
      at = @At(
   value = "INVOKE",
   target = "Lnet/minecraft/client/entity/EntityPlayerSP;getActivePotionEffects()Ljava/util/Collection;",
   opcode = 182
),
      require = 2,
      allow = 2
   )
   private Collection xj(EntityPlayerSP var1) {
      FeatherSourceFile444 var2 = (FeatherSourceFile444)WN.ag();
      return (Collection)(var2 != null && var2.uj() && ((FeatherSourceFile$qy4)var2.pr()).DZ ? Collections.emptySet() : var1.func_70651_bq());
   }
}
