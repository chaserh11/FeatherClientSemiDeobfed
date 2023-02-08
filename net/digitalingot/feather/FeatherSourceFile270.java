package net.digitalingot.feather;

public abstract class FeatherSourceFile270 {
   protected int Vj;
   protected final int Vk;

   public FeatherSourceFile270(int var1) {
      this.Vk = var1;
   }

   public int zX() {
      long var1 = System.currentTimeMillis();
      if (this instanceof FeatherSourceFile268) {
         return (int)(var1 / (long)this.qp(0) % (long)this.Vk);
      } else {
         FeatherSourceFile272 var3 = (FeatherSourceFile272)this;
         long var4 = var1 % (long)var3.Aj();
         int var6 = this.Vj;
         int var7 = var3.gk(var6) - var3.qp(var6);
         if ((long)var7 > var4) {
            var6 = 0;
         }

         while(var4 >= (long)var3.gk(var6 % this.Vk)) {
            ++var6;
         }

         this.Vj = var6;
         return var6;
      }
   }

   public int zZ() {
      return this.Vk;
   }

   public abstract int qp(int var1);
}
