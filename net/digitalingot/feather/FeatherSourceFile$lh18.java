package net.digitalingot.feather;

import org.jetbrains.annotations.NotNull;

public enum FeatherSourceFile$lh18 {
   SKYBLOCK("Skyblock"),
   SKYBLOCK_CO_OP("Skyblock", "Skyblock Co-Op"),
   SKYWARS("Skywars"),
   BLITZ_SG("Survival Games"),
   CRAZY_WALLS("Crazy Walls"),
   COPS_AND_CRIMS("Cops and Crims"),
   THE_WALLS("The Walls"),
   MEGA_WALLS("Mega Walls"),
   UHC_CHAMPIONS("UHC Champions"),
   MURDER_MYSTERY("Murder Mystery"),
   HOUSING("Housing"),
   THE_HYPIXEL_PIT("The Hypixel Pit"),
   ARCADE_GAMES("Arcade Games"),
   BUILD_BATTLE("Build Battle"),
   CREEPER_ATTACK("Creeper Attack"),
   FARM_HUNT("Farm Hunt"),
   PARTY_GAMES("Party Games"),
   ZOMBIES("Zombies"),
   HIDE_AND_SEEK("Hide and Seek"),
   HYPIXEL_SAYS("Hypixel Says"),
   MINI_WALLS("Mini Walls"),
   BLOCKING_DEAD("Blocking Dead"),
   THROW_OUT("Throw Out"),
   GALAXY_WARS("Galaxy Wars"),
   ENDER_SPLEEF("Ender Spleef"),
   DRAGON_WARS("Dragon Wars"),
   CAPTURE_THE_WOOL("Capture The Wool"),
   PIXEL_PAINTERS("Pixel Painters"),
   BOUNTY_HUNTERS("Bounty Hunters"),
   FOOTBALL("Football"),
   HOLE_IN_THE_WALL("Hole In The Wall"),
   DUELS("Duels"),
   THE_TNT_GAMES("The TNT Games"),
   SMASH_HEROES("Smash Heroes"),
   WARLORDS("Warlords"),
   SPEED_UHC("Speed UHC"),
   BEDWARS("Bedwars", "Bed Wars"),
   LOBBY("Lobby", "Hypixel");

   @NotNull
   private final @NotNull String displayName;
   @NotNull
   private final @NotNull String scoreboardName;

   @NotNull
   public static @NotNull @NotNull FeatherSourceFile$lh18 fromScoreboardName(@NotNull @NotNull String var0) {
      FeatherSourceFile$lh18[] var1 = values();
      int var2 = var1.length;

      for(int var3 = 0; var3 < var2; ++var3) {
         FeatherSourceFile$lh18 var4 = var1[var3];
         if (var0.equalsIgnoreCase(var4.getScoreboardName())) {
            return var4;
         }
      }

      return LOBBY;
   }

   private FeatherSourceFile$lh18(@NotNull String var3) {
      this.displayName = var3;
      this.scoreboardName = var3;
   }

   private FeatherSourceFile$lh18(@NotNull String var3, @NotNull String var4) {
      this.displayName = var3;
      this.scoreboardName = var4;
   }

   @NotNull
   public @NotNull String getDisplayName() {
      return this.displayName;
   }

   @NotNull
   public @NotNull String getScoreboardName() {
      return this.scoreboardName;
   }

   // $FF: synthetic method
   private static FeatherSourceFile$lh18[] $values() {
      return new FeatherSourceFile$lh18[]{SKYBLOCK, SKYBLOCK_CO_OP, SKYWARS, BLITZ_SG, CRAZY_WALLS, COPS_AND_CRIMS, THE_WALLS, MEGA_WALLS, UHC_CHAMPIONS, MURDER_MYSTERY, HOUSING, THE_HYPIXEL_PIT, ARCADE_GAMES, BUILD_BATTLE, CREEPER_ATTACK, FARM_HUNT, PARTY_GAMES, ZOMBIES, HIDE_AND_SEEK, HYPIXEL_SAYS, MINI_WALLS, BLOCKING_DEAD, THROW_OUT, GALAXY_WARS, ENDER_SPLEEF, DRAGON_WARS, CAPTURE_THE_WOOL, PIXEL_PAINTERS, BOUNTY_HUNTERS, FOOTBALL, HOLE_IN_THE_WALL, DUELS, THE_TNT_GAMES, SMASH_HEROES, WARLORDS, SPEED_UHC, BEDWARS, LOBBY};
   }
}
