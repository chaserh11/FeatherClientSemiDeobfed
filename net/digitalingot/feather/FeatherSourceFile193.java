package net.digitalingot.feather;

import java.util.ArrayList;
import java.util.List;
import net.digitalingot.vendor.javax.inject.Inject;
import net.digitalingot.vendor.javax.inject.Singleton;
import org.jetbrains.annotations.NotNull;

@Singleton
class FeatherSourceFile193 {
   private final FeatherSourceFile253 nc;

   @Inject
   FeatherSourceFile193(FeatherSourceFile253 var1) {
      this.nc = var1;
   }

   public void wz(boolean var1) {
      List var2 = this.he();
      List var3 = this.lt(var1);
      FeatherSourceFile322 var4 = new FeatherSourceFile322(var2, var3);
      this.nc.nc(var4);
   }

   @NotNull
   private @NotNull List he() {
      ArrayList var1 = new ArrayList();
      var1.add(FeatherSourceFile112.SINGLEPLAYER);
      var1.add(FeatherSourceFile112.MULTIPLAYER);
      var1.add(FeatherSourceFile112.COSMETICS);
      var1.add(FeatherSourceFile112.QUIT_GAME);
      return var1;
   }

   @NotNull
   private @NotNull List lt(boolean var1) {
      ArrayList var2 = new ArrayList();
      var2.add(FeatherSourceFile259.SOCIAL);
      var2.add(FeatherSourceFile259.MC_SETTINGS);
      if (FeatherSourceFile390.nw()) {
         var2.add(FeatherSourceFile259.MOD_MENU);
      }

      if (FeatherSourceFile6.ha()) {
         var2.add(FeatherSourceFile259.REPLAY_MOD);
      }

      if (var1) {
         var2.add(FeatherSourceFile259.ORIGINAL_MENU);
      }

      return var2;
   }
}
