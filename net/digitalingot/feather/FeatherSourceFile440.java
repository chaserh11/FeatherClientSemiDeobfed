package net.digitalingot.feather;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import org.apache.commons.io.IOUtils;
import org.cef.callback.CefCallback;
import org.cef.handler.CefResourceHandlerAdapter;
import org.cef.misc.IntRef;
import org.cef.misc.StringRef;
import org.cef.network.CefRequest;
import org.cef.network.CefResponse;
import org.jetbrains.annotations.Nullable;

public class FeatherSourceFile440 extends CefResourceHandlerAdapter {
   private final String op;
   @Nullable
   private @Nullable InputStream ka;

   public FeatherSourceFile440(String var1) {
      this.op = var1;
      this.ka = null;
   }

   public boolean processRequest(CefRequest var1, CefCallback var2) {
      this.ka = this.getClass().getResourceAsStream(this.op);
      var2.Continue();
      return true;
   }

   public void getResponseHeaders(CefResponse var1, IntRef var2, StringRef var3) {
      if (this.ka == null) {
         var1.setStatus(404);
      } else {
         var1.setStatus(200);
      }

      var1.setMimeType("text/html");
      HashMap var4 = new HashMap();
      var1.getHeaderMap(var4);
      var4.put("Content-Type", "text/html; charset=utf-8");
      var4.put("Access-Control-Allow-Origin", "*");
      var4.put("Access-Control-Allow-Methods", "GET, OPTIONS");
      var4.put("Cache-Control", "max-age=86400");
      var1.setHeaderMap(var4);
      var2.set(-1);
   }

   public boolean readResponse(byte[] var1, int var2, IntRef var3, CefCallback var4) {
      if (this.ka != null) {
         try {
            int var5 = Math.max(0, this.ka.read(var1, 0, var2));
            var3.set(var5);
            boolean var6 = var5 > 0;
            if (!var6) {
               this.close();
            }

            return var6;
         } catch (IOException var7) {
            var4.cancel();
            return false;
         }
      } else {
         return false;
      }
   }

   public void cancel() {
      this.close();
   }

   private void close() {
      if (this.ka != null) {
         IOUtils.closeQuietly(this.ka);
         this.ka = null;
      }

   }
}
