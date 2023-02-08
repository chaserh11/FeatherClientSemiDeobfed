package net.digitalingot.feather;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Consumer;
import net.digitalingot.vendor.javax.inject.Inject;
import net.digitalingot.vendor.javax.inject.Singleton;
import net.minecraft.client.settings.KeyBinding;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Singleton
public class FeatherSourceFile533 implements FeatherSourceFile594 {
   private final FeatherSourceFile665 hb;
   private final FeatherSourceFile143 lk;

   @Inject
   FeatherSourceFile533(FeatherSourceFile665 var1, FeatherSourceFile143 var2) {
      this.hb = var1;
      this.lk = var2;
   }

   public void lh(FeatherSourceFile328 var1, Consumer var2, Consumer var3) {
      this.lk.lh((var3x) -> {
         int[] var4 = Arrays.stream(var3x).mapToObj(FeatherSourceFile766::xy).mapToInt(FeatherSourceFile473::zv).toArray();
         if (Arrays.stream(var4).anyMatch((var0) -> {
            return var0 == 27;
         })) {
            var2.accept(new FeatherSourceFile141(new int[0], "None"));
         } else {
            FeatherSourceFile344 var5 = new FeatherSourceFile344(var3x);
            String var6 = this.lh(var5.va());
            if (var6 != null) {
               var3.accept(new FeatherSourceFile4(var6));
            } else {
               var2.accept(new FeatherSourceFile141(var4, var5.getName()));
            }

         }
      });
   }

   @Nullable
   public @Nullable String lh(int[] var1) {
      String var2 = this.nc(var1);
      return var2 != null ? var2 : this.xj(var1);
   }

   @Nullable
   private @Nullable String nc(int[] var1) {
      KeyBinding[] var2 = FeatherSourceFile93.ly().ps();
      int var3 = var2.length;

      for(int var4 = 0; var4 < var3; ++var4) {
         KeyBinding var5 = var2[var4];
         int var6 = FeatherSourceFile198.lh(var5);
         if (var6 < 0) {
            var6 += 100101;
         }

         if (Arrays.stream(var1).allMatch((var1x) -> {
            return var1x == var6;
         })) {
            return FeatherSourceFile37.lh(var5.func_151464_g()).func_150260_c();
         }
      }

      return null;
   }

   @Nullable
   private @Nullable String xj(int[] var1) {
      Map var2 = this.pk();
      Iterator var3 = var2.entrySet().iterator();

      FeatherSourceFile344 var5;
      String var6;
      do {
         if (!var3.hasNext()) {
            return null;
         }

         Entry var4 = (Entry)var3.next();
         var5 = (FeatherSourceFile344)var4.getKey();
         var6 = (String)var4.getValue();
      } while(!Arrays.equals(var5.va(), var1));

      return var6;
   }

   @NotNull
   private @NotNull Map pk() {
      HashMap var1 = new HashMap();
      Iterator var2 = this.hb.dx().iterator();

      while(true) {
         FeatherSourceFile495 var3;
         do {
            if (!var2.hasNext()) {
               return var1;
            }

            var3 = (FeatherSourceFile495)var2.next();
         } while(!var3.uj());

         FeatherSourceFile136 var4 = var3.pr();
         Field[] var5 = var4.getClass().getDeclaredFields();
         int var6 = var5.length;

         for(int var7 = 0; var7 < var6; ++var7) {
            Field var8 = var5[var7];
            if (var8.getType() == FeatherSourceFile344.class) {
               FeatherSourceFile571 var10 = (FeatherSourceFile571)var8.getDeclaredAnnotation(FeatherSourceFile571.class);

               FeatherSourceFile344 var9;
               try {
                  var9 = (FeatherSourceFile344)var8.get(var4);
               } catch (IllegalAccessException var12) {
                  throw new IllegalStateException(var12);
               }

               var1.put(var9, FeatherSourceFile37.nc(var3.li().kl().jc()) + ": " + FeatherSourceFile37.nc(var10.jc()));
            }
         }
      }
   }

   public FeatherSourceFile754 hc() {
      return FeatherSourceFile754.RECORD_KEYS;
   }
}
