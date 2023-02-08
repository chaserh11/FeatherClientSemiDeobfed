package net.digitalingot.feather;

import net.digitalingot.vendor.com.google.inject.AbstractModule;
import net.digitalingot.vendor.com.google.inject.Provides;
import net.minecraft.client.Minecraft;

public class FeatherSourceFile648 extends AbstractModule {
   @Provides
   public Minecraft si() {
      return Minecraft.func_71410_x();
   }
}
