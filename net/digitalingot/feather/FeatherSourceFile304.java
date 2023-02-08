package net.digitalingot.feather;

import net.digitalingot.vendor.javax.inject.Inject;
import net.digitalingot.vendor.javax.inject.Singleton;

@Singleton
@FeatherSourceFile3(
   jj = FeatherSourceFile243.NAMETAGS,
   kl = @FeatherSourceFile414(
   jc = "feather.modulename.nametags",
   jl = "https://assets.feathercdn.net/game/mods/nametags.svg",
   od = "feather.moduledescription.nametags",
   wr = {}
)
)
public class FeatherSourceFile304 extends FeatherSourceFile495 {
   public static int nD = 90;
   public static int nE = 145;
   private boolean nF = true;
   private final FeatherSourceFile55 kQ;

   @Inject
   FeatherSourceFile304(FeatherSourceFile55 var1) {
      this.kQ = var1;
   }

   public void ex() {
      this.kQ.lh(() -> {
         return ((FeatherSourceFile$lh80)this.fS).nH;
      }, () -> {
         this.nF = !this.nF;
      });
   }

   public boolean pi() {
      return this.nF;
   }
}
