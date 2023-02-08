package net.digitalingot.feather;

import net.digitalingot.vendor.com.google.inject.AbstractModule;
import net.digitalingot.vendor.com.google.inject.multibindings.Multibinder;

public class FeatherSourceFile106 extends AbstractModule {
   protected void configure() {
      Multibinder var1 = Multibinder.newSetBinder(this.binder(), FeatherSourceFile791.class);
      var1.addBinding().to(FeatherSourceFile187.class).asEagerSingleton();
      var1.addBinding().to(FeatherSourceFile767.class).asEagerSingleton();
      var1.addBinding().to(FeatherSourceFile505.class).asEagerSingleton();
      var1.addBinding().to(FeatherSourceFile496.class).asEagerSingleton();
      var1.addBinding().to(FeatherSourceFile750.class).asEagerSingleton();
      var1.addBinding().to(FeatherSourceFile98.class).asEagerSingleton();
      var1.addBinding().to(FeatherSourceFile13.class).asEagerSingleton();
   }
}
