package net.digitalingot.feather;

import com.google.common.collect.ImmutableMap;
import java.awt.Color;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class FeatherSourceFile668 {
   private static final Map iQ = ImmutableMap.builder().put(Boolean.class, new FeatherSourceFile760()).put(Enum.class, new FeatherSourceFile646()).put(Double.class, new FeatherSourceFile135()).put(Float.class, new FeatherSourceFile376()).put(Integer.class, new FeatherSourceFile634()).put(String.class, new FeatherSourceFile56()).put(Color.class, new FeatherSourceFile152()).put(FeatherSourceFile225.class, new FeatherSourceFile64()).put(FeatherSourceFile344.class, new FeatherSourceFile90()).build();

   @Nullable
   static @Nullable @NotNull FeatherSourceFile518 qy(@NotNull @NotNull Class var0) {
      Iterator var1 = iQ.entrySet().iterator();

      Class var3;
      FeatherSourceFile518 var4;
      do {
         if (!var1.hasNext()) {
            return null;
         }

         Entry var2 = (Entry)var1.next();
         var3 = (Class)var2.getKey();
         var4 = (FeatherSourceFile518)var2.getValue();
      } while(!var3.isAssignableFrom(var0));

      return var4;
   }
}
