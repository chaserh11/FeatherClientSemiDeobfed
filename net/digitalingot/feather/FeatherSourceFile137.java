package net.digitalingot.feather;

import java.net.URL;
import org.jetbrains.annotations.NotNull;

public enum FeatherSourceFile137 {
   AUTH_TOKEN(FeatherSourceFile658.GET, "/game/auth-token"),
   SERVER_ID(FeatherSourceFile658.GET, "/minecraft/server-id"),
   HAS_JOINED(FeatherSourceFile658.GET, "/minecraft/has-joined/{}?token={}"),
   UPDATE_TOKEN(FeatherSourceFile658.GET, "/service/update-token"),
   ACCOUNT_SEARCH(FeatherSourceFile658.POST, "/minecraft/account-search"),
   COMMUNICATION_SETTINGS(FeatherSourceFile658.GET, "/communication/settings"),
   UPDATE_COMMUNICATION_SETTINGS(FeatherSourceFile658.POST, "/communication/settings"),
   UPDATE_LOCATION(FeatherSourceFile658.POST, "/friend-list/location");

   private static final String BASE = FeatherSourceFile339.lt("FEATHER_API_URL", "https://api.feathermc.com/v1");
   @NotNull
   private final @NotNull FeatherSourceFile658 method;
   @NotNull
   private final @NotNull String endpoint;

   private FeatherSourceFile137(@NotNull FeatherSourceFile658 var3, @NotNull String var4) {
      this.method = var3;
      this.endpoint = var4;
   }

   public URL get(String... var1) {
      String var2 = this.endpoint;
      String[] var3 = var1;
      int var4 = var1.length;

      for(int var5 = 0; var5 < var4; ++var5) {
         String var6 = var3[var5];
         var2 = var2.replaceFirst("\\{}", var6);
      }

      if (var2.contains("{}")) {
         throw new IllegalArgumentException("not all variables required were delivered");
      } else {
         return new URL(BASE + var2);
      }
   }

   @NotNull
   public @NotNull FeatherSourceFile658 getMethod() {
      return this.method;
   }

   // $FF: synthetic method
   private static FeatherSourceFile137[] $values() {
      return new FeatherSourceFile137[]{AUTH_TOKEN, SERVER_ID, HAS_JOINED, UPDATE_TOKEN, ACCOUNT_SEARCH, COMMUNICATION_SETTINGS, UPDATE_COMMUNICATION_SETTINGS, UPDATE_LOCATION};
   }
}
