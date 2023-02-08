package net.digitalingot.feather;

import java.lang.reflect.Field;

public class FeatherSourceFile584 extends RuntimeException {
   public FeatherSourceFile584(String var1) {
      super(var1);
   }

   public FeatherSourceFile584(Field var1, Class var2) {
      super("Field " + var1.getName() + " is missing annotation " + var2.getName());
   }

   public FeatherSourceFile584(Class var1, Class var2) {
      super("Class " + var1.getName() + " is missing annotation " + var2.getName());
   }
}
