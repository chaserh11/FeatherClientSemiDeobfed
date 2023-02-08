package net.digitalingot.feather;

import java.awt.Color;
import org.jetbrains.annotations.NotNull;

public class FeatherSourceFile64 implements FeatherSourceFile518 {
   @NotNull
   private final @NotNull FeatherSourceFile760 iR = new FeatherSourceFile760();
   @NotNull
   private final @NotNull FeatherSourceFile152 iS = new FeatherSourceFile152();

   @NotNull
   public @NotNull @NotNull @NotNull FeatherSourceFile225 oe(@NotNull @NotNull String var1, @NotNull @NotNull Class var2) {
      String[] var3 = var1.split("/", 2);
      if (var3.length != 2) {
         throw new FeatherSourceFile277("ChromaColor input does not contain a minimum of two /");
      } else {
         String var4 = var3[0];
         String var5 = var3[1];
         boolean var6 = this.iR.xj(var4, Boolean.class);
         Color var7 = this.iS.qy(var5, Color.class);
         return new FeatherSourceFile225(var6, var7);
      }
   }

   @NotNull
   public @NotNull @NotNull String lh(@NotNull @NotNull FeatherSourceFile225 var1) {
      return var1.on() + "/" + this.iS.qy(var1.dm());
   }

   // $FF: synthetic method
   @NotNull
   public @NotNull @NotNull String km(@NotNull @NotNull Object var1) {
      return this.lh((FeatherSourceFile225)var1);
   }

   // $FF: synthetic method
   @NotNull
   public @NotNull @NotNull @NotNull Object nc(@NotNull @NotNull String var1, @NotNull @NotNull Class var2) {
      return this.oe(var1, var2);
   }
}
