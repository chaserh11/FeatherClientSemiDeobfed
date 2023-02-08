package net.digitalingot.feather;

import com.google.gson.annotations.SerializedName;
import org.jetbrains.annotations.NotNull;

public enum FeatherSourceFile259 {
   MC_SETTINGS("MC Settings", "mcSettings", "https://assets.feathercdn.net/game/homepageicons/settings.svg"),
   REALMS("Minecraft Realms", "mcRealms", "https://assets.feathercdn.net/game/homepageicons/realms.svg"),
   REPLAY_MOD("Replay Mod", "replayMod", "https://assets.feathercdn.net/game/homepageicons/replaymod.svg"),
   MOD_MENU("Mod Menu", "modMenu", "https://assets.feathercdn.net/game/homepageicons/modmenu.svg"),
   ORIGINAL_MENU("Original Main Menu", "originalMenu", "https://assets.feathercdn.net/game/homepageicons/home.svg"),
   ORIGINAL_PAUSE_SCREEN("Original Pause Screen", "originalPauseScreen", "https://assets.feathercdn.net/game/homepageicons/toggleon.svg"),
   SERVER_LIST("Server List", "serverList", "https://assets.feathercdn.net/game/homepageicons/serverlist.svg"),
   FEAHTER_SETTINGS("Feather Settings", "featherSettings", "https://assets.feathercdn.net/game/homepageicons/feather.svg"),
   SOCIAL("Social", "social", "https://assets.feathercdn.net/game/homepageicons/chat.svg");

   @SerializedName("name")
   @NotNull
   private final @NotNull String name;
   @SerializedName("slug")
   @NotNull
   private final @NotNull String slug;
   @SerializedName("icon")
   @NotNull
   private final @NotNull String icon;

   private FeatherSourceFile259(@NotNull @NotNull String var3, @NotNull String var4, @NotNull String var5) {
      this.name = var3;
      this.slug = var4;
      this.icon = var5;
   }

   @NotNull
   public @NotNull String getName() {
      return this.name;
   }

   @NotNull
   public @NotNull String getSlug() {
      return this.slug;
   }

   @NotNull
   public @NotNull String getIcon() {
      return this.icon;
   }

   // $FF: synthetic method
   private static FeatherSourceFile259[] $values() {
      return new FeatherSourceFile259[]{MC_SETTINGS, REALMS, REPLAY_MOD, MOD_MENU, ORIGINAL_MENU, ORIGINAL_PAUSE_SCREEN, SERVER_LIST, FEAHTER_SETTINGS, SOCIAL};
   }
}
