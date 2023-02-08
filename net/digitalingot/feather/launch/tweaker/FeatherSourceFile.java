package net.digitalingot.feather.launch.tweaker;

import java.io.File;
import java.lang.reflect.Field;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import net.digitalingot.feather.FeatherSourceFile775;
import net.minecraft.launchwrapper.ITweaker;
import net.minecraft.launchwrapper.LaunchClassLoader;

public class FeatherSourceFile implements ITweaker {
   public final void acceptOptions(List var1, File var2, File var3, String var4) {
   }

   public final void injectIntoClassLoader(LaunchClassLoader var1) {
      lh(var1);
      var1.registerTransformer(FeatherSourceFile775.class.getName());
   }

   public String getLaunchTarget() {
      return "net.minecraft.client.main.Main";
   }

   public String[] getLaunchArguments() {
      return new String[0];
   }

   private static void lh(LaunchClassLoader var0) {
      nc(var0).remove("org.lwjgl.");
   }

   private static Set nc(LaunchClassLoader var0) {
      try {
         Field var1 = LaunchClassLoader.class.getDeclaredField("classLoaderExceptions");
         var1.setAccessible(true);
         return (Set)var1.get(var0);
      } catch (IllegalAccessException | NoSuchFieldException var2) {
         return Collections.emptySet();
      }
   }
}
