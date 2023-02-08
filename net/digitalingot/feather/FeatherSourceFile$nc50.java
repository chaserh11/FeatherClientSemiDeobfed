package net.digitalingot.feather;

import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class FeatherSourceFile$nc50 extends FeatherSourceFile413 {
   private int BM;
   // $FF: synthetic field
   final FeatherSourceFile84 BN;

   public FeatherSourceFile$nc50(FeatherSourceFile84 var1) {
      this.BN = var1;
      this.BM = 0;
   }

   private void ai(boolean var1) {
      int var2 = var1 ? 0 : FeatherSourceFile323.lh(FeatherSourceFile84.lh(this.BN).field_71439_g, (Item[])(Items.field_151032_g));
      int var3 = var1 ? 0 : FeatherSourceFile323.lh(FeatherSourceFile84.lh(this.BN).field_71439_g, (Item[])(Items.field_151083_be, Items.field_151157_am, Items.field_151150_bK));
      int var4 = var1 ? 0 : FeatherSourceFile323.lh(FeatherSourceFile84.lh(this.BN).field_71439_g, (ItemStack[])(FeatherSourceFile84.aU()));
      int var5 = var1 ? 0 : FeatherSourceFile323.lh(FeatherSourceFile84.lh(this.BN).field_71439_g, (ItemStack[])(FeatherSourceFile84.aV()));
      int var6 = var1 ? 0 : FeatherSourceFile323.lh(FeatherSourceFile84.lh(this.BN).field_71439_g, (ItemStack[])(FeatherSourceFile84.aW(), FeatherSourceFile84.aX(), FeatherSourceFile84.aY(), FeatherSourceFile84.aZ()));
      int var7 = var1 ? 0 : FeatherSourceFile323.lh(FeatherSourceFile84.lh(this.BN).field_71439_g, (Item[])(Items.field_151009_A));
      int var8;
      if (((FeatherSourceFile$lh104)FeatherSourceFile84.nc(this.BN)).Bt.hG) {
         var8 = this.rl();
         int var9 = this.fv();
         this.gD.xj(0, 0, var8, var9, ((FeatherSourceFile$lh104)FeatherSourceFile84.xj(this.BN)).Bt.hH.getRGB());
         if (((FeatherSourceFile$lh104)FeatherSourceFile84.oe(this.BN)).Bt.hI) {
            int var10 = ((FeatherSourceFile$lh104)FeatherSourceFile84.qy(this.BN)).Bt.hJ.getRGB();
            float var11 = (float)((FeatherSourceFile$lh104)FeatherSourceFile84.ou(this.BN)).Bt.hK / 20.0F;
            this.gD.xj(0, 0, var8, var9, var10, var11);
         }
      }

      switch (((FeatherSourceFile$lh104)FeatherSourceFile84.pq(this.BN)).Br) {
         case HORIZONTAL:
            var8 = 0;
            boolean var12 = true;
            if (((FeatherSourceFile$lh104)FeatherSourceFile84.as(this.BN)).Bv) {
               this.lh(var8, 2, (Item)Items.field_151032_g, var2, ((FeatherSourceFile$lh104)FeatherSourceFile84.km(this.BN)).Bs, ((FeatherSourceFile$lh104)FeatherSourceFile84.mq(this.BN)).Bw);
               var8 += this.mm(var2) + 2;
            }

            if (((FeatherSourceFile$lh104)FeatherSourceFile84.mr(this.BN)).By) {
               this.lh(var8, 2, (Item)Items.field_151083_be, var3, ((FeatherSourceFile$lh104)FeatherSourceFile84.ux(this.BN)).Bs, ((FeatherSourceFile$lh104)FeatherSourceFile84.si(this.BN)).Bz);
               var8 += this.mm(var3) + 2;
            }

            if (((FeatherSourceFile$lh104)FeatherSourceFile84.wz(this.BN)).BE) {
               this.lh(var8, 2, (Item)Items.field_151153_ao, var4, ((FeatherSourceFile$lh104)FeatherSourceFile84.lt(this.BN)).Bs, ((FeatherSourceFile$lh104)FeatherSourceFile84.hb(this.BN)).BF);
               var8 += this.mm(var4) + 2;
            }

            if (((FeatherSourceFile$lh104)FeatherSourceFile84.ep(this.BN)).BH) {
               this.lh(var8, 2, (ItemStack)FeatherSourceFile84.aV(), var5, ((FeatherSourceFile$lh104)FeatherSourceFile84.qr(this.BN)).Bs, ((FeatherSourceFile$lh104)FeatherSourceFile84.eg(this.BN)).BI);
               var8 += this.mm(var5) + 2;
            }

            if (((FeatherSourceFile$lh104)FeatherSourceFile84.oy(this.BN)).BB) {
               this.lh(var8, 2, (ItemStack)FeatherSourceFile84.aW(), var6, ((FeatherSourceFile$lh104)FeatherSourceFile84.ug(this.BN)).Bs, ((FeatherSourceFile$lh104)FeatherSourceFile84.hv(this.BN)).BC);
               var8 += this.mm(var6) + 2;
            }

            if (((FeatherSourceFile$lh104)FeatherSourceFile84.sm(this.BN)).BK) {
               this.lh(var8, 2, (Item)Items.field_151009_A, var7, ((FeatherSourceFile$lh104)FeatherSourceFile84.ly(this.BN)).Bs, ((FeatherSourceFile$lh104)FeatherSourceFile84.rp(this.BN)).BL);
               var8 += this.mm(var7);
            }

            this.BM = var8;
            break;
         case VERTICAL:
            var8 = 0;
            if (((FeatherSourceFile$lh104)FeatherSourceFile84.tx(this.BN)).Bv) {
               this.lh(0, var8, (Item)Items.field_151032_g, var2, ((FeatherSourceFile$lh104)FeatherSourceFile84.wn(this.BN)).Bs, ((FeatherSourceFile$lh104)FeatherSourceFile84.jh(this.BN)).Bw);
               var8 += this.bA();
            }

            if (((FeatherSourceFile$lh104)FeatherSourceFile84.gr(this.BN)).By) {
               this.lh(0, var8, (Item)Items.field_151083_be, var3, ((FeatherSourceFile$lh104)FeatherSourceFile84.oh(this.BN)).Bs, ((FeatherSourceFile$lh104)FeatherSourceFile84.hg(this.BN)).Bz);
               var8 += this.bA();
            }

            if (((FeatherSourceFile$lh104)FeatherSourceFile84.et(this.BN)).BE) {
               this.lh(0, var8, (Item)Items.field_151153_ao, var4, ((FeatherSourceFile$lh104)FeatherSourceFile84.yl(this.BN)).Bs, ((FeatherSourceFile$lh104)FeatherSourceFile84.ai(this.BN)).BF);
               var8 += this.bA();
            }

            if (((FeatherSourceFile$lh104)FeatherSourceFile84.ja(this.BN)).BH) {
               this.lh(0, var8, (ItemStack)FeatherSourceFile84.aV(), var5, ((FeatherSourceFile$lh104)FeatherSourceFile84.qn(this.BN)).Bs, ((FeatherSourceFile$lh104)FeatherSourceFile84.er(this.BN)).BI);
               var8 += this.bA();
            }

            if (((FeatherSourceFile$lh104)FeatherSourceFile84.zd(this.BN)).BB) {
               this.lh(0, var8, (ItemStack)FeatherSourceFile84.aW(), var6, ((FeatherSourceFile$lh104)FeatherSourceFile84.ps(this.BN)).Bs, ((FeatherSourceFile$lh104)FeatherSourceFile84.xm(this.BN)).BC);
               var8 += this.bA();
            }

            if (((FeatherSourceFile$lh104)FeatherSourceFile84.ku(this.BN)).BK) {
               this.lh(0, var8, (Item)Items.field_151009_A, var7, ((FeatherSourceFile$lh104)FeatherSourceFile84.vt(this.BN)).Bs, ((FeatherSourceFile$lh104)FeatherSourceFile84.ck(this.BN)).BL);
               int var10000 = var8 + this.bA();
            }
      }

   }

   public void lh(FeatherSourceFile683 var1) {
      this.ai(false);
   }

   public void sy() {
      this.ai(true);
   }

   public int fv() {
      if (((FeatherSourceFile$lh104)FeatherSourceFile84.xy(this.BN)).Br == FeatherSourceFile$lh$lh8.HORIZONTAL) {
         return ((FeatherSourceFile$lh104)FeatherSourceFile84.fh(this.BN)).Bs != FeatherSourceFile$lh$nc2.TOP && ((FeatherSourceFile$lh104)FeatherSourceFile84.xi(this.BN)).Bs != FeatherSourceFile$lh$nc2.BOTTOM ? 16 : 30;
      } else {
         return ((FeatherSourceFile$lh104)FeatherSourceFile84.cg(this.BN)).Bs != FeatherSourceFile$lh$nc2.TOP && ((FeatherSourceFile$lh104)FeatherSourceFile84.sb(this.BN)).Bs != FeatherSourceFile$lh$nc2.BOTTOM ? this.BN.aT() * 18 - 2 : this.BN.aT() * 30 - 2;
      }
   }

   public int rl() {
      return ((FeatherSourceFile$lh104)FeatherSourceFile84.jr(this.BN)).Br == FeatherSourceFile$lh$lh8.HORIZONTAL ? this.BM : this.mm(99);
   }

   private int bA() {
      return ((FeatherSourceFile$lh104)FeatherSourceFile84.rt(this.BN)).Bs != FeatherSourceFile$lh$nc2.BOTTOM && ((FeatherSourceFile$lh104)FeatherSourceFile84.nb(this.BN)).Bs != FeatherSourceFile$lh$nc2.TOP ? 18 : 30;
   }

   private int bh(int var1) {
      return (16 - this.gD.vr(String.valueOf(var1))) / 2;
   }

   private int mm(int var1) {
      return ((FeatherSourceFile$lh104)FeatherSourceFile84.gy(this.BN)).Bs != FeatherSourceFile$lh$nc2.BOTTOM && ((FeatherSourceFile$lh104)FeatherSourceFile84.bh(this.BN)).Bs != FeatherSourceFile$lh$nc2.TOP ? 18 + this.gD.vr(String.valueOf(var1)) : 16;
   }

   public void lh(int var1, int var2, Item var3, int var4, FeatherSourceFile$lh$nc2 var5, FeatherSourceFile225 var6) {
      ItemStack var7 = new ItemStack(var3);
      this.lh(var1, var2, var7, var4, var5, var6);
   }

   public void lh(int var1, int var2, ItemStack var3, int var4, FeatherSourceFile$lh$nc2 var5, FeatherSourceFile225 var6) {
      int var7;
      int var8;
      int var9;
      int var10;
      switch (var5) {
         case BOTTOM:
            var7 = var1;
            var8 = var2;
            var9 = var1 + this.bh(var4);
            var10 = var2 + 16;
            break;
         case TOP:
            var7 = var1;
            var8 = var2 + 12;
            var9 = var1 + this.bh(var4);
            var10 = var2;
            break;
         case LEFT:
            var7 = var1 + this.gD.vr(String.valueOf(var4)) + 2;
            var8 = var2;
            var9 = var1;
            var10 = var2 + 2;
            break;
         case RIGHT:
            var7 = var1;
            var8 = var2;
            var9 = var1 + 16 + 2;
            var10 = var2 + 2;
            break;
         default:
            throw new IllegalStateException();
      }

      this.gD.lh(var3, var7, var8, false, false);
      this.gD.lh(String.valueOf(var4), (float)var9, (float)var10, var6, !((FeatherSourceFile$lh104)FeatherSourceFile84.mm(this.BN)).Bt.hG);
      FeatherSourceFile843.nc(1.0F, 1.0F, 1.0F, 1.0F);
   }

   public FeatherSourceFile89 hk() {
      return ((FeatherSourceFile$lh104)FeatherSourceFile84.xe(this.BN)).Bt;
   }
}
