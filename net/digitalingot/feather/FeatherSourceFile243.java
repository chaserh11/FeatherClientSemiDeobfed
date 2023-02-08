package net.digitalingot.feather;

import com.google.gson.annotations.SerializedName;
import java.lang.reflect.Field;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public enum FeatherSourceFile243 {
   @SerializedName("core")
   CORE(true, true),
   @SerializedName("chatOptions")
   CHAT_OPTIONS(true, true),
   @SerializedName("social")
   SOCIAL(true, true),
   @SerializedName("graphicsOptions")
   GRAPHICS_OPTIONS(true, true),
   @SerializedName("performanceOptions")
   PERFORMANCE_OPTIONS(true, true),
   @SerializedName("cosmeticOptions")
   COSMETIC_OPTIONS(true, true),
   @SerializedName("customChat")
   CUSTOM_CHAT(false, false),
   @SerializedName("autoText")
   AUTO_TEXT(false, false),
   @SerializedName("crosshair")
   CROSSHAIR(false, false),
   @SerializedName("cps")
   CPS(false, false),
   @SerializedName("armorStatus")
   ARMOR_STATUS(false, false),
   @SerializedName("bossBar")
   BOSS_BAR(false, false),
   @SerializedName("comboDisplay")
   COMBO_DISPLAY(false, false),
   @SerializedName("coordinates")
   COORDINATES(false, false),
   @SerializedName("direction")
   DIRECTION(false, false),
   @SerializedName("fps")
   FPS(false, false),
   @SerializedName("itemCounter")
   ITEM_COUNTER(false, false),
   @SerializedName("itemInfo")
   ITEM_INFO(false, false),
   @SerializedName("keystrokes")
   KEYSTROKES(false, false),
   @SerializedName("packdisplay")
   PACK_DISPLAY(false, false),
   @SerializedName("ping")
   PING(false, false),
   @SerializedName("potionEffects")
   POTION_EFFECTS(false, false),
   @SerializedName("reachDisplay")
   REACH_DISPLAY(false, false),
   @SerializedName("speedMeter")
   SPEED_METER(false, false),
   @SerializedName("scoreboard")
   SCOREBOARD(false, false),
   @SerializedName("time")
   TIME(false, false),
   @SerializedName("toggleSprint")
   TOGGLE_SPRINT(false, false),
   @SerializedName("serverAddress")
   SERVER_ADDRESS(false, false),
   @SerializedName("mousestrokes")
   MOUSE_STROKES(false, false),
   @SerializedName("hypixel")
   HYPIXEL(false, false),
   @SerializedName("motionBlur")
   MOTION_BLUR(false, false),
   @SerializedName("saturation")
   SATURATION(false, false),
   @SerializedName("waypoints")
   WAYPOINTS(false, false),
   @SerializedName("animations")
   ANIMATIONS(false, false),
   @SerializedName("damageIndicator")
   DAMAGE_INDICATOR(false, false),
   @SerializedName("discordRP")
   DISCORD(false, false),
   @SerializedName("blockOverlay")
   BLOCK_OVERLAY(false, false),
   @SerializedName("clearWater")
   CLEAR_WATER(false, false),
   @SerializedName("fovChanger")
   FOV_CHANGER(false, false),
   @SerializedName("glint")
   GLINT(false, false),
   @SerializedName("hitbox")
   HITBOX(false, false),
   @SerializedName("itemPhysic")
   ITEM_PHYSIC(false, false),
   @SerializedName("oofMod")
   OOF_MOD(false, false),
   @SerializedName("particles")
   PARTICLES(false, false),
   @SerializedName("perspective")
   PERSPECTIVE(false, false),
   @SerializedName("snaplook")
   SNAPLOOK(false, false),
   @SerializedName("voice")
   VOICE(false, false),
   @SerializedName("timeChanger")
   TIME_CHANGER(false, false),
   @SerializedName("tnttimer")
   TNT_TIMER(false, false),
   @SerializedName("toastcontrol")
   TOAST_CONTROL(false, false),
   @SerializedName("nickHider")
   NICK_HIDER(false, false),
   @SerializedName("screenshot")
   SCREENSHOT(false, false),
   @SerializedName("stopwatch1")
   STOPWATCH(false, false),
   @SerializedName("scrollableTooltips1")
   SCROLLABLE_TOOLTIPS(false, false),
   @SerializedName("weatherchanger")
   WEATHER_CHANGER(false, false),
   @SerializedName("zoom")
   ZOOM(false, false),
   @SerializedName("brightness")
   BRIGHTNESS(false, false),
   @SerializedName("titletweaker")
   TITLE_TWEAKER(false, false),
   @SerializedName("viewModel")
   VIEWMODEL(false, false),
   @SerializedName("nametags")
   NAMETAGS(false, false),
   @SerializedName("deathInfo")
   DEATH_INFO(false, false);

   private final String slug;
   private final boolean core;
   private final boolean sidebar;

   @Nullable
   public static @Nullable FeatherSourceFile243 fromSlug(String var0) {
      FeatherSourceFile243[] var1 = values();
      int var2 = var1.length;

      for(int var3 = 0; var3 < var2; ++var3) {
         FeatherSourceFile243 var4 = var1[var3];
         if (var4.getSlug().equals(var0)) {
            return var4;
         }
      }

      return null;
   }

   private FeatherSourceFile243(boolean var3, boolean var4) {
      this.sidebar = var4;

      try {
         Field var5 = this.getClass().getDeclaredField(this.name());
         this.slug = ((SerializedName)var5.getDeclaredAnnotation(SerializedName.class)).value();
      } catch (NoSuchFieldException var6) {
         throw new IllegalStateException("Enum \"" + this.name() + "\" in \"" + this.getClass().getName() + "\" not annotated with @SerializedName");
      }

      this.core = var3;
   }

   @NotNull
   public @NotNull String getSlug() {
      return this.slug;
   }

   public boolean isCore() {
      return this.core;
   }

   public boolean isSidebar() {
      return this.sidebar;
   }

   // $FF: synthetic method
   private static FeatherSourceFile243[] $values() {
      return new FeatherSourceFile243[]{CORE, CHAT_OPTIONS, SOCIAL, GRAPHICS_OPTIONS, PERFORMANCE_OPTIONS, COSMETIC_OPTIONS, CUSTOM_CHAT, AUTO_TEXT, CROSSHAIR, CPS, ARMOR_STATUS, BOSS_BAR, COMBO_DISPLAY, COORDINATES, DIRECTION, FPS, ITEM_COUNTER, ITEM_INFO, KEYSTROKES, PACK_DISPLAY, PING, POTION_EFFECTS, REACH_DISPLAY, SPEED_METER, SCOREBOARD, TIME, TOGGLE_SPRINT, SERVER_ADDRESS, MOUSE_STROKES, HYPIXEL, MOTION_BLUR, SATURATION, WAYPOINTS, ANIMATIONS, DAMAGE_INDICATOR, DISCORD, BLOCK_OVERLAY, CLEAR_WATER, FOV_CHANGER, GLINT, HITBOX, ITEM_PHYSIC, OOF_MOD, PARTICLES, PERSPECTIVE, SNAPLOOK, VOICE, TIME_CHANGER, TNT_TIMER, TOAST_CONTROL, NICK_HIDER, SCREENSHOT, STOPWATCH, SCROLLABLE_TOOLTIPS, WEATHER_CHANGER, ZOOM, BRIGHTNESS, TITLE_TWEAKER, VIEWMODEL, NAMETAGS, DEATH_INFO};
   }
}
