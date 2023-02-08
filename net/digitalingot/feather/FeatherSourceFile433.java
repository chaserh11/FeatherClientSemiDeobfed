package net.digitalingot.feather;

public class FeatherSourceFile433 extends FeatherSourceFile432 {
   private final long Rb;
   private boolean Rc;

   public FeatherSourceFile433(Runnable var1, boolean var2, long var3, long var5) {
      super(var1, var2, var3);
      this.Rb = var5;
   }

   public long wZ() {
      return this.Rb;
   }

   public void cancel() {
      this.Rc = true;
   }

   public boolean xA() {
      return this.Rc;
   }
}
