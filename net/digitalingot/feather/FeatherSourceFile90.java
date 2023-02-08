package net.digitalingot.feather;

import java.util.StringJoiner;
import org.jetbrains.annotations.NotNull;

public class FeatherSourceFile90 implements FeatherSourceFile518 {
   @NotNull
   private final @NotNull FeatherSourceFile634 iT = new FeatherSourceFile634();

   @NotNull
   public @NotNull @NotNull @NotNull FeatherSourceFile344 mq(@NotNull @NotNull String var1, @NotNull @NotNull Class var2) {
      if (var1.equals("0")) {
         return new FeatherSourceFile344(new int[0]);
      } else {
         String[] var3 = var1.split(",");
         int[] var4 = new int[var3.length];

         for(int var5 = 0; var5 < var3.length; ++var5) {
            var4[var5] = FeatherSourceFile766.fh(this.iT.km(var3[var5], Integer.class)).ol();
         }

         return new FeatherSourceFile344(var4);
      }
   }

   @NotNull
   public @NotNull @NotNull String lh(@NotNull @NotNull FeatherSourceFile344 var1) {
      if (var1.va().length == 0) {
         return "0";
      } else {
         StringJoiner var2 = new StringJoiner(",");
         int[] var3 = var1.va();
         int var4 = var3.length;

         for(int var5 = 0; var5 < var4; ++var5) {
            int var6 = var3[var5];
            var2.add(String.valueOf(FeatherSourceFile766.xy(var6).zv()));
         }

         return var2.toString();
      }
   }

   // $FF: synthetic method
   @NotNull
   public @NotNull @NotNull String km(@NotNull @NotNull Object var1) {
      return this.lh((FeatherSourceFile344)var1);
   }

   // $FF: synthetic method
   @NotNull
   public @NotNull @NotNull @NotNull Object nc(@NotNull @NotNull String var1, @NotNull @NotNull Class var2) {
      return this.mq(var1, var2);
   }
}
