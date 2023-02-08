package net.digitalingot.feather;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;
import javax.sound.sampled.FloatControl;
import net.digitalingot.vendor.javax.inject.Inject;
import net.digitalingot.vendor.javax.inject.Singleton;
import org.jetbrains.annotations.NotNull;

@Singleton
public class FeatherSourceFile70 implements FeatherSourceFile148 {
   @NotNull
   private final @NotNull Map JQ = new ConcurrentHashMap();
   private final FeatherSourceFile359 JR = FeatherSourceFile361.lh(() -> {
      return (List)this.JQ.values().stream().filter(FeatherSourceFile264::fT).map((var0) -> {
         return new FeatherSourceFile632(var0.fX(), var0.me());
      }).collect(Collectors.toList());
   }, 200L);

   @Inject
   FeatherSourceFile70() {
   }

   private @NotNull void lh(@NotNull @NotNull FeatherSourceFile264 var1) {
      this.JQ.put(var1.fX(), var1);
   }

   public @NotNull @NotNull void lh(@NotNull @NotNull UUID var1, @NotNull @NotNull FeatherSourceFile526 var2) {
      FeatherSourceFile264 var3 = (FeatherSourceFile264)this.JQ.get(var1);
      if (var3 != null) {
         var3.fV().add(var2);
      } else {
         var3 = FeatherSourceFile264.ug(var1);
         this.lh(var3);
         var3.fV().add(var2);
         var3.start();
      }

   }

   public @NotNull void lt(@NotNull @NotNull UUID var1) {
      this.JQ.remove(var1);
   }

   public void rp(float var1) {
      Iterator var2 = this.JQ.values().iterator();

      while(var2.hasNext()) {
         FeatherSourceFile264 var3 = (FeatherSourceFile264)var2.next();
         FloatControl var4 = var3.fW();
         var4.setValue(var1 * 40.0F / 100.0F - 35.0F);
         var3.fU();
      }

   }

   public void eJ() {
      Iterator var1 = this.JQ.values().iterator();

      while(var1.hasNext()) {
         FeatherSourceFile264 var2 = (FeatherSourceFile264)var1.next();
         var2.close();
      }

      this.JQ.clear();
   }

   public @NotNull boolean hb(@NotNull @NotNull UUID var1) {
      return this.eK().stream().anyMatch((var1x) -> {
         return var1x.oa().equals(var1);
      });
   }

   public List eK() {
      return (List)this.JR.call();
   }
}
