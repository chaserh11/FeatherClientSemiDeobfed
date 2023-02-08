package net.digitalingot.feather.mixin.client;

import net.digitalingot.feather.FeatherSourceFile$lh12;
import net.digitalingot.feather.FeatherSourceFile465;
import net.digitalingot.feather.FeatherSourceFile515;
import net.digitalingot.feather.FeatherSourceFile665;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBiped;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;

@Mixin({ModelBiped.class})
public abstract class FeatherSourceFile101 extends ModelBase {
   @Unique
   private static final FeatherSourceFile465 Ws = FeatherSourceFile665.nc(FeatherSourceFile515.class);

   @ModifyConstant(
      method = {"setRotationAngles(FFFFFFLnet/minecraft/entity/Entity;)V"},
      constant = {@Constant(
   floatValue = -0.5235988F
)},
      require = 1,
      allow = 1
   )
   private float un(float var1) {
      FeatherSourceFile515 var2 = (FeatherSourceFile515)Ws.ag();
      return var2.uj() && ((FeatherSourceFile$lh12)var2.pr()).jY ? 0.0F : var1;
   }
}
