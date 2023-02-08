package net.digitalingot.feather;

import java.io.Serializable;
import java.nio.FloatBuffer;

public abstract class FeatherSourceFile405 implements Serializable, FeatherSourceFile412 {
   protected FeatherSourceFile405() {
   }

   public final float zJ() {
      return (float)Math.sqrt((double)this.zF());
   }

   public abstract float zF();

   public abstract FeatherSourceFile405 pq(FloatBuffer var1);

   public abstract FeatherSourceFile405 zG();

   public final FeatherSourceFile405 zK() {
      float var1 = this.zJ();
      if (var1 != 0.0F) {
         float var2 = 1.0F / var1;
         return this.ku(var2);
      } else {
         throw new IllegalStateException("Zero length vector");
      }
   }

   public abstract FeatherSourceFile405 as(FloatBuffer var1);

   public abstract FeatherSourceFile405 ku(float var1);
}
