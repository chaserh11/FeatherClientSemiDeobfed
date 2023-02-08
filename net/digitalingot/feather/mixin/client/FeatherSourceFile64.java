package net.digitalingot.feather.mixin.client;

import java.io.File;
import net.digitalingot.feather.FeatherSourceFile222;
import net.minecraft.client.resources.ResourcePackRepository.Entry;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;
import org.spongepowered.asm.mixin.Shadow;

@Mixin({Entry.class})
public abstract class FeatherSourceFile64 implements FeatherSourceFile222 {
   @Shadow
   @Final
   private File field_110523_b;

   @Overwrite
   public String toString() {
      return String.format("%s:%s:%s:%d", this.field_110523_b.getName(), this.field_110523_b.isDirectory() ? "folder" : "zip", this.getOriginFolder(), this.field_110523_b.lastModified());
   }
}
