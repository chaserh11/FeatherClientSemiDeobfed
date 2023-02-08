package net.digitalingot.feather.mixin.client;

import java.awt.Color;
import net.digitalingot.feather.FeatherSourceFile$lh35;
import net.digitalingot.feather.FeatherSourceFile186;
import net.digitalingot.feather.FeatherSourceFile465;
import net.digitalingot.feather.FeatherSourceFile665;
import net.minecraft.client.multiplayer.WorldClient;
import net.minecraft.client.renderer.EntityRenderer;
import net.minecraft.client.resources.IResourceManagerReloadListener;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyArgs;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.invoke.arg.Args;

@Mixin({EntityRenderer.class})
public abstract class FeatherSourceFile63 implements IResourceManagerReloadListener {
   @Unique
   private static final FeatherSourceFile465 WR = FeatherSourceFile665.nc(FeatherSourceFile186.class);

   @Redirect(
      method = {"renderRainSnow"},
      at = @At(
   value = "INVOKE",
   target = "Lnet/minecraft/client/multiplayer/WorldClient;getRainStrength(F)F"
)
   )
   private float lh(WorldClient var1, float var2) {
      FeatherSourceFile186 var3 = (FeatherSourceFile186)WR.ag();
      if (var3.uj() && !var3.tf()) {
         return var3.cs() ? 1.0F : 0.0F;
      } else {
         return var1.func_72867_j(var2);
      }
   }

   @Redirect(
      method = {"updateFogColor"},
      at = @At(
   value = "INVOKE",
   target = "Lnet/minecraft/world/World;getRainStrength(F)F"
)
   )
   private float lh(World var1, float var2) {
      FeatherSourceFile186 var3 = (FeatherSourceFile186)WR.ag();
      if (var3.uj() && !var3.tf()) {
         return var3.cs() ? 1.0F : 0.0F;
      } else {
         return var1.func_72867_j(var2);
      }
   }

   @Redirect(
      method = {"updateFogColor"},
      at = @At(
   value = "INVOKE",
   target = "Lnet/minecraft/world/World;getThunderStrength(F)F"
)
   )
   private float nc(World var1, float var2) {
      FeatherSourceFile186 var3 = (FeatherSourceFile186)WR.ag();
      if (var3.uj() && !var3.tf()) {
         return var3.wu() ? 1.0F : 0.0F;
      } else {
         return var1.func_72819_i(var2);
      }
   }

   @Redirect(
      method = {"addRainParticles"},
      at = @At(
   value = "INVOKE",
   target = "Lnet/minecraft/client/multiplayer/WorldClient;getRainStrength(F)F"
)
   )
   private float nc(WorldClient var1, float var2) {
      FeatherSourceFile186 var3 = (FeatherSourceFile186)WR.ag();
      if (var3.uj() && !var3.tf()) {
         return var3.cs() ? 1.0F : 0.0F;
      } else {
         return var1.func_72867_j(var2);
      }
   }

   @ModifyArgs(
      method = {"renderRainSnow"},
      at = @At(
   value = "INVOKE",
   target = "Lnet/minecraft/client/renderer/WorldRenderer;color(FFFF)Lnet/minecraft/client/renderer/WorldRenderer;"
),
      require = 8,
      allow = 8
   )
   public void ou(Args var1) {
      FeatherSourceFile186 var2 = (FeatherSourceFile186)WR.ag();
      if (var2.uj()) {
         Color var3 = ((FeatherSourceFile$lh35)var2.pr()).qM;
         var1.set(0, (float)var3.getRed() / 255.0F);
         var1.set(1, (float)var3.getGreen() / 255.0F);
         var1.set(2, (float)var3.getBlue() / 255.0F);
      }

   }
}
