package net.digitalingot.feather;

import io.netty.buffer.ByteBuf;
import java.util.HashSet;
import java.util.Set;

public class FeatherSourceFile110 implements FeatherSourceFile305 {
   private Set Mx;

   public void lh(ByteBuf var1, FeatherSourceFile$lh27 var2) {
      this.Mx = new HashSet();
      int var3 = FeatherSourceFile590.lh(var1);

      for(int var4 = 0; var4 < var3; ++var4) {
         this.Mx.add(FeatherSourceFile590.oe(var1));
      }

   }

   public void nc(ByteBuf var1, FeatherSourceFile$lh27 var2) {
   }

   public void nc(FeatherSourceFile285 var1) {
      var1.lh(this);
   }

   public Set gK() {
      return this.Mx;
   }
}
