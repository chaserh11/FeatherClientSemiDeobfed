package net.digitalingot.feather.mixin.client;

import java.nio.ByteBuffer;
import net.digitalingot.feather.FeatherSourceFile812;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.vertex.VertexBuffer;
import net.minecraft.client.renderer.vertex.VertexFormat;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;

@Mixin({VertexBuffer.class})
public abstract class FeatherSourceFile68 implements FeatherSourceFile812 {
   @Shadow
   private int field_177364_c;
   @Shadow
   @Final
   private VertexFormat field_177363_b;

   public void feather$bufferData(ByteBuffer var1, int var2) {
      OpenGlHelper.func_176071_a(OpenGlHelper.field_176089_P, var1, var2);
      this.field_177364_c = var1.limit() / this.field_177363_b.func_177338_f();
   }
}
