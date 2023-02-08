package net.digitalingot.feather.mixin.client;

import java.util.Iterator;
import java.util.List;
import net.digitalingot.feather.FeatherSourceFile$lh7;
import net.digitalingot.feather.FeatherSourceFile335;
import net.minecraft.client.gui.GuiOverlayDebug;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin({GuiOverlayDebug.class})
public class FeatherSourceFile {
   @Inject(
      method = {"call"},
      at = {@At("RETURN")}
   )
   private void wz(CallbackInfoReturnable var1) {
      Iterator var2 = FeatherSourceFile335.yD().iterator();

      while(var2.hasNext()) {
         FeatherSourceFile$lh7 var3 = (FeatherSourceFile$lh7)var2.next();
         ((List)var1.getReturnValue()).add(var3.get());
      }

   }
}
