package net.digitalingot.feather;

import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import net.digitalingot.vendor.javax.inject.Inject;
import net.digitalingot.vendor.javax.inject.Singleton;

@Singleton
public class FeatherSourceFile850 {
   private static final String Ny = "https://modprofiles.feathermc.com/profile";
   private static final String Nz = "https://modprofiles.feathermc.com/profile/";
   private static final int NA = 10000;
   private final FeatherSourceFile689 jr;

   @Inject
   FeatherSourceFile850(FeatherSourceFile689 var1) {
      this.jr = var1;
   }

   public String ye(String var1) {
      try {
         URL var2 = new URL("https://modprofiles.feathermc.com/profile");
         HttpURLConnection var3 = (HttpURLConnection)var2.openConnection();
         var3.setRequestMethod("POST");
         var3.setDoOutput(true);
         var3.setRequestProperty("User-Agent", "Feather Client");
         var3.setRequestProperty("Authorization", this.jr.rn());
         var3.setRequestProperty("Content-Type", "application/json");
         var3.setConnectTimeout(10000);
         var3.setReadTimeout(10000);
         var3.connect();
         OutputStream var4 = var3.getOutputStream();

         try {
            var4.write(var1.getBytes(StandardCharsets.UTF_8));
            var4.flush();
         } catch (Throwable var8) {
            if (var4 != null) {
               try {
                  var4.close();
               } catch (Throwable var7) {
                  var8.addSuppressed(var7);
               }
            }

            throw var8;
         }

         if (var4 != null) {
            var4.close();
         }

         if (var3.getResponseCode() == 201) {
            return FeatherSourceFile815.xj(var3.getInputStream()).wR();
         }
      } catch (Exception var9) {
      }

      return null;
   }

   public String me(String var1) {
      try {
         URL var2 = new URL("https://modprofiles.feathermc.com/profile/" + var1);
         HttpURLConnection var3 = (HttpURLConnection)var2.openConnection();
         var3.setRequestMethod("GET");
         var3.setRequestProperty("User-Agent", "Feather Client");
         var3.setRequestProperty("Authorization", this.jr.rn());
         var3.setConnectTimeout(10000);
         var3.setReadTimeout(10000);
         var3.connect();
         if (var3.getResponseCode() == 200) {
            return FeatherSourceFile815.xj(var3.getInputStream()).wR();
         }
      } catch (Exception var4) {
      }

      return null;
   }
}
