package net.digitalingot.feather;

import com.google.gson.JsonObject;
import java.io.InputStream;
import net.minecraft.client.resources.IResource;
import net.minecraft.client.resources.data.IMetadataSection;
import net.minecraft.util.ResourceLocation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

class FeatherSourceFile423 implements IResource {
   private final FeatherSourceFile842 QN;

   public FeatherSourceFile423(FeatherSourceFile842 var1) {
      this.QN = var1;
   }

   public ResourceLocation func_177241_a() {
      return null;
   }

   @NotNull
   public @NotNull InputStream func_110527_b() {
      return this.QN.wV();
   }

   public boolean func_110528_c() {
      return this.QN.wW();
   }

   @Nullable
   public @Nullable IMetadataSection func_110526_a(String var1) {
      JsonObject var2 = this.QN.jy(var1);
      return var2 != null ? null : null;
   }

   public String func_177240_d() {
      return "feather_rt";
   }
}
