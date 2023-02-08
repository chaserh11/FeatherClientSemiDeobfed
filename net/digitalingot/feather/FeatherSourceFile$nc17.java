package net.digitalingot.feather;

import org.cef.browser.CefBrowser;
import org.cef.browser.CefFrame;
import org.cef.handler.CefResourceHandler;
import org.cef.handler.CefResourceRequestHandlerAdapter;
import org.cef.network.CefRequest;

class FeatherSourceFile$nc17 extends CefResourceRequestHandlerAdapter {
   private final FeatherSourceFile65 hu;

   public FeatherSourceFile$nc17(FeatherSourceFile65 var1) {
      this.hu = var1;
   }

   public CefResourceHandler getResourceHandler(CefBrowser var1, CefFrame var2, CefRequest var3) {
      return new FeatherSourceFile58(this.hu);
   }
}
