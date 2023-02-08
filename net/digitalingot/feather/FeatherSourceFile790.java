package net.digitalingot.feather;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.awt.Color;
import java.net.InetSocketAddress;
import net.digitalingot.vendor.com.google.inject.AbstractModule;
import net.digitalingot.vendor.com.google.inject.Provides;
import net.digitalingot.vendor.com.google.inject.TypeLiteral;
import net.digitalingot.vendor.com.google.inject.multibindings.Multibinder;
import net.digitalingot.vendor.javax.inject.Singleton;

public class FeatherSourceFile790 extends AbstractModule {
   protected void configure() {
      Multibinder var1 = Multibinder.newSetBinder(this.binder(), new TypeLiteral() {
      });
      var1.addBinding().to(FeatherSourceFile118.class);
      var1.addBinding().to(FeatherSourceFile533.class);
      var1.addBinding().to(FeatherSourceFile50.class);
      var1.addBinding().to(FeatherSourceFile711.class);
      var1.addBinding().to(FeatherSourceFile674.class);
      var1.addBinding().to(FeatherSourceFile467.class);
      var1.addBinding().to(FeatherSourceFile705.class);
      var1.addBinding().to(FeatherSourceFile17.class);
      var1.addBinding().to(FeatherSourceFile42.class);
      var1.addBinding().to(FeatherSourceFile179.class);
      var1.addBinding().to(FeatherSourceFile69.class);
      var1.addBinding().to(FeatherSourceFile740.class);
      var1.addBinding().to(FeatherSourceFile782.class);
      var1.addBinding().to(FeatherSourceFile94.class);
      var1.addBinding().to(FeatherSourceFile550.class);
      var1.addBinding().to(FeatherSourceFile166.class);
      var1.addBinding().to(FeatherSourceFile46.class);
      var1.addBinding().to(FeatherSourceFile255.class);
      var1.addBinding().to(FeatherSourceFile326.class);
      var1.addBinding().to(FeatherSourceFile460.class);
      var1.addBinding().to(FeatherSourceFile734.class);
      var1.addBinding().to(FeatherSourceFile602.class);
      var1.addBinding().to(FeatherSourceFile188.class);
      var1.addBinding().to(FeatherSourceFile613.class);
      var1.addBinding().to(FeatherSourceFile103.class);
      var1.addBinding().to(FeatherSourceFile557.class);
   }

   @Provides
   @Singleton
   @FeatherSourceFile$lh10
   public Gson rm() {
      return (new GsonBuilder()).addSerializationExclusionStrategy(new FeatherSourceFile509()).enableComplexMapKeySerialization().setFieldNamingStrategy(new FeatherSourceFile514()).registerTypeAdapterFactory(new FeatherSourceFile761()).registerTypeAdapter(Color.class, new FeatherSourceFile173()).registerTypeAdapter(FeatherSourceFile225.class, new FeatherSourceFile720()).registerTypeAdapter(InetSocketAddress.class, new FeatherSourceFile521()).registerTypeAdapter(byte[].class, new FeatherSourceFile450()).registerTypeAdapter(FeatherSourceFile344.class, new FeatherSourceFile273()).registerTypeAdapter(FeatherSourceFile259.class, new FeatherSourceFile$lh129()).registerTypeAdapter(FeatherSourceFile112.class, new FeatherSourceFile$nc43()).registerTypeAdapter(FeatherSourceFile219.class, new FeatherSourceFile$xj16()).create();
   }
}
