package net.digitalingot.feather;

enum FeatherSourceFile$lh$lh6 {
   @FeatherSourceFile558(
      lb = "mountains",
      jc = "feather.modules.core.Core.PreviewBackground.mountains"
   )
   MOUNTAINS("https://assets.feathercdn.net/game/modpreview/background1.webp"),
   @FeatherSourceFile558(
      lb = "ocean",
      jc = "feather.modules.core.Core.PreviewBackground.ocean"
   )
   OCEAN("https://assets.feathercdn.net/game/modpreview/background2.webp"),
   @FeatherSourceFile558(
      lb = "skyblock",
      jc = "feather.modules.core.Core.PreviewBackground.skyblock"
   )
   SKYBLOCK("https://assets.feathercdn.net/game/modpreview/background3.webp"),
   @FeatherSourceFile558(
      lb = "stone",
      jc = "feather.modules.core.Core.PreviewBackground.stone"
   )
   STONE("https://assets.feathercdn.net/game/modpreview/stone.webp");

   private final String url;

   private FeatherSourceFile$lh$lh6(String var3) {
      this.url = var3;
   }

   public String getURL() {
      return this.url;
   }

   // $FF: synthetic method
   private static FeatherSourceFile$lh$lh6[] $values() {
      return new FeatherSourceFile$lh$lh6[]{MOUNTAINS, OCEAN, SKYBLOCK, STONE};
   }
}
