package net.digitalingot.feather;

public enum FeatherSourceFile$lh$nc4 {
   @FeatherSourceFile558(
      lb = "off",
      jc = "Off (Vanilla)"
   )
   OFF,
   @FeatherSourceFile558(
      lb = "low",
      jc = "feather.gui.browser.Quality.low"
   )
   LOW,
   @FeatherSourceFile558(
      lb = "medium",
      jc = "feather.gui.browser.Quality.medium"
   )
   MEDIUM,
   @FeatherSourceFile558(
      lb = "high",
      jc = "feather.gui.browser.Quality.high"
   )
   HIGH;

   public int getValue() {
      switch (this) {
         case LOW:
            return 50;
         case MEDIUM:
            return 250;
         case HIGH:
            return 500;
         default:
            return 0;
      }
   }

   // $FF: synthetic method
   private static FeatherSourceFile$lh$nc4[] $values() {
      return new FeatherSourceFile$lh$nc4[]{OFF, LOW, MEDIUM, HIGH};
   }
}
