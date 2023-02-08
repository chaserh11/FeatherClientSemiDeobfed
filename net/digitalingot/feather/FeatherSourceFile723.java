package net.digitalingot.feather;

import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.scoreboard.ScoreObjective;
import net.minecraft.scoreboard.Scoreboard;
import org.jetbrains.annotations.NotNull;

public class FeatherSourceFile723 {
   private static long tb;
   private static FeatherSourceFile$lh18 sn;

   @NotNull
   public static @NotNull FeatherSourceFile$lh18 fx() {
      long var0 = System.currentTimeMillis();
      if (var0 - tb > 1000L || sn == null) {
         tb = var0;
         sn = at();
      }

      return sn;
   }

   @NotNull
   private static @NotNull FeatherSourceFile$lh18 at() {
      EntityPlayerSP var0 = Minecraft.func_71410_x().field_71439_g;
      if (var0 == null) {
         return FeatherSourceFile$lh18.LOBBY;
      } else {
         Scoreboard var1 = var0.func_96123_co();
         ScoreObjective var2 = var1.func_96539_a(1);
         if (var2 == null) {
            return FeatherSourceFile$lh18.LOBBY;
         } else if (var2.func_96678_d() == null) {
            return FeatherSourceFile$lh18.LOBBY;
         } else {
            String var3 = var2.func_96678_d().trim();
            var3 = FeatherSourceFile341.px(var3);
            return FeatherSourceFile$lh18.fromScoreboardName(var3);
         }
      }
   }
}
