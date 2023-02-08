package net.digitalingot.feather;

public class FeatherSourceFile329 {
   private boolean RX = false;
   private Runnable RY = null;

   public void qy(Runnable var1) {
      if (this.RY == null) {
         this.RY = var1;
      }

   }

   public void zr() {
      if (!this.RX) {
         this.RY.run();
         this.RX = true;
      }

   }

   public void ir() {
      this.RX = false;
   }

   public boolean yF() {
      return this.RX;
   }
}
