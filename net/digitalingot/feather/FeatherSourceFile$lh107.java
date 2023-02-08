package net.digitalingot.feather;

import io.netty.buffer.ByteBuf;
import java.nio.ByteBuffer;
import java.nio.channels.ReadableByteChannel;

class FeatherSourceFile$lh107 implements ReadableByteChannel {
   private final ByteBuf TA;

   public FeatherSourceFile$lh107(ByteBuf var1) {
      this.TA = var1;
   }

   public int read(ByteBuffer var1) {
      int var2 = this.TA.readerIndex();
      int var3 = var1.remaining();
      int var4 = this.TA.readableBytes();
      if (var3 > var4) {
         var1.limit(var4);
      }

      this.TA.readBytes(var1);
      var1.limit(var3);
      return this.TA.readerIndex() - var2;
   }

   public boolean isOpen() {
      return true;
   }

   public void close() {
   }
}
