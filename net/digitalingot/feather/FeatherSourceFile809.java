package net.digitalingot.feather;

import com.google.common.io.ByteStreams;
import com.google.gson.Gson;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;
import java.util.function.Function;
import org.jetbrains.annotations.NotNull;

public interface FeatherSourceFile809 extends Closeable, AutoCloseable {
   @NotNull
   @NotNull InputStream wO();

   default @NotNull void lh(@NotNull FeatherSourceFile814 var1) {
      Objects.requireNonNull(var1);
      this.qy(var1::oe);
   }

   @NotNull
   default @NotNull FeatherSourceFile809 wP() {
      return new FeatherSourceFile418(this);
   }

   default byte[] wQ() {
      return (byte[])this.lh((var0) -> {
         try {
            return ByteStreams.toByteArray(var0);
         } catch (IOException var2) {
            throw new FeatherSourceFile816(var2);
         }
      });
   }

   default @NotNull Object lh(@NotNull @NotNull Type var1) {
      Gson var2 = new Gson();
      return this.lh(var2, var1);
   }

   default @NotNull Object km(@NotNull @NotNull Class var1) {
      Gson var2 = new Gson();
      return this.lh(var2, var1);
   }

   default @NotNull @NotNull Object lh(@NotNull @NotNull Gson var1, @NotNull @NotNull Class var2) {
      return var1.fromJson(this.wR(), var2);
   }

   default @NotNull @NotNull Object lh(@NotNull @NotNull Gson var1, @NotNull @NotNull Type var2) {
      return var1.fromJson(this.wR(), var2);
   }

   @NotNull
   default @NotNull String wR() {
      return String.join("\n", this.wS());
   }

   @NotNull
   default @NotNull List wS() {
      return (List)this.lh((var0) -> {
         try {
            BufferedReader var1 = new BufferedReader(new InputStreamReader(var0));

            ArrayList var4;
            try {
               ArrayList var2 = new ArrayList();

               while(true) {
                  String var3;
                  if ((var3 = var1.readLine()) == null) {
                     var4 = var2;
                     break;
                  }

                  var2.add(var3);
               }
            } catch (Throwable var6) {
               try {
                  var1.close();
               } catch (Throwable var5) {
                  var6.addSuppressed(var5);
               }

               throw var6;
            }

            var1.close();
            return var4;
         } catch (IOException var7) {
            throw new FeatherSourceFile816(var7);
         }
      });
   }

   default @NotNull Object lh(@NotNull @NotNull Function var1) {
      Object var3;
      try {
         InputStream var2 = this.wO();
         var3 = var1.apply(var2);
      } finally {
         FeatherSourceFile810.lh(this);
      }

      return var3;
   }

   default @NotNull void qy(@NotNull @NotNull Consumer var1) {
      try {
         InputStream var2 = this.wO();
         var1.accept(var2);
      } finally {
         FeatherSourceFile810.lh(this);
      }

   }
}
