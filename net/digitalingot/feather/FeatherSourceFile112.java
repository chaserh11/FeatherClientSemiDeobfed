package net.digitalingot.feather;

import com.google.gson.annotations.SerializedName;
import org.jetbrains.annotations.NotNull;

public enum FeatherSourceFile112 {
   SINGLEPLAYER("menu.singleplayer", "singleplayer", true),
   MULTIPLAYER("menu.multiplayer", "multiplayer", true),
   COSMETICS("Cosmetics", "cosmetics"),
   QUIT_GAME("Quit Game", "quitGame"),
   OPTIONS("menu.options", "options", true),
   FEATHER_SETTINGS("Feather Settings", "featherSettings"),
   DISCONNECT("menu.disconnect", "disconnect", true, true),
   SAVE_AND_QUIT("menu.returnToMenu", "saveAndQuitToTitle", true, true),
   BACK_TO_GAME("menu.returnToGame", "backToGame", true, true),
   OPEN_TO_LAN("Open to Lan", "openToLan"),
   GIVE_FEEDBACK("Give Feedback", "giveFeedback"),
   REPORT_BUGS("Report Bugs", "reportBugs");

   @SerializedName("name")
   @NotNull
   private final @NotNull String name;
   @SerializedName("slug")
   @NotNull
   private final @NotNull String slug;
   private final transient boolean textBridge;
   private final transient boolean cache;
   private transient String cacheValue;

   private FeatherSourceFile112(@NotNull String var3, @NotNull String var4) {
      this.name = var3;
      this.slug = var4;
      this.textBridge = false;
      this.cache = false;
   }

   private FeatherSourceFile112(@NotNull String var3, @NotNull String var4, boolean var5) {
      this.name = var3;
      this.slug = var4;
      this.textBridge = var5;
      this.cache = false;
   }

   private FeatherSourceFile112(@NotNull String var3, @NotNull String var4, boolean var5, boolean var6) {
      this.name = var3;
      this.slug = var4;
      this.textBridge = var5;
      this.cache = var6;
   }

   @NotNull
   public @NotNull String getName() {
      if (!this.textBridge) {
         return this.name;
      } else {
         String var1 = FeatherSourceFile37.nc(this.name);
         var1 = FeatherSourceFile341.px(var1);
         var1 = var1.replaceAll("\\.{3}", "");
         var1 = var1.replaceAll("\\p{C}", "").trim();
         if (!this.cache) {
            return var1.length() == 0 ? "???" : var1;
         } else if (var1.length() != 0) {
            this.cacheValue = var1;
            return var1;
         } else {
            return this.cacheValue != null && this.cacheValue.length() != 0 ? this.cacheValue : "???";
         }
      }
   }

   @NotNull
   public @NotNull String getSlug() {
      return this.slug;
   }

   // $FF: synthetic method
   private static FeatherSourceFile112[] $values() {
      return new FeatherSourceFile112[]{SINGLEPLAYER, MULTIPLAYER, COSMETICS, QUIT_GAME, OPTIONS, FEATHER_SETTINGS, DISCONNECT, SAVE_AND_QUIT, BACK_TO_GAME, OPEN_TO_LAN, GIVE_FEEDBACK, REPORT_BUGS};
   }
}
