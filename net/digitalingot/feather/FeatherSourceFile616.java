package net.digitalingot.feather;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.mojang.authlib.exceptions.AuthenticationException;
import com.mojang.authlib.minecraft.MinecraftSessionService;
import java.io.IOException;
import java.io.OutputStream;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.UUID;
import javax.net.ssl.HttpsURLConnection;
import net.digitalingot.vendor.javax.inject.Inject;
import net.digitalingot.vendor.javax.inject.Singleton;
import net.minecraft.client.Minecraft;
import net.minecraft.util.Session;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Singleton
class FeatherSourceFile616 implements FeatherSourceFile700 {
   @NotNull
   private final @NotNull Gson cf = (new GsonBuilder()).create();
   @NotNull
   private final @NotNull Minecraft minecraft;
   @NotNull
   private final @NotNull FeatherSourceFile689 jr;
   @NotNull
   private final @NotNull Map ts = new HashMap();
   @NotNull
   private final @NotNull Map ru;
   @NotNull
   private final @NotNull FeatherSourceFile200 rn;
   private FeatherSourceFile302 og;

   @Inject
   FeatherSourceFile616(@NotNull @NotNull Minecraft var1, @NotNull @NotNull FeatherSourceFile689 var2, @NotNull @NotNull FeatherSourceFile200 var3) {
      this.ru = new TreeMap(String.CASE_INSENSITIVE_ORDER);
      this.minecraft = var1;
      this.jr = var2;
      this.rn = var3;
   }

   public void fe() {
      this.jr.fe();
      this.bw();
      FeatherSourceFile370.ws.oe(() -> {
         try {
            this.bw();
            this.jr.om();
            this.rn.eA();
         } catch (FeatherSourceFile28 | IOException var2) {
            FeatherSourceFile311.Sb.error("Error while trying to authenticate with core backend", var2);
            FeatherSourceFile311.Sb.error("For the time being, you need to be authenticated in order to participate in our beta.");
            this.minecraft.func_71400_g();
         }

      });
   }

   @Nullable
   public @Nullable @NotNull String lh(@NotNull @NotNull UUID var1) {
      return (String)this.lh(var1).values().stream().findAny().orElse((Object)null);
   }

   @NotNull
   public @NotNull Map lh(@NotNull UUID... var1) {
      ArrayList var2 = new ArrayList();
      HashMap var3 = new HashMap(var1.length);
      UUID[] var4 = var1;
      int var5 = var1.length;

      for(int var6 = 0; var6 < var5; ++var6) {
         UUID var7 = var4[var6];
         String var8 = (String)this.ts.get(var7);
         if (var8 != null) {
            var3.put(var7, var8);
         } else {
            var2.add(var7);
         }
      }

      if (!var2.isEmpty()) {
         FeatherSourceFile599 var10 = new FeatherSourceFile599((Collection)null, var2, (Collection)null);

         FeatherSourceFile71 var11;
         try {
            var11 = (FeatherSourceFile71)this.lh(FeatherSourceFile71.class, FeatherSourceFile137.ACCOUNT_SEARCH, var10);
         } catch (IOException var9) {
            FeatherSourceFile311.Sb.error("Error while making an account search request", var9);
            return new HashMap();
         }

         Iterator var12 = var11.ik().iterator();

         while(var12.hasNext()) {
            FeatherSourceFile$lh39 var13 = (FeatherSourceFile$lh39)var12.next();
            this.lh(var13);
            var3.put(var13.ye(), var13.me());
         }
      }

      return var3;
   }

   @Nullable
   public @Nullable @NotNull UUID mq(@NotNull @NotNull String var1) {
      return (UUID)this.nc(var1).values().stream().findAny().orElse((Object)null);
   }

   @NotNull
   public @NotNull Map nc(@NotNull String... var1) {
      ArrayList var2 = new ArrayList();
      HashMap var3 = new HashMap(var1.length);
      String[] var4 = var1;
      int var5 = var1.length;

      for(int var6 = 0; var6 < var5; ++var6) {
         String var7 = var4[var6];
         UUID var8 = (UUID)this.ru.get(var7);
         if (var8 != null) {
            var3.put(var7, var8);
         } else {
            var2.add(var7);
         }
      }

      if (!var2.isEmpty()) {
         FeatherSourceFile599 var10 = new FeatherSourceFile599((Collection)null, (Collection)null, var2);

         FeatherSourceFile71 var11;
         try {
            var11 = (FeatherSourceFile71)this.lh(FeatherSourceFile71.class, FeatherSourceFile137.ACCOUNT_SEARCH, var10);
         } catch (IOException var9) {
            FeatherSourceFile311.Sb.error("Error while making an account search request", var9);
            return new HashMap();
         }

         Iterator var12 = var11.ik().iterator();

         while(var12.hasNext()) {
            FeatherSourceFile$lh39 var13 = (FeatherSourceFile$lh39)var12.next();
            this.lh(var13);
            var3.put(var13.me(), var13.ye());
         }
      }

      return var3;
   }

   private @NotNull void lh(@NotNull @NotNull FeatherSourceFile$lh39 var1) {
      this.ts.put(var1.ye(), var1.me());
      this.ru.put(var1.me(), var1.ye());
   }

   public FeatherSourceFile302 wj() {
      return this.og;
   }

   public FeatherSourceFile126 ez() {
      return (FeatherSourceFile126)this.lh(FeatherSourceFile126.class, FeatherSourceFile137.COMMUNICATION_SETTINGS);
   }

   public void lh(FeatherSourceFile126 var1) {
      this.lh((FeatherSourceFile137)FeatherSourceFile137.UPDATE_COMMUNICATION_SETTINGS, (Object)var1);
   }

   public @Nullable void pq(@Nullable @Nullable String var1) {
      this.lh(FeatherSourceFile585.class, FeatherSourceFile137.UPDATE_LOCATION, new FeatherSourceFile585(var1));
   }

   public void ts() {
      this.lh(FeatherSourceFile797.class, FeatherSourceFile137.UPDATE_TOKEN);
   }

   public String ru() {
      return this.jr.ru();
   }

   public String rn() {
      return this.jr.rn();
   }

   @NotNull
   public @NotNull String og() {
      return (String)this.lh(String.class, FeatherSourceFile137.AUTH_TOKEN);
   }

   public void bw() {
      MinecraftSessionService var1 = this.minecraft.func_152347_ac();
      if (var1 == null) {
         throw new FeatherSourceFile28("session service not available");
      } else {
         Session var2 = this.minecraft.func_110432_I();
         if (var2 == null) {
            throw new FeatherSourceFile28("session not available");
         } else {
            boolean var3 = false;

            for(int var5 = 0; var5 < 2; ++var5) {
               String var6 = (String)this.lh(String.class, FeatherSourceFile137.SERVER_ID);

               try {
                  var1.joinServer(var2.func_148256_e(), var2.func_148254_d(), var6);
               } catch (AuthenticationException var8) {
                  throw new FeatherSourceFile28(var8);
               }

               String var7 = this.lh(FeatherSourceFile137.HAS_JOINED, var2.func_111285_a(), var6);
               if (var7.contains("mcUsername")) {
                  FeatherSourceFile114 var4 = (FeatherSourceFile114)this.cf.fromJson(var7, FeatherSourceFile114.class);
                  this.og = new FeatherSourceFile302(var4.re(), var4.bx(), var4.hz());
                  var3 = true;
                  break;
               }
            }

            if (!var3) {
               throw new FeatherSourceFile28("Failed to authenticate with core backend");
            } else {
               FeatherSourceFile311.Sb.info("Authenticated with core backend");
            }
         }
      }
   }

   @NotNull
   private @NotNull @NotNull @NotNull Object lh(@NotNull @NotNull Class var1, @NotNull @NotNull FeatherSourceFile137 var2, @NotNull String... var3) {
      return this.lh(var1, var2, (Object)null, var3);
   }

   @NotNull
   private @NotNull @NotNull @NotNull @Nullable Object lh(@NotNull @NotNull Class var1, @NotNull @NotNull FeatherSourceFile137 var2, @Nullable @Nullable Object var3, @NotNull String... var4) {
      String var5 = this.lh(var2, var3, var4);
      return this.cf.fromJson(var5, var1);
   }

   @NotNull
   private @NotNull @NotNull String lh(@NotNull @NotNull FeatherSourceFile137 var1, @NotNull String... var2) {
      return this.lh((FeatherSourceFile137)var1, (Object)null, var2);
   }

   @NotNull
   private @NotNull @NotNull @Nullable String lh(@NotNull @NotNull FeatherSourceFile137 var1, @Nullable @Nullable Object var2, @NotNull String... var3) {
      URL var4 = var1.get(var3);
      HttpsURLConnection var5 = (HttpsURLConnection)var4.openConnection();
      var5.setRequestMethod(var1.getMethod().name());
      var5.setRequestProperty("User-Agent", "Feather Client");
      String var6;
      if (var1 != FeatherSourceFile137.SERVER_ID && var1 != FeatherSourceFile137.HAS_JOINED) {
         var6 = this.jr.ru();
         if (var6 != null) {
            var5.setRequestProperty("Authorization", var6);
         }
      }

      if (var2 != null) {
         var5.setDoOutput(true);
         var5.setRequestProperty("Content-Type", "application/json");
      }

      var5.connect();
      if (var2 != null) {
         var6 = this.cf.toJson(var2);
         OutputStream var7 = var5.getOutputStream();

         try {
            var7.write(var6.getBytes(StandardCharsets.UTF_8));
            var7.flush();
         } catch (Throwable var11) {
            if (var7 != null) {
               try {
                  var7.close();
               } catch (Throwable var10) {
                  var11.addSuppressed(var10);
               }
            }

            throw var11;
         }

         if (var7 != null) {
            var7.close();
         }
      }

      var6 = var5.getHeaderField("Authorization");
      if (var6 != null) {
         this.jr.mr(var6);
      }

      return FeatherSourceFile815.xj(var5.getInputStream()).wR();
   }
}
