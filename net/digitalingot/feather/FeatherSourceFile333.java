package net.digitalingot.feather;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public class FeatherSourceFile333 {
   private FeatherSourceFile333() {
      throw new AssertionError();
   }

   public static DecimalFormat gj(String var0) {
      DecimalFormat var1 = new DecimalFormat(var0, new DecimalFormatSymbols(Locale.ROOT));
      var1.setRoundingMode(RoundingMode.HALF_UP);
      return var1;
   }

   public static void lh(DecimalFormat var0, int var1) {
      var0.setMaximumFractionDigits(var1);
      var0.setMinimumFractionDigits(var1);
   }
}
