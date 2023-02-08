package net.digitalingot.feather;

import org.cef.browser.CefBrowser;
import org.cef.browser.CefFrame;
import org.cef.callback.CefBeforeDownloadCallback;
import org.cef.callback.CefContextMenuParams;
import org.cef.callback.CefDownloadItem;
import org.cef.callback.CefDownloadItemCallback;
import org.cef.callback.CefJSDialogCallback;
import org.cef.callback.CefMenuModel;
import org.cef.handler.CefContextMenuHandler;
import org.cef.handler.CefDownloadHandler;
import org.cef.handler.CefFocusHandler;
import org.cef.handler.CefJSDialogHandler;
import org.cef.handler.CefLifeSpanHandler;
import org.cef.handler.CefLoadHandler;
import org.cef.handler.CefFocusHandler.FocusSource;
import org.cef.handler.CefJSDialogHandler.JSDialogType;
import org.cef.handler.CefLoadHandler.ErrorCode;
import org.cef.misc.BoolRef;
import org.cef.network.CefRequest.TransitionType;

class FeatherSourceFile183 implements CefContextMenuHandler, CefDownloadHandler, CefFocusHandler, CefJSDialogHandler, CefLifeSpanHandler, CefLoadHandler {
   public void onBeforeContextMenu(CefBrowser var1, CefFrame var2, CefContextMenuParams var3, CefMenuModel var4) {
   }

   public boolean onContextMenuCommand(CefBrowser var1, CefFrame var2, CefContextMenuParams var3, int var4, int var5) {
      return false;
   }

   public void onContextMenuDismissed(CefBrowser var1, CefFrame var2) {
   }

   public void onTakeFocus(CefBrowser var1, boolean var2) {
   }

   public boolean onSetFocus(CefBrowser var1, FocusSource var2) {
      return false;
   }

   public void onGotFocus(CefBrowser var1) {
   }

   public boolean onBeforePopup(CefBrowser var1, CefFrame var2, String var3, String var4) {
      return false;
   }

   public void onAfterCreated(CefBrowser var1) {
   }

   public void onAfterParentChanged(CefBrowser var1) {
   }

   public boolean doClose(CefBrowser var1) {
      return false;
   }

   public void onBeforeClose(CefBrowser var1) {
   }

   public void onLoadingStateChange(CefBrowser var1, boolean var2, boolean var3, boolean var4) {
   }

   public void onLoadStart(CefBrowser var1, CefFrame var2, TransitionType var3) {
   }

   public void onLoadEnd(CefBrowser var1, CefFrame var2, int var3) {
   }

   public void onLoadError(CefBrowser var1, CefFrame var2, ErrorCode var3, String var4, String var5) {
   }

   public boolean onJSDialog(CefBrowser var1, String var2, JSDialogType var3, String var4, String var5, CefJSDialogCallback var6, BoolRef var7) {
      return false;
   }

   public boolean onBeforeUnloadDialog(CefBrowser var1, String var2, boolean var3, CefJSDialogCallback var4) {
      return false;
   }

   public void onResetDialogState(CefBrowser var1) {
   }

   public void onDialogClosed(CefBrowser var1) {
   }

   public void onBeforeDownload(CefBrowser var1, CefDownloadItem var2, String var3, CefBeforeDownloadCallback var4) {
   }

   public void onDownloadUpdated(CefBrowser var1, CefDownloadItem var2, CefDownloadItemCallback var3) {
   }
}
