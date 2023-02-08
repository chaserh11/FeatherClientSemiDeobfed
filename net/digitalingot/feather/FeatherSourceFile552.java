package net.digitalingot.feather;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Consumer;
import net.digitalingot.vendor.javax.inject.Inject;
import net.digitalingot.vendor.javax.inject.Singleton;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Singleton
public class FeatherSourceFile552 implements FeatherSourceFile253 {
   private final Gson cf;
   private final FeatherSourceFile508 bK;
   private final FeatherSourceFile27 bL;
   @NotNull
   private final @NotNull AtomicInteger bU = new AtomicInteger();

   @Inject
   FeatherSourceFile552(@FeatherSourceFile$lh10 Gson var1, FeatherSourceFile508 var2, FeatherSourceFile27 var3) {
      this.cf = var1;
      this.bK = var2;
      this.bL = var3;
   }

   public @NotNull @Nullable @Nullable @NotNull void lh(@NotNull @NotNull FeatherSourceFile706 var1, @Nullable @Nullable Consumer var2, @Nullable @Nullable Consumer var3, @NotNull @NotNull FeatherSourceFile275 var4) {
      int var5 = this.bU.incrementAndGet();
      if (var2 != null || var3 != null) {
         FeatherSourceFile174 var6 = new FeatherSourceFile174(var2, var3);
         this.bK.lh(var5, var4, var6);
      }

      JsonElement var8 = this.cf.toJsonTree(var1);
      FeatherSourceFile145 var7 = new FeatherSourceFile145(var5, var1.hc(), var8, (JsonElement)null, (JsonElement)null);
      this.bL.qy(var7, var4);
   }
}
