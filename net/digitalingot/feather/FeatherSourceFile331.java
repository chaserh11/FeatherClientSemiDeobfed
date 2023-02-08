package net.digitalingot.feather;

public enum FeatherSourceFile331 {
   @FeatherSourceFile558(
      lb = "outExpo",
      jc = "feather.util.Easing.outExpo"
   )
   OUT_EXPONENTIAL {
      public float calculate(float var1) {
         return (double)Math.abs(var1 - 1.0F) < 1.0E-12 ? 1.0F : 1.0F - (float)Math.pow(2.0, (double)(-10.0F * var1));
      }
   },
   @FeatherSourceFile558(
      lb = "inOutQuad",
      jc = "feather.util.Easing.inOutQuad"
   )
   IN_OUT_QUADRATIC {
      public float calculate(float var1) {
         return (double)var1 < 0.5 ? 2.0F * var1 * var1 : (float)(1.0 - Math.pow((double)(-2.0F * var1 + 2.0F), 2.0) / 2.0);
      }
   },
   @FeatherSourceFile558(
      lb = "inOutCirc",
      jc = "feather.util.Easing.inOutCirc"
   )
   IN_OUR_CIRCULAR {
      public float calculate(float var1) {
         return (float)((double)var1 < 0.5 ? (1.0 - Math.sqrt(1.0 - Math.pow((double)(2.0F * var1), 2.0))) / 2.0 : (Math.sqrt(1.0 - Math.pow((double)(-2.0F * var1 + 2.0F), 2.0)) + 1.0) / 2.0);
      }
   },
   @FeatherSourceFile558(
      lb = "outQuint",
      jc = "feather.util.Easing.outQuint"
   )
   OUT_QUINTIC {
      public float calculate(float var1) {
         return (float)(1.0 - Math.pow((double)(1.0F - var1), 5.0));
      }
   };

   private FeatherSourceFile331() {
   }

   public abstract float calculate(float var1);

   // $FF: synthetic method
   private static FeatherSourceFile331[] $values() {
      return new FeatherSourceFile331[]{OUT_EXPONENTIAL, IN_OUT_QUADRATIC, IN_OUR_CIRCULAR, OUT_QUINTIC};
   }

   // $FF: synthetic method
   FeatherSourceFile331(Object var3) {
      this();
   }
}
