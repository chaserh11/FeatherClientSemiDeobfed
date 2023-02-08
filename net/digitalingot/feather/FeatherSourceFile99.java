package net.digitalingot.feather;

import java.util.Iterator;
import net.digitalingot.vendor.com.google.inject.AbstractModule;
import net.digitalingot.vendor.com.google.inject.TypeLiteral;
import net.digitalingot.vendor.com.google.inject.multibindings.Multibinder;

public class FeatherSourceFile99 extends AbstractModule {
   protected void configure() {
      this.mh();
      this.dd();
   }

   private void mh() {
      Multibinder var1 = Multibinder.newSetBinder(this.binder(), new TypeLiteral() {
      });
      Iterator var2 = FeatherSourceFile459.jO.iterator();

      while(var2.hasNext()) {
         Class var3 = (Class)var2.next();
         var1.addBinding().to(var3).asEagerSingleton();
      }

   }

   private void dd() {
      Multibinder var1 = Multibinder.newSetBinder(this.binder(), FeatherSourceFile22.class);
      var1.addBinding().to(FeatherSourceFile772.class);
      var1.addBinding().to(FeatherSourceFile54.class);
   }
}
