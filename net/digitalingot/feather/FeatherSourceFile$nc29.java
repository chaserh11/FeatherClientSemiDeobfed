package net.digitalingot.feather;

import net.minecraft.client.settings.KeyBinding;

class FeatherSourceFile$nc29 extends FeatherSourceFile$oe4 {
   private String Cr;
   private float Cs;
   private float Ct;

   public FeatherSourceFile$nc29(FeatherSourceFile$ou1 var1, FeatherSourceFile$qy1 var2, KeyBinding var3) {
      super(var1, var2, var3);
   }

   public void xj(float var1, float var2) {
      super.xj(var1, var2);
      if (this.Cu.CO == FeatherSourceFile$ou$lh2.WITH_CLICKS) {
         this.CH -= 2.0F;
         if (this.Cr != null) {
            this.bD();
         }
      }

   }

   public void kx(String var1) {
      this.Cr = var1;
      this.bD();
   }

   private void bD() {
      float var1 = (float)FeatherSourceFile843.fo(this.Cr) / 2.0F;
      this.Cs = this.CC + (FeatherSourceFile$xj9.access$3200(FeatherSourceFile$qy1.access$3000(this.Cv)) - var1) / 2.0F;
      this.Ct = this.CH + 7.0F + 1.0F;
      this.Cs *= 2.0F;
      this.Ct *= 2.0F;
   }

   // $FF: synthetic method
   static String lh(FeatherSourceFile$nc29 var0) {
      return var0.Cr;
   }

   // $FF: synthetic method
   static float nc(FeatherSourceFile$nc29 var0) {
      return var0.Cs;
   }

   // $FF: synthetic method
   static float xj(FeatherSourceFile$nc29 var0) {
      return var0.Ct;
   }
}
