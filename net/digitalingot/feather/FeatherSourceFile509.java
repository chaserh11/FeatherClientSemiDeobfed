package net.digitalingot.feather;

import com.google.gson.ExclusionStrategy;
import com.google.gson.FieldAttributes;

public class FeatherSourceFile509 implements ExclusionStrategy {
   public boolean shouldSkipField(FieldAttributes var1) {
      return var1.getDeclaredClass().isAssignableFrom(FeatherSourceFile68.class);
   }

   public boolean shouldSkipClass(Class var1) {
      return var1.isAssignableFrom(FeatherSourceFile68.class);
   }
}
