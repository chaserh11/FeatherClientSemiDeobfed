package net.digitalingot.feather;

import com.google.common.collect.ImmutableSet;
import java.io.FileNotFoundException;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import net.minecraft.client.resources.FallbackResourceManager;
import net.minecraft.client.resources.IResource;
import net.minecraft.client.resources.data.IMetadataSerializer;
import net.minecraft.util.ResourceLocation;
import org.jetbrains.annotations.NotNull;

public class FeatherSourceFile422 extends FallbackResourceManager {
   private final FeatherSourceFile420 ux;

   public FeatherSourceFile422(FeatherSourceFile420 var1) {
      super((IMetadataSerializer)null);
      this.ux = var1;
   }

   @NotNull
   public @NotNull Set func_135055_a() {
      return ImmutableSet.of("feather_rt");
   }

   @NotNull
   public @NotNull @NotNull IResource func_110536_a(@NotNull @NotNull ResourceLocation var1) {
      FeatherSourceFile421 var2 = this.ux.qy(var1);
      if (var2 == null) {
         throw new FileNotFoundException(var1.toString());
      } else {
         return new FeatherSourceFile423(var2.createRuntimeResource());
      }
   }

   @NotNull
   public @NotNull List func_135056_b(ResourceLocation var1) {
      return Collections.emptyList();
   }
}
