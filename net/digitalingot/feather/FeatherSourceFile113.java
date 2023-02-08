package net.digitalingot.feather;

import java.util.ArrayList;
import net.digitalingot.cef.SharedTextureSupport;
import net.digitalingot.vendor.com.google.inject.Inject;
import net.digitalingot.vendor.com.google.inject.Singleton;
import org.cef.CefApp;
import org.cef.CefClient;
import org.cef.CefSettings;
import org.cef.CefApp.CefAppState;
import org.cef.CefSettings.LogSeverity;
import org.cef.browser.CefBrowserFactory;
import org.cef.callback.CefCommandLine;

@Singleton
class FeatherSourceFile113 extends FeatherSourceFile128 {
   private final CefApp zn;

   @Inject
   FeatherSourceFile113(@FeatherSourceFile$lh8 String var1, @FeatherSourceFile$nc49 String var2) {
      CefBrowserFactory.setFactory(new FeatherSourceFile293());
      if (!CefApp.startup((String[])null)) {
         throw new RuntimeException("failed to initialize browser system");
      } else if (CefApp.getState() == CefAppState.INITIALIZED) {
         throw new IllegalStateException("already initialized");
      } else {
         CefApp var3 = CefApp.getInstance((String[])null, (CefSettings)null);
         CefSettings var4 = new CefSettings();
         var4.windowless_rendering_enabled = true;
         var4.cache_path = var1;
         var4.user_agent_product = "Chrome/" + var3.getVersion().getChromeVersion() + " Feather/" + var2;
         var4.locale = "en-US";
         var4.log_severity = LogSeverity.LOGSEVERITY_DEFAULT;
         if (FeatherSourceFile747.as()) {
            var4.log_severity = LogSeverity.LOGSEVERITY_VERBOSE;
            var4.remote_debugging_port = 9222;
         }

         var4.hardware_acceleration = of();
         var3.setSettings(var4);
         CefApp.addAppHandler(this);
         var3.initialize();
         this.zn = var3;
      }
   }

   private static boolean of() {
      String var0 = System.getProperty("feather.overrideHardwareAccel", "");
      boolean var1 = "true".equals(var0);
      return !var1 && !"false".equals(var0) ? SharedTextureSupport.isHardwareAccelerationAvailable() : var1;
   }

   public void onBeforeCommandLineProcessing(String var1, CefCommandLine var2) {
      ArrayList var3 = new ArrayList();
      var2.appendSwitch("ignore-gpu-blocklist");
      var2.appendSwitch("disable-gpu-driver-bug-workarounds");
      var2.appendSwitch("enable-gpu-rasterization");
      var2.appendSwitch("disable-direct-composition");
      var2.appendSwitchWithValue("use-angle", "d3d11");
      var2.appendSwitchWithValue("default-encoding", "utf-8");
      var2.appendSwitch("enable-experimental-web-platform-features");
      var2.appendSwitch("disable-breakpad");
      var2.appendSwitch("disable-site-isolation-trials");
      var2.appendSwitch("disable-spell-checking");
      var2.appendSwitch("disable-extensions");
      var2.appendSwitch("disable-pinch");
      var2.appendSwitch("disable-gpu-process-crash-limit");
      var2.appendSwitchWithValue("autoplay-policy", "no-user-gesture-required");
      var2.appendSwitch("disable-smooth-scrolling");
      var2.appendSwitch("disable-media-session");
      var3.add("HardwareMediaKeyHandling");
      String var4;
      if (var2.hasSwitch("disabled-features")) {
         var4 = var2.getSwitchValue("disable-features");
         var4 = var4 + "," + String.join(",", var3);
         var2.appendSwitchWithValue("disable-features", var4);
      } else {
         var4 = String.join(",", var3);
         var2.appendSwitchWithValue("disable-features", var4);
      }

   }

   public boolean onBeforeTerminate() {
      return true;
   }

   public boolean qi() {
      return this.zn.getSettings().hardware_acceleration;
   }

   CefClient pd() {
      return this.zn.createClient();
   }
}
