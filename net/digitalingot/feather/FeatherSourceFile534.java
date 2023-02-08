package net.digitalingot.feather;

public enum FeatherSourceFile534 {
   @FeatherSourceFile558(
      lb = "english",
      jc = "English"
   )
   ENGLISH("English", "en"),
   @FeatherSourceFile558(
      lb = "mandarin",
      jc = "Mandarin"
   )
   MANDARIN("Mandarin", "zh-CN"),
   @FeatherSourceFile558(
      lb = "hindi",
      jc = "Hindi"
   )
   HINDI("Hindi", "hi"),
   @FeatherSourceFile558(
      lb = "spanish",
      jc = "Spanish"
   )
   SPANISH("Spanish", "es"),
   @FeatherSourceFile558(
      lb = "french",
      jc = "French"
   )
   FRENCH("French", "fr"),
   @FeatherSourceFile558(
      lb = "arabic",
      jc = "Arabic"
   )
   ARABIC("Arabic", "ar"),
   @FeatherSourceFile558(
      lb = "russian",
      jc = "Russian"
   )
   RUSSIAN("Russian", "ru"),
   @FeatherSourceFile558(
      lb = "portuguese",
      jc = "Portuguese"
   )
   PORTUGUESE("Portuguese", "pt-BR"),
   @FeatherSourceFile558(
      lb = "japanese",
      jc = "Japanese"
   )
   JAPANESE("Japanese", "ja"),
   @FeatherSourceFile558(
      lb = "korean",
      jc = "Korean"
   )
   KOREAN("Korean", "ko"),
   @FeatherSourceFile558(
      lb = "german",
      jc = "German"
   )
   GERMAN("German", "de"),
   @FeatherSourceFile558(
      lb = "polish",
      jc = "Polish"
   )
   POLISH("Polish", "pl");

   private final String code;
   private final String displayName;

   private FeatherSourceFile534(String var3, String var4) {
      this.displayName = var3;
      this.code = var4;
   }

   public String getCode() {
      return this.code;
   }

   public String getDisplayName() {
      return this.displayName;
   }

   // $FF: synthetic method
   private static FeatherSourceFile534[] $values() {
      return new FeatherSourceFile534[]{ENGLISH, MANDARIN, HINDI, SPANISH, FRENCH, ARABIC, RUSSIAN, PORTUGUESE, JAPANESE, KOREAN, GERMAN, POLISH};
   }
}
