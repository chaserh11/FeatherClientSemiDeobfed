package net.digitalingot.feather;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.net.InetSocketAddress;

public class FeatherSourceFile521 extends TypeAdapter {
   public void lh(JsonWriter var1, InetSocketAddress var2) {
      if (var2 == null) {
         var1.nullValue();
      } else {
         String var3 = var2.getAddress().getHostAddress() + ":" + var2.getPort();
         var1.value(var3);
      }
   }

   public InetSocketAddress ou(JsonReader var1) {
      String var2 = var1.nextString();
      String[] var3 = var2.split(":", 2);
      String var4 = var3[0];
      int var5 = Integer.parseInt(var3[1]);
      return new InetSocketAddress(var4, var5);
   }

   // $FF: synthetic method
   public Object read(JsonReader var1) {
      return this.ou(var1);
   }

   // $FF: synthetic method
   public void write(JsonWriter var1, Object var2) {
      this.lh(var1, (InetSocketAddress)var2);
   }
}
