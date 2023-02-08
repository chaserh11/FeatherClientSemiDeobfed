package net.digitalingot.feather.mixin;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import net.digitalingot.feather.FeatherSourceFile45;
import net.digitalingot.feather.FeatherSourceFile721;
import net.digitalingot.feather.FeatherSourceFile815;
import org.jetbrains.annotations.NotNull;
import org.objectweb.asm.tree.ClassNode;
import org.spongepowered.asm.mixin.Mixins;
import org.spongepowered.asm.mixin.extensibility.IMixinConfigPlugin;
import org.spongepowered.asm.mixin.extensibility.IMixinInfo;

public class FeatherSourceFile implements IMixinConfigPlugin {
   private static final Gson GSON = (new GsonBuilder()).create();
   private static final Type CONDITIONS_TYPE = (new TypeToken() {
   }).getType();
   private static final String CONDITIONS_SOURCE = "/mixins.feather.cond.json";
   private static final FeatherSourceFile.lh SOLVER = new FeatherSourceFile.lh((var0) -> {
      if ("sodium".equals(var0)) {
         return FeatherSourceFile.nc.INSTANCE.test() ? 1 : 0;
      } else if ("patcher".equals(var0)) {
         return FeatherSourceFile45.nw() ? 1 : 0;
      } else {
         return "optifine".equals(var0) ? FeatherSourceFile721.nw() ? 1 : 0 : null;
      }
   });
   private final List extraMixins = Lists.newArrayList();

   public void onLoad(String var1) {
      Iterator var2 = loadConditionals().entrySet().iterator();

      while(var2.hasNext()) {
         Entry var3 = (Entry)var2.next();
         if (SOLVER.ku((String)var3.getValue())) {
            this.extraMixins.add((String)var3.getKey());
         }
      }

   }

   public String getRefMapperConfig() {
      return null;
   }

   public boolean shouldApplyMixin(String var1, String var2) {
      return true;
   }

   public void acceptTargets(Set var1, Set var2) {
   }

   public List getMixins() {
      Mixins.addConfiguration("mixins.feather.optifine.json");
      return this.extraMixins;
   }

   public void preApply(String var1, ClassNode var2, String var3, IMixinInfo var4) {
   }

   public void preApply(String var1, feather.org.objectweb.asm.tree.ClassNode var2, String var3, IMixinInfo var4) {
   }

   public void postApply(String var1, ClassNode var2, String var3, IMixinInfo var4) {
   }

   public void postApply(String var1, feather.org.objectweb.asm.tree.ClassNode var2, String var3, IMixinInfo var4) {
   }

   @NotNull
   private static @NotNull Map loadConditionals() {
      try {
         return loadConditionals0();
      } catch (Throwable var1) {
         return Maps.newHashMap();
      }
   }

   @NotNull
   private static @NotNull Map loadConditionals0() {
      return (Map)FeatherSourceFile815.hm("/mixins.feather.cond.json").lh(GSON, CONDITIONS_TYPE);
   }

   static class lh {
      private final FeatherSourceFile.xj gA;

      public lh(FeatherSourceFile.xj var1) {
         this.gA = var1;
      }

      public boolean ku(String var1) {
         String[] var2 = var1.split("==");
         String var3 = var2[0].trim();
         int var4 = this.gA.getToken(var3);
         int var5 = Integer.parseInt(var2[1].trim());
         return var4 == var5;
      }
   }

   static enum nc {
      INSTANCE(isSodiumLoaded());

      private static final String SODIUM_TEST_CLASS = "me.jellysquid.mods.sodium.mixin.SodiumMixinPlugin";
      private final boolean loaded;

      private nc(boolean var3) {
         this.loaded = var3;
      }

      public boolean test() {
         return this.loaded;
      }

      private static boolean isSodiumLoaded() {
         try {
            Class.forName("me.jellysquid.mods.sodium.mixin.SodiumMixinPlugin");
            return true;
         } catch (ClassNotFoundException var1) {
            return false;
         }
      }

      // $FF: synthetic method
      private static FeatherSourceFile.nc[] $values() {
         return new FeatherSourceFile.nc[]{INSTANCE};
      }
   }

   interface xj {
      Integer getToken(String var1);
   }
}
