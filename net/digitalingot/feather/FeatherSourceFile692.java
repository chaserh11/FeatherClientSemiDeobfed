package net.digitalingot.feather;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

public final class FeatherSourceFile692 extends TypeAdapter {
   private final Map cd = new HashMap();
   private final Map cl = new HashMap();

   public FeatherSourceFile692(Class var1) {
      Enum[] var2 = (Enum[])var1.getEnumConstants();
      int var3 = var2.length;

      for(int var4 = 0; var4 < var3; ++var4) {
         Enum var5 = var2[var4];
         String var6 = lh((Class)var1, (Object)var5);
         this.cd.put(var6, var5);
         this.cl.put(var5, var6);
      }

   }

   public Enum qy(JsonReader var1) {
      if (var1.peek() == JsonToken.NULL) {
         var1.nextNull();
         return null;
      } else {
         return (Enum)this.cd.get(var1.nextString());
      }
   }

   public void lh(JsonWriter var1, Enum var2) {
      var1.value(var2 == null ? null : (String)this.cl.get(var2));
   }

   private static String lh(Class var0, Object var1) {
      Field var2;
      try {
         var2 = var0.getDeclaredField(var1.toString());
      } catch (NoSuchFieldException var5) {
         throw new IllegalStateException(var5);
      }

      FeatherSourceFile558 var3 = (FeatherSourceFile558)var2.getDeclaredAnnotation(FeatherSourceFile558.class);
      if (var3 != null) {
         return var3.lb();
      } else {
         SerializedName var4 = (SerializedName)var2.getDeclaredAnnotation(SerializedName.class);
         return var4 != null ? var4.value() : var1.toString();
      }
   }

   // $FF: synthetic method
   public Object read(JsonReader var1) {
      return this.qy(var1);
   }

   // $FF: synthetic method
   public void write(JsonWriter var1, Object var2) {
      this.lh(var1, (Enum)var2);
   }
}
