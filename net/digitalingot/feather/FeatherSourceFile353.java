package net.digitalingot.feather;

import java.nio.ByteBuffer;
import java.util.UUID;

public class FeatherSourceFile353 {
   public static byte[] tx(UUID var0) {
      ByteBuffer var1 = ByteBuffer.wrap(new byte[16]);
      var1.putLong(var0.getMostSignificantBits());
      var1.putLong(var0.getLeastSignificantBits());
      return var1.array();
   }

   public static UUID eg(byte[] var0) {
      long var1 = 0L;
      long var3 = 0L;

      int var5;
      for(var5 = 0; var5 < 8; ++var5) {
         var1 = var1 << 8 | (long)(var0[var5] & 255);
      }

      for(var5 = 8; var5 < 16; ++var5) {
         var3 = var3 << 8 | (long)(var0[var5] & 255);
      }

      return new UUID(var1, var3);
   }
}
