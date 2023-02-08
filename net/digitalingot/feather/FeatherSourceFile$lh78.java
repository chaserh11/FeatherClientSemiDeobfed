package net.digitalingot.feather;

import java.util.Objects;
import java.util.UUID;
import java.util.regex.Pattern;

class FeatherSourceFile$lh78 {
   private final UUID nY;
   private final String nZ;
   private final String oA;
   private final Pattern oB;

   public FeatherSourceFile$lh78(UUID var1, String var2, String var3) {
      this.nY = var1;
      this.nZ = var2;
      this.oA = var3;
      this.oB = FeatherSourceFile410.bh(var2);
   }

   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 != null && this.getClass() == var1.getClass()) {
         FeatherSourceFile$lh78 var2 = (FeatherSourceFile$lh78)var1;
         return this.nY.equals(var2.nY);
      } else {
         return false;
      }
   }

   public int hashCode() {
      return Objects.hash(new Object[]{this.nY});
   }

   // $FF: synthetic method
   static UUID lh(FeatherSourceFile$lh78 var0) {
      return var0.nY;
   }

   // $FF: synthetic method
   static String nc(FeatherSourceFile$lh78 var0) {
      return var0.oA;
   }

   // $FF: synthetic method
   static String xj(FeatherSourceFile$lh78 var0) {
      return var0.nZ;
   }

   // $FF: synthetic method
   static Pattern oe(FeatherSourceFile$lh78 var0) {
      return var0.oB;
   }
}
