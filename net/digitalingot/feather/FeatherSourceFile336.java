package net.digitalingot.feather;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import net.digitalingot.vendor.javax.inject.Inject;
import net.digitalingot.vendor.javax.inject.Singleton;
import net.minecraft.util.ResourceLocation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Singleton
public class FeatherSourceFile336 {
   private static final String dz = FeatherSourceFile339.lt("FEATHER_COSMETICS_JSON", "https://game-client.feathermc.com/cosmetics.json");
   private static final Gson GSON = (new GsonBuilder()).registerTypeAdapter(ResourceLocation.class, new FeatherSourceFile468()).create();
   @NotNull
   private final @NotNull Map hm = new HashMap();
   @NotNull
   private final @NotNull Map qp = new HashMap();
   @NotNull
   private final @NotNull Map jy = new HashMap();
   @NotNull
   private final @NotNull Map gk = new HashMap();
   @NotNull
   private final @NotNull Map sd = new HashMap();

   @Inject
   FeatherSourceFile336() {
   }

   public void fe() {
      try {
         FeatherSourceFile78 var1 = (FeatherSourceFile78)FeatherSourceFile815.xz(dz).lh(GSON, FeatherSourceFile78.class);
         Iterator var2 = var1.jy().iterator();

         while(var2.hasNext()) {
            FeatherSourceFile165 var3 = (FeatherSourceFile165)var2.next();
            this.hm.put(var3.getSlug(), var3);
         }

         var2 = var1.gk().iterator();

         while(var2.hasNext()) {
            FeatherSourceFile739 var5 = (FeatherSourceFile739)var2.next();
            this.qp.put(var5.getSlug(), var5);
         }
      } catch (Exception var4) {
         FeatherSourceFile311.Sb.error("Error during cosmetics info fetch", var4);
      }

   }

   public FeatherSourceFile$lh40 ux(String var1) {
      return this.hm.containsKey(var1) ? FeatherSourceFile$lh40.COSMETIC : (this.qp.containsKey(var1) ? FeatherSourceFile$lh40.EMOTE : FeatherSourceFile$lh40.NONE);
   }

   @Nullable
   public @Nullable FeatherSourceFile165 si(String var1) {
      return (FeatherSourceFile165)this.hm.get(var1);
   }

   @Nullable
   public @Nullable FeatherSourceFile739 wz(String var1) {
      return (FeatherSourceFile739)this.qp.get(var1);
   }

   @NotNull
   public @NotNull Map nh() {
      return this.hm;
   }

   @NotNull
   public @NotNull Map xz() {
      return this.qp;
   }

   @NotNull
   public @NotNull Map dz() {
      return this.jy;
   }

   @NotNull
   public @NotNull Map hm() {
      return this.gk;
   }

   @NotNull
   public @NotNull Map qp() {
      return this.sd;
   }
}
