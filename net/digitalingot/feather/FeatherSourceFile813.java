package net.digitalingot.feather;

import com.google.gson.JsonObject;
import java.io.ByteArrayInputStream;
import java.io.InputStream;

public class FeatherSourceFile813 implements FeatherSourceFile842 {
   private byte[] QL;
   private final JsonObject QM;

   public FeatherSourceFile813(byte[] var1, boolean var2, boolean var3) {
      this.QL = var1;
      this.QM = nc(var2, var3);
   }

   public void hb(byte[] var1) {
      this.QL = var1;
   }

   public InputStream wV() {
      return new ByteArrayInputStream(this.QL);
   }

   public boolean wW() {
      return true;
   }

   public JsonObject jy(String var1) {
      return this.QM;
   }

   public void close() {
   }

   private static JsonObject nc(boolean var0, boolean var1) {
      JsonObject var2 = new JsonObject();
      var2.addProperty("blur", var0);
      var2.addProperty("clamp", var1);
      return var2;
   }
}
