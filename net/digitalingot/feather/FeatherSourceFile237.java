package net.digitalingot.feather;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FeatherSourceFile237 {
   private static final char Si = '§';
   private static final Pattern Sj = Pattern.compile("(?i)§[0-9A-FK-OR]");
   private static final char Sk = 'r';
   private static final char Sl = 'l';
   private static final char Sm = 'k';
   private static final char Sn = 'm';
   private static final char So = 'n';
   private static final char Sp = 'o';

   private FeatherSourceFile237() {
      throw new AssertionError();
   }

   public static FeatherSourceFile$lh76 tq(String var0) {
      Matcher var1 = Sj.matcher(var0);
      ArrayList var2 = new ArrayList();
      FeatherSourceFile$nc32 var3 = null;

      while(var1.find()) {
         int var4 = var1.start();
         char var5 = var0.charAt(var4 + 1);
         if (var5 == 'r') {
            if (var3 != null) {
               FeatherSourceFile$nc32.lh(var3, var4);
               var2.add(var3);
               var3 = null;
            }
         } else if (nc(var5)) {
            if (var3 != null) {
               if (!FeatherSourceFile$nc32.lh(var3, var5)) {
                  FeatherSourceFile$nc32.lh(var3, var4);
                  var2.add(var3);
                  var3 = FeatherSourceFile$nc32.nc(var3);
                  FeatherSourceFile$nc32.nc(var3, var4 + 2);
               }
            } else {
               var3 = new FeatherSourceFile$nc32();
               FeatherSourceFile$nc32.nc(var3, var4 + 2);
            }

            FeatherSourceFile$nc32.nc(var3, var5);
         } else {
            if (var3 != null) {
               FeatherSourceFile$nc32.lh(var3, var4);
               var2.add(var3);
            }

            var3 = new FeatherSourceFile$nc32();
            FeatherSourceFile$nc32.nc(var3, var4 + 2);
            FeatherSourceFile$nc32.xj(var3, var5);
         }
      }

      if (var3 != null) {
         FeatherSourceFile$nc32.lh(var3, var0.length());
         var2.add(var3);
      }

      return new FeatherSourceFile$lh76(var2);
   }

   private static boolean nc(char var0) {
      // $FF: Couldn't be decompiled
   }
}
