package net.digitalingot.feather;

import java.io.File;
import java.nio.file.Path;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import net.digitalingot.vendor.javax.inject.Inject;
import net.digitalingot.vendor.javax.inject.Provider;
import net.digitalingot.vendor.javax.inject.Singleton;

@Singleton
public class FeatherSourceFile693 {
   private static final long bt = 1500L;
   private static final String se = "^(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)$";
   private static final Pattern yh = Pattern.compile("^(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)$");
   private final FeatherSourceFile626 ku;
   private final FeatherSourceFile131 rb;
   private String ej = null;
   private final File vr;
   private FeatherSourceFile$lh124 kx;
   private final FeatherSourceFile700 ch;
   private final FeatherSourceFile434 bh;
   private final FeatherSourceFile308 yz;
   private final Provider ii;
   private long zk = 0L;

   @Inject
   FeatherSourceFile693(FeatherSourceFile626 var1, FeatherSourceFile131 var2, @FeatherSourceFile$xj15 Path var3, FeatherSourceFile700 var4, FeatherSourceFile434 var5, FeatherSourceFile308 var6, Provider var7) {
      this.ku = var1;
      this.rb = var2;
      this.vr = var3.resolve("chat_server_store.json").toFile();
      this.ch = var4;
      this.bh = var5;
      this.yz = var6;
      this.ii = var7;
   }

   public FeatherSourceFile33 tm() {
      return this.kx.bo;
   }

   public String bo() {
      return this.ej;
   }

   public void fe() {
      if (this.vr.exists()) {
         try {
            this.kx = (FeatherSourceFile$lh124)FeatherSourceFile815.ux(this.vr).km(FeatherSourceFile$lh124.class);
         } catch (Exception var2) {
            this.kx = new FeatherSourceFile$lh124();
         }
      } else {
         this.kx = new FeatherSourceFile$lh124();
      }

      this.ku.yh();
      this.ku.lh(new FeatherSourceFile574() {
         public void yz() {
            FeatherSourceFile693.this.rb.yz();
         }

         public void kx() {
            FeatherSourceFile693.this.rb.kx();
            FeatherSourceFile693.this.bh.nc(() -> {
               FeatherSourceFile693.this.pq(FeatherSourceFile693.this.ej);
               FeatherSourceFile693.this.rb.lh(FeatherSourceFile693.this.kx.bo);
            }, 60L);
         }

         public void oe(String var1) {
            FeatherSourceFile693.this.rb.km(var1);
         }
      });
      FeatherSourceFile357.ws.oe((var1, var2x, var3) -> {
         if (!ou(var2x)) {
            String var4 = var3 == 25565 ? var2x : String.format("%s:%s", var2x, var3);
            this.pq(var4);
         }
      });
      FeatherSourceFile725.wi.oe((var1, var2x) -> {
         this.pq((String)null);
      });
      FeatherSourceFile370.ws.oe(() -> {
         FeatherSourceFile434 var10000 = this.bh;
         FeatherSourceFile626 var10001 = this.ku;
         Objects.requireNonNull(var10001);
         var10000.nc(var10001::ii, 60L);
         var10000 = this.bh;
         FeatherSourceFile308 var1 = this.yz;
         Objects.requireNonNull(var1);
         var10000.nc(var1::lv, 80L);
         this.bh.nc(this::fa, 100L);
      });
   }

   public static boolean ou(String var0) {
      if (var0 == null) {
         return false;
      } else {
         Matcher var1 = yh.matcher(var0);
         return var1.matches();
      }
   }

   public void lh(FeatherSourceFile33 var1) {
      this.kx.bo = var1;
      this.qb();
   }

   private void fa() {
      this.pq(this.ej);
      this.rb.lh(this.kx.bo);
   }

   public void pq(String var1) {
      if (!((FeatherSourceFile$lh25)((FeatherSourceFile200)this.ii.get()).pr()).Jz) {
         if (System.currentTimeMillis() - this.zk >= 1500L) {
            this.ej = var1;
            this.bh.oe(() -> {
               try {
                  this.ch.pq(var1);
                  this.zk = System.currentTimeMillis();
               } catch (Exception var3) {
                  FeatherSourceFile311.Sb.error("Failed to update chat location");
               }

            });
         }
      }
   }

   private void qb() {
      this.vr.getParentFile().mkdirs();
      FeatherSourceFile815.ux(this.vr).wU().wz(this.kx);
   }
}
