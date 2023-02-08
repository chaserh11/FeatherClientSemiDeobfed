package net.digitalingot.feather;

import com.google.common.collect.Maps;
import io.netty.util.collection.IntObjectHashMap;
import io.netty.util.collection.IntObjectMap;
import java.util.Map;
import java.util.function.Supplier;

public class FeatherSourceFile$lh68 {
   private final FeatherSourceFile$lh27 Ms;
   private final IntObjectMap Mt = new IntObjectHashMap();
   private final Map Mu = Maps.newHashMap();

   FeatherSourceFile$lh68(FeatherSourceFile$lh27 var1) {
      this.Ms = var1;
   }

   private void lh(Class var1, Supplier var2, int var3, boolean var4) {
      Supplier var5 = (Supplier)this.Mt.get(var3);
      if (var5 != null) {
         throw new IllegalArgumentException(String.format("Cannot register packet %s with id %d. Already in use by %s.", var1.getSimpleName(), var3, ((FeatherSourceFile305)var5.get()).getClass().getSimpleName()));
      } else {
         Integer var6 = (Integer)this.Mu.get(var1);
         if (var6 != null) {
            throw new IllegalArgumentException(String.format("%s is already registered with id %d", var1.getSimpleName(), var6));
         } else {
            if (!var4) {
               this.Mt.put(var3, var2);
            }

            this.Mu.put(var1, var3);
         }
      }
   }

   public FeatherSourceFile305 se(int var1) {
      Supplier var2 = (Supplier)this.Mt.get(var1);
      return var2 == null ? null : (FeatherSourceFile305)var2.get();
   }

   public int xj(FeatherSourceFile305 var1) {
      Integer var2 = (Integer)this.Mu.get(var1.getClass());
      if (var2 == null) {
         throw new IllegalArgumentException(String.format("Unable to find packet id for type %s in %s", var1.getClass().getSimpleName(), this.Ms));
      } else {
         return var2;
      }
   }

   // $FF: synthetic method
   static void lh(FeatherSourceFile$lh68 var0, Class var1, Supplier var2, int var3, boolean var4) {
      var0.lh(var1, var2, var3, var4);
   }
}
