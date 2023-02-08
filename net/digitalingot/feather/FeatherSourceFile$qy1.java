package net.digitalingot.feather;

enum FeatherSourceFile$qy1 {
   FORWARD(FeatherSourceFile$xj9.THIRD, "W", "+"),
   LEFT(FeatherSourceFile$xj9.THIRD, "A", "<"),
   BACK(FeatherSourceFile$xj9.THIRD, "S", "-"),
   RIGHT(FeatherSourceFile$xj9.THIRD, "D", ">"),
   JUMP(FeatherSourceFile$xj9.FULL, "JUMP", ""),
   CPS(FeatherSourceFile$xj9.FULL, "", ""),
   ATTACK(FeatherSourceFile$xj9.HALF, "LMB", "<--"),
   USE(FeatherSourceFile$xj9.HALF, "RMB", "-->");

   private final FeatherSourceFile$xj9 bounds;
   private final String name;
   private final int nameWidth;
   private final String arrow;
   private final int arrowWidth;

   private FeatherSourceFile$qy1(FeatherSourceFile$xj9 var3, String var4, String var5) {
      this.bounds = var3;
      this.name = var4;
      this.nameWidth = FeatherSourceFile843.fo(var4);
      this.arrow = var5;
      this.arrowWidth = FeatherSourceFile843.fo(var5);
   }

   private String getText(FeatherSourceFile$ou1 var1) {
      switch (this.getDisplayMode(var1)) {
         case NAMES:
            return this.name;
         case ARROWS:
            return this.arrow;
         default:
            return null;
      }
   }

   private int getTextWidth(FeatherSourceFile$ou1 var1) {
      switch (this.getDisplayMode(var1)) {
         case NAMES:
            return this.nameWidth;
         case ARROWS:
            return this.arrowWidth;
         default:
            return 0;
      }
   }

   private FeatherSourceFile$ou$nc2 getDisplayMode(FeatherSourceFile$ou1 var1) {
      switch (this) {
         case FORWARD:
         case LEFT:
         case BACK:
         case RIGHT:
            return var1.CL;
         case JUMP:
            return var1.CK;
         case ATTACK:
         case USE:
            return var1.CJ;
         default:
            throw new AssertionError();
      }
   }

   // $FF: synthetic method
   private static FeatherSourceFile$qy1[] $values() {
      return new FeatherSourceFile$qy1[]{FORWARD, LEFT, BACK, RIGHT, JUMP, CPS, ATTACK, USE};
   }

   // $FF: synthetic method
   static String access$2900(FeatherSourceFile$qy1 var0, FeatherSourceFile$ou1 var1) {
      return var0.getText(var1);
   }

   // $FF: synthetic method
   static FeatherSourceFile$xj9 access$3000(FeatherSourceFile$qy1 var0) {
      return var0.bounds;
   }

   // $FF: synthetic method
   static int access$3400(FeatherSourceFile$qy1 var0, FeatherSourceFile$ou1 var1) {
      return var0.getTextWidth(var1);
   }
}
