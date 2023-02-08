package net.digitalingot.feather;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.awt.Color;
import org.jetbrains.annotations.NotNull;

public class FeatherSourceFile720 extends TypeAdapter {
   public void lh(JsonWriter var1, FeatherSourceFile225 var2) {
      if (var2 == null) {
         var1.nullValue();
      } else {
         Color var3 = var2.dm();
         String var4;
         if (var3.getAlpha() == 0) {
            var4 = String.format("#%02x%02x%02x", var3.getRed(), var3.getGreen(), var3.getBlue());
         } else {
            var4 = String.format("#%02x%02x%02x%02x", var3.getRed(), var3.getGreen(), var3.getBlue(), var3.getAlpha());
         }

         var1.beginObject();
         var1.name("chroma").value(var2.on());
         var1.name("color").value(var4);
         var1.endObject();
      }
   }

   public FeatherSourceFile225 xj(JsonReader var1) {
      var1.beginObject();
      boolean var2 = false;
      Color var3 = null;

      while(var1.hasNext()) {
         switch (var1.nextName()) {
            case "chroma":
               var2 = var1.nextBoolean();
               break;
            case "color":
               var3 = ps(var1.nextString());
         }
      }

      var1.endObject();
      return new FeatherSourceFile225(var2, var3);
   }

   private static @NotNull Color ps(@NotNull @NotNull String var0) {
      int var1 = Integer.valueOf(var0.substring(1, 3), 16);
      int var2 = Integer.valueOf(var0.substring(3, 5), 16);
      int var3 = Integer.valueOf(var0.substring(5, 7), 16);
      if (var0.length() > 7) {
         int var4 = Integer.valueOf(var0.substring(7, 9), 16);
         return new Color(var1, var2, var3, var4);
      } else {
         return new Color(var1, var2, var3);
      }
   }

   // $FF: synthetic method
   public Object read(JsonReader var1) {
      return this.xj(var1);
   }

   // $FF: synthetic method
   public void write(JsonWriter var1, Object var2) {
      this.lh(var1, (FeatherSourceFile225)var2);
   }
}
