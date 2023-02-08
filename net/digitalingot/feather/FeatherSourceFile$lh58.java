package net.digitalingot.feather;

enum FeatherSourceFile$lh58 {
   INSIDE,
   POSITIVE,
   NEGATIVE;

   public static FeatherSourceFile$lh58 from(int var0, int var1, int var2) {
      if (var1 > var2 && var0 > var2) {
         return POSITIVE;
      } else {
         return var0 < var2 && var1 < var2 ? NEGATIVE : INSIDE;
      }
   }

   // $FF: synthetic method
   private static FeatherSourceFile$lh58[] $values() {
      return new FeatherSourceFile$lh58[]{INSIDE, POSITIVE, NEGATIVE};
   }
}
