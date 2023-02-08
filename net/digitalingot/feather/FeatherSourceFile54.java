package net.digitalingot.feather;

import java.io.Closeable;
import net.digitalingot.vendor.javax.inject.Inject;
import org.jitsi.impl.neomedia.codec.audio.opus.Opus;

public class FeatherSourceFile54 implements Closeable, FeatherSourceFile22 {
   private final long LT = Opus.encoder_create(24000, 1);

   @Inject
   FeatherSourceFile54() {
      if (this.LT == 0L) {
         throw new IllegalStateException("Error on creating opus encoder");
      }
   }

   public byte[] pq(byte[] var1) {
      byte[] var2 = new byte[1276];
      int var3 = Opus.encode(this.LT, var1, 0, 480, var2, 0, var2.length);
      if (var3 < 0) {
         throw new IllegalStateException("Failed to encode audio data");
      } else {
         byte[] var4 = new byte[var3];
         System.arraycopy(var2, 0, var4, 0, var3);
         return var4;
      }
   }

   public int io() {
      return 0;
   }

   public void close() {
      Opus.encoder_destroy(this.LT);
   }
}
