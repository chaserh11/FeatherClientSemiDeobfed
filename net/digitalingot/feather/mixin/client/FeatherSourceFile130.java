package net.digitalingot.feather.mixin.client;

import java.nio.file.Path;
import java.util.List;
import net.digitalingot.feather.FeatherSourceFile216;
import net.digitalingot.feather.FeatherSourceFile222;
import net.minecraft.client.gui.GuiScreenResourcePacks;
import net.minecraft.client.resources.ResourcePackListEntry;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.Slice;

@Mixin({ResourcePackListEntry.class})
public abstract class FeatherSourceFile130 implements FeatherSourceFile222 {
   @Shadow
   @Final
   protected GuiScreenResourcePacks field_148315_b;

   @Redirect(
      method = {"mousePressed"},
      slice = @Slice(
   from = @At(
   value = "INVOKE",
   target = "Lnet/minecraft/client/gui/GuiScreenResourcePacks;getSelectedResourcePacks()Ljava/util/List;"
)
),
      at = @At(
   value = "INVOKE",
   target = "Ljava/util/List;add(ILjava/lang/Object;)V",
   ordinal = 0
)
   )
   private void lh(List var1, int var2, Object var3) {
      ResourcePackListEntry var4 = (ResourcePackListEntry)var3;
      var1.add(var2, var4);
      ((FeatherSourceFile216)this.field_148315_b).populate((Path)null, false);
   }
}
