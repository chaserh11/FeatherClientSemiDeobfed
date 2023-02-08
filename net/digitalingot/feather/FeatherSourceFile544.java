package net.digitalingot.feather;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class FeatherSourceFile544 {
   @NotNull
   protected final @NotNull Object iL;

   FeatherSourceFile544(@NotNull @NotNull Object var1) {
      this.iL = var1;
   }

   @NotNull
   public @NotNull Map xc() {
      List var1 = this.di();
      return this.km(var1);
   }

   private List di() {
      FeatherSourceFile726 var1 = new FeatherSourceFile726(this.iL.getClass());
      return var1.di();
   }

   @NotNull
   private @NotNull @NotNull Map km(@NotNull @NotNull List var1) {
      HashMap var2 = new HashMap();
      Iterator var3 = var1.iterator();

      while(var3.hasNext()) {
         FeatherSourceFile712 var4 = (FeatherSourceFile712)var3.next();
         if (var4.mo() != null) {
            var2.putAll(this.oe(var4));
         } else {
            Entry var5 = this.xj(var4);
            if (var5 != null) {
               var2.put((String)var5.getKey(), (String)var5.getValue());
            }
         }
      }

      return var2;
   }

   @Nullable
   private @Nullable @NotNull Entry xj(@NotNull @NotNull FeatherSourceFile712 var1) {
      if (var1.ce().lb().equals("hudSelection")) {
         FeatherSourceFile368 var2 = (FeatherSourceFile368)this.iL.getClass().getDeclaredAnnotation(FeatherSourceFile368.class);
         if (var2 == null || var2.qj().bv().isEmpty()) {
            return null;
         }
      }

      Object var4 = var1.as(this.iL);
      FeatherSourceFile30 var3 = new FeatherSourceFile30(var1, var4);
      return var3.jq();
   }

   private @NotNull Map oe(@NotNull @NotNull FeatherSourceFile712 var1) {
      Object var2 = var1.as(this.iL);
      return FeatherSourceFile261.INSTANCE.create(var2).xc();
   }
}
