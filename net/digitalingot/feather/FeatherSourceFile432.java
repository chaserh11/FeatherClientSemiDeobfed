package net.digitalingot.feather;

public class FeatherSourceFile432 {
   private final Runnable Rd;
   private final boolean Re;
   private long Rf;

   public FeatherSourceFile432(Runnable var1, boolean var2, long var3) {
      this.Rd = var1;
      this.Re = var2;
      this.Rf = var3;
   }

   public boolean xB() {
      return --this.Rf <= 0L;
   }

   public Runnable xC() {
      return this.Rd;
   }

   public boolean xD() {
      return this.Re;
   }

   public void km(long var1) {
      this.Rf = var1;
   }

   public long xE() {
      return this.Rf;
   }
}
