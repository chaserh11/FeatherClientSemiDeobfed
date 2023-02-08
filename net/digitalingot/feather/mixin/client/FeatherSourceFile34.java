package net.digitalingot.feather.mixin.client;

import net.minecraft.client.renderer.chunk.RenderChunk;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(
   targets = {"net.minecraft.client.renderer.RenderGlobal$ContainerLocalRenderInformation"}
)
public interface FeatherSourceFile34 {
   @Accessor("renderChunk")
   @Final
   RenderChunk feather$getRenderChunk();
}
