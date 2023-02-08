package net.digitalingot.feather;

import java.nio.ByteBuffer;
import org.lwjgl.opengl.ARBVertexBufferObject;
import org.lwjgl.opengl.GL15;

public class FeatherSourceFile820 {
   public static boolean PX;
   public static boolean PY;

   public static void lh(int var0, long var1, ByteBuffer var3) {
      if (PY) {
         if (PX) {
            ARBVertexBufferObject.glBufferSubDataARB(var0, var1, var3);
         } else {
            GL15.glBufferSubData(var0, var1, var3);
         }
      }

   }
}
