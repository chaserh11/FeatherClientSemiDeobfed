package net.digitalingot.feather;

import java.text.DecimalFormat;
import net.minecraft.client.Minecraft;
import net.minecraft.client.settings.GameSettings;
import org.lwjgl.opengl.GL11;

public class FeatherSourceFile$pq1 extends FeatherSourceFile413 implements FeatherSourceFile$lh16 {
   private final FeatherSourceFile583 CT;
   private final DecimalFormat CU;
   private FeatherSourceFile$oe4 CV;
   private FeatherSourceFile$oe4 CW;
   private FeatherSourceFile$oe4 CX;
   private FeatherSourceFile$oe4 CY;
   private FeatherSourceFile$oe4 CZ;
   private FeatherSourceFile$nc29 Da;
   private FeatherSourceFile$nc29 Db;
   private FeatherSourceFile$oe4[] Dc;
   private int Dd;
   private float De;
   private float Df;
   private float Dg;
   private float Dh;
   private float Di;
   private float Dj;
   private String Dk;
   // $FF: synthetic field
   final FeatherSourceFile463 Dl;

   public FeatherSourceFile$pq1(FeatherSourceFile463 var1) {
      this.Dl = var1;
      this.CT = new FeatherSourceFile583(this.Dl, this);
      this.CU = FeatherSourceFile333.gj("#.#");
      this.Dc = new FeatherSourceFile$oe4[0];
   }

   private void bE() {
      GameSettings var1 = Minecraft.func_71410_x().field_71474_y;
      this.CV = new FeatherSourceFile$oe4((FeatherSourceFile$ou1)FeatherSourceFile463.lh(this.Dl), FeatherSourceFile$qy1.FORWARD, var1.field_74351_w);
      this.CW = new FeatherSourceFile$oe4((FeatherSourceFile$ou1)FeatherSourceFile463.nc(this.Dl), FeatherSourceFile$qy1.BACK, var1.field_74368_y);
      this.CX = new FeatherSourceFile$oe4((FeatherSourceFile$ou1)FeatherSourceFile463.xj(this.Dl), FeatherSourceFile$qy1.LEFT, var1.field_74370_x);
      this.CY = new FeatherSourceFile$oe4((FeatherSourceFile$ou1)FeatherSourceFile463.oe(this.Dl), FeatherSourceFile$qy1.RIGHT, var1.field_74366_z);
      this.CZ = new FeatherSourceFile$oe4((FeatherSourceFile$ou1)FeatherSourceFile463.qy(this.Dl), FeatherSourceFile$qy1.JUMP, var1.field_74314_A);
      this.Da = new FeatherSourceFile$nc29((FeatherSourceFile$ou1)FeatherSourceFile463.ou(this.Dl), FeatherSourceFile$qy1.ATTACK, var1.field_74312_F);
      this.Db = new FeatherSourceFile$nc29((FeatherSourceFile$ou1)FeatherSourceFile463.pq(this.Dl), FeatherSourceFile$qy1.USE, var1.field_74313_G);
      this.Dc = new FeatherSourceFile$oe4[]{this.CV, this.CW, this.CX, this.CY, this.CZ, this.Da, this.Db};
   }

   public void lh(FeatherSourceFile683 var1) {
      this.bH();
      if (((FeatherSourceFile$ou1)FeatherSourceFile463.as(this.Dl)).CL != FeatherSourceFile$ou$nc2.NONE) {
         this.xj(this.CV);
         this.xj(this.CX);
         this.xj(this.CW);
         this.xj(this.CY);
      }

      if (((FeatherSourceFile$ou1)FeatherSourceFile463.km(this.Dl)).CJ != FeatherSourceFile$ou$nc2.NONE) {
         this.oe(this.Da);
         this.oe(this.Db);
      }

      if (((FeatherSourceFile$ou1)FeatherSourceFile463.mq(this.Dl)).CK != FeatherSourceFile$ou$nc2.NONE) {
         this.oe(this.CZ);
      }

      if (((FeatherSourceFile$ou1)FeatherSourceFile463.mr(this.Dl)).CO == FeatherSourceFile$ou$lh2.SEPARATE) {
         this.gD.lh((int)this.De, (int)this.Df, (int)this.Dg, (int)this.Dh, ((FeatherSourceFile$ou1)FeatherSourceFile463.ux(this.Dl)).hH.getRGB(), false);
         this.gD.lh(this.Dk, this.Di, this.Dj, ((FeatherSourceFile$ou1)FeatherSourceFile463.si(this.Dl)).hQ, ((FeatherSourceFile$ou1)FeatherSourceFile463.wz(this.Dl)).hR);
      }

   }

   public void pu() {
      FeatherSourceFile333.lh(this.CU, ((FeatherSourceFile$ou1)FeatherSourceFile463.lt(this.Dl)).CP);
      this.bE();
      this.bF();
      this.bI();
   }

   public int fv() {
      return this.Dd;
   }

   public int rl() {
      return 62;
   }

   private void lh(FeatherSourceFile$oe4 var1) {
      this.gD.nc((int)var1.CC, (int)var1.CD, (int)var1.CE, (int)var1.CF, var1.Cx.Cp.getRGB());
   }

   private void nc(FeatherSourceFile$oe4 var1) {
      this.gD.lh(var1.s, var1.CG, var1.CH, var1.Cx.Cq, ((FeatherSourceFile$ou1)FeatherSourceFile463.hb(this.Dl)).hR);
   }

   private void xj(FeatherSourceFile$oe4 var1) {
      this.lh(var1);
      this.nc(var1);
   }

   private void oe(FeatherSourceFile$nc29 var1) {
      this.xj(var1);
      if (((FeatherSourceFile$ou1)FeatherSourceFile463.ep(this.Dl)).CO == FeatherSourceFile$ou$lh2.WITH_CLICKS) {
         GL11.glPushMatrix();
         GL11.glScalef(0.5F, 0.5F, 1.0F);
         this.gD.lh(FeatherSourceFile$nc29.lh(var1), FeatherSourceFile$nc29.nc(var1), FeatherSourceFile$nc29.xj(var1), var1.Cx.Cq, ((FeatherSourceFile$ou1)FeatherSourceFile463.qr(this.Dl)).hR);
         GL11.glPopMatrix();
      }

   }

   private void oe(FeatherSourceFile$oe4 var1) {
      this.lh(var1);
      if (((FeatherSourceFile$ou1)FeatherSourceFile463.eg(this.Dl)).CK == FeatherSourceFile$ou$nc2.ARROWS) {
         float var2 = var1.CD + (var1.CF - var1.CD) / 2.0F;
         this.gD.lh((int)(var1.CC + 20.0F), (int)(var2 + 1.0F), (int)(var1.CE - 20.0F), (int)var2, var1.Cx.Cq.lm(), var1.Cx.Cq.on());
      } else {
         this.nc(var1);
      }

   }

   private void bF() {
      float var1 = 0.0F;
      this.Dd = 0;
      if (((FeatherSourceFile$ou1)FeatherSourceFile463.oy(this.Dl)).CL != FeatherSourceFile$ou$nc2.NONE) {
         this.CV.xj(1.0F, var1++);
         this.CX.xj(0.0F, var1);
         this.CW.xj(1.0F, var1);
         this.CY.xj(2.0F, var1++);
         this.Dd += 42;
      }

      if (((FeatherSourceFile$ou1)FeatherSourceFile463.ug(this.Dl)).CJ != FeatherSourceFile$ou$nc2.NONE) {
         this.Da.xj(0.0F, var1);
         this.Db.xj(1.0F, var1++);
         this.Dd += 21;
      }

      byte var2 = 0;
      if (((FeatherSourceFile$ou1)FeatherSourceFile463.hv(this.Dl)).CK != FeatherSourceFile$ou$nc2.NONE) {
         this.CZ.lh(0.0F, var1++, 10.0F);
         this.Dd += 11;
         var2 = -10;
      }

      if (((FeatherSourceFile$ou1)FeatherSourceFile463.sm(this.Dl)).CO == FeatherSourceFile$ou$lh2.SEPARATE) {
         this.De = 0.0F;
         this.Df = var1 * 21.0F + (float)var2;
         this.Dg = this.De + 62.0F;
         this.Dh = this.Df + 12.0F;
         this.Dd += 12;
      }

   }

   private void bG() {
   }

   private void bH() {
      this.bG();
      long var1 = System.currentTimeMillis();
      FeatherSourceFile$oe4[] var3 = this.Dc;
      int var4 = var3.length;

      for(int var5 = 0; var5 < var4; ++var5) {
         FeatherSourceFile$oe4 var6 = var3[var5];
         int var7 = FeatherSourceFile198.lh(var6.Cw);
         var6.Cz = FeatherSourceFile60.ck(var7);
         var6.ou(var1);
      }

   }

   private void bI() {
      this.lh(this.Da, this.CT.dC());
      this.lh(this.Db, this.CT.dD());
      this.bJ();
   }

   private void bJ() {
      this.Dk = this.as(this.CT.dC());
      this.Di = this.De + (float)(62 - FeatherSourceFile843.fo(this.Dk)) / 2.0F;
      this.Dj = this.Df + 2.5F;
   }

   private void lh(FeatherSourceFile$nc29 var1, double var2) {
      var1.kx(this.as(var2));
   }

   private String as(double var1) {
      return ((FeatherSourceFile$ou1)FeatherSourceFile463.ly(this.Dl)).CQ ? "CPS: " + this.CU.format(var1) : this.CU.format(var1) + " CPS";
   }

   public FeatherSourceFile89 hk() {
      return ((FeatherSourceFile$ou1)FeatherSourceFile463.rp(this.Dl)).yT;
   }

   public void oe(double var1, double var3) {
      switch (((FeatherSourceFile$ou1)FeatherSourceFile463.tx(this.Dl)).CO) {
         case WITH_CLICKS:
            if (var1 != 0.0) {
               this.lh(this.Da, this.CT.dC());
            }

            if (var3 != 0.0) {
               this.lh(this.Db, this.CT.dD());
            }
            break;
         case SEPARATE:
            if (var1 != 0.0) {
               this.bJ();
            }
      }

   }
}
