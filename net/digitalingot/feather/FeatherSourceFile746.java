package net.digitalingot.feather;

import com.google.gson.stream.JsonReader;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.jetbrains.annotations.NotNull;

public class FeatherSourceFile746 {
   @NotNull
   private final @NotNull FeatherSourceFile144 qr;

   public FeatherSourceFile746(@NotNull @NotNull FeatherSourceFile144 var1) {
      this.qr = var1;
   }

   @NotNull
   public @NotNull Map nj() {
      Stream var1 = this.lh(this.qr.gh()).entrySet().stream().filter((var0) -> {
         return !((FeatherSourceFile243)var0.getKey()).isSidebar();
      });
      Stream var2 = this.lh(this.qr.wp()).entrySet().stream().filter((var0) -> {
         return ((FeatherSourceFile243)var0.getKey()).isSidebar();
      });
      return (Map)Stream.concat(var1, var2).collect(Collectors.toMap(Entry::getKey, Entry::getValue));
   }

   @NotNull
   public @NotNull Map lh(File var1) {
      if (!var1.exists()) {
         return new EnumMap(FeatherSourceFile243.class);
      } else {
         try {
            JsonReader var2 = new JsonReader(new BufferedReader(new FileReader(var1)));

            Map var3;
            try {
               var3 = this.mr(var2);
            } catch (Throwable var6) {
               try {
                  var2.close();
               } catch (Throwable var5) {
                  var6.addSuppressed(var5);
               }

               throw var6;
            }

            var2.close();
            return var3;
         } catch (IOException var7) {
            return new EnumMap(FeatherSourceFile243.class);
         }
      }
   }

   @NotNull
   private @NotNull @NotNull Map mr(@NotNull @NotNull JsonReader var1) {
      EnumMap var2 = new EnumMap(FeatherSourceFile243.class);
      var1.beginObject();

      while(var1.hasNext()) {
         FeatherSourceFile243 var3 = FeatherSourceFile243.fromSlug(var1.nextName());
         if (var3 == null) {
            var1.skipValue();
         } else {
            Map var4 = this.ux(var1);
            var2.put(var3, var4);
         }
      }

      var1.endObject();
      return var2;
   }

   @NotNull
   private @NotNull @NotNull Map ux(@NotNull @NotNull JsonReader var1) {
      HashMap var2 = new HashMap();
      var1.beginObject();

      while(var1.hasNext()) {
         String var3 = var1.nextName();
         String var4 = var1.nextString();
         var2.put(var3, var4);
      }

      var1.endObject();
      return var2;
   }
}
