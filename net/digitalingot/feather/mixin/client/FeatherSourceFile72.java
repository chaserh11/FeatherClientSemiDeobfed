package net.digitalingot.feather.mixin.client;

import net.digitalingot.feather.FeatherSourceFile388;
import net.digitalingot.feather.FeatherSourceFile465;
import net.digitalingot.feather.FeatherSourceFile665;
import net.minecraft.client.multiplayer.WorldClient;
import net.minecraft.world.GameRules;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyVariable;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin({WorldClient.class})
public class FeatherSourceFile72 {
   @Unique
   private static final FeatherSourceFile465 WP = FeatherSourceFile665.nc(FeatherSourceFile388.class);

   @Redirect(
      method = {"tick"},
      at = @At(
   value = "INVOKE",
   target = "Lnet/minecraft/world/GameRules;getBoolean(Ljava/lang/String;)Z"
),
      require = 1,
      allow = 1
   )
   private boolean lh(GameRules var1, String var2) {
      FeatherSourceFile388 var3 = (FeatherSourceFile388)WP.ag();
      return var3 != null && var3.uj() || var1.func_82766_b(var2);
   }

   @ModifyVariable(
      method = {"setWorldTime"},
      at = @At("HEAD"),
      argsOnly = true,
      ordinal = 0,
      require = 1,
      allow = 1
   )
   private long si(long var1) {
      FeatherSourceFile388 var3 = (FeatherSourceFile388)WP.ag();
      return var3 != null && var3.uj() ? var3.eH() : var1;
   }
}
