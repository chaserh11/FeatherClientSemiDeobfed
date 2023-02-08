package net.digitalingot.feather;

import net.minecraft.util.ResourceLocation;

public enum FeatherSourceFile$xj18 {
   @FeatherSourceFile558(
      lb = "default",
      jc = "feather.commonterm.default"
   )
   DEFAULT("default.png", 1728, 70, 4.8F),
   @FeatherSourceFile558(
      lb = "simple",
      jc = "feather.modules.direction.Type.simple"
   )
   SIMPLE("simple.png", 1728, 84, 4.8F),
   @FeatherSourceFile558(
      lb = "noTick",
      jc = "feather.modules.direction.Type.noTick"
   )
   NO_TICK("no_tick.png", 1728, 84, 4.8F);

   private static final String BASE_PATH = "textures/direction/";
   public final ResourceLocation texture;
   public final int textureWidth;
   public final int textureHeight;
   public final float pixelsPerDegree;

   private FeatherSourceFile$xj18(String var3, int var4, int var5, float var6) {
      this.texture = new ResourceLocation("feather:textures/direction/" + var3);
      this.textureWidth = var4;
      this.textureHeight = var5;
      this.pixelsPerDegree = var6;
   }

   // $FF: synthetic method
   private static FeatherSourceFile$xj18[] $values() {
      return new FeatherSourceFile$xj18[]{DEFAULT, SIMPLE, NO_TICK};
   }
}
