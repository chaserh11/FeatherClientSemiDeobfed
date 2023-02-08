package net.digitalingot.feather.mixin.client;

import java.util.List;
import net.minecraft.client.settings.KeyBinding;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin({KeyBinding.class})
public interface FeatherSourceFile132 {
   @Accessor
   static List getKeybindArray() {
      throw new AssertionError();
   }
}
