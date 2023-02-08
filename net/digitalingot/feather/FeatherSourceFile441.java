package net.digitalingot.feather;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;

public class FeatherSourceFile441 {
   private FeatherSourceFile441() {
      throw new AssertionError();
   }

   public static ByteBuffer bx(int var0) {
      return ByteBuffer.allocateDirect(var0).order(ByteOrder.nativeOrder());
   }

   static int jh(int var0, int var1) {
      return var0 << var1;
   }

   public static IntBuffer sp(int var0) {
      return bx(jh(var0, 2)).asIntBuffer();
   }

   public static FloatBuffer ie(int var0) {
      return bx(jh(var0, 2)).asFloatBuffer();
   }
}
