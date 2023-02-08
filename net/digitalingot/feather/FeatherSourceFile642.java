package net.digitalingot.feather;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Objects;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.function.Function;

class FeatherSourceFile642 extends FeatherSourceFile519 {
   private final Function ek;
   private final Lock lx = new ReentrantLock();
   private Object[] oo;

   FeatherSourceFile642(Class var1, Function var2) {
      this.ek = var2;
      this.oo = (Object[])Array.newInstance(var1, 0);
      this.an();
   }

   void an() {
      this.mv = this.ek.apply(this.oo);
   }

   public void oe(Object var1) {
      Objects.requireNonNull(var1, "Tried to register a null listener!");
      this.lx.lock();

      try {
         this.oo = Arrays.copyOf(this.oo, this.oo.length + 1);
         this.oo[this.oo.length - 1] = var1;
         this.an();
      } finally {
         this.lx.unlock();
      }

   }
}
