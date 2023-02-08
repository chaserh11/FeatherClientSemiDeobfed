package net.digitalingot.feather;

import java.lang.reflect.Field;
import org.objectweb.asm.ClassVisitor;
import org.objectweb.asm.tree.ClassNode;

public final class FeatherSourceFile393 {
   public static final int SO;

   private FeatherSourceFile393() {
      throw new AssertionError();
   }

   static {
      try {
         Field var0 = ClassVisitor.class.getDeclaredField("api");
         var0.setAccessible(true);
         SO = (Integer)var0.get(new ClassNode());
      } catch (IllegalAccessException | NoSuchFieldException var1) {
         throw new RuntimeException("Unable to find ASM API version");
      }
   }
}
