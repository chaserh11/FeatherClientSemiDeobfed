package net.digitalingot.feather;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

public class FeatherSourceFile$lh129 extends TypeAdapter {
   public void lh(JsonWriter var1, FeatherSourceFile259 var2) {
      var1.beginObject();
      var1.name("name").value(var2.getName());
      var1.name("slug").value(var2.getSlug());
      var1.name("icon").value(var2.getIcon());
      var1.endObject();
   }

   public FeatherSourceFile259 as(JsonReader var1) {
      throw new UnsupportedOperationException("not implemented");
   }

   // $FF: synthetic method
   public Object read(JsonReader var1) {
      return this.as(var1);
   }

   // $FF: synthetic method
   public void write(JsonWriter var1, Object var2) {
      this.lh(var1, (FeatherSourceFile259)var2);
   }
}
