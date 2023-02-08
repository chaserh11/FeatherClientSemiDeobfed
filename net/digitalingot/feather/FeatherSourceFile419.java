package net.digitalingot.feather;

import com.google.gson.JsonObject;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import org.apache.commons.io.IOUtils;

public class FeatherSourceFile419 implements FeatherSourceFile842 {
   private final String QQ;

   public FeatherSourceFile419(String var1) {
      this.QQ = var1;
   }

   public InputStream wV() {
      return IOUtils.toInputStream(this.QQ, StandardCharsets.UTF_8);
   }

   public boolean wW() {
      return false;
   }

   public JsonObject jy(String var1) {
      return null;
   }

   public void close() {
   }
}
