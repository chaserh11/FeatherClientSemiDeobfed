package net.digitalingot.feather;

import org.cef.CefClient;
import org.cef.browser.CefBrowser;
import org.cef.browser.CefFrame;
import org.cef.browser.CefMessageRouter;
import org.cef.callback.CefContextMenuParams;
import org.cef.callback.CefDownloadItem;
import org.cef.callback.CefDownloadItemCallback;
import org.cef.callback.CefJSDialogCallback;
import org.cef.callback.CefMenuModel;
import org.cef.handler.CefMessageRouterHandler;
import org.cef.handler.CefFocusHandler.FocusSource;
import org.cef.handler.CefJSDialogHandler.JSDialogType;
import org.cef.misc.BoolRef;

class FeatherSourceFile625 extends FeatherSourceFile183 {
   protected final CefClient gc;

   FeatherSourceFile625(FeatherSourceFile113 var1) {
      CefClient var2 = var1.pd();
      var2.removeLifeSpanHandler();
      var2.addLifeSpanHandler(this);
      var2.removeContextMenuHandler();
      var2.addContextMenuHandler(this);
      var2.removeFocusHandler();
      var2.addFocusHandler(this);
      var2.removeLoadHandler();
      var2.addLoadHandler(this);
      var2.removeJSDialogHandler();
      var2.addJSDialogHandler(this);
      var2.removeDownloadHandler();
      var2.addDownloadHandler(this);
      this.gc = var2;
   }

   public void onBeforeContextMenu(CefBrowser var1, CefFrame var2, CefContextMenuParams var3, CefMenuModel var4) {
      var4.clear();
   }

   public boolean onSetFocus(CefBrowser var1, FocusSource var2) {
      return var2 != FocusSource.FOCUS_SOURCE_SYSTEM;
   }

   public boolean onBeforePopup(CefBrowser var1, CefFrame var2, String var3, String var4) {
      return true;
   }

   public void onAfterCreated(CefBrowser var1) {
      FeatherSourceFile104 var2 = (FeatherSourceFile104)var1;
      var2.yn();
      var1.setFocus(false);
   }

   public boolean onJSDialog(CefBrowser var1, String var2, JSDialogType var3, String var4, String var5, CefJSDialogCallback var6, BoolRef var7) {
      var7.set(true);
      return false;
   }

   public boolean onBeforeUnloadDialog(CefBrowser var1, String var2, boolean var3, CefJSDialogCallback var4) {
      var4.Continue(true, "");
      return true;
   }

   public void onDownloadUpdated(CefBrowser var1, CefDownloadItem var2, CefDownloadItemCallback var3) {
      var3.cancel();
   }

   protected void lh(CefMessageRouterHandler var1) {
      CefMessageRouter var2 = CefMessageRouter.create();
      var2.addHandler(var1, true);
      this.gc.addMessageRouter(var2);
   }

   public FeatherSourceFile104 eg(String var1) {
      CefBrowser var2 = this.gc.createBrowser(var1);
      var2.createImmediately();
      return (FeatherSourceFile104)var2;
   }

   public void cm() {
      this.gc.dispose();
   }
}
