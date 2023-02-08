package net.digitalingot.feather;

import net.minecraft.util.ResourceLocation;
import org.jetbrains.annotations.NotNull;

public class FeatherSourceFile794 {
   private static final FeatherSourceFile465 sP = FeatherSourceFile665.nc(FeatherSourceFile522.class);
   private static final String[] sU = new String[]{"white", "orange", "magenta", "light_blue", "yellow", "lime", "pink", "gray", "light", "cyan", "purple", "blue", "brown", "green", "red", "black"};

   @NotNull
   public static @NotNull @NotNull ResourceLocation nc(@NotNull @NotNull ResourceLocation var0) {
      FeatherSourceFile522 var1 = (FeatherSourceFile522)sP.ag();
      if (var1 == null) {
         return var0;
      } else if (!((FeatherSourceFile$lh135)var1.pr()).mD) {
         return var0;
      } else {
         String var2 = var0.func_110623_a();
         if (var2.contains("glass") && var2.contains(".png") && !var2.contains("spyglass") && !var2.contains("bottle")) {
            if (!((FeatherSourceFile$lh135)var1.pr()).mE) {
               String[] var3 = sU;
               int var4 = var3.length;

               for(int var5 = 0; var5 < var4; ++var5) {
                  String var6 = var3[var5];
                  if (var2.contains(var6)) {
                     return var0;
                  }
               }
            }

            return new ResourceLocation("feather:textures/block/glass.png");
         } else {
            return var0;
         }
      }
   }
}
