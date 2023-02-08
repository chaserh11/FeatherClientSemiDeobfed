package net.digitalingot.feather;

public enum FeatherSourceFile796 {
   @FeatherSourceFile558(
      lb = "ultra",
      jc = "feather.gui.browser.Quality.ultra"
   )
   ULTRA(1.0F),
   @FeatherSourceFile558(
      lb = "high",
      jc = "feather.gui.browser.Quality.high"
   )
   HIGH(0.85F),
   @FeatherSourceFile558(
      lb = "medium",
      jc = "feather.gui.browser.Quality.medium"
   )
   MEDIUM(0.75F),
   @FeatherSourceFile558(
      lb = "low",
      jc = "feather.gui.browser.Quality.low"
   )
   LOW(0.6F);

   private final float scale;

   private FeatherSourceFile796(float var3) {
      this.scale = var3;
   }

   public float getScale() {
      return this.scale;
   }

   // $FF: synthetic method
   private static FeatherSourceFile796[] $values() {
      return new FeatherSourceFile796[]{ULTRA, HIGH, MEDIUM, LOW};
   }
}
