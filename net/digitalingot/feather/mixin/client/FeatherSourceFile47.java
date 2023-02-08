package net.digitalingot.feather.mixin.client;

import com.google.common.collect.ImmutableSet;
import com.google.common.collect.UnmodifiableIterator;
import net.minecraft.util.ClassInheritanceMultiMap;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(
   value = {ClassInheritanceMultiMap.class},
   targets = {"net.minecraft.util.ClassInheritanceMultiMap$1"}
)
public class FeatherSourceFile47 {
   @Redirect(
      method = {"iterator()Ljava/util/Iterator;"},
      at = @At(
   value = "INVOKE",
   target = "Lcom/google/common/collect/Iterators;emptyIterator()Lcom/google/common/collect/UnmodifiableIterator;",
   opcode = 184
),
      remap = false
   )
   private UnmodifiableIterator Aq() {
      return ImmutableSet.of().iterator();
   }
}
