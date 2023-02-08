package net.digitalingot.feather;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

public class FeatherSourceFile761 implements TypeAdapterFactory {
   public TypeAdapter create(Gson var1, TypeToken var2) {
      Class var3 = var2.getRawType();
      if (Enum.class.isAssignableFrom(var3) && var3 != Enum.class) {
         if (!var3.isEnum()) {
            var3 = var3.getSuperclass();
         }

         return new FeatherSourceFile692(var3);
      } else {
         return null;
      }
   }
}
