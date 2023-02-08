package net.digitalingot.feather;

public class FeatherSourceFile$nc55 extends FeatherSourceFile713 {
   private boolean aA;
   private boolean aB;
   // $FF: synthetic field
   final FeatherSourceFile650 Z;

   public FeatherSourceFile$nc55(FeatherSourceFile650 var1, int var2, int var3) {
      super((FeatherSourceFile475)null, var2, var3);
      this.Z = var1;
   }

   protected void am() {
      super.am();
      this.L = this.L || this.aB;
      this.t.L = true;
      if (this.L && !this.aA && FeatherSourceFile845.kx(0)) {
         this.aB = true;
      }

      if (!FeatherSourceFile845.kx(0)) {
         this.aB = false;
      }

      this.aA = FeatherSourceFile845.kx(0);
   }

   public boolean gg() {
      return this.aB;
   }
}
