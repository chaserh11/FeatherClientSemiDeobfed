package net.digitalingot.feather;

import java.util.Objects;
import java.util.function.Consumer;

public class FeatherSourceFile494 implements FeatherSourceFile594 {
   private final FeatherSourceFile39 GE;

   public FeatherSourceFile494(FeatherSourceFile39 var1) {
      this.GE = var1;
   }

   public void lh(FeatherSourceFile251 var1, Consumer var2, Consumer var3) {
      String var4 = var1.tn();
      FeatherSourceFile527 var5 = var1.tl();
      FeatherSourceFile527 var6 = (FeatherSourceFile527)this.GE.sc().stream().filter((var1x) -> {
         return Objects.equals(var1x.getName(), var4);
      }).findFirst().orElse((Object)null);
      if (var4 != null && (var6 != null || var5 != null && !var5.getName().equals(var4))) {
         if (var6 == null) {
            throw new IllegalArgumentException("Chat Tab not found");
         }

         if (var5 != null) {
            var6.xe(var5.getName());
            var6.er(var5.cy());
            var6.cc(var5.cM());
            var6.zd(var5.cN());
            var6.ps(var5.cO());
            var6.mr(var5.cP());
            this.GE.cV();
         } else {
            this.GE.nc(var6);
         }
      } else if (var5 != null) {
         this.GE.lh(var5);
      }

      var2.accept(new FeatherSourceFile12("success"));
   }

   public FeatherSourceFile754 hc() {
      return FeatherSourceFile754.CREATE_UPDATE_CHAT_TAB;
   }
}
