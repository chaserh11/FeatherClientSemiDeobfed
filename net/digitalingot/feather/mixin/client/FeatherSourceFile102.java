package net.digitalingot.feather.mixin.client;

import net.digitalingot.feather.FeatherSourceFile$lh12;
import net.digitalingot.feather.FeatherSourceFile465;
import net.digitalingot.feather.FeatherSourceFile515;
import net.digitalingot.feather.FeatherSourceFile665;
import net.minecraft.client.renderer.entity.RendererLivingEntity;
import net.minecraft.client.renderer.entity.layers.LayerArmorBase;
import net.minecraft.client.renderer.entity.layers.LayerBipedArmor;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;

@Mixin({LayerBipedArmor.class})
public abstract class FeatherSourceFile102 extends LayerArmorBase {
   @Unique
   private static final FeatherSourceFile465 Ws = FeatherSourceFile665.nc(FeatherSourceFile515.class);

   public FeatherSourceFile102(RendererLivingEntity var1) {
      super(var1);
   }

   public boolean func_177142_b() {
      FeatherSourceFile515 var1 = (FeatherSourceFile515)Ws.ag();
      return var1.uj() && ((FeatherSourceFile$lh12)var1.pr()).jX;
   }
}
