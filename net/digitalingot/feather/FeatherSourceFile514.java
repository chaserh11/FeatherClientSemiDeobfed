package net.digitalingot.feather;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.FieldNamingStrategy;
import com.google.gson.annotations.SerializedName;
import java.lang.reflect.Field;

public class FeatherSourceFile514 implements FieldNamingStrategy {
   public String translateName(Field var1) {
      FeatherSourceFile571 var2 = (FeatherSourceFile571)var1.getDeclaredAnnotation(FeatherSourceFile571.class);
      if (var2 != null) {
         return var2.lb();
      } else {
         FeatherSourceFile656 var3 = (FeatherSourceFile656)var1.getDeclaredAnnotation(FeatherSourceFile656.class);
         if (var3 != null) {
            return "nested_" + var3.ox();
         } else {
            SerializedName var4 = (SerializedName)var1.getDeclaredAnnotation(SerializedName.class);
            if (var4 != null) {
               return var4.value();
            } else {
               if (!var1.getType().isAssignableFrom(FeatherSourceFile68.class)) {
                  FeatherSourceFile311.Sb.error(var1 + " translated using FieldNamingPolicy.IDENTITY");
               }

               return FieldNamingPolicy.IDENTITY.translateName(var1);
            }
         }
      }
   }
}
