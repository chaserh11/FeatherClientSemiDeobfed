package net.digitalingot.feather;

import io.netty.buffer.ByteBuf;

public class FeatherSourceFile732 implements FeatherSourceFile305 {
   private int MA;

   public FeatherSourceFile732() {
   }

   public FeatherSourceFile732(int var1) {
      this.MA = var1;
   }

   public void lh(ByteBuf var1, FeatherSourceFile$lh27 var2) {
      this.MA = var1.readInt();
   }

   public void nc(ByteBuf var1, FeatherSourceFile$lh27 var2) {
      var1.writeInt(this.MA);
   }

   public void nc(FeatherSourceFile285 var1) {
      var1.lh(this);
   }

   public int gM() {
      return this.MA;
   }
}
