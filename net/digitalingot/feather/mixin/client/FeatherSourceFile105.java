package net.digitalingot.feather.mixin.client;

import java.nio.file.Path;
import net.digitalingot.feather.FeatherSourceFile222;
import net.minecraft.client.resources.ResourcePackListEntry;
import net.minecraft.client.resources.ResourcePackRepository.Entry;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;

@Mixin({ResourcePackListEntry.class, Entry.class})
public abstract class FeatherSourceFile105 implements FeatherSourceFile222 {
   @Unique
   private Path VQ;

   public Path getOriginFolder() {
      return this.VQ;
   }

   public void setOriginFolder(Path var1) {
      this.VQ = var1;
   }
}
