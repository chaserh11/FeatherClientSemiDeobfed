package net.digitalingot.feather;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import net.digitalingot.vendor.javax.inject.Inject;
import net.digitalingot.vendor.javax.inject.Singleton;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Singleton
public class FeatherSourceFile596 {
   private final Gson cf;
   @NotNull
   private final @NotNull FeatherSourceFile144 qr;
   @NotNull
   private final @NotNull FeatherSourceFile665 hb;
   @NotNull
   private final @NotNull FeatherSourceFile190 ep;
   @NotNull
   private final @NotNull FeatherSourceFile657 lt;
   private final FeatherSourceFile207 hf;
   private final FeatherSourceFile308 yz;

   @Inject
   FeatherSourceFile596(@FeatherSourceFile$lh10 Gson var1, @NotNull @NotNull FeatherSourceFile144 var2, @NotNull @NotNull FeatherSourceFile665 var3, @NotNull @NotNull FeatherSourceFile190 var4, @NotNull @NotNull FeatherSourceFile657 var5, FeatherSourceFile207 var6, FeatherSourceFile308 var7) {
      this.cf = var1;
      this.qr = var2;
      this.hb = var3;
      this.ep = var4;
      this.lt = var5;
      this.hf = var6;
      this.yz = var7;
   }

   public void ex() {
      this.lt.fe();
   }

   public void rp() {
      this.qr.nc(this.hb.dx());
   }

   public void sw() {
      this.qr.ff();
      Iterator var1 = this.hb.dx().iterator();

      while(var1.hasNext()) {
         FeatherSourceFile495 var2 = (FeatherSourceFile495)var1.next();
         this.lt.mr(var2);
      }

      this.ep.sk();
      this.hf.rj();
      this.hf.jx();
      this.yz.ga();
   }

   public @NotNull @NotNull void lh(@NotNull @NotNull FeatherSourceFile495 var1, @NotNull @NotNull Map var2) {
      FeatherSourceFile726 var3 = new FeatherSourceFile726(var1.pr().getClass());
      List var4 = var3.di();
      this.lh((List)var4, (FeatherSourceFile495)var1, (FeatherSourceFile712)null, (Map)var2, (String)"");
   }

   private @NotNull @NotNull @Nullable @NotNull @NotNull void lh(@NotNull @NotNull List var1, @NotNull @NotNull FeatherSourceFile495 var2, @Nullable @Nullable FeatherSourceFile712 var3, @NotNull @NotNull Map var4, @NotNull @NotNull String var5) {
      Iterator var6 = var1.iterator();

      while(var6.hasNext()) {
         FeatherSourceFile712 var7 = (FeatherSourceFile712)var6.next();
         FeatherSourceFile571 var8 = var7.ce();
         FeatherSourceFile656 var9 = var7.mo();
         if (var9 != null) {
            this.lh(var2, var4, var5, var7, var9);
         } else {
            if (var8 == null) {
               throw new FeatherSourceFile584("@Value or @Nested annotation is missing on field \"" + var7.ad().getName() + "\"");
            }

            if (var3 != null) {
               this.lh(var3.as(var2.pr()), var4, var5, var7, var8);
            } else {
               this.lh((Object)var2, (Map)var4, (String)var5, (FeatherSourceFile712)var7, (FeatherSourceFile571)var8);
            }
         }
      }

   }

   private @NotNull @NotNull @NotNull @NotNull @NotNull void lh(@NotNull @NotNull FeatherSourceFile495 var1, @NotNull @NotNull Map var2, @NotNull @NotNull String var3, @NotNull @NotNull FeatherSourceFile712 var4, @NotNull @NotNull FeatherSourceFile656 var5) {
      List var6 = (new FeatherSourceFile726(var4.cn())).lh((FeatherSourceFile192)var4.ad().getDeclaredAnnotation(FeatherSourceFile192.class));
      String var7 = var3.isEmpty() ? var5.ox() : var3 + ":" + var5.ox();
      this.lh(var6, var1, var4, var2, var7);
   }

   private @NotNull @NotNull @NotNull @NotNull @NotNull void lh(@NotNull @NotNull Object var1, @NotNull @NotNull Map var2, @NotNull @NotNull String var3, @NotNull @NotNull FeatherSourceFile712 var4, @NotNull @NotNull FeatherSourceFile571 var5) {
      String var6 = var5.lb();
      String var7 = var3.isEmpty() ? var6 : var3 + ":" + var6;
      JsonElement var8 = (JsonElement)var2.get(var7);
      if (var8 != null) {
         Object var9 = this.cf.fromJson(var8, var4.cn());
         FeatherSourceFile617 var10 = new FeatherSourceFile617(var4);
         if ((var4.wd() == null || var4.ce() == null || var4.do() == null || !var4.ce().lb().equals(var4.do().bn())) && !var10.mq(var9)) {
            throw new IllegalArgumentException("Config key \"" + var6 + "\" contained a payload which couldn't be validated: \"" + var8 + "\"");
         } else {
            if (var1 instanceof FeatherSourceFile495) {
               var4.nc(((FeatherSourceFile495)var1).pr(), var9);
            } else {
               var4.nc(var1, var9);
            }

         }
      }
   }

   public @NotNull void pq(@NotNull @NotNull FeatherSourceFile495 var1) {
      FeatherSourceFile136 var2 = var1.pr();
      this.qr.yp().put(var1.fg(), new HashMap());
      this.lt.mr(var1);
      FeatherSourceFile136 var3 = var1.pr();
      this.lh(var2, var3);
      this.mq(var1);
   }

   private @NotNull @NotNull void lh(@NotNull @NotNull FeatherSourceFile136 var1, @NotNull @NotNull FeatherSourceFile136 var2) {
      var2.enabled = var1.enabled;
      var2.eP = var1.eP;
      var2.hM = var1.hM;
      this.lh((Object)var1, (Object)var2);
   }

   private @NotNull @NotNull void lh(@NotNull @NotNull Object var1, @NotNull @NotNull Object var2) {
      if (var1 instanceof FeatherSourceFile89) {
         FeatherSourceFile89 var3 = (FeatherSourceFile89)var1;
         FeatherSourceFile89 var4 = (FeatherSourceFile89)var2;
         var4.gF = var3.gF;
         var4.gG = var3.gG;
         var4.gH = var3.gH;
         var4.gI = var3.gI;
         var4.gJ = var3.gJ;
      }

      Class var7 = var1.getClass();
      List var8 = (new FeatherSourceFile726(var7)).di();
      Iterator var5 = var8.iterator();

      while(var5.hasNext()) {
         FeatherSourceFile712 var6 = (FeatherSourceFile712)var5.next();
         if (var6.mo() != null) {
            this.lh(var6.as(var1), var6.as(var2));
         }
      }

   }

   public @NotNull void xj(@NotNull @NotNull FeatherSourceFile360 var1) {
      Field[] var2 = var1.pr().getClass().getFields();
      int var3 = var2.length;

      for(int var4 = 0; var4 < var3; ++var4) {
         Field var5 = var2[var4];
         FeatherSourceFile600 var6 = (FeatherSourceFile600)var5.getAnnotation(FeatherSourceFile600.class);
         if (var6 != null) {
            FeatherSourceFile637 var7 = var6.xp();
            double var8 = var6.vl();
            double var10 = var6.go();
            double var12 = var6.dc();

            FeatherSourceFile89 var14;
            try {
               var14 = (FeatherSourceFile89)var5.get(var1.pr());
            } catch (IllegalAccessException var16) {
               throw new IllegalStateException(var16);
            }

            var14.lh(var7, var8, var10, var12);
         }
      }

      this.mq(var1);
   }

   public @NotNull void pq(@NotNull @NotNull FeatherSourceFile413 var1) {
      FeatherSourceFile360 var2 = var1.rf();
      switch (var2.ni()) {
         case ONLY_HUD_ELEMENT:
            var1.hk().gF = false;
            break;
         case DISABLE_MODULE_IF_NO_HUD_ELEMENTS:
            var2.pr().enabled = var2.hh().stream().noneMatch((var0) -> {
               return var0.hk().gF;
            });
            break;
         case DISABLE_MODULE:
            var2.pr().enabled = false;
      }

      this.mq(var2);
   }

   public @NotNull void as(@NotNull @NotNull FeatherSourceFile495 var1) {
      var1.pr().enabled = true;
      this.mq(var1);
   }

   public @NotNull void km(@NotNull @NotNull FeatherSourceFile495 var1) {
      var1.pr().enabled = false;
      this.mq(var1);
   }

   public @NotNull void mq(@NotNull @NotNull FeatherSourceFile495 var1) {
      this.qr.lh(var1.fg(), var1.pr());
      var1.kc();
      var1.pu();
      if (var1.uj() && !var1.pr().vy()) {
         this.ep.unload(var1);
      } else if (!var1.uj() && var1.pr().vy()) {
         this.ep.load(var1);
      }

      FeatherSourceFile368 var2 = (FeatherSourceFile368)var1.pr().getClass().getDeclaredAnnotation(FeatherSourceFile368.class);
      if (var2 != null && !var2.qj().bv().isEmpty()) {
         this.yz.ga();
      }

   }

   @NotNull
   public @NotNull FeatherSourceFile144 yy() {
      return this.qr;
   }
}
