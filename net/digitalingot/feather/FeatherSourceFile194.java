package net.digitalingot.feather;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonPrimitive;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Map.Entry;
import java.util.function.BiConsumer;
import java.util.regex.Pattern;
import net.minecraft.client.Minecraft;
import org.jetbrains.annotations.NotNull;

public abstract class FeatherSourceFile194 {
   public static final FeatherSourceFile194 aY = qo();
   private static FeatherSourceFile194 aZ;
   private static final Gson GSON = new Gson();
   private static final Pattern bA = Pattern.compile("%(\\d+\\$)?[\\d.]*[df]");

   private FeatherSourceFile194() {
   }

   public abstract @NotNull String yl(@NotNull @NotNull String var1);

   public abstract Map us();

   public static FeatherSourceFile194 ns() {
      return aZ;
   }

   public static void ai(String var0) {
      FeatherSourceFile194 var1 = ja(var0);
      aZ = var1 == null ? aY : var1;
   }

   private static FeatherSourceFile194 qo() {
      return ja("en_us");
   }

   private static FeatherSourceFile194 ja(String var0) {
      var0 = var0.toLowerCase();
      Builder var1 = ImmutableMap.builder();
      Objects.requireNonNull(var1);
      BiConsumer var2 = var1::put;

      try {
         label52: {
            InputStream var3 = FeatherSourceFile194.class.getResourceAsStream("/assets/feather/lang/" + var0 + ".json");

            Object var4;
            label45: {
               try {
                  if (var3 == null) {
                     var4 = null;
                     break label45;
                  }

                  lh(var3, var2);
               } catch (Throwable var7) {
                  if (var3 != null) {
                     try {
                        var3.close();
                     } catch (Throwable var6) {
                        var7.addSuppressed(var6);
                     }
                  }

                  throw var7;
               }

               if (var3 != null) {
                  var3.close();
               }
               break label52;
            }

            if (var3 != null) {
               var3.close();
            }

            return (FeatherSourceFile194)var4;
         }
      } catch (IOException | JsonParseException var8) {
         FeatherSourceFile311.Sb.error("Couldn't read language {}", new Object[]{"/assets/feather/lang/" + var0 + ".json", var8});
      }

      final ImmutableMap var9 = var1.build();
      return new FeatherSourceFile194() {
         public @NotNull String yl(@NotNull @NotNull String var1) {
            return (String)var9.get(var1);
         }

         public Map us() {
            return var9;
         }
      };
   }

   private static void lh(InputStream var0, BiConsumer var1) {
      JsonObject var2 = (JsonObject)GSON.fromJson(new InputStreamReader(var0, StandardCharsets.UTF_8), JsonObject.class);
      Iterator var3 = var2.entrySet().iterator();

      while(true) {
         while(var3.hasNext()) {
            Entry var4 = (Entry)var3.next();
            JsonElement var5 = (JsonElement)var4.getValue();
            if (var5.isJsonPrimitive() && ((JsonPrimitive)var5).isString()) {
               String var6 = bA.matcher(var5.getAsString()).replaceAll("%$1s");
               var1.accept((String)var4.getKey(), var6);
            } else {
               FeatherSourceFile311.Sb.warn("Language entry '" + (String)var4.getKey() + "' is not of type string");
            }
         }

         return;
      }
   }

   public static String ak() {
      String var0 = Minecraft.func_71410_x().func_135016_M().func_135041_c().func_135034_a();
      return var0;
   }

   // $FF: synthetic method
   FeatherSourceFile194(Object var1) {
      this();
   }

   static {
      aZ = aY;
   }
}
