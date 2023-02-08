package net.digitalingot.feather;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import java.util.LinkedList;
import java.util.Queue;
import net.minecraft.client.Minecraft;
import org.apache.commons.lang3.StringEscapeUtils;
import org.cef.browser.CefBrowser;
import org.cef.browser.CefFrame;
import org.cef.callback.CefQueryCallback;
import org.cef.handler.CefMessageRouterHandlerAdapter;

public class FeatherSourceFile695 extends CefMessageRouterHandlerAdapter {
   private static final String iu = "createFrame";
   private static final String ip = "destroyFrame";
   private static final String tn = "focusFrame";
   private static final String tl = "messageFrame";
   private static final String sc = "unfocusFrame";
   private static final String ki = "showFrame";
   private static final String fq = "hideFrame";
   private static final Gson GSON = new Gson();
   private final FeatherSourceFile124 bl;
   private CefQueryCallback hj = null;
   private final Queue sr = new LinkedList();
   private final Minecraft minecraft = Minecraft.func_71410_x();

   public FeatherSourceFile695(FeatherSourceFile124 var1) {
      this.bl = var1;
   }

   public boolean onQuery(CefBrowser var1, CefFrame var2, long var3, String var5, boolean var6, CefQueryCallback var7) {
      if (!var2.isMain()) {
         var7.failure(-1, (String)null);
         return true;
      } else if ("registerApi".equals(var5)) {
         if (!var6) {
            throw new AssertionError("Not persistent");
         } else if (this.hj != null) {
            throw new AssertionError("Already registered");
         } else {
            this.hj = var7;
            this.bf();
            return true;
         }
      } else if (var5.startsWith("event:")) {
         String var8 = var5.substring(6);
         JsonObject var9 = (JsonObject)GSON.fromJson(var8, JsonObject.class);
         String var10 = var9.get("type").getAsString();
         JsonElement var11 = var9.get("data");
         this.minecraft.func_152344_a(() -> {
            this.lh(var10, var11);
         });
         var7.success((String)null);
         return true;
      } else {
         return false;
      }
   }

   private void lh(String var1, JsonElement var2) {
      JsonObject var5;
      String var6;
      int var7;
      String var8;
      switch (var1) {
         case "createFrame":
         default:
            break;
         case "destroyFrame":
            var5 = var2.getAsJsonObject();
            var6 = var5.get("frame").getAsString();
            var7 = var5.get("total").getAsNumber().intValue();
            this.bl.lh(var6, var7);
            break;
         case "focusFrame":
            var8 = var2.getAsString();
            this.bl.oh(var8);
            break;
         case "unfocusFrame":
            var8 = var2.getAsString();
            this.bl.hg(var8);
            break;
         case "showFrame":
            var5 = var2.getAsJsonObject();
            var6 = var5.get("frame").getAsString();
            var7 = var5.get("total").getAsNumber().intValue();
            this.bl.nc(var6, var7);
            break;
         case "hideFrame":
            var5 = var2.getAsJsonObject();
            var6 = var5.get("frame").getAsString();
            var7 = var5.get("total").getAsNumber().intValue();
            this.bl.xj(var6, var7);
      }

   }

   public void lh(String var1, String var2) {
      this.lh("createFrame", var1, var2);
   }

   public void sm(String var1) {
      this.xj("destroyFrame", var1);
   }

   public void nc(String var1, String var2) {
      this.lh("messageFrame", var1, var2);
   }

   public void ly(String var1) {
      this.xj("focusFrame", var1);
   }

   public void rp(String var1) {
      this.xj("unfocusFrame", var1);
   }

   public void tx(String var1) {
      this.xj("showFrame", var1);
   }

   public void wn(String var1) {
      this.xj("hideFrame", var1);
   }

   private void xj(String var1, String var2) {
      JsonArray var3 = new JsonArray();
      lh(var3, var2);
      this.lh(var1, var3);
   }

   private void lh(String var1, String var2, String var3) {
      JsonArray var4 = new JsonArray();
      lh(var4, var2);
      lh(var4, var3);
      this.lh(var1, var4);
   }

   private static void lh(JsonArray var0, String var1) {
      var0.add((JsonElement)(var1 == null ? JsonNull.INSTANCE : new JsonPrimitive(var1)));
   }

   private void lh(String var1, JsonArray var2) {
      JsonObject var3 = new JsonObject();
      var3.add("func", new JsonPrimitive(var1));
      var3.add("args", var2);
      String var4 = GSON.toJson(var3);
      if (this.hj == null) {
         this.sr.add(var4);
      } else {
         this.jh(var4);
      }

   }

   private void bf() {
      String var1;
      while((var1 = (String)this.sr.poll()) != null) {
         this.jh(var1);
      }

   }

   private void jh(String var1) {
      var1 = StringEscapeUtils.escapeEcmaScript(var1);
      this.bl.et("window.feather(\"" + var1 + "\");");
   }
}
