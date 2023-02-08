package net.digitalingot.feather;

import com.google.gson.annotations.SerializedName;
import java.util.Arrays;
import java.util.StringJoiner;
import org.jetbrains.annotations.NotNull;

public class FeatherSourceFile344 {
   @SerializedName("keys")
   private final int[] aC;

   public FeatherSourceFile344(int[] var1) {
      this.aC = Arrays.stream(var1).boxed().sorted(new FeatherSourceFile21()).mapToInt((var0) -> {
         return var0;
      }).toArray();
   }

   @NotNull
   public @NotNull String getName() {
      StringJoiner var1 = new StringJoiner(" + ");
      int[] var2 = this.aC;
      int var3 = var2.length;

      for(int var4 = 0; var4 < var3; ++var4) {
         int var5 = var2[var4];
         var1.add(FeatherSourceFile766.xy(var5).getName());
      }

      return var1.toString();
   }

   public boolean eb() {
      if (this.aC.length == 0) {
         return false;
      } else {
         int[] var1 = this.aC;
         int var2 = var1.length;

         for(int var3 = 0; var3 < var2; ++var3) {
            int var4 = var1[var3];
            if (var4 != 0) {
               if (var4 >= 100000) {
                  if (!FeatherSourceFile845.kx(var4 - 100001)) {
                     return false;
                  }
               } else if (!FeatherSourceFile704.lh(var4)) {
                  return false;
               }
            }
         }

         return true;
      }
   }

   public int[] va() {
      return this.aC;
   }
}
