package net.digitalingot.feather;

import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import java.util.function.Supplier;
import org.lwjgl.opengl.GL11;

public class FeatherSourceFile288 {
   public static IntBuffer dz(int var0) {
      IntBuffer var1 = FeatherSourceFile441.sp(var0);
      Supplier var2 = () -> {
         int var1x = GL11.glGetError();
         if (var1x != 0) {
            FeatherSourceFile311.Sb.error("[GLTextures] There was an error before creating textures: " + var1x);
         }

         GL11.glGenTextures(var1);
         return GL11.glGetError();
      };

      try {
         int var3;
         if (FeatherSourceFile747.qy()) {
            var3 = (Integer)var2.get();
         } else {
            var3 = (Integer)FeatherSourceFile747.oe().lh(var2).get();
         }

         if (var3 != 0) {
            FeatherSourceFile311.Sb.error("[GLTextures] Error creating textures: " + var3);
            return null;
         } else {
            return var1;
         }
      } catch (Exception var4) {
         return null;
      }
   }

   public static void lh(IntBuffer var0) {
      Supplier var1 = () -> {
         GL11.glDeleteTextures(var0);
         return null;
      };

      try {
         if (FeatherSourceFile747.qy()) {
            var1.get();
         } else {
            FeatherSourceFile747.oe().lh(var1).get();
         }
      } catch (Exception var3) {
      }

   }

   public static int lh(int var0, int var1, int var2, int var3, ByteBuffer var4) {
      Supplier var5 = () -> {
         nc(var0, var1, var2, var3, var4);
         return GL11.glGetError();
      };

      try {
         return FeatherSourceFile747.qy() ? (Integer)var5.get() : (Integer)FeatherSourceFile747.oe().lh(var5).get();
      } catch (Exception var7) {
         return -1;
      }
   }

   public static void nc(int var0, int var1, int var2, int var3, ByteBuffer var4) {
      GL11.glBindTexture(3553, var0);
      GL11.glEnable(3553);
      GL11.glTexParameteri(3553, 10241, 9729);
      GL11.glTexParameteri(3553, 10240, 9729);
      GL11.glTexParameteri(3553, 10242, 10497);
      GL11.glTexParameteri(3553, 10243, 10497);
      GL11.glPixelStorei(3314, 0);
      GL11.glPixelStorei(3316, 0);
      GL11.glPixelStorei(3315, 0);
      var4.rewind();
      short var5;
      if (var1 == 3) {
         var5 = 6407;
         GL11.glPixelStorei(3317, 1);
         FeatherSourceFile311.Sb.error("[GLTexture] RGB format is used to be bugged.");
      } else {
         if (var1 != 4) {
            FeatherSourceFile311.Sb.error("[GLTexture] Only RGB and RGBA are supported");
            return;
         }

         var5 = 6408;
         GL11.glPixelStorei(3317, 4);
      }

      GL11.glTexImage2D(3553, 0, var5, var2, var3, 0, var5, 5121, var4);
      GL11.glBindTexture(3553, 0);
   }
}
