package net.digitalingot.feather;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class FeatherSourceFile435 implements FeatherSourceFile809 {
   @NotNull
   private final @NotNull URL QW;
   @Nullable
   private @Nullable HttpURLConnection QX;
   @Nullable
   private @Nullable InputStream ka;
   @NotNull
   private @NotNull String QY;

   public FeatherSourceFile435(@NotNull @NotNull URL var1) {
      this.QW = var1;
      this.QY = "Feather Client";
   }

   public @NotNull FeatherSourceFile435 sd(@NotNull @NotNull String var1) {
      this.QY = var1;
      return this;
   }

   @NotNull
   public @NotNull InputStream wO() {
      if (this.ka != null) {
         return this.ka;
      } else {
         try {
            this.QX = (HttpURLConnection)this.QW.openConnection();
            this.QX.setRequestMethod("GET");
            this.QX.setUseCaches(true);
            this.QX.setRequestProperty("User-Agent", this.QY);
            this.QX.setReadTimeout(30000);
            this.QX.setConnectTimeout(30000);
            this.QX.setDoOutput(true);
            this.ka = this.QX.getInputStream();
            return this.ka;
         } catch (IOException var2) {
            throw new FeatherSourceFile816(var2);
         }
      }
   }

   public void close() {
      if (this.QX != null) {
         this.QX.disconnect();
      }

      FeatherSourceFile810.lh(this.ka);
      this.ka = null;
   }
}
