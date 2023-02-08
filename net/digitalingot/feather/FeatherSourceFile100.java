package net.digitalingot.feather;

import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import net.digitalingot.vendor.javax.inject.Inject;
import net.digitalingot.vendor.javax.inject.Provider;
import net.digitalingot.vendor.javax.inject.Singleton;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Singleton
public class FeatherSourceFile100 {
   @NotNull
   private final @NotNull FeatherSourceFile676 xA;
   @NotNull
   private final @NotNull FeatherSourceFile700 ch;
   @NotNull
   private final @NotNull Provider xB;
   private long xC;

   @Inject
   FeatherSourceFile100(@NotNull @NotNull FeatherSourceFile676 var1, @NotNull @NotNull FeatherSourceFile700 var2, @NotNull @NotNull Provider var3) {
      this.xA = var1;
      this.ch = var2;
      this.xB = var3;
   }

   public void fe() {
      FeatherSourceFile182 var1 = (FeatherSourceFile182)this.xB.get();
      FeatherSourceFile519 var10000 = FeatherSourceFile653.ws;
      Objects.requireNonNull(var1);
      var10000.oe(var1::lh);
      FeatherSourceFile603.ws.oe(() -> {
         this.xA.nc((FeatherSourceFile628)null);
      });
   }

   @Nullable
   public @Nullable @Nullable FeatherSourceFile627 rb(@Nullable @Nullable String var1) {
      FeatherSourceFile627 var2 = null;
      List var3 = this.xA.hA();
      if (var1 == null) {
         var2 = var3.size() != 0 ? (FeatherSourceFile627)var3.remove(0) : null;
      } else {
         UUID var4 = this.ch.mq(var1);
         if (var4 == null) {
            return null;
         }

         Iterator var5 = var3.iterator();

         while(var5.hasNext()) {
            FeatherSourceFile627 var6 = (FeatherSourceFile627)var5.next();
            if (var6.hD().equals(var4)) {
               var2 = var6;
               var5.remove();
               break;
            }
         }
      }

      return var2;
   }

   @NotNull
   public @NotNull FeatherSourceFile676 L() {
      return this.xA;
   }

   public void oe(long var1) {
      this.xC = var1;
   }

   public boolean M() {
      return System.currentTimeMillis() - this.xC < TimeUnit.SECONDS.toMillis(3L);
   }
}
