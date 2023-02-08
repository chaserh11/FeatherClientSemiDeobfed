package net.digitalingot.feather;

public enum FeatherSourceFile10 {
   @FeatherSourceFile558(
      lb = "black",
      jc = "feather.module.config.type.LegacyColorType.black"
   )
   BLACK('0'),
   @FeatherSourceFile558(
      lb = "darkBlue",
      jc = "feather.module.config.type.LegacyColorType.darkBlue"
   )
   DARK_BLUE('1'),
   @FeatherSourceFile558(
      lb = "darkGreen",
      jc = "feather.module.config.type.LegacyColorType.darkGreen"
   )
   DARK_GREEN('2'),
   @FeatherSourceFile558(
      lb = "darkAqua",
      jc = "feather.module.config.type.LegacyColorType.darkAqua"
   )
   DARK_AQUA('3'),
   @FeatherSourceFile558(
      lb = "darkRed",
      jc = "feather.module.config.type.LegacyColorType.darkRed"
   )
   DARK_RED('4'),
   @FeatherSourceFile558(
      lb = "darkPurple",
      jc = "feather.module.config.type.LegacyColorType.darkPurple"
   )
   DARK_PURPLE('5'),
   @FeatherSourceFile558(
      lb = "gold",
      jc = "feather.module.config.type.LegacyColorType.gold"
   )
   GOLD('6'),
   @FeatherSourceFile558(
      lb = "gray",
      jc = "feather.module.config.type.LegacyColorType.gray"
   )
   GRAY('7'),
   @FeatherSourceFile558(
      lb = "darkGray",
      jc = "feather.module.config.type.LegacyColorType.darkGray"
   )
   DARK_GRAY('8'),
   @FeatherSourceFile558(
      lb = "blue",
      jc = "feather.module.config.type.LegacyColorType.blue"
   )
   BLUE('9'),
   @FeatherSourceFile558(
      lb = "green",
      jc = "feather.module.config.type.LegacyColorType.green"
   )
   GREEN('a'),
   @FeatherSourceFile558(
      lb = "aqua",
      jc = "feather.module.config.type.LegacyColorType.aqua"
   )
   AQUA('b'),
   @FeatherSourceFile558(
      lb = "red",
      jc = "feather.module.config.type.LegacyColorType.red"
   )
   RED('c'),
   @FeatherSourceFile558(
      lb = "lightPurple",
      jc = "feather.module.config.type.LegacyColorType.lightPurple"
   )
   LIGHT_PURPLE('d'),
   @FeatherSourceFile558(
      lb = "yellow",
      jc = "feather.module.config.type.LegacyColorType.yellow"
   )
   YELLOW('e'),
   @FeatherSourceFile558(
      lb = "white",
      jc = "feather.module.config.type.LegacyColorType.white"
   )
   WHITE('f');

   public static final String PREFIX_CHAR = "§";
   public final char code;
   public final String toString;

   private FeatherSourceFile10(char var3) {
      this.code = var3;
      this.toString = "§" + var3;
   }

   // $FF: synthetic method
   private static FeatherSourceFile10[] $values() {
      return new FeatherSourceFile10[]{BLACK, DARK_BLUE, DARK_GREEN, DARK_AQUA, DARK_RED, DARK_PURPLE, GOLD, GRAY, DARK_GRAY, BLUE, GREEN, AQUA, RED, LIGHT_PURPLE, YELLOW, WHITE};
   }
}
