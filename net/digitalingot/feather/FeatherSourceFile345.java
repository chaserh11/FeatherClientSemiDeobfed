package net.digitalingot.feather;

import java.util.Iterator;
import java.util.NavigableMap;
import java.util.TreeMap;
import java.util.Map.Entry;

public class FeatherSourceFile345 {
   private static final NavigableMap SI;
   private static final TreeMap SJ = new TreeMap();

   public static int hc(String var0) {
      var0 = var0.toUpperCase();
      int var1 = 0;
      Iterator var2 = SI.entrySet().iterator();

      while(var2.hasNext()) {
         Entry var3 = (Entry)var2.next();
         String var4 = (String)var3.getValue();

         for(int var5 = (Integer)var3.getKey(); var0.startsWith(var4); var0 = var0.substring(var4.length())) {
            var1 += var5;
         }
      }

      return var1;
   }

   public static String mx(int var0) {
      StringBuilder var1 = new StringBuilder();

      while(var0 > 0) {
         Entry var2 = SJ.floorEntry(var0);
         var0 -= (Integer)var2.getKey();
         var1.append((String)var2.getValue());
      }

      return var1.toString();
   }

   static {
      SJ.put(1, "I");
      SJ.put(4, "IV");
      SJ.put(5, "V");
      SJ.put(9, "IX");
      SJ.put(10, "X");
      SJ.put(40, "XL");
      SJ.put(50, "L");
      SJ.put(90, "XC");
      SJ.put(100, "C");
      SJ.put(400, "CD");
      SJ.put(500, "D");
      SJ.put(900, "CM");
      SJ.put(1000, "M");
      SJ.put(4000, "MV̅");
      SJ.put(5000, "V̅");
      SJ.put(9000, "MX̅");
      SJ.put(10000, "X̅");
      SJ.put(40000, "X̅L̅");
      SJ.put(50000, "L̅");
      SJ.put(90000, "X̅C̅");
      SJ.put(100000, "C̅");
      SJ.put(400000, "C̅D̅");
      SJ.put(500000, "D̅");
      SJ.put(900000, "C̅M̅");
      SJ.put(1000000, "M̅");
      SI = SJ.descendingMap();
   }
}
