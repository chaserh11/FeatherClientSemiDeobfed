package net.digitalingot.feather;

import com.google.gson.Gson;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.function.Consumer;
import java.util.function.Function;
import org.jetbrains.annotations.NotNull;

public interface FeatherSourceFile814 extends Closeable, AutoCloseable {
   @NotNull
   @NotNull OutputStream wT();

   @NotNull
   default @NotNull FeatherSourceFile439 wU() {
      return new FeatherSourceFile439(this);
   }

   default @NotNull void wz(@NotNull @NotNull Object var1) {
      this.lh(new Gson(), var1);
   }

   default @NotNull @NotNull void lh(@NotNull @NotNull Gson var1, @NotNull @NotNull Object var2) {
      this.qp(var1.toJson(var2));
   }

   default @NotNull void qp(@NotNull @NotNull String var1) {
      this.lt(var1.getBytes());
   }

   default void lt(byte[] var1) {
      this.ou((var1x) -> {
         try {
            var1x.write(var1);
         } catch (IOException var3) {
            throw new FeatherSourceFile816(var3);
         }
      });
   }

   default @NotNull void oe(@NotNull @NotNull InputStream var1) {
      try {
         InputStream var2 = var1;

         try {
            this.ou((var1x) -> {
               try {
                  int var2x = var2.available();
                  if (var2x < 8192) {
                     var2x = 8192;
                  }

                  byte[] var3 = new byte[var2x];

                  int var4;
                  while((var4 = var2.read(var3, 0, var2x)) >= 0) {
                     var1x.write(var3, 0, var4);
                  }

               } catch (IOException var5) {
                  throw new FeatherSourceFile816(var5);
               }
            });
         } catch (Throwable var6) {
            if (var1 != null) {
               try {
                  var2.close();
               } catch (Throwable var5) {
                  var6.addSuppressed(var5);
               }
            }

            throw var6;
         }

         if (var1 != null) {
            var1.close();
         }

      } catch (IOException var7) {
         throw new FeatherSourceFile816(var7);
      }
   }

   default @NotNull Object nc(@NotNull @NotNull Function var1) {
      Object var3;
      try {
         OutputStream var2 = this.wT();
         var3 = var1.apply(var2);
      } finally {
         FeatherSourceFile810.lh(this);
      }

      return var3;
   }

   default @NotNull void ou(@NotNull @NotNull Consumer var1) {
      try {
         OutputStream var2 = this.wT();
         var1.accept(var2);
      } finally {
         FeatherSourceFile810.lh(this);
      }

   }
}
