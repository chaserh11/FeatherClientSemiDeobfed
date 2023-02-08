package net.digitalingot.feather.mixin.client;

import net.digitalingot.feather.FeatherSourceFile581;
import net.minecraft.util.ChatComponentText;
import org.spongepowered.asm.mixin.Mixin;

@Mixin({ChatComponentText.class})
public class FeatherSourceFile60 implements FeatherSourceFile581 {
   private boolean VC = false;

   public boolean feather$isDuplicateMessage() {
      return this.VC;
   }

   public void feather$setDuplicateMessage(boolean var1) {
      this.VC = var1;
   }
}
