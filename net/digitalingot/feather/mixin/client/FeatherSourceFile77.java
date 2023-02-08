package net.digitalingot.feather.mixin.client;

import net.digitalingot.feather.FeatherSourceFile186;
import net.digitalingot.feather.FeatherSourceFile465;
import net.digitalingot.feather.FeatherSourceFile665;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin({World.class})
public class FeatherSourceFile77 {
   @Unique
   private static final FeatherSourceFile465 WR = FeatherSourceFile665.nc(FeatherSourceFile186.class);

   @Redirect(
      method = {"getSkyColorBody"},
      at = @At(
   value = "INVOKE",
   target = "Lnet/minecraft/world/World;getRainStrength(F)F"
)
   )
   private float xj(World var1, float var2) {
      FeatherSourceFile186 var3 = (FeatherSourceFile186)WR.ag();
      if (var3.uj() && !var3.tf()) {
         return var3.cs() ? 1.0F : 0.0F;
      } else {
         return var1.func_72867_j(var2);
      }
   }

   @Redirect(
      method = {"getSkyColorBody"},
      at = @At(
   value = "INVOKE",
   target = "Lnet/minecraft/world/World;getThunderStrength(F)F"
)
   )
   private float oe(World var1, float var2) {
      FeatherSourceFile186 var3 = (FeatherSourceFile186)WR.ag();
      if (var3.uj() && !var3.tf()) {
         return var3.wu() ? 1.0F : 0.0F;
      } else {
         return var1.func_72819_i(var2);
      }
   }

   @Redirect(
      method = {"drawCloudsBody"},
      at = @At(
   value = "INVOKE",
   target = "Lnet/minecraft/world/World;getRainStrength(F)F"
)
   )
   private float qy(World var1, float var2) {
      FeatherSourceFile186 var3 = (FeatherSourceFile186)WR.ag();
      if (var3.uj() && !var3.tf()) {
         return var3.cs() ? 1.0F : 0.0F;
      } else {
         return var1.func_72867_j(var2);
      }
   }

   @Redirect(
      method = {"drawCloudsBody"},
      at = @At(
   value = "INVOKE",
   target = "Lnet/minecraft/world/World;getThunderStrength(F)F"
)
   )
   private float ou(World var1, float var2) {
      FeatherSourceFile186 var3 = (FeatherSourceFile186)WR.ag();
      if (var3.uj() && !var3.tf()) {
         return var3.wu() ? 1.0F : 0.0F;
      } else {
         return var1.func_72819_i(var2);
      }
   }
}
