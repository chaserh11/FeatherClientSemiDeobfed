package net.digitalingot.feather;

import java.nio.file.Path;
import net.digitalingot.vendor.com.google.inject.AbstractModule;
import net.digitalingot.vendor.com.google.inject.Provides;
import net.digitalingot.vendor.com.google.inject.Singleton;

public class FeatherSourceFile569 extends AbstractModule {
   protected void configure() {
      this.bind(FeatherSourceFile124.class).asEagerSingleton();
   }

   @Provides
   @Singleton
   @FeatherSourceFile$lh8
   static String oe(@FeatherSourceFile$lh112 Path var0) {
      return var0.resolve("cef_cache").toAbsolutePath().toString();
   }

   @Provides
   @Singleton
   @FeatherSourceFile$nc7
   static boolean lh(FeatherSourceFile113 var0) {
      return var0.qi();
   }

   @Provides
   @FeatherSourceFile$xj
   @Singleton
   static String ar() {
      if (FeatherSourceFile747.pq()) {
         return System.getenv("FEATHER_LOCAL_TEST") != null ? "http://127.0.0.1:4200/" : "https://ig-client.feathermc.com/";
      } else {
         switch (FeatherSourceFile18.lh) {
            case IDE:
               return "https://ig-client.feathermc.com/";
            case DEVELOPMENT:
               return "https://dev.mc-webapp.feathermc.com/";
            case BETA:
               return "https://beta.mc-webapp.feathermc.com/";
            default:
               return "https://mc-webapp.feathermc.com/";
         }
      }
   }
}
