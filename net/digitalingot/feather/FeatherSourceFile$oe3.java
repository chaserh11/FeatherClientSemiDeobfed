package net.digitalingot.feather;

import java.util.Objects;
import org.cache2k.Cache;
import org.cache2k.Cache2kBuilder;

class FeatherSourceFile$oe3 {
   private final Cache oP;

   private FeatherSourceFile$oe3(long var1, FeatherSourceFile$oe$lh var3) {
      Cache2kBuilder var10001 = Cache2kBuilder.of(String.class, String.class).entryCapacity(var1);
      Objects.requireNonNull(var3);
      this.oP = var10001.loader(var3::load).build();
   }

   public String yl(String var1) {
      return (String)this.oP.get(var1);
   }

   public void lf() {
      this.oP.clear();
   }

   // $FF: synthetic method
   FeatherSourceFile$oe3(long var1, FeatherSourceFile$oe$lh var3, Object var4) {
      this(var1, var3);
   }
}
