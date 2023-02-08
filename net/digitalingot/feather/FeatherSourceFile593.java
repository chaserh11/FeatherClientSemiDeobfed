package net.digitalingot.feather;

import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

class FeatherSourceFile593 extends FeatherSourceFile548 {
   @NotNull
   private final @NotNull FeatherSourceFile600 iJ;
   @NotNull
   private final @NotNull FeatherSourceFile712 iK;

   FeatherSourceFile593(@NotNull @NotNull Class var1, @Nullable @Nullable Map var2, @NotNull @NotNull String var3, @NotNull @NotNull FeatherSourceFile712 var4) {
      super(var1, var2, var3);
      this.iK = var4;
      this.iJ = this.qh();
   }

   protected List di() {
      FeatherSourceFile726 var1 = new FeatherSourceFile726(this.iH);
      return var1.lh(this.iK.xq());
   }

   @NotNull
   public @NotNull FeatherSourceFile89 pw() {
      FeatherSourceFile89 var1 = (FeatherSourceFile89)super.vh();
      this.lh(var1);
      return var1;
   }

   @Nullable
   protected @Nullable @NotNull @Nullable Object ou(@NotNull @NotNull String var1, @Nullable @Nullable String var2) {
      return var2 == null && var1.equals(this.hB + "hudEnabled") ? this.iJ.zc() : super.ou(var1, var2);
   }

   private @NotNull void lh(@NotNull @NotNull FeatherSourceFile89 var1) {
      if (this.iI == null || !this.iI.containsKey(this.hB + "hudRelativeX")) {
         FeatherSourceFile637 var2 = this.iJ.xp();
         double var3 = this.iJ.vl();
         double var5 = this.iJ.go();
         double var7 = this.iJ.dc();
         var1.lh(var2, var3, var5, var7);
      }

   }

   @NotNull
   private @NotNull FeatherSourceFile600 qh() {
      FeatherSourceFile600 var1 = (FeatherSourceFile600)this.iK.ad().getAnnotation(FeatherSourceFile600.class);
      return var1;
   }

   // $FF: synthetic method
   @NotNull
   public @NotNull Object vh() {
      return this.pw();
   }
}
