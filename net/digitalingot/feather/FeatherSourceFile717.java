package net.digitalingot.feather;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.UUID;
import net.digitalingot.vendor.javax.inject.Inject;
import net.digitalingot.vendor.javax.inject.Provider;
import net.digitalingot.vendor.javax.inject.Singleton;

@Singleton
public class FeatherSourceFile717 implements FeatherSourceFile148 {
   private final FeatherSourceFile493 Kt;
   private final FeatherSourceFile689 jr;
   private final FeatherSourceFile70 JT;
   private final FeatherSourceFile434 bh;
   private final FeatherSourceFile736 Ku;
   private final Provider Kv;
   private final FeatherSourceFile549 JV;

   @Inject
   FeatherSourceFile717(FeatherSourceFile689 var1, FeatherSourceFile70 var2, FeatherSourceFile434 var3, FeatherSourceFile736 var4, Provider var5, FeatherSourceFile549 var6) {
      this.jr = var1;
      this.JT = var2;
      this.bh = var3;
      this.Ku = var4;
      this.Kv = var5;
      this.JV = var6;
      this.Kt = new FeatherSourceFile493();
   }

   public void fe() {
      this.Kt.lh((FeatherSourceFile148)this);
      FeatherSourceFile370.ws.oe(this::vr);
   }

   public void yh() {
      try {
         InetAddress var1 = InetAddress.getByName(FeatherSourceFile586.Kz);
         FeatherSourceFile311.Sb.info("Connecting to voice server...");
         this.Kt.lh(var1, 24917);
      } catch (UnknownHostException var2) {
         throw new RuntimeException(var2);
      }
   }

   public boolean se() {
      return this.Kt.se();
   }

   public boolean vr() {
      return this.Kt.vr();
   }

   public boolean ch() {
      return !this.Kt.bt();
   }

   private void ej() {
      if (((FeatherSourceFile121)this.Kv.get()).uj()) {
         FeatherSourceFile311.Sb.info("Reconnecting to voice in 5 seconds");
         this.bh.nc(this::yh, 100L);
      }
   }

   public void kx() {
      FeatherSourceFile311.Sb.info("Authenticating with voice server");
      this.Kt.xg(this.jr.rn());
   }

   public void lh(Throwable var1) {
      FeatherSourceFile311.Sb.error("Couldn't connect to voice server");
      this.ej();
   }

   public void wj(String var1) {
      FeatherSourceFile311.Sb.info("Disconnected because " + var1);
      this.ej();
   }

   public void eS() {
      FeatherSourceFile311.Sb.info("Authenticated with voice server");
   }

   public void lh(FeatherSourceFile480 var1) {
      FeatherSourceFile526 var2 = new FeatherSourceFile526(FeatherSourceFile$nc.PROXIMITY, var1.gN());
      UUID var3 = var1.gO();
      if (this.Ku.F().contains(var3)) {
         this.JT.lh(var1.gO(), var2);
      }
   }

   public void lh(FeatherSourceFile110 var1) {
      this.JV.oe(var1.gK());
   }

   public void lh(FeatherSourceFile305 var1) {
      this.Kt.nc(var1);
   }
}
