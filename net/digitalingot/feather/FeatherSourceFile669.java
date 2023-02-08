package net.digitalingot.feather;

import java.util.Collections;
import net.digitalingot.vendor.javax.inject.Inject;
import net.minecraft.client.Minecraft;
import org.jetbrains.annotations.NotNull;

public class FeatherSourceFile669 extends FeatherSourceFile735 {
   private final FeatherSourceFile124 bl;

   @Inject
   public FeatherSourceFile669(FeatherSourceFile124 var1) {
      super("fui", Collections.emptyList());
      this.bl = var1;
   }

   private static String[] lh(String[] var0, int var1) {
      if (var1 < var0.length) {
         String[] var2 = new String[var0.length - var1];
         System.arraycopy(var0, var1, var2, 0, var0.length - var1);
         return var2;
      } else {
         return new String[0];
      }
   }

   private static void ug(String var0) {
      Minecraft.func_71410_x().field_71456_v.func_146158_b().func_146227_a(FeatherSourceFile37.xj(var0));
   }

   private static void qw() {
      ug("Usage: /fui [cf|df|ff|uf|sf|hf|mf] [frame] (...)");
   }

   public void lh(@NotNull @NotNull String[] var1) {
      if (var1.length < 2) {
         qw();
      } else {
         String var2 = var1[1];
         switch (var1[0]) {
            case "cf":
               this.lh(var2, lh(var1, 2));
               break;
            case "df":
               this.nc(var2, lh(var1, 2));
               break;
            case "ff":
               this.xj(var2, lh(var1, 2));
               break;
            case "uf":
               this.oe(var2, lh(var1, 2));
               break;
            case "sf":
               this.qy(var2, lh(var1, 2));
               break;
            case "hf":
               this.ou(var2, lh(var1, 2));
               break;
            case "mf":
               this.pq(var2, lh(var1, 2));
               break;
            default:
               qw();
         }

      }
   }

   private void lh(String var1, String[] var2) {
      if (var2.length < 1) {
         ug("Usage: /fui cf " + var1 + " [url]");
      } else {
         String var3 = var2[0];
         ug("Creating frame.  Name: " + var1 + ". Url: " + var3);
         this.bl.lh(var1, var3);
      }

   }

   private void nc(String var1, String[] var2) {
      ug("Destroying frame.  Name: " + var1);
      this.bl.sm(var1);
   }

   private void xj(String var1, String[] var2) {
      ug("Focusing frame.  Name: " + var1);
      FeatherSourceFile747.oe().lh(() -> {
         this.bl.lh(var1, true);
      }, 0L);
   }

   private void oe(String var1, String[] var2) {
      ug("Unfocusing frame.  Name: " + var1);
      this.bl.lh(var1, false);
   }

   private void qy(String var1, String[] var2) {
      ug("Showing frame.  Name: " + var1);
      this.bl.nc(var1, true);
   }

   private void ou(String var1, String[] var2) {
      ug("Hiding frame.  Name: " + var1);
      this.bl.nc(var1, false);
   }

   private void pq(String var1, String[] var2) {
      if (var2.length < 1) {
         ug("Usage: /fui mf " + var1 + " [data...]");
      } else {
         String var3 = String.join(" ", lh(var2, 0));
         ug("Sending frame message.   Name: " + var1 + ". Data: " + var3);
         this.bl.oe(var1, var3);
      }

   }
}
