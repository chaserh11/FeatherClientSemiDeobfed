package net.digitalingot.feather.mixin.client;

import net.digitalingot.feather.FeatherSourceFile214;
import net.minecraft.client.resources.ResourcePackListEntryFound;
import net.minecraft.client.resources.ResourcePackRepository.Entry;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;

@Mixin({ResourcePackListEntryFound.class})
public class FeatherSourceFile76 implements FeatherSourceFile214 {
   @Shadow
   @Final
   private Entry field_148319_c;

   public String getTitle() {
      return this.field_148319_c.func_110515_d();
   }
}
