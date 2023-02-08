package net.digitalingot.feather;

import java.awt.Color;
import org.jetbrains.annotations.NotNull;

public class FeatherSourceFile152 implements FeatherSourceFile518 {
   @NotNull
   public @NotNull @NotNull @NotNull Color qy(@NotNull @NotNull String var1, @NotNull @NotNull Class var2) {
      String[] var3 = var1.split("/");
      if (var3.length != 3 && var3.length != 4) {
         throw new FeatherSourceFile277("Color input doesn't contain 3 or 4 parts");
      } else {
         try {
            int var4 = Integer.parseInt(var3[0]);
            int var5 = Integer.parseInt(var3[1]);
            int var6 = Integer.parseInt(var3[2]);
            if (var3.length == 3) {
               return new Color(var4, var5, var6);
            } else {
               int var7 = Integer.parseInt(var3[3]);
               return new Color(var4, var5, var6, var7);
            }
         } catch (NumberFormatException var8) {
            throw new FeatherSourceFile277("A color component wasn't an integer", var8);
         } catch (IllegalArgumentException var9) {
            throw new FeatherSourceFile277("A color component wasn't in the range [0;255]");
         }
      }
   }

   @NotNull
   public @NotNull @NotNull String qy(@NotNull @NotNull Color var1) {
      return var1.getRed() + "/" + var1.getGreen() + "/" + var1.getBlue() + "/" + var1.getAlpha();
   }

   // $FF: synthetic method
   @NotNull
   public @NotNull @NotNull String km(@NotNull @NotNull Object var1) {
      return this.qy((Color)var1);
   }

   // $FF: synthetic method
   @NotNull
   public @NotNull @NotNull @NotNull Object nc(@NotNull @NotNull String var1, @NotNull @NotNull Class var2) {
      return this.qy(var1, var2);
   }
}
