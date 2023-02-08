package net.digitalingot.feather;

import net.digitalingot.vendor.javax.inject.Inject;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.util.IChatComponent;
import org.jetbrains.annotations.NotNull;

public class FeatherSourceFile757 implements FeatherSourceFile833 {
   private final Minecraft minecraft;

   @Inject
   FeatherSourceFile757(Minecraft var1) {
      this.minecraft = var1;
   }

   public @NotNull void ej(@NotNull @NotNull String var1) {
      IChatComponent var2 = FeatherSourceFile37.lh(var1);
      EntityPlayerSP var3 = this.minecraft.field_71439_g;
      if (var3 != null) {
         FeatherSourceFile198.lh(var3, var2);
      }

   }
}
