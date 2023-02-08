package net.digitalingot.feather.mixin.client;

import java.util.Set;
import net.minecraft.client.multiplayer.WorldClient;
import net.minecraft.entity.Entity;
import net.minecraft.profiler.Profiler;
import net.minecraft.world.World;
import net.minecraft.world.WorldProvider;
import net.minecraft.world.storage.ISaveHandler;
import net.minecraft.world.storage.WorldInfo;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({WorldClient.class})
public abstract class FeatherSourceFile40 extends World {
   @Shadow
   @Final
   private Set field_73032_d;

   protected FeatherSourceFile40(ISaveHandler var1, WorldInfo var2, WorldProvider var3, Profiler var4, boolean var5) {
      super(var1, var2, var3, var4, var5);
   }

   @Inject(
      method = {"addEntityToWorld"},
      at = {@At("HEAD")}
   )
   public void lh(int var1, Entity var2, CallbackInfo var3) {
      ((net.digitalingot.feather.FeatherSourceFile34)net.digitalingot.feather.FeatherSourceFile34.zw.sx()).track(var2);
   }

   @Redirect(
      method = {"removeEntityFromWorld"},
      at = @At(
   value = "INVOKE",
   target = "Ljava/util/Set;remove(Ljava/lang/Object;)Z",
   remap = false
)
   )
   public boolean lh(Set var1, Object var2) {
      Entity var3 = (Entity)var2;
      ((net.digitalingot.feather.FeatherSourceFile34)net.digitalingot.feather.FeatherSourceFile34.yv.sx()).track(var3);
      return this.field_73032_d.remove(var3);
   }
}
