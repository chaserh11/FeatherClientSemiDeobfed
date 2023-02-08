package net.digitalingot.feather;

public enum FeatherSourceFile$ou2 {
   TOP_LEFT(-1),
   TOP_RIGHT(1),
   BOTTOM_LEFT(-1),
   BOTTOM_RIGHT(1),
   CENTER(0);

   private final int multiplier;

   private FeatherSourceFile$ou2(int var3) {
      this.multiplier = var3;
   }

   private static FeatherSourceFile$ou2 fromInteractionPoint(FeatherSourceFile$nc39 var0) {
      switch (var0) {
         case BOTTOM_RIGHT:
            return BOTTOM_RIGHT;
         case TOP_LEFT:
            return TOP_LEFT;
         case TOP_RIGHT:
            return TOP_RIGHT;
         case BOTTOM_LEFT:
            return BOTTOM_LEFT;
         default:
            return null;
      }
   }

   // $FF: synthetic method
   static int access$300(FeatherSourceFile$ou2 var0) {
      return var0.multiplier;
   }

   // $FF: synthetic method
   static FeatherSourceFile$ou2 access$500(FeatherSourceFile$nc39 var0) {
      return fromInteractionPoint(var0);
   }

   // $FF: synthetic method
   private static FeatherSourceFile$ou2[] $values() {
      return new FeatherSourceFile$ou2[]{TOP_LEFT, TOP_RIGHT, BOTTOM_LEFT, BOTTOM_RIGHT, CENTER};
   }
}
