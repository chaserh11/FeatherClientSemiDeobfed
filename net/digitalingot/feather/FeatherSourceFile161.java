package net.digitalingot.feather;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.Locale;
import org.cef.browser.CefBrowser;
import org.cef.browser.CefFrame;
import org.cef.handler.CefRequestHandlerAdapter;
import org.cef.handler.CefResourceRequestHandler;
import org.cef.misc.BoolRef;
import org.cef.network.CefRequest;
import org.cef.network.CefRequest.TransitionType;

class FeatherSourceFile161 extends CefRequestHandlerAdapter {
   private final FeatherSourceFile$lh32 bi = new FeatherSourceFile$lh32();
   private final FeatherSourceFile$nc17 fj;

   public FeatherSourceFile161(FeatherSourceFile65 var1) {
      this.fj = new FeatherSourceFile$nc17(var1);
   }

   public boolean onBeforeBrowse(CefBrowser var1, CefFrame var2, CefRequest var3, boolean var4, boolean var5) {
      return var2.isMain() && var3.getTransitionType() != TransitionType.TT_EXPLICIT;
   }

   public boolean onOpenURLFromTab(CefBrowser var1, CefFrame var2, String var3, boolean var4) {
      return true;
   }

   public CefResourceRequestHandler getResourceRequestHandler(CefBrowser var1, CefFrame var2, CefRequest var3, boolean var4, boolean var5, String var6, BoolRef var7) {
      URI var8;
      try {
         var8 = new URI(var3.getURL());
      } catch (URISyntaxException var11) {
         var7.set(true);
         return null;
      }

      switch (var8.getScheme().toLowerCase(Locale.ROOT)) {
         case "http":
         case "https":
            CefFrame var12 = var2.getParent();
            if (var12 == null) {
               return this.bi;
            } else {
               if (var12.getParent() == null && var8.getHost().equalsIgnoreCase(var2.getName())) {
                  return this.fj;
               }

               return null;
            }
         case "data":
         case "ws":
         case "wss":
            return null;
         default:
            var7.set(true);
            return null;
      }
   }
}
