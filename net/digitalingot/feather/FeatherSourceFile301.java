package net.digitalingot.feather;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Multimap;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.function.Consumer;
import net.digitalingot.vendor.javax.inject.Inject;
import net.digitalingot.vendor.javax.inject.Singleton;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Singleton
class FeatherSourceFile301 implements FeatherSourceFile663 {
   @NotNull
   private final @NotNull Gson cf;
   @NotNull
   private final @NotNull FeatherSourceFile508 bK;
   @NotNull
   private final @NotNull FeatherSourceFile27 bL;
   @NotNull
   private final @NotNull FeatherSourceFile434 xj;
   @NotNull
   private final @NotNull Multimap bM = ArrayListMultimap.create();

   @Inject
   FeatherSourceFile301(@FeatherSourceFile$lh10 @NotNull @NotNull Gson var1, @NotNull @NotNull FeatherSourceFile508 var2, Set var3, @NotNull @NotNull FeatherSourceFile27 var4, FeatherSourceFile$nc48 var5, @NotNull @NotNull FeatherSourceFile434 var6) {
      this.xj = var6;
      var5.fe();
      this.cf = var1;
      this.bK = var2;
      this.bL = var4;
      Iterator var7 = var3.iterator();

      while(var7.hasNext()) {
         FeatherSourceFile594 var8 = (FeatherSourceFile594)var7.next();
         this.lh(var8);
      }

   }

   public @NotNull void lh(@NotNull @NotNull FeatherSourceFile594 var1) {
      this.bM.put(var1.hc(), var1);
   }

   public @NotNull @NotNull void lh(@NotNull @NotNull String var1, @NotNull @NotNull FeatherSourceFile275 var2) {
      try {
         FeatherSourceFile145 var3 = (FeatherSourceFile145)this.cf.fromJson(var1, FeatherSourceFile145.class);
         if (var3.ks() == null && var3.su() == null) {
            if (var3.rx() != null) {
               this.lh(var3, var2);
            }
         } else {
            this.nc(var3, var2);
         }
      } catch (Exception var4) {
         FeatherSourceFile311.Sb.error("Failed to handle incoming message", var4);
      }

   }

   private @NotNull @NotNull void lh(@NotNull @NotNull FeatherSourceFile145 var1, @NotNull @NotNull FeatherSourceFile275 var2) {
      FeatherSourceFile754 var3 = var1.rx();

      assert var3 != null;

      Collection var4 = this.bM.get(var3);
      if (!var4.isEmpty()) {
         FeatherSourceFile706 var5;
         if (var1.dh() == null) {
            var5 = null;
         } else {
            var5 = (FeatherSourceFile706)this.cf.fromJson(var1.dh(), var3.getModel());
         }

         Iterator var6 = var4.iterator();

         while(var6.hasNext()) {
            FeatherSourceFile594 var7 = (FeatherSourceFile594)var6.next();
            this.lh(var7, var5, var1.oj(), var2);
         }

      }
   }

   private @NotNull @Nullable @NotNull void lh(@NotNull @NotNull FeatherSourceFile594 var1, @Nullable @Nullable FeatherSourceFile706 var2, int var3, @NotNull @NotNull FeatherSourceFile275 var4) {
      Consumer var5 = (var3x) -> {
         JsonElement var4x = this.cf.toJsonTree(var3x);
         FeatherSourceFile145 var5 = new FeatherSourceFile145(var3, (FeatherSourceFile754)null, (JsonElement)null, var4x, (JsonElement)null);
         this.xj.xj(() -> {
            this.bL.qy(var5, var4);
         });
      };
      Consumer var6 = (var3x) -> {
         JsonElement var4x = this.cf.toJsonTree(var3x);
         FeatherSourceFile145 var5 = new FeatherSourceFile145(var3, (FeatherSourceFile754)null, (JsonElement)null, (JsonElement)null, var4x);
         this.xj.xj(() -> {
            this.bL.qy(var5, var4);
         });
      };

      try {
         var1.lh(var2, var5, var6);
      } catch (Exception var8) {
         FeatherSourceFile311.Sb.error("Exception during executing a callback", var8);
         var6.accept(new FeatherSourceFile4(var8.getClass().getName() + ": " + var8.getMessage()));
      }

   }

   private @NotNull @NotNull void nc(@NotNull @NotNull FeatherSourceFile145 var1, @NotNull @NotNull FeatherSourceFile275 var2) {
      FeatherSourceFile174 var3 = this.bK.lh(var1.oj(), var2);
      if (var3 != null) {
         this.lh(var1, var3);
      }
   }

   private @NotNull @NotNull void lh(@NotNull @NotNull FeatherSourceFile145 var1, @NotNull @NotNull FeatherSourceFile174 var2) {
      Consumer var3 = var2.ve();
      Consumer var4 = var2.tu();
      if (var1.ks() != null && var3 != null) {
         this.lh(var3, var1.ks());
      } else {
         if (var1.su() == null || var4 == null) {
            throw new IllegalStateException("unreachable state (success and failure are null)");
         }

         this.lh(var4, var1.su());
      }

   }

   private @NotNull void lh(@NotNull @NotNull Consumer var1, JsonElement var2) {
      Class var3 = FeatherSourceFile246.lh(var1.getClass(), 0, 0);
      FeatherSourceFile706 var4 = (FeatherSourceFile706)this.cf.fromJson(var2, var3);
      var1.accept(var4);
   }
}
