package net.digitalingot.feather;

enum FeatherSourceFile$xj9 {
   THIRD(20.0F, 20.0F, 1.0F),
   HALF(30.5F, 20.0F, 1.0F),
   FULL(62.0F, 20.0F, 0.0F);

   private final float width;
   private final float height;
   private final float margin;

   private FeatherSourceFile$xj9(float var3, float var4, float var5) {
      this.width = var3;
      this.height = var4;
      this.margin = var5;
   }

   // $FF: synthetic method
   private static FeatherSourceFile$xj9[] $values() {
      return new FeatherSourceFile$xj9[]{THIRD, HALF, FULL};
   }

   // $FF: synthetic method
   static float access$3100(FeatherSourceFile$xj9 var0) {
      return var0.height;
   }

   // $FF: synthetic method
   static float access$3200(FeatherSourceFile$xj9 var0) {
      return var0.width;
   }

   // $FF: synthetic method
   static float access$3300(FeatherSourceFile$xj9 var0) {
      return var0.margin;
   }
}
