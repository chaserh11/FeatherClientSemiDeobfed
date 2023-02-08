package net.digitalingot.feather;

import io.netty.buffer.ByteBuf;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;

class FeatherSourceFile$lh77 implements WritableByteChannel {
   private final ByteBuf TB;

   public FeatherSourceFile$lh77(ByteBuf var1) {
      this.TB = var1;
   }

   public int write(ByteBuffer var1) {
      int var2 = this.TB.writerIndex();
      this.TB.writeBytes(var1);
      return this.TB.writerIndex() - var2;
   }

   public boolean isOpen() {
      return true;
   }

   public void close() {
   }
}
