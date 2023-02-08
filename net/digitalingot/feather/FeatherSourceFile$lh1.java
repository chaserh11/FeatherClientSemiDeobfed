package net.digitalingot.feather;

import net.digitalingot.vendor.javax.inject.Inject;
import net.digitalingot.vendor.javax.inject.Provider;
import net.digitalingot.vendor.javax.inject.Singleton;
import org.cef.browser.CefBrowser;
import org.cef.browser.CefFrame;
import org.cef.callback.CefQueryCallback;
import org.cef.handler.CefMessageRouterHandlerAdapter;

@Singleton
public class FeatherSourceFile$lh1 extends CefMessageRouterHandlerAdapter {
   private final Provider bI;
   private final FeatherSourceFile434 xj;

   @Inject
   FeatherSourceFile$lh1(Provider var1, FeatherSourceFile434 var2) {
      this.bI = var1;
      this.xj = var2;
   }

   public boolean onQuery(CefBrowser var1, CefFrame var2, long var3, String var5, boolean var6, CefQueryCallback var7) {
      if (FeatherSourceFile747.as()) {
         FeatherSourceFile311.Sb.info("FE Channel -> " + var5);
      } else {
         FeatherSourceFile311.Sb.debug("FE Channel -> " + var5);
      }

      this.xj.xj(() -> {
         ((FeatherSourceFile663)this.bI.get()).lh(var5, FeatherSourceFile275.FRONTEND);
      });
      var7.success((String)null);
      return true;
   }
}
