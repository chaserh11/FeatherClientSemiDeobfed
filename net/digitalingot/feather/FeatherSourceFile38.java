package net.digitalingot.feather;

import io.netty.buffer.ByteBuf;
import java.util.Iterator;
import java.util.Set;
import java.util.UUID;

public class FeatherSourceFile38 implements FeatherSourceFile305 {
   private Set Mx;
   private byte[] My;

   public FeatherSourceFile38() {
   }

   public FeatherSourceFile38(Set var1, byte[] var2) {
      this.Mx = var1;
      this.My = var2;
   }

   public void lh(ByteBuf var1, FeatherSourceFile$lh27 var2) {
   }

   public void nc(ByteBuf var1, FeatherSourceFile$lh27 var2) {
      FeatherSourceFile590.lh(var1, this.Mx.size());
      Iterator var3 = this.Mx.iterator();

      while(var3.hasNext()) {
         UUID var4 = (UUID)var3.next();
         FeatherSourceFile590.lh(var1, var4);
      }

      FeatherSourceFile590.lh(var1, this.My);
   }

   public void nc(FeatherSourceFile285 var1) {
   }
}
