package net.digitalingot.feather;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSyntaxException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import javax.net.ssl.HttpsURLConnection;

public class FeatherSourceFile180 {
   private static final Gson GSON = (new GsonBuilder()).create();
   private static final String GG = "https://translate.googleapis.com/translate_a/single";

   private String km(String var1, String var2) {
      StringBuilder var3 = new StringBuilder("https://translate.googleapis.com/translate_a/single");
      var3.append("?client=gtx");
      var3.append("&dt=t");
      var3.append("&q=").append(URLEncoder.encode(var1));
      var3.append("&sl=auto");
      var3.append("&tl=").append(var2);
      HttpsURLConnection var4 = null;

      try {
         URL var5 = new URL(var3.toString());
         var4 = (HttpsURLConnection)var5.openConnection();
         var4.setDoOutput(true);
         var4.setRequestMethod("GET");
         var4.setConnectTimeout(1000);
         var4.setRequestProperty("Content-Type", "application/json");
         var4.connect();
         if (var4.getResponseCode() != 200) {
            return null;
         } else {
            BufferedReader var6 = new BufferedReader(new InputStreamReader(var4.getInputStream(), StandardCharsets.UTF_8));
            StringBuilder var7 = new StringBuilder();

            String var8;
            while((var8 = var6.readLine()) != null) {
               var7.append(var8);
            }

            String var9 = var7.toString();
            return var9;
         }
      } catch (IOException var13) {
         return null;
      } finally {
         if (var4 != null) {
            var4.disconnect();
         }

      }
   }

   public String mq(String var1, String var2) {
      String var3 = this.km(var1, var2);
      if (var3 == null) {
         return null;
      } else {
         JsonArray var4;
         try {
            var4 = (JsonArray)GSON.fromJson(var3, JsonArray.class);
         } catch (JsonSyntaxException var7) {
            return null;
         }

         JsonElement var5 = var4.get(0);
         if (!var5.isJsonArray()) {
            return null;
         } else {
            var5 = var5.getAsJsonArray().get(0);
            if (!var5.isJsonArray()) {
               return null;
            } else {
               var5 = var5.getAsJsonArray().get(0);
               if (!var5.isJsonPrimitive()) {
                  return null;
               } else {
                  JsonPrimitive var6 = var5.getAsJsonPrimitive();
                  return !var6.isString() ? null : var6.getAsString();
               }
            }
         }
      }
   }
}
