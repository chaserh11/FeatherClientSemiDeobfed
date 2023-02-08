package net.digitalingot.feather;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import org.jetbrains.annotations.Nullable;

public final class FeatherSourceFile246 {
   public static Class lh(Class var0, int var1, int var2) {
      ParameterizedType var3 = (ParameterizedType)var0.getGenericInterfaces()[var1];
      return lh(var3, var2);
   }

   public static Class lh(Class var0, int var1) {
      ParameterizedType var2 = (ParameterizedType)var0.getGenericSuperclass();
      return lh(var2, var1);
   }

   @Nullable
   public static @Nullable Class lh(ParameterizedType var0, int var1) {
      Type var2 = var0.getActualTypeArguments()[var1];
      String var3 = var2.getTypeName();

      try {
         return Class.forName(var3);
      } catch (ClassNotFoundException var5) {
         return null;
      }
   }
}
