package net.digitalingot.feather;

import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class FeatherSourceFile548 {
   @NotNull
   protected final @NotNull Class iH;
   @Nullable
   protected final @Nullable Map iI;
   @NotNull
   protected final @NotNull String hB;

   FeatherSourceFile548(@NotNull @NotNull Class var1, @Nullable @Nullable Map var2, String var3) {
      this.iH = var1;
      this.iI = var2;
      this.hB = var3;
   }

   @NotNull
   public @NotNull Object vh() {
      List var1 = this.di();
      Map var2 = this.as(var1);
      this.lh(var2);
      return this.nc(var2);
   }

   protected List di() {
      FeatherSourceFile726 var1 = new FeatherSourceFile726(this.iH);
      return var1.di();
   }

   @NotNull
   private @NotNull @NotNull Map as(@NotNull @NotNull List var1) {
      HashMap var2 = new HashMap(var1.size());

      FeatherSourceFile712 var4;
      Object var5;
      for(Iterator var3 = var1.iterator(); var3.hasNext(); var2.put(var4, var5)) {
         var4 = (FeatherSourceFile712)var3.next();
         if (var4.mo() != null) {
            var5 = this.nc(var4);
         } else {
            var5 = this.lh(var4);
         }
      }

      return var2;
   }

   private @NotNull Object lh(@NotNull @NotNull FeatherSourceFile712 var1) {
      String var2 = var1.ce().lb();
      String var3 = this.hB + var2;
      String var4 = this.iI == null ? null : (String)this.iI.get(var3);
      Object var5 = this.ou(var2, var4);
      if (var5 != null) {
         return var5;
      } else {
         FeatherSourceFile727 var6 = new FeatherSourceFile727(var1, var4);
         return var6.dk();
      }
   }

   @Nullable
   protected @Nullable @NotNull @Nullable Object ou(@NotNull @NotNull String var1, @Nullable @Nullable String var2) {
      if (var2 == null && var1.equals("enabled")) {
         FeatherSourceFile368 var3 = this.rz();
         if (var3 != null) {
            return var3.zc();
         }
      }

      return null;
   }

   private Object nc(FeatherSourceFile712 var1) {
      return FeatherSourceFile716.INSTANCE.create(var1, this.iI, var1.mo().ox()).vh();
   }

   private void lh(Map var1) {
      if (var1 == null) {
         throw new IllegalStateException("validateObjects() called before parseObjects()");
      } else {
         Iterator var2 = var1.entrySet().iterator();

         while(var2.hasNext()) {
            Entry var3 = (Entry)var2.next();
            FeatherSourceFile712 var4 = (FeatherSourceFile712)var3.getKey();
            Object var5 = var3.getValue();
            FeatherSourceFile196 var6 = var4.yw();
            if (var6 != null) {
               FeatherSourceFile617 var7 = new FeatherSourceFile617(var4);
               if (!var7.mq(var5)) {
                  FeatherSourceFile727 var8 = new FeatherSourceFile727((FeatherSourceFile712)var3.getKey(), (String)null);
                  var3.setValue(var8.dk());
               }
            }
         }

      }
   }

   private Object nc(Map var1) {
      try {
         Object var2 = this.iH.getConstructor().newInstance();
         Iterator var3 = var1.entrySet().iterator();

         while(var3.hasNext()) {
            Entry var4 = (Entry)var3.next();
            FeatherSourceFile712 var5 = (FeatherSourceFile712)var4.getKey();
            Object var6 = var4.getValue();
            var5.nc(var2, var6);
         }

         return var2;
      } catch (NoSuchMethodException var7) {
         throw new IllegalStateException("The config class has no default constructor.", var7);
      } catch (InstantiationException | InvocationTargetException | IllegalAccessException var8) {
         throw new IllegalStateException(var8);
      }
   }

   @Nullable
   private @Nullable FeatherSourceFile368 rz() {
      return (FeatherSourceFile368)this.iH.getDeclaredAnnotation(FeatherSourceFile368.class);
   }
}
