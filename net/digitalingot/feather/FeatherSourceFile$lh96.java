package net.digitalingot.feather;

enum FeatherSourceFile$lh96 {
   MOVE,
   SCALE,
   RESIZE,
   DISABLE,
   OPEN_SETTINGS;

   private static FeatherSourceFile$lh96 fromInteractionPoint(FeatherSourceFile$nc39 var0) {
      switch (var0) {
         case BOTTOM_RIGHT:
         case TOP_LEFT:
         case TOP_RIGHT:
         case BOTTOM_LEFT:
            return SCALE;
         case LEFT:
         case RIGHT:
         case TOP:
         case BOTTOM:
            return RESIZE;
         case BODY:
            return MOVE;
         case INNER_BOTTOM_LEFT:
            return OPEN_SETTINGS;
         case INNER_BOTTOM_RIGHT:
            return DISABLE;
         default:
            throw new AssertionError();
      }
   }

   // $FF: synthetic method
   static FeatherSourceFile$lh96 access$400(FeatherSourceFile$nc39 var0) {
      return fromInteractionPoint(var0);
   }

   // $FF: synthetic method
   private static FeatherSourceFile$lh96[] $values() {
      return new FeatherSourceFile$lh96[]{MOVE, SCALE, RESIZE, DISABLE, OPEN_SETTINGS};
   }
}
