package net.digitalingot.feather;

import net.digitalingot.vendor.com.google.inject.Guice;
import net.digitalingot.vendor.com.google.inject.Injector;
import net.digitalingot.vendor.com.google.inject.Module;
import net.digitalingot.vendor.com.google.inject.Provider;

public class FeatherSourceFile487 {
   private static Injector eg;

   public static void km() {
      eg = Guice.createInjector(new Module[]{new FeatherSourceFile800(), new FeatherSourceFile99(), new FeatherSourceFile106(), new FeatherSourceFile790(), new FeatherSourceFile648(), new FeatherSourceFile569()});
      ((FeatherSourceFile747)eg.getInstance(FeatherSourceFile747.class)).xj();
   }

   public static Injector mq() {
      return eg;
   }

   public static Provider lh(Class var0) {
      return eg.getProvider(var0);
   }
}
