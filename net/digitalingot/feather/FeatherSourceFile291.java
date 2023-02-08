package net.digitalingot.feather;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.UUID;
import javax.net.ssl.HttpsURLConnection;
import net.digitalingot.vendor.javax.inject.Inject;

class FeatherSourceFile291 {
   private static final String HR = "https://hypixelstats.feathermc.com/v0/stats/";
   private final Gson cf = new Gson();
   private final FeatherSourceFile689 jr;

   @Inject
   FeatherSourceFile291(FeatherSourceFile689 var1) {
      this.jr = var1;
   }

   public JsonObject ux(UUID var1) {
      String var2 = this.jr.rn();
      HttpsURLConnection var3 = null;

      JsonObject var8;
      try {
         InputStreamReader var5;
         try {
            URL var4 = new URL("https://hypixelstats.feathermc.com/v0/stats/" + var1);
            var3 = (HttpsURLConnection)var4.openConnection();
            var3.setRequestMethod("GET");
            var3.setRequestProperty("User-Agent", "Feather Client");
            var3.setRequestProperty("Authorization", "Bearer " + var2);
            var3.connect();
            if (var3.getResponseCode() != 200) {
               var5 = null;
               return var5;
            }

            var5 = new InputStreamReader(var3.getInputStream());

            try {
               BufferedReader var6 = new BufferedReader(var5);

               try {
                  JsonElement var7 = (JsonElement)this.cf.fromJson(var6, JsonElement.class);
                  var8 = var7.getAsJsonObject();
               } catch (Throwable var18) {
                  try {
                     var6.close();
                  } catch (Throwable var17) {
                     var18.addSuppressed(var17);
                  }

                  throw var18;
               }

               var6.close();
            } catch (Throwable var19) {
               try {
                  var5.close();
               } catch (Throwable var16) {
                  var19.addSuppressed(var16);
               }

               throw var19;
            }

            var5.close();
         } catch (Exception var20) {
            var5 = null;
            return var5;
         }
      } finally {
         if (var3 != null) {
            var3.disconnect();
         }

      }

      return var8;
   }
}
