package net.digitalingot.feather.mixin.client;

import net.digitalingot.feather.FeatherSourceFile381;
import net.minecraft.client.gui.FontRenderer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Pseudo;
import org.spongepowered.asm.mixin.Shadow;

@Pseudo
@Mixin({FontRenderer.class})
public abstract class FeatherSourceFile22 implements FeatherSourceFile381 {
   @Shadow(
      remap = false
   )
   private float[] charWidthFloat;
   @Shadow(
      remap = false
   )
   private float offsetBold;

   @Shadow(
      remap = false
   )
   abstract float getCharWidthFloat(char var1);

   public int[] charWidth() {
      return null;
   }

   public float[] charWidthFloat() {
      return this.charWidthFloat;
   }

   public int invokeCharWidth(char var1) {
      return 0;
   }

   public float invokeCharWidthFloat(char var1) {
      return this.getCharWidthFloat(var1);
   }

   public float getOffsetBold() {
      return this.offsetBold;
   }
}
