package net.digitalingot.feather;

import java.io.File;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.StringJoiner;
import net.digitalingot.vendor.javax.inject.Inject;
import net.digitalingot.vendor.javax.inject.Provider;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import org.jetbrains.annotations.NotNull;

public class FeatherSourceFile644 extends FeatherSourceFile735 {
   private final FeatherSourceFile434 xj;
   private final Provider Jr;
   private final Minecraft minecraft;

   @Inject
   FeatherSourceFile644(FeatherSourceFile434 var1, Provider var2, Minecraft var3) {
      super("featherscreenshot", Collections.emptyList());
      this.xj = var1;
      this.Jr = var2;
      this.minecraft = var3;
   }

   public void lh(@NotNull @NotNull String[] var1) {
      if (var1.length >= 2) {
         String var2 = var1[0];
         StringJoiner var3 = new StringJoiner(" ");

         for(int var4 = 1; var4 < var1.length; ++var4) {
            var3.add(var1[var4]);
         }

         String var8 = var3.toString();
         File var5 = new File(var8);
         FeatherSourceFile$lh$lh10 var6 = ((FeatherSourceFile$lh99)((FeatherSourceFile659)this.Jr.get()).pr()).IV;
         EntityPlayerSP var7 = this.minecraft.field_71439_g;
         this.xj.oe(() -> {
            String var7x;
            switch (var2) {
               case "copy":
                  FeatherSourceFile547.xj(var5);
                  FeatherSourceFile198.lh(var7, FeatherSourceFile37.lh("feather.screenshot.copied.image"));
                  break;
               case "upload":
                  FeatherSourceFile198.lh(var7, FeatherSourceFile37.lh("feather.screenshot.uploading"));
                  var7x = FeatherSourceFile221.pq(var5);
                  switch (var6) {
                     case COPY_AND_OPEN_LINK:
                        this.qr(var7x);
                     case COPY_LINK:
                        FeatherSourceFile844.ik(var7x);
                        FeatherSourceFile198.lh(this.minecraft.field_71439_g, FeatherSourceFile37.lh("feather.screenshot.copied.link"));
                        return;
                     case OPEN_LINK:
                        this.qr(var7x);
                        return;
                     default:
                        return;
                  }
               case "tweet":
                  FeatherSourceFile198.lh(var7, FeatherSourceFile37.lh("feather.screenshot.uploading"));
                  var7x = FeatherSourceFile221.pq(var5);
                  this.qr(this.rn(var7x));
            }

         });
      }
   }

   private @NotNull String rn(@NotNull @NotNull String var1) {
      String var2;
      try {
         var2 = URLEncoder.encode(var1, StandardCharsets.UTF_8.toString());
      } catch (UnsupportedEncodingException var4) {
         throw new IllegalStateException(var4);
      }

      return "https://twitter.com/intent/tweet?text=Look%20at%20this%20screenshot%20I%20took!%0A" + var2 + "%0A%0A%20%40Feather_Client&related=Feather_Client%3AFeather%20Client%20Published%20via&hashtags=minecraft";
   }

   private @NotNull void qr(@NotNull @NotNull String var1) {
      try {
         FeatherSourceFile844.lh((new URL(var1)).toURI());
      } catch (URISyntaxException | MalformedURLException var3) {
      }

   }
}
