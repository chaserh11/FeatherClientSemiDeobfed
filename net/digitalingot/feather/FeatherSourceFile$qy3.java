package net.digitalingot.feather;

public enum FeatherSourceFile$qy3 {
   LEFT(-1),
   RIGHT(1),
   TOP(-1),
   BOTTOM(1);

   private final int multiplier;

   private FeatherSourceFile$qy3(int var3) {
      this.multiplier = var3;
   }

   public FeatherSourceFile637 toAnchorPoint() {
      switch (this) {
         case LEFT:
         case TOP:
            return FeatherSourceFile637.TOP_LEFT;
         case RIGHT:
            return FeatherSourceFile637.TOP_RIGHT;
         case BOTTOM:
            return FeatherSourceFile637.BOTTOM_LEFT;
         default:
            return null;
      }
   }

   private static FeatherSourceFile$qy3 fromInteractionPoint(FeatherSourceFile$nc39 var0) {
      switch (var0) {
         case LEFT:
            return LEFT;
         case RIGHT:
            return RIGHT;
         case TOP:
            return TOP;
         case BOTTOM:
            return BOTTOM;
         default:
            return null;
      }
   }

   // $FF: synthetic method
   static int access$200(FeatherSourceFile$qy3 var0) {
      return var0.multiplier;
   }

   // $FF: synthetic method
   static FeatherSourceFile$qy3 access$600(FeatherSourceFile$nc39 var0) {
      return fromInteractionPoint(var0);
   }

   // $FF: synthetic method
   private static FeatherSourceFile$qy3[] $values() {
      return new FeatherSourceFile$qy3[]{LEFT, RIGHT, TOP, BOTTOM};
   }
}
