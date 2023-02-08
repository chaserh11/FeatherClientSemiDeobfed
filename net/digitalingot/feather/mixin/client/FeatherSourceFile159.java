package net.digitalingot.feather.mixin.client;

import net.digitalingot.feather.FeatherSourceFile186;
import net.digitalingot.feather.FeatherSourceFile465;
import net.digitalingot.feather.FeatherSourceFile665;
import net.minecraft.client.multiplayer.WorldClient;
import net.minecraft.client.renderer.RenderGlobal;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin({RenderGlobal.class})
public class FeatherSourceFile159 {
   @Unique
   private static final FeatherSourceFile465 WR = FeatherSourceFile665.nc(FeatherSourceFile186.class);

   @Redirect(
      method = {"renderSky(FI)V"},
      at = @At(
   value = "INVOKE",
   target = "Lnet/minecraft/client/multiplayer/WorldClient;getRainStrength(F)F"
)
   )
   private float xj(WorldClient var1, float var2) {
      FeatherSourceFile186 var3 = (FeatherSourceFile186)WR.ag();
      if (var3.uj() && !var3.tf()) {
         return var3.cs() ? 1.0F : 0.0F;
      } else {
         return var1.func_72867_j(var2);
      }
   }
}
