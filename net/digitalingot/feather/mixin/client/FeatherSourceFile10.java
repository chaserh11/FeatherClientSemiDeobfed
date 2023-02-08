package net.digitalingot.feather.mixin.client;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import net.minecraft.client.settings.GameSettings;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin({GameSettings.class})
public class FeatherSourceFile10 {
   private static final String Wb = "mc_options_v1.txt";

   @Redirect(
      method = {"<init>(Lnet/minecraft/client/Minecraft;Ljava/io/File;)V"},
      at = @At(
   value = "NEW",
   target = "java/io/File",
   ordinal = 0
)
   )
   private File lh(File var1, String var2) {
      File var3 = new File(var1, "feather");
      File var4 = new File(var3, "mc_options_v1.txt");
      if (!var4.exists()) {
         File var5 = new File(var1, var2);
         if (!var3.exists() && !var3.mkdirs()) {
            return var5;
         }

         if (var5.exists()) {
            try {
               Files.copy(var5.toPath(), var4.toPath());
            } catch (IOException var7) {
            }
         }
      }

      return var4;
   }
}
