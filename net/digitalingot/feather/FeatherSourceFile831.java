package net.digitalingot.feather;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.UUID;
import net.digitalingot.vendor.javax.inject.Inject;
import org.capnproto.StructList.Reader;

public class FeatherSourceFile831 extends ChannelInboundHandlerAdapter {
   private final FeatherSourceFile849 pv;
   private final FeatherSourceFile833 NL;
   private final FeatherSourceFile826 NM;
   private final FeatherSourceFile832 NN;

   @Inject
   FeatherSourceFile831(FeatherSourceFile849 var1, FeatherSourceFile833 var2, FeatherSourceFile826 var3, FeatherSourceFile832 var4) {
      this.pv = var1;
      this.NL = var2;
      this.NM = var3;
      this.NN = var4;
   }

   public void channelRead(ChannelHandlerContext var1, Object var2) {
      FeatherSourceFile$wz$oe1 var3 = (FeatherSourceFile$wz$oe1)var2;
      FeatherSourceFile$wz$xj.xj var4 = var3.nZ();
      UUID var8;
      UUID var14;
      Reader var23;
      ArrayList var24;
      Iterator var27;
      switch (var4.lN()) {
         case AUTHENTICATION_SUCCESS:
            FeatherSourceFile311.Sb.error("Received authentication successful packet on Redstone while already authenticated.");
            break;
         case SOFT_ERROR:
            FeatherSourceFile$si$xj1 var5 = var4.nC();
            String var6 = var5.lJ().toString();
            this.NL.ej(var6);
            break;
         case EMOTE_UPDATE:
            FeatherSourceFile$oe$xj var22 = var4.nE();
            var8 = FeatherSourceFile353.eg(var22.jV().toArray());
            String var28 = var22.kK().toString();
            this.NM.lh(var8, var28);
            break;
         case OPTION_REFRESH_PROMPT:
            FeatherSourceFile$qy$xj var20 = var4.nG();
            var8 = FeatherSourceFile353.eg(var20.jV().toArray());
            FeatherSourceFile848 var26 = this.pv.iU();

            assert var26 != null;

            HashSet var30 = new HashSet(1);
            var30.add(var8);
            var26.qy(var30);
            break;
         case BULK_OPTION_RESPONSE:
            FeatherSourceFile$lh$oe var19 = var4.nI();
            var23 = var19.jX();
            Iterator var25 = var23.iterator();

            while(var25.hasNext()) {
               FeatherSourceFile$lh$xj.qy var29 = (FeatherSourceFile$lh$xj.qy)var25.next();
               UUID var33 = FeatherSourceFile353.eg(var29.jV().toArray());
               FeatherSourceFile$lh$xj.nc.xj var36 = var29.jW();
               this.pv.iT().put(var33, var36);
            }

            return;
         case COSMETIC_SET:
            FeatherSourceFile$xj$oe var18 = var4.nK();
            var23 = var18.kG();
            var24 = new ArrayList(var23.size());
            var27 = var23.iterator();

            while(var27.hasNext()) {
               FeatherSourceFile$xj$nc.xj var32 = (FeatherSourceFile$xj$nc.xj)var27.next();
               UUID var35 = FeatherSourceFile353.eg(var32.jV().toArray());
               org.capnproto.TextList.Reader var38 = var32.kB();
               ArrayList var39 = new ArrayList(var38.size());
               Iterator var40 = var38.iterator();

               while(var40.hasNext()) {
                  org.capnproto.Text.Reader var41 = (org.capnproto.Text.Reader)var40.next();
                  var39.add(var41.toString());
               }

               var24.add(new FeatherSourceFile827(var35, var39));
            }

            this.NM.lh(var24);
            break;
         case COSMETIC_OWNED:
            FeatherSourceFile$nc$xj1 var17 = var4.nM();
            org.capnproto.TextList.Reader var21 = var17.kB();
            var24 = new ArrayList(var21.size());
            var27 = var21.iterator();

            while(var27.hasNext()) {
               org.capnproto.Text.Reader var31 = (org.capnproto.Text.Reader)var27.next();
               var24.add(var31.toString());
            }

            this.NM.nc(var24);
            break;
         case PARTY_INFO:
            FeatherSourceFile$as$xj1 var7 = var4.nO();
            var8 = FeatherSourceFile353.eg(var7.la().toArray());
            FeatherSourceFile$nc10 var9 = var7.gZ();
            org.capnproto.DataList.Reader var10 = var7.lp();
            ArrayList var11 = new ArrayList(var10.size());
            Iterator var34 = var10.iterator();

            while(var34.hasNext()) {
               org.capnproto.Data.Reader var37 = (org.capnproto.Data.Reader)var34.next();
               var14 = FeatherSourceFile353.eg(var37.toArray());
               var11.add(var14);
            }

            this.NN.lh(var8, var11, var9);
            break;
         case PARTY_INVITE:
            FeatherSourceFile$km$xj var12 = var4.nQ();
            int var13 = var12.hC();
            var14 = FeatherSourceFile353.eg(var12.lD().toArray());
            this.NN.lh(var13, var14);
            break;
         case PARTY_INVITE_DENIED:
            FeatherSourceFile$mq$xj var15 = var4.nS();
            UUID var16 = FeatherSourceFile353.eg(var15.jV().toArray());
            this.NN.mr(var16);
            break;
         case PARTY_LEAVE:
            this.NN.N();
      }

   }
}
