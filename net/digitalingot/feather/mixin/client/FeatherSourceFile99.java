package net.digitalingot.feather.mixin.client;

import net.digitalingot.feather.FeatherSourceFile381;
import net.minecraft.client.gui.FontRenderer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;

@Mixin({FontRenderer.class})
public abstract class FeatherSourceFile99 implements FeatherSourceFile381 {
   @Shadow
   protected int[] field_78286_d;

   @Shadow
   public abstract int func_78263_a(char var1);

   public int[] charWidth() {
      return this.field_78286_d;
   }

   public float[] charWidthFloat() {
      return null;
   }

   public int invokeCharWidth(char var1) {
      return this.func_78263_a(var1);
   }

   public float invokeCharWidthFloat(char var1) {
      return 0.0F;
   }

   public float getOffsetBold() {
      return 1.0F;
   }
}
