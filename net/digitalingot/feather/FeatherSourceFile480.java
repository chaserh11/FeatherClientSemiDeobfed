package net.digitalingot.feather;

import io.netty.buffer.ByteBuf;
import java.util.UUID;

public class FeatherSourceFile480 implements FeatherSourceFile305 {
   private UUID MB;
   private byte[] My;

   public void lh(ByteBuf var1, FeatherSourceFile$lh27 var2) {
      this.MB = FeatherSourceFile590.oe(var1);
      this.My = FeatherSourceFile590.xj(var1);
   }

   public void nc(ByteBuf var1, FeatherSourceFile$lh27 var2) {
   }

   public void nc(FeatherSourceFile285 var1) {
      var1.lh(this);
   }

   public byte[] gN() {
      return this.My;
   }

   public UUID gO() {
      return this.MB;
   }
}
