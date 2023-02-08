package net.digitalingot.feather;

import com.google.gson.Gson;
import net.digitalingot.vendor.javax.inject.Inject;
import net.digitalingot.vendor.javax.inject.Singleton;
import org.jetbrains.annotations.NotNull;

@Singleton
class FeatherSourceFile27 {
   private final Gson cf;
   private final FeatherSourceFile688 bR;
   private final FeatherSourceFile688 bS;

   @Inject
   FeatherSourceFile27(@FeatherSourceFile$lh10 Gson var1, FeatherSourceFile29 var2, FeatherSourceFile310 var3) {
      this.cf = var1;
      this.bR = var2;
      this.bS = var3;
   }

   public @NotNull @NotNull void qy(@NotNull @NotNull FeatherSourceFile145 var1, @NotNull @NotNull FeatherSourceFile275 var2) {
      String var3 = this.cf.toJson(var1);
      switch (var2) {
         case FRONTEND:
            this.bR.qn(var3);
            break;
         case RUST_LAUNCHER:
            this.bS.qn(var3);
      }

   }
}
