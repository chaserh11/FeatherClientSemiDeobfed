package net.digitalingot.feather;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import net.digitalingot.vendor.javax.inject.Inject;
import net.digitalingot.vendor.javax.inject.Provider;
import net.digitalingot.vendor.javax.inject.Singleton;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Singleton
public class FeatherSourceFile689 {
   @NotNull
   private final @NotNull FeatherSourceFile434 xj;
   @NotNull
   private final @NotNull Provider bw;
   private FeatherSourceFile433 wj;
   @Nullable
   private @Nullable String ez;
   private long ty;
   private FeatherSourceFile433 om;
   @Nullable
   private @Nullable String tz;
   private long xg;
   @NotNull
   private final @NotNull FeatherSourceFile308 yz;

   @Inject
   FeatherSourceFile689(@NotNull @NotNull FeatherSourceFile434 var1, @NotNull @NotNull Provider var2, @NotNull @NotNull FeatherSourceFile308 var3) {
      this.xj = var1;
      this.bw = var2;
      this.yz = var3;
   }

   void fe() {
      this.tz();
   }

   public void om() {
      this.ty = 0L;
      this.xg = 0L;
      this.tz();
   }

   private void tz() {
      if (this.wj != null) {
         this.wj.cancel();
      }

      if (this.om != null) {
         this.om.cancel();
      }

      this.wj = this.xj.nc(() -> {
         this.ts();
         this.yz.lv();
      }, TimeUnit.HOURS.toSeconds(6L) * 20L, TimeUnit.HOURS.toSeconds(6L) * 20L);
      this.om = this.xj.lh(() -> {
         this.tz = this.og();
         this.yz.lv();
      }, TimeUnit.MINUTES.toSeconds(115L) * 20L, TimeUnit.MINUTES.toSeconds(115L) * 20L);
   }

   @Nullable
   public @Nullable String ru() {
      if (System.currentTimeMillis() > this.ty + TimeUnit.HOURS.toMillis(6L)) {
         this.ts();
      }

      return this.ez;
   }

   @NotNull void mr(@NotNull @NotNull String var1) {
      FeatherSourceFile311.Sb.info("Setting core backend token");
      this.ty = System.currentTimeMillis();
      this.ez = var1;
   }

   private void ts() {
      this.ty = System.currentTimeMillis();

      try {
         ((FeatherSourceFile700)this.bw.get()).ts();
      } catch (IOException var2) {
         FeatherSourceFile311.Sb.error("Error during fetching JWT Token", var2);
      }

   }

   @Nullable
   public @Nullable String rn() {
      if (this.tz == null || System.currentTimeMillis() > this.xg + TimeUnit.MINUTES.toMillis(115L)) {
         this.tz = this.og();
      }

      return this.tz;
   }

   @Nullable
   private @Nullable String og() {
      this.xg = System.currentTimeMillis();

      try {
         FeatherSourceFile311.Sb.debug("Fetching new game token...");
         return ((FeatherSourceFile700)this.bw.get()).og();
      } catch (IOException var2) {
         FeatherSourceFile311.Sb.error("Error during fetching game token", var2);
         return null;
      }
   }
}
