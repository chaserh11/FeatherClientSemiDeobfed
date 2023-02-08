package net.digitalingot.feather;

import org.cef.browser.CefBrowser;
import org.cef.browser.CefFrame;
import org.cef.handler.CefResourceHandler;
import org.cef.handler.CefResourceRequestHandlerAdapter;
import org.cef.network.CefRequest;

class FeatherSourceFile$lh32 extends CefResourceRequestHandlerAdapter {
   private FeatherSourceFile$lh32() {
   }

   public boolean onBeforeResourceLoad(CefBrowser var1, CefFrame var2, CefRequest var3) {
      if (!var3.getURL().startsWith("http://fui-root/")) {
         var3.setURL("http://fui-root/");
      }

      return false;
   }

   public CefResourceHandler getResourceHandler(CefBrowser var1, CefFrame var2, CefRequest var3) {
      return new FeatherSourceFile440("/assets/feather/ui/root.html");
   }

   // $FF: synthetic method
   FeatherSourceFile$lh32(Object var1) {
      this();
   }
}
