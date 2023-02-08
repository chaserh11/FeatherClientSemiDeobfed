package net.digitalingot.feather;

import java.util.ArrayList;
import java.util.List;
import net.digitalingot.vendor.javax.inject.Inject;
import org.jetbrains.annotations.NotNull;

public class FeatherSourceFile499 {
   private final FeatherSourceFile253 nc;

   @Inject
   FeatherSourceFile499(FeatherSourceFile253 var1) {
      this.nc = var1;
   }

   public void wz(boolean var1) {
      List var2 = this.hb(var1);
      List var3 = this.dl();
      List var4 = this.ep(var1);
      FeatherSourceFile26 var5 = new FeatherSourceFile26(var2, var3, var4);
      this.nc.nc(var5);
   }

   @NotNull
   private @NotNull List hb(boolean var1) {
      ArrayList var2 = new ArrayList();
      var2.add(FeatherSourceFile112.BACK_TO_GAME);
      var2.add(FeatherSourceFile112.FEATHER_SETTINGS);
      var2.add(FeatherSourceFile112.OPTIONS);
      if (!var1) {
         var2.add(FeatherSourceFile112.DISCONNECT);
      } else {
         var2.add(FeatherSourceFile112.SAVE_AND_QUIT);
      }

      return var2;
   }

   @NotNull
   private @NotNull List dl() {
      ArrayList var1 = new ArrayList();
      var1.add(FeatherSourceFile259.SOCIAL);
      var1.add(FeatherSourceFile259.SERVER_LIST);
      if (FeatherSourceFile390.nw()) {
         var1.add(FeatherSourceFile259.MOD_MENU);
      }

      var1.add(FeatherSourceFile259.ORIGINAL_PAUSE_SCREEN);
      return var1;
   }

   @NotNull
   private @NotNull List ep(boolean var1) {
      ArrayList var2 = new ArrayList();
      if (var1) {
         var2.add(FeatherSourceFile112.OPEN_TO_LAN);
      }

      return var2;
   }
}
