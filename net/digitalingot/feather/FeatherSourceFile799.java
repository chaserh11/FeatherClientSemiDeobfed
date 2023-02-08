package net.digitalingot.feather;

import org.cef.browser.CefBrowser;
import org.cef.browser.CefFrame;
import org.cef.handler.CefLoadHandler.ErrorCode;

public class FeatherSourceFile799 extends FeatherSourceFile625 {
   private final FeatherSourceFile124 bl;

   public FeatherSourceFile799(FeatherSourceFile113 var1, FeatherSourceFile124 var2, FeatherSourceFile65 var3, FeatherSourceFile695 var4) {
      super(var1);
      this.gc.removeRequestHandler();
      this.gc.addRequestHandler(new FeatherSourceFile161(var3));
      this.bl = var2;
      this.lh(var4);
   }

   public void onLoadEnd(CefBrowser var1, CefFrame var2, int var3) {
      if (FeatherSourceFile14.nc(var2)) {
         this.lh(var2);
         this.bl.gr(var2.getName());
      }

   }

   public void onLoadError(CefBrowser var1, CefFrame var2, ErrorCode var3, String var4, String var5) {
      if (var3 != ErrorCode.ERR_ABORTED) {
         if (FeatherSourceFile14.nc(var2)) {
            this.bl.qy(var2.getName(), var4);
         }

      }
   }

   private void lh(CefFrame var1) {
      var1.executeJavaScript("!function(){let e=window.name;Object.defineProperty(window,'resourceName',{get:function(){return e},set:function(){}})}();", "internal", 0);
   }
}
