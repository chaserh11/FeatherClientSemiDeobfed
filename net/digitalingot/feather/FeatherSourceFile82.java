package net.digitalingot.feather;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import org.apache.commons.io.IOUtils;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class FeatherSourceFile82 {
   @NotNull
   private final @NotNull Path jA;
   @Nullable
   private @Nullable FeatherSourceFile11 jB;

   public FeatherSourceFile82(@NotNull @NotNull Path var1) {
      this.jA = var1;
   }

   public void xr() {
      String var1 = this.vc();
      this.jB = new FeatherSourceFile11(this, var1);
   }

   @NotNull
   public @NotNull FeatherSourceFile11 xa() {
      if (this.jB == null) {
         this.xr();
      }

      return this.jB;
   }

   public @NotNull void ck(@NotNull @NotNull String var1) {
      (new FeatherSourceFile11(this, var1)).gh().delete();
   }

   public @NotNull void xy(@NotNull @NotNull String var1) {
      try {
         this.xi(var1);
         this.jB = new FeatherSourceFile11(this, var1);
      } catch (IOException var3) {
         throw new IllegalStateException(var3);
      }
   }

   public @NotNull boolean fh(@NotNull @NotNull String var1) {
      if (FeatherSourceFile844.iB()) {
         return var1.matches(".*[<>:\"/|?*\\\\\u0000].*");
      } else if (!FeatherSourceFile844.iC() && !FeatherSourceFile844.iD()) {
         throw new UnsupportedOperationException();
      } else {
         return var1.matches(".*[/\u0000].*");
      }
   }

   @NotNull
   public @NotNull List mz() {
      ArrayList var1 = new ArrayList();
      String[] var2 = this.jA.resolve("profiles").toFile().list();
      int var3 = var2.length;

      for(int var4 = 0; var4 < var3; ++var4) {
         String var5 = var2[var4];
         if (var5.endsWith(".json")) {
            var5 = var5.substring(0, var5.length() - 5);
            var1.add(var5);
         }
      }

      return var1;
   }

   @NotNull
   private @NotNull File kh() {
      File var1 = this.zh();
      if (!var1.exists()) {
         this.nc(var1);
      }

      return var1;
   }

   private @NotNull void nc(@NotNull @NotNull File var1) {
      try {
         if (var1.getParentFile().mkdirs()) {
            FeatherSourceFile311.Sb.info("Created profile storage directory");
         }

         if (!var1.createNewFile()) {
            throw new IOException("Profile storage couldn't be created.");
         } else {
            this.xi("default");
         }
      } catch (IOException var3) {
         throw new IllegalStateException(var3);
      }
   }

   private @NotNull void xi(@NotNull @NotNull String var1) {
      FileWriter var2 = new FileWriter(this.kh());

      try {
         BufferedWriter var3 = new BufferedWriter(var2);

         try {
            IOUtils.write(var1, var3);
         } catch (Throwable var8) {
            try {
               var3.close();
            } catch (Throwable var7) {
               var8.addSuppressed(var7);
            }

            throw var8;
         }

         var3.close();
      } catch (Throwable var9) {
         try {
            var2.close();
         } catch (Throwable var6) {
            var9.addSuppressed(var6);
         }

         throw var9;
      }

      var2.close();
   }

   @NotNull
   private @NotNull String vc() {
      return FeatherSourceFile815.ux(this.kh()).wP().wR();
   }

   @NotNull
   public @NotNull Path gz() {
      return this.jA;
   }

   @NotNull
   private @NotNull File zh() {
      return this.jA.resolve("current.profile").toFile();
   }
}
