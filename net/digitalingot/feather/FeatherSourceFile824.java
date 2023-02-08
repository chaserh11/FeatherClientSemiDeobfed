package net.digitalingot.feather;

public class FeatherSourceFile824 implements FeatherSourceFile823 {
   private final float Qh;
   private final float Qi;
   private final float Qj;
   private final float Qk;
   private final int zb;
   private final int pp;

   public FeatherSourceFile824(float var1, float var2, float var3, float var4, int var5, int var6) {
      this.Qh = var1;
      this.Qi = var2;
      this.Qj = var3;
      this.Qk = var4;
      this.zb = var5;
      this.pp = var6;
   }

   public float vW() {
      return this.Qh;
   }

   public float vX() {
      return this.Qi;
   }

   public float vY() {
      return this.Qj;
   }

   public float vZ() {
      return this.Qk;
   }

   public int rl() {
      return this.zb;
   }

   public int fv() {
      return this.pp;
   }

   public float ja(float var1) {
      return this.Qh + var1 * (this.Qj - this.Qh);
   }

   public float qn(float var1) {
      return this.Qi + var1 * (this.Qk - this.Qi);
   }
}
