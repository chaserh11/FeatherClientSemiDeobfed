package net.digitalingot.feather;

import java.io.File;
import java.nio.file.Path;
import net.digitalingot.vendor.com.google.inject.AbstractModule;
import net.digitalingot.vendor.com.google.inject.Provides;
import net.digitalingot.vendor.javax.inject.Singleton;
import net.minecraft.client.Minecraft;

public class FeatherSourceFile800 extends AbstractModule {
   @Provides
   @Singleton
   @FeatherSourceFile$lh112
   public Path mr() {
      return Minecraft.func_71410_x().field_71412_D.toPath().resolve("feather");
   }

   @Provides
   @Singleton
   @FeatherSourceFile$lh112
   public File lh(@FeatherSourceFile$lh112 Path var1) {
      return var1.toFile();
   }

   @Provides
   @Singleton
   @FeatherSourceFile$xj15
   public Path nc(@FeatherSourceFile$lh112 Path var1) {
      return var1.resolve("misc");
   }

   @Provides
   @Singleton
   @FeatherSourceFile$xj15
   public File xj(@FeatherSourceFile$xj15 Path var1) {
      return var1.toFile();
   }

   @Provides
   @Singleton
   @FeatherSourceFile$nc49
   public String ux() {
      return FeatherSourceFile815.hm("/git.hash").wR();
   }
}
