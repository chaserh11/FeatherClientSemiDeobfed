package net.digitalingot.feather;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.util.ArrayList;

public class FeatherSourceFile450 extends TypeAdapter {
   public void lh(JsonWriter var1, byte[] var2) {
      if (var2 == null) {
         var1.nullValue();
      } else {
         var1.beginArray();
         byte[] var3 = var2;
         int var4 = var2.length;

         for(int var5 = 0; var5 < var4; ++var5) {
            byte var6 = var3[var5];
            int var7 = var6 & 255;
            var1.value((long)var7);
         }

         var1.endArray();
      }
   }

   public byte[] nc(JsonReader var1) {
      var1.beginArray();
      ArrayList var2 = new ArrayList();

      while(var1.peek() == JsonToken.NUMBER) {
         int var3 = var1.nextInt();
         var2.add((byte)var3);
      }

      var1.endArray();
      byte[] var5 = new byte[var2.size()];

      for(int var4 = 0; var4 < var2.size(); ++var4) {
         var5[var4] = (Byte)var2.get(var4);
      }

      return var5;
   }

   // $FF: synthetic method
   public Object read(JsonReader var1) {
      return this.nc(var1);
   }

   // $FF: synthetic method
   public void write(JsonWriter var1, Object var2) {
      this.lh(var1, (byte[])var2);
   }
}
