package net.digitalingot.feather.mixin.client;

import java.util.List;
import net.minecraft.client.resources.ResourcePackListEntry;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(
   targets = {"net.minecraft.client.resources.ResourcePackListEntry$1"}
)
public class FeatherSourceFile153 {
   @Redirect(
      method = {"confirmClicked"},
      at = @At(
   value = "INVOKE",
   target = "Ljava/util/List;add(ILjava/lang/Object;)V"
)
   )
   private void lh(List var1, int var2, Object var3) {
      ResourcePackListEntry var4 = (ResourcePackListEntry)var3;
      var1.add(var2, var4);
      ((FeatherSourceFile$lh1)var4).getResourcePacksGUI().func_175288_g();
   }
}
