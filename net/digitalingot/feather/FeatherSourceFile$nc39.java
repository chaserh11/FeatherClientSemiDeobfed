package net.digitalingot.feather;

enum FeatherSourceFile$nc39 {
   LEFT,
   RIGHT,
   TOP,
   BOTTOM,
   TOP_LEFT,
   TOP_RIGHT,
   BOTTOM_LEFT,
   BOTTOM_RIGHT,
   INNER_BOTTOM_LEFT,
   INNER_BOTTOM_RIGHT,
   BODY,
   NONE;

   private FeatherSourceFile$oe6 getRect(FeatherSourceFile$oe6 var1) {
      int var2;
      switch (this) {
         case BOTTOM_RIGHT:
            return new FeatherSourceFile$oe6(var1.wa() - 3, var1.my() - 3, 6, 6);
         case TOP_LEFT:
            return new FeatherSourceFile$oe6(var1.kj - 3, var1.yu - 3, 6, 6);
         case TOP_RIGHT:
            return new FeatherSourceFile$oe6(var1.wa() - 3, var1.yu - 3, 6, 6);
         case BOTTOM_LEFT:
            return new FeatherSourceFile$oe6(var1.kj - 3, var1.my() - 3, 6, 6);
         case LEFT:
            return new FeatherSourceFile$oe6(var1.kj - 1, var1.yu + 3, 3, var1.pp - 6);
         case RIGHT:
            return new FeatherSourceFile$oe6(var1.wa() - 1, var1.yu + 3, 3, var1.pp - 6);
         case TOP:
            return new FeatherSourceFile$oe6(var1.kj + 3, var1.yu - 1, var1.zb - 6, 3);
         case BOTTOM:
            return new FeatherSourceFile$oe6(var1.kj + 3, var1.my() - 1, var1.zb - 6, 3);
         case BODY:
            return var1;
         case INNER_BOTTOM_LEFT:
            var2 = (int)(24.0 / FeatherSourceFile500.js());
            return new FeatherSourceFile$oe6(var1.kj, var1.my() - var2, var2, var2);
         case INNER_BOTTOM_RIGHT:
            var2 = (int)(24.0 / FeatherSourceFile500.js());
            return new FeatherSourceFile$oe6(var1.wa() - var2, var1.my() - var2, var2, var2);
         case NONE:
            return null;
         default:
            throw new AssertionError();
      }
   }

   public FeatherSourceFile839 toOutlineRenderer() {
      FeatherSourceFile839[] var1 = FeatherSourceFile839.values();
      int var2 = var1.length;

      for(int var3 = 0; var3 < var2; ++var3) {
         FeatherSourceFile839 var4 = var1[var3];
         if (var4.name().equalsIgnoreCase(this.name())) {
            return var4;
         }
      }

      return FeatherSourceFile839.ALL;
   }

   private static FeatherSourceFile$nc39 fromElement(FeatherSourceFile413 var0, int var1, int var2) {
      int var3 = (int)var0.zm();
      int var4 = (int)var0.nt();
      int var5 = (int)var0.rq();
      int var6 = (int)var0.jf();
      FeatherSourceFile$oe6 var7 = new FeatherSourceFile$oe6(var3, var5, var4, var6);
      FeatherSourceFile$nc39[] var8 = values();
      int var9 = var8.length;

      for(int var10 = 0; var10 < var9; ++var10) {
         FeatherSourceFile$nc39 var11 = var8[var10];
         FeatherSourceFile$oe6 var12 = var11.getRect(var7);
         if (var12 != null && var12.ux(var1, var2)) {
            return var11;
         }
      }

      return null;
   }

   // $FF: synthetic method
   static FeatherSourceFile$nc39 access$100(FeatherSourceFile413 var0, int var1, int var2) {
      return fromElement(var0, var1, var2);
   }

   // $FF: synthetic method
   private static FeatherSourceFile$nc39[] $values() {
      return new FeatherSourceFile$nc39[]{LEFT, RIGHT, TOP, BOTTOM, TOP_LEFT, TOP_RIGHT, BOTTOM_LEFT, BOTTOM_RIGHT, INNER_BOTTOM_LEFT, INNER_BOTTOM_RIGHT, BODY, NONE};
   }
}
