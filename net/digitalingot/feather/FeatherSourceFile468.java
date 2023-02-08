package net.digitalingot.feather;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import net.minecraft.util.ResourceLocation;

public class FeatherSourceFile468 extends TypeAdapter {
   public void lh(JsonWriter var1, ResourceLocation var2) {
      throw new IOException("operation unsupported");
   }

   public ResourceLocation lh(JsonReader var1) {
      String var2 = var1.nextString();
      return new ResourceLocation(var2);
   }

   // $FF: synthetic method
   public Object read(JsonReader var1) {
      return this.lh(var1);
   }

   // $FF: synthetic method
   public void write(JsonWriter var1, Object var2) {
      this.lh(var1, (ResourceLocation)var2);
   }
}
