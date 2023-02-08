package net.digitalingot.feather;

import java.util.List;
import java.util.UUID;
import net.digitalingot.vendor.javax.inject.Inject;
import org.jetbrains.annotations.NotNull;

public class FeatherSourceFile77 implements FeatherSourceFile832 {
   @NotNull
   private final @NotNull FeatherSourceFile35 MV;
   @NotNull
   private final @NotNull FeatherSourceFile676 xA;

   @Inject
   FeatherSourceFile77(@NotNull @NotNull FeatherSourceFile35 var1, @NotNull @NotNull FeatherSourceFile676 var2) {
      this.MV = var1;
      this.xA = var2;
   }

   public void lh(UUID var1, List var2, FeatherSourceFile$nc10 var3) {
      FeatherSourceFile628 var4 = new FeatherSourceFile628(var1, var2, var3);
      this.xA.nc(var4);
      this.MV.lh(var4);
   }

   public void lh(int var1, UUID var2) {
      FeatherSourceFile627 var3 = new FeatherSourceFile627(var1, var2);
      this.xA.hA().add(var3);
      this.MV.lh(var3);
   }

   public void mr(UUID var1) {
      this.MV.mr(var1);
   }

   public void N() {
      this.xA.nc((FeatherSourceFile628)null);
      this.MV.N();
   }
}
