package net.digitalingot.feather.mixin.core;

import net.minecraft.client.renderer.EntityRenderer;
import net.minecraft.client.shader.ShaderGroup;
import net.minecraft.util.ResourceLocation;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;
import org.spongepowered.asm.mixin.gen.Invoker;

@Mixin({EntityRenderer.class})
public interface FeatherSourceFile10 {
   @Invoker("loadShader")
   void feather$loadShader(ResourceLocation var1);

   @Accessor("theShaderGroup")
   ShaderGroup feather$getEffect();
}
