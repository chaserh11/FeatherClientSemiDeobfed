package net.digitalingot.feather;

import net.minecraft.util.EnumFacing;

public enum FeatherSourceFile315 {
   UP(EnumFacing.UP, 0, -1),
   DOWN(EnumFacing.DOWN, 0, 1),
   LEFT(EnumFacing.EAST, -1, 0),
   RIGHT(EnumFacing.WEST, 1, 0);

   public static final FeatherSourceFile315[] VALUES = values();
   private final EnumFacing direction;
   private final int xOffset;
   private final int yOffset;

   private FeatherSourceFile315(EnumFacing var3, int var4, int var5) {
      this.direction = var3;
      this.xOffset = var4;
      this.yOffset = var5;
   }

   public EnumFacing getDirection() {
      return this.direction;
   }

   public int getXOffset() {
      return this.xOffset;
   }

   public int getYOffset() {
      return this.yOffset;
   }

   boolean isHorizontal() {
      return this == DOWN || this == UP;
   }

   // $FF: synthetic method
   private static FeatherSourceFile315[] $values() {
      return new FeatherSourceFile315[]{UP, DOWN, LEFT, RIGHT};
   }
}
