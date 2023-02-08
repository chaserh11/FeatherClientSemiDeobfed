package net.digitalingot.feather;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.util.ArrayList;

public class FeatherSourceFile273 extends TypeAdapter {
   public void lh(JsonWriter var1, FeatherSourceFile344 var2) {
      if (var2 == null) {
         var1.nullValue();
      } else {
         var1.beginObject();
         var1.name("keys");
         var1.beginArray();
         int[] var3 = var2.va();
         int var4 = var3.length;

         for(int var5 = 0; var5 < var4; ++var5) {
            int var6 = var3[var5];
            var1.value((long)FeatherSourceFile766.xy(var6).zv());
         }

         var1.endArray();
         var1.name("display").value(var2.getName());
         var1.endObject();
      }
   }

   public FeatherSourceFile344 pq(JsonReader var1) {
      var1.beginObject();
      ArrayList var2 = new ArrayList();

      while(true) {
         while(var1.hasNext()) {
            String var3 = var1.nextName();
            if (var3.equals("keys")) {
               var1.beginArray();

               while(var1.hasNext()) {
                  var2.add(FeatherSourceFile766.fh(var1.nextInt()).ol());
               }

               var1.endArray();
            } else {
               var1.skipValue();
            }
         }

         var1.endObject();
         return new FeatherSourceFile344(var2.stream().mapToInt((var0) -> {
            return var0;
         }).toArray());
      }
   }

   // $FF: synthetic method
   public Object read(JsonReader var1) {
      return this.pq(var1);
   }

   // $FF: synthetic method
   public void write(JsonWriter var1, Object var2) {
      this.lh(var1, (FeatherSourceFile344)var2);
   }
}
