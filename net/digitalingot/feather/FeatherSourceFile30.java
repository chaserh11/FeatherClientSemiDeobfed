package net.digitalingot.feather;

import com.google.common.collect.Maps;
import java.util.Map.Entry;
import org.jetbrains.annotations.NotNull;

public class FeatherSourceFile30 {
   @NotNull
   private final @NotNull FeatherSourceFile712 iK;
   @NotNull
   private final @NotNull FeatherSourceFile518 iN;
   @NotNull
   private final @NotNull Object iP;

   public FeatherSourceFile30(@NotNull @NotNull FeatherSourceFile712 var1, @NotNull @NotNull Object var2) {
      this.iK = var1;
      this.iN = FeatherSourceFile668.qy(var1.cn());
      if (this.iN == null) {
         throw new IllegalArgumentException("Type " + var1.cn().getName() + " (" + var1 + ") not supported");
      } else {
         this.iP = var2;
      }
   }

   @NotNull
   public @NotNull Entry jq() {
      String var1 = this.iK.ce().lb();
      String var2 = this.iN.km(this.iP);
      String var3;
      if (this.iK.mo() != null) {
         var3 = this.iK.mo().ox().isEmpty() ? "" : this.iK.mo().ox() + ":";
      } else {
         var3 = "";
      }

      return Maps.immutableEntry(var3 + var1, var2);
   }
}
