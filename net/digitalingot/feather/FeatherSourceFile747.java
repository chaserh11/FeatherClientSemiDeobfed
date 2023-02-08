package net.digitalingot.feather;

import java.util.LinkedList;
import net.digitalingot.vendor.javax.inject.Inject;
import net.digitalingot.vendor.javax.inject.Singleton;
import net.minecraft.client.Minecraft;
import org.jetbrains.annotations.NotNull;

@Singleton
public class FeatherSourceFile747 {
   private static final boolean ou = System.getenv("FEATHER_TEST") != null;
   private static final boolean pq = System.getenv("FEATHER_DEBUG") != null;
   private static final LinkedList as = new LinkedList();
   private static boolean km;
   private static FeatherSourceFile747 mq;
   private final String mr;
   private final FeatherSourceFile434 xj;
   private final FeatherSourceFile420 ux;
   private final FeatherSourceFile18 si;
   private final FeatherSourceFile776 wz;
   private final FeatherSourceFile657 lt;
   private final FeatherSourceFile665 hb;
   private final FeatherSourceFile190 ep;
   private final FeatherSourceFile144 qr;

   @Inject
   FeatherSourceFile747(String var1, FeatherSourceFile434 var2, FeatherSourceFile420 var3, FeatherSourceFile18 var4, FeatherSourceFile776 var5, FeatherSourceFile657 var6, FeatherSourceFile665 var7, FeatherSourceFile190 var8, FeatherSourceFile144 var9) {
      this.si = var4;
      mq = this;
      this.mr = var1;
      this.xj = var2;
      this.ux = var3;
      this.wz = var5;
      this.lt = var6;
      this.hb = var7;
      this.ep = var8;
      this.qr = var9;
   }

   void xj() {
      this.xj.fe();
      this.ux.fe();
      this.qr.ff();
      this.lt.fe();
      km = true;
      FeatherSourceFile721.yq();
      this.ep.wt();
      this.qr.nc(this.hb.dx());
      FeatherSourceFile752.vp();
      this.wz.fe();
      this.si.lh();
      FeatherSourceFile311.Sb.info("Started Feather (" + this.mr + ")");

      Runnable var1;
      while((var1 = (Runnable)as.poll()) != null) {
         var1.run();
      }

   }

   public static FeatherSourceFile434 oe() {
      return mq.xj;
   }

   public static @NotNull void lh(@NotNull @NotNull Runnable var0) {
      as.add(var0);
   }

   public static boolean qy() {
      return Minecraft.func_71410_x().func_152345_ab();
   }

   public static boolean ou() {
      return km;
   }

   public static boolean pq() {
      return ou;
   }

   public static boolean as() {
      return pq;
   }
}
