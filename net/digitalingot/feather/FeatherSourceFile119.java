package net.digitalingot.feather;

import com.google.gson.stream.JsonWriter;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import org.jetbrains.annotations.NotNull;

public class FeatherSourceFile119 {
   @NotNull
   private final @NotNull FeatherSourceFile144 qr;

   public FeatherSourceFile119(@NotNull @NotNull FeatherSourceFile144 var1) {
      this.qr = var1;
   }

   public @NotNull @NotNull void nc(@NotNull @NotNull FeatherSourceFile243 var1, @NotNull @NotNull Map var2) {
      Map var3 = this.qr.yp();
      if (var3 == null) {
         this.qr.ff();
      }

      var3.put(var1, var2);
      this.oe(var3);
   }

   public @NotNull void oe(@NotNull @NotNull Map var1) {
      Map var2 = (Map)var1.entrySet().stream().collect(Collectors.groupingBy((var0) -> {
         return ((FeatherSourceFile243)var0.getKey()).isSidebar();
      }, Collectors.toMap(Entry::getKey, Entry::getValue)));
      Map var3 = (Map)var2.getOrDefault(false, new EnumMap(FeatherSourceFile243.class));
      Map var4 = (Map)var2.getOrDefault(true, new EnumMap(FeatherSourceFile243.class));
      this.lh(this.qr.gh(), var3);
      this.lh(this.qr.wp(), var4);
   }

   private @NotNull @NotNull void lh(@NotNull @NotNull File var1, @NotNull @NotNull Map var2) {
      try {
         FileWriter var3 = new FileWriter(var1);

         try {
            BufferedWriter var4 = new BufferedWriter(var3);

            try {
               JsonWriter var5 = new JsonWriter(var4);

               try {
                  if (!var1.exists() && !var1.createNewFile()) {
                     throw new IOException("Configuration file could not be created");
                  }

                  this.lh(var5, var2);
               } catch (Throwable var11) {
                  try {
                     var5.close();
                  } catch (Throwable var10) {
                     var11.addSuppressed(var10);
                  }

                  throw var11;
               }

               var5.close();
            } catch (Throwable var12) {
               try {
                  var4.close();
               } catch (Throwable var9) {
                  var12.addSuppressed(var9);
               }

               throw var12;
            }

            var4.close();
         } catch (Throwable var13) {
            try {
               var3.close();
            } catch (Throwable var8) {
               var13.addSuppressed(var8);
            }

            throw var13;
         }

         var3.close();
      } catch (IOException var14) {
         throw new RuntimeException(var14);
      }
   }

   private @NotNull @NotNull void lh(@NotNull @NotNull JsonWriter var1, @NotNull @NotNull Map var2) {
      var1.beginObject();
      Iterator var3 = var2.entrySet().iterator();

      while(var3.hasNext()) {
         Entry var4 = (Entry)var3.next();
         FeatherSourceFile243 var5 = (FeatherSourceFile243)var4.getKey();
         Map var6 = (Map)var4.getValue();
         var1.name(var5.getSlug());
         this.nc(var1, var6);
      }

      var1.endObject();
   }

   private @NotNull @NotNull void nc(@NotNull @NotNull JsonWriter var1, @NotNull @NotNull Map var2) {
      var1.beginObject();
      Iterator var3 = var2.entrySet().iterator();

      while(var3.hasNext()) {
         Entry var4 = (Entry)var3.next();
         String var5 = (String)var4.getKey();
         String var6 = (String)var4.getValue();
         var1.name(var5).value(var6);
      }

      var1.endObject();
   }
}
