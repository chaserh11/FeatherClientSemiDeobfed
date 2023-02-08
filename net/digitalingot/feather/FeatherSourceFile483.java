package net.digitalingot.feather;

import feather.org.objectweb.asm.commons.Remapper;
import java.io.File;
import java.util.Set;
import javax.annotation.Nullable;
import net.minecraft.launchwrapper.LaunchClassLoader;
import net.minecraftforge.fml.common.asm.transformers.deobf.FMLDeobfuscatingRemapper;

public class FeatherSourceFile483 extends Remapper {
   public static final FeatherSourceFile483 INSTANCE = new FeatherSourceFile483();
   private static final FMLDeobfuscatingRemapper PROXIED;

   private FeatherSourceFile483() {
   }

   public void setupLoadOnly(String var1, boolean var2) {
      PROXIED.setupLoadOnly(var1, var2);
   }

   public void setup(File var1, LaunchClassLoader var2, String var3) {
      PROXIED.setup(var1, var2, var3);
   }

   public boolean isRemappedClass(String var1) {
      return PROXIED.isRemappedClass(var1);
   }

   public String mapFieldName(String var1, String var2, @Nullable String var3) {
      return PROXIED.mapFieldName(var1, var2, var3);
   }

   public String map(String var1) {
      return PROXIED.map(var1);
   }

   public String unmap(String var1) {
      return PROXIED.unmap(var1);
   }

   public String mapMethodName(String var1, String var2, String var3) {
      return PROXIED.mapMethodName(var1, var2, var3);
   }

   @Nullable
   public String mapSignature(String var1, boolean var2) {
      return PROXIED.mapSignature(var1, var2);
   }

   public void mergeSuperMaps(String var1, @Nullable String var2, String[] var3) {
      PROXIED.mergeSuperMaps(var1, var2, var3);
   }

   public Set getObfedClasses() {
      return PROXIED.getObfedClasses();
   }

   @Nullable
   public String getStaticFieldType(String var1, String var2, String var3, String var4) {
      return PROXIED.getStaticFieldType(var1, var2, var3, var4);
   }

   static {
      PROXIED = FMLDeobfuscatingRemapper.INSTANCE;
   }
}
