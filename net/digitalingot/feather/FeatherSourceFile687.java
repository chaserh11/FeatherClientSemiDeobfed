package net.digitalingot.feather;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import net.digitalingot.vendor.com.google.inject.Inject;
import net.digitalingot.vendor.com.google.inject.Singleton;
import org.cef.browser.CefBrowser;
import org.cef.browser.CefFrame;
import org.cef.handler.CefLoadHandler.ErrorCode;

@Singleton
class FeatherSourceFile687 extends FeatherSourceFile625 {
   @Inject
   FeatherSourceFile687(FeatherSourceFile113 var1, FeatherSourceFile$lh1 var2) {
      super(var1);
      this.lh(var2);
   }

   public void onLoadError(CefBrowser var1, CefFrame var2, ErrorCode var3, String var4, String var5) {
      if (var3 != ErrorCode.ERR_ABORTED) {
         String var6 = null;

         try {
            FeatherSourceFile438 var7 = FeatherSourceFile815.hm("/assets/feather/ui/error.html");

            try {
               var6 = var7.wR();
               var6 = Base64.getEncoder().encodeToString(var6.getBytes(StandardCharsets.UTF_8));
            } catch (Throwable var11) {
               if (var7 != null) {
                  try {
                     var7.close();
                  } catch (Throwable var10) {
                     var11.addSuppressed(var10);
                  }
               }

               throw var11;
            }

            if (var7 != null) {
               var7.close();
            }
         } catch (IOException var12) {
         }

         if (var6 != null) {
            var1.loadURL("data:text/html;base64," + var6 + "#" + var4);
         }

      }
   }
}
