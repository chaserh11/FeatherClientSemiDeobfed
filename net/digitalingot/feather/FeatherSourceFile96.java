package net.digitalingot.feather;

public class FeatherSourceFile96 extends FeatherSourceFile713 {
   protected String s;

   public FeatherSourceFile96(String var1) {
      this.s = var1;
      this.ku(FeatherSourceFile843.hV());
      this.xm(FeatherSourceFile843.fo(var1));
   }

   protected void wz(float var1) {
      if (!(var1 < 0.1F)) {
         FeatherSourceFile843.wq();
         FeatherSourceFile843.lh(this.s, this.z, this.A, FeatherSourceFile341.mq(255, 255, 255, (int)(var1 * 255.0F)));
         FeatherSourceFile843.jz();
      }
   }
}
