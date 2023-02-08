package net.digitalingot.feather;

import java.nio.ByteBuffer;
import java.nio.ShortBuffer;

public class FeatherSourceFile651 {
   private static final byte Ld = -127;
   private static final byte Le = 0;

   public static void lh(byte[] var0, float var1) {
      if (!(Math.abs((double)var1 - 1.0) < 0.001)) {
         for(int var2 = 0; var2 < var0.length; var2 += 2) {
            short var3 = lh(var0[var2], var0[var2 + 1]);
            var3 = (short)((int)((float)var3 * var1));
            var0[var2] = (byte)var3;
            var0[var2 + 1] = (byte)(var3 >> 8);
         }

      }
   }

   public static byte[] lh(byte[] var0, float var1, float var2) {
      byte[] var3 = new byte[var0.length * 2];

      for(int var4 = 0; var4 < var0.length; var4 += 2) {
         short var5 = lh(var0[var4], var0[var4 + 1]);
         short var6 = (short)((int)((float)var5 * var1));
         short var7 = (short)((int)((float)var5 * var2));
         var3[var4 * 2] = (byte)var6;
         var3[var4 * 2 + 1] = (byte)(var6 >> 8);
         var3[var4 * 2 + 2] = (byte)var7;
         var3[var4 * 2 + 3] = (byte)(var7 >> 8);
      }

      return var3;
   }

   public static double oe(byte[] var0) {
      double var1 = -127.0;
      int var3 = var0.length / 10;

      for(int var4 = 0; var4 < var0.length; var4 += var3) {
         double var5 = lh(var0, var4, Math.min(var4 + var3, var0.length));
         if (var5 > var1) {
            var1 = var5;
         }
      }

      return var1;
   }

   public static double lh(byte[] var0, int var1, int var2) {
      double var3;
      for(var3 = 0.0; var1 < var2; var1 += 2) {
         double var5 = (double)lh(var0[var1], var0[var1 + 1]);
         var5 /= 32767.0;
         var3 += var5 * var5;
      }

      int var8 = var2 / 2;
      var3 = var8 == 0 ? 0.0 : Math.sqrt(var3 / (double)var8);
      double var6;
      if (var3 > 0.0) {
         var6 = Math.min(Math.max(20.0 * Math.log10(var3), -127.0), 0.0);
      } else {
         var6 = -127.0;
      }

      return (double)((byte)((int)var6));
   }

   public static short lh(byte var0, byte var1) {
      return (short)((var1 & 255) << 8 | var0 & 255);
   }

   public static byte[] lh(short var0) {
      return new byte[]{(byte)(var0 & 255), (byte)(var0 >> 8 & 255)};
   }

   public static float[] qy(byte[] var0) {
      ShortBuffer var1 = ByteBuffer.wrap(var0).asShortBuffer();
      short[] var2 = new short[var1.capacity()];
      var1.get(var2);
      float[] var3 = new float[var2.length];

      for(int var4 = 0; var4 < var2.length; ++var4) {
         var3[var4] = (float)Short.reverseBytes(var2[var4]) / 32768.0F;
      }

      return var3;
   }

   public static byte[] lh(float[] var0) {
      short[] var1 = new short[var0.length];

      for(int var2 = 0; var2 < var0.length; ++var2) {
         var1[var2] = Short.reverseBytes((short)((int)(var0[var2] * 32768.0F)));
      }

      ByteBuffer var4 = ByteBuffer.wrap(new byte[var1.length * 2]);
      ShortBuffer var3 = var4.asShortBuffer();
      var3.put(var1);
      return var4.array();
   }
}
