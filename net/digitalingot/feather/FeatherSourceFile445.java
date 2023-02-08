package net.digitalingot.feather;

import java.util.function.Function;

public class FeatherSourceFile445 {
   public long RF;
   public long RG;
   private Number RH;
   public Function RI;
   public Number RJ;
   private boolean RK;
   public Runnable RL;

   public void lh(long var1, long var3, Number var5, Function var6, Number var7) {
      this.RF = var1;
      this.RG = var3;
      this.RH = var5;
      this.RI = var6;
      this.RJ = var7;
      this.RL = null;
      this.RK = false;
   }

   public float er(float var1) {
      return this.lh(System.currentTimeMillis(), var1);
   }

   public float lh(long var1, float var3) {
      if (this.RI == null) {
         return var3;
      } else if (this.mr(var1)) {
         if (this.RL != null) {
            this.RL.run();
            this.RL = null;
         }

         return this.RJ.floatValue();
      } else {
         return this.RH.floatValue() + (Float)this.RI.apply(this.mq(var1)) * (this.RJ.floatValue() - this.RH.floatValue());
      }
   }

   public float mq(long var1) {
      return (float)(var1 - this.RF) / (float)this.RG;
   }

   public boolean xY() {
      return this.RK;
   }

   public boolean mr(long var1) {
      return this.RK || (this.RK = var1 >= this.RF + this.RG);
   }
}
