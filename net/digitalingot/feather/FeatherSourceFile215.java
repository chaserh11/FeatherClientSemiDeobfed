package net.digitalingot.feather;

import io.netty.buffer.ByteBuf;
import java.util.HashSet;
import java.util.Set;

public class FeatherSourceFile215 implements FeatherSourceFile305 {
   private Set Mx;

   public FeatherSourceFile215() {
   }

   public FeatherSourceFile215(Set var1) {
      this.Mx = var1;
   }

   public void lh(ByteBuf var1, FeatherSourceFile$lh27 var2) {
      int var3 = FeatherSourceFile590.lh(var1);
      this.Mx = new HashSet();

      for(int var4 = 0; var4 < var3; ++var4) {
         this.Mx.add(FeatherSourceFile590.oe(var1));
      }

   }

   public void nc(ByteBuf var1, FeatherSourceFile$lh27 var2) {
      FeatherSourceFile590.lh(var1, this.Mx.size());
      this.Mx.forEach((var1x) -> {
         FeatherSourceFile590.lh(var1, var1x);
      });
   }

   public void nc(FeatherSourceFile285 var1) {
   }

   public Set gK() {
      return this.Mx;
   }
}
