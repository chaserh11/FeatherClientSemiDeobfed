package net.digitalingot.feather;

import com.google.common.base.Preconditions;
import io.netty.buffer.ByteBuf;

public class FeatherSourceFile139 implements FeatherSourceFile305 {
   private String sN;

   public FeatherSourceFile139() {
   }

   public FeatherSourceFile139(String var1) {
      this.sN = (String)Preconditions.checkNotNull(var1, "authToken");
   }

   public void lh(ByteBuf var1, FeatherSourceFile$lh27 var2) {
   }

   public void nc(ByteBuf var1, FeatherSourceFile$lh27 var2) {
      FeatherSourceFile590.lh(var1, (CharSequence)this.sN);
   }

   public void nc(FeatherSourceFile285 var1) {
   }
}
