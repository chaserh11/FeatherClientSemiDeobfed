package net.digitalingot.feather;

import io.netty.channel.Channel;
import java.net.InetSocketAddress;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.function.Consumer;
import net.digitalingot.vendor.javax.inject.Inject;
import org.capnproto.MessageBuilder;
import org.capnproto.Void;
import org.capnproto.Data.Reader;
import org.capnproto.DataList.Builder;
import org.jetbrains.annotations.NotNull;

public class FeatherSourceFile848 extends FeatherSourceFile829 {
   @NotNull
   private @NotNull List NI = new ArrayList();

   @Inject
   FeatherSourceFile848(@NotNull @NotNull FeatherSourceFile849 var1) {
      super(var1);
   }

   public static @NotNull FeatherSourceFile848 xj(@NotNull @NotNull Channel var0) {
      FeatherSourceFile848 var1 = (FeatherSourceFile848)FeatherSourceFile487.mq().getInstance(FeatherSourceFile848.class);
      var1.vt = var0;
      return var1;
   }

   public void oe(Consumer var1) {
      MessageBuilder var2 = new MessageBuilder();
      FeatherSourceFile$ou.qy.lh var3 = this.lh((MessageBuilder)var2).sT().oN().qA();
      var1.accept(var3);
      this.nc(var2);
   }

   public @NotNull void nc(@NotNull String var1, short var2) {
      MessageBuilder var3 = new MessageBuilder();
      FeatherSourceFile$ou.oe.lh var4 = this.lh((MessageBuilder)var3).sT().oN().qD();
      var4.sp(var1);
      var4.nc(var2);
      this.nc(var3);
   }

   public void iX() {
      MessageBuilder var1 = new MessageBuilder();
      this.lh((MessageBuilder)var1).sT().oN().xj(Void.VOID);
      this.nc(var1);
   }

   public void G() {
      MessageBuilder var1 = new MessageBuilder();
      this.lh((MessageBuilder)var1).sW().rR().ou(Void.VOID);
      this.NI.clear();
      this.nc(var1);
   }

   public @NotNull @NotNull void lh(@NotNull @NotNull List var1, @NotNull @NotNull Set var2) {
      ArrayList var3 = new ArrayList(var1);
      var3.removeAll(this.NI);
      ArrayList var4 = new ArrayList(this.NI);
      var4.removeAll(var1);
      if (!var4.isEmpty() || !var3.isEmpty()) {
         if (!var3.isEmpty()) {
            ArrayList var5 = new ArrayList(var3);
            var5.removeAll(var2);
            if (!var2.isEmpty()) {
               this.hb(var5);
            }
         }

         MessageBuilder var14 = new MessageBuilder();
         FeatherSourceFile$ep.xj.lh var6 = this.lh((MessageBuilder)var14);
         FeatherSourceFile$hb.lh var7 = var6.sW();
         FeatherSourceFile$hb.qy.lh var8 = var7.rR();
         FeatherSourceFile$hb.xj.lh var9 = var8.sE();
         Builder var10 = var9.hy(var3.size());

         for(int var11 = 0; var11 < var3.size(); ++var11) {
            UUID var12 = (UUID)var3.get(var11);
            var10.set(var11, new Reader(FeatherSourceFile353.tx(var12)));
         }

         Builder var15 = var9.ue(var4.size());

         for(int var16 = 0; var16 < var4.size(); ++var16) {
            UUID var13 = (UUID)var4.get(var16);
            var15.set(var16, new Reader(FeatherSourceFile353.tx(var13)));
         }

         this.NI = var1;
         this.nc(var14);
      }
   }

   public @NotNull void qy(@NotNull @NotNull Set var1) {
      this.pv.iT().keySet().removeIf((var1x) -> {
         return !var1.contains(var1x);
      });
      var1.removeAll(this.pv.iT().keySet());
      if (!var1.isEmpty()) {
         MessageBuilder var2 = new MessageBuilder();
         FeatherSourceFile$ep.xj.lh var3 = this.lh((MessageBuilder)var2);
         FeatherSourceFile$lh$lh11 var4 = var3.sZ();
         Builder var5 = var4.jv(var1.size());
         int var6 = 0;

         for(Iterator var7 = var1.iterator(); var7.hasNext(); ++var6) {
            UUID var8 = (UUID)var7.next();
            var5.set(var6, new Reader(FeatherSourceFile353.tx(var8)));
         }

         this.nc(var2);
      }
   }

   public @NotNull void lt(@NotNull @NotNull List var1) {
      MessageBuilder var2 = new MessageBuilder();
      FeatherSourceFile$ep.xj.lh var3 = this.lh((MessageBuilder)var2);
      FeatherSourceFile$xj$lh1 var4 = var3.tD();
      org.capnproto.TextList.Builder var5 = var4.ii(var1.size());

      for(int var6 = 0; var6 < var1.size(); ++var6) {
         FeatherSourceFile165 var7 = (FeatherSourceFile165)var1.get(var6);
         String var8 = var7.getSlug();
         var5.set(var6, new org.capnproto.Text.Reader(var8));
      }

      this.nc(var2);
   }

   public @NotNull void hb(@NotNull @NotNull List var1) {
      MessageBuilder var2 = new MessageBuilder();
      FeatherSourceFile$ep.xj.lh var3 = this.lh((MessageBuilder)var2);
      FeatherSourceFile$nc$lh5 var4 = var3.tB();
      Builder var5 = var4.jv(var1.size());

      for(int var6 = 0; var6 < var1.size(); ++var6) {
         UUID var7 = (UUID)var1.get(var6);
         var5.set(var6, new Reader(FeatherSourceFile353.tx(var7)));
      }

      this.nc(var2);
   }

   public @NotNull void lh(@NotNull @NotNull FeatherSourceFile739 var1) {
      MessageBuilder var2 = new MessageBuilder();
      FeatherSourceFile$ep.xj.lh var3 = this.lh((MessageBuilder)var2);
      FeatherSourceFile$oe$lh2 var4 = var3.tG();
      var4.hz(var1.getSlug());
      this.nc(var2);
   }

   public void iY() {
      MessageBuilder var1 = new MessageBuilder();
      FeatherSourceFile$ep.xj.lh var2 = this.lh((MessageBuilder)var1);
      var2.tJ();
      this.nc(var1);
   }

   public @NotNull void sm(@NotNull @NotNull UUID var1) {
      MessageBuilder var2 = new MessageBuilder();
      FeatherSourceFile$ep.xj.lh var3 = this.lh((MessageBuilder)var2);
      FeatherSourceFile$si.lh1 var4 = var3.tM();
      var4.si(FeatherSourceFile353.tx(var1));
      this.nc(var2);
   }

   public @NotNull void ly(@NotNull @NotNull UUID var1) {
      MessageBuilder var2 = new MessageBuilder();
      FeatherSourceFile$ep.xj.lh var3 = this.lh((MessageBuilder)var2);
      FeatherSourceFile$mq.lh1 var4 = var3.tO();
      var4.si(FeatherSourceFile353.tx(var1));
      this.nc(var2);
   }

   public void xj(int var1, boolean var2) {
      MessageBuilder var3 = new MessageBuilder();
      FeatherSourceFile$ep.xj.lh var4 = this.lh((MessageBuilder)var3);
      FeatherSourceFile$mr.lh1 var5 = var4.tR();
      var5.qb(var1);
      var5.xi(var2);
      this.nc(var3);
   }

   public void iZ() {
      MessageBuilder var1 = new MessageBuilder();
      FeatherSourceFile$ep.xj.lh var2 = this.lh((MessageBuilder)var1);
      var2.tT().qY().oe(Void.VOID);
      this.nc(var1);
   }

   public @NotNull void rp(@NotNull @NotNull UUID var1) {
      MessageBuilder var2 = new MessageBuilder();
      FeatherSourceFile$ep.xj.lh var3 = this.lh((MessageBuilder)var2);
      var3.tT().qY().si(FeatherSourceFile353.tx(var1));
      this.nc(var2);
   }

   public @NotNull void lh(@NotNull @NotNull FeatherSourceFile$nc10 var1) {
      MessageBuilder var2 = new MessageBuilder();
      FeatherSourceFile$ep.xj.lh var3 = this.lh((MessageBuilder)var2);
      FeatherSourceFile$wz.lh var4 = var3.tW();
      FeatherSourceFile$wz.oe.lh var5 = var4.rI();
      var5.lh(var1);
      this.nc(var2);
   }

   public @NotNull @NotNull void lh(@NotNull @NotNull UUID var1, @NotNull @NotNull FeatherSourceFile449 var2) {
      MessageBuilder var3 = new MessageBuilder();
      FeatherSourceFile$ep.xj.lh var4 = this.lh((MessageBuilder)var3);
      FeatherSourceFile$as.lh var5 = var4.tY();
      FeatherSourceFile$lh$lh2 var6 = var5.kQ();
      this.lh(var6, var2);
      var5.si(FeatherSourceFile353.tx(var1));
      this.nc(var3);
   }

   public @NotNull @NotNull void nc(@NotNull @NotNull UUID var1, @NotNull @NotNull FeatherSourceFile449 var2) {
      MessageBuilder var3 = new MessageBuilder();
      FeatherSourceFile$ep.xj.lh var4 = this.lh((MessageBuilder)var3);
      FeatherSourceFile$pq.lh var5 = var4.uA();
      FeatherSourceFile$lh$lh2 var6 = var5.kQ();
      this.lh(var6, var2);
      var5.ux(FeatherSourceFile353.tx(var1));
      this.nc(var3);
   }

   private @NotNull @NotNull void lh(@NotNull @NotNull FeatherSourceFile$lh$lh2 var1, @NotNull @NotNull FeatherSourceFile449 var2) {
      InetSocketAddress var3 = var2.xX();
      String var4 = var3.getAddress().getHostAddress() + ":" + var3.getPort();
      var1.ud(var4);
      var1.wz(var2.lo());
   }
}
