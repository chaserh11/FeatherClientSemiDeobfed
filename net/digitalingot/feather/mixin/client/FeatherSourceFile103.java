package net.digitalingot.feather.mixin.client;

import net.digitalingot.feather.FeatherSourceFile317;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.entity.Entity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;

@Mixin({Render.class})
public abstract class FeatherSourceFile103 implements FeatherSourceFile317 {
   @Shadow
   protected abstract void func_177067_a(Entity var1, double var2, double var4, double var6);

   public void feather$renderName(Entity var1, double var2, double var4, double var6) {
      this.func_177067_a(var1, var2, var4, var6);
   }
}
