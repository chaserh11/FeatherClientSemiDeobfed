package net.digitalingot.feather;

import net.minecraft.client.entity.AbstractClientPlayer;

public class FeatherSourceFile178 {
   public static float xx = 1.318F;
   public static float xv = 0.215F;
   public static float be = 0.119F;
   public static float ql = 0.02F;
   public static float pk;
   public static float wk;
   public static float ph;
   public static float ia;
   public static float sa;
   private static float ga;
   private FeatherSourceFile398[] eo;
   private FeatherSourceFile488[] fn;
   private float bs = 0.0F;

   public FeatherSourceFile178(float var1, int var2) {
      this.lh(var1, var2, 1.0F, 1.0F);
   }

   public FeatherSourceFile178(float var1, int var2, float var3) {
      this.lh(var1, var2, var3, 1.0F);
   }

   public FeatherSourceFile178(float var1, int var2, float var3, float var4) {
      this.lh(var1, var2, var3, var4);
   }

   private void lh(float var1, int var2, float var3, float var4) {
      if (var2 <= 1) {
         FeatherSourceFile311.Sb.error("ClothPiece.java: Wrong constructor value");
         throw new AssertionError();
      } else {
         float var5 = var1 / (float)(var2 - 1) * var4;
         this.eo = new FeatherSourceFile398[var2];
         this.fn = new FeatherSourceFile488[var2 - 1];

         for(int var6 = 0; var6 < var2; ++var6) {
            this.eo[var6] = new FeatherSourceFile398();
            this.eo[var6].dl.Te = -var5 * (float)var6;
            this.eo[var6].kb = var3;
            this.eo[var6].oe(10.0F);
            if (var6 == 0) {
               this.eo[0].he = true;
               this.eo[0].oe(30.0F);
            } else {
               this.fn[var6 - 1] = new FeatherSourceFile488();
               this.fn[var6 - 1].lv = this.eo[var6 - 1];
               this.fn[var6 - 1].yg = this.eo[var6];
               this.fn[var6 - 1].gs = var5;
            }
         }

      }
   }

   public void lh(float var1) {
      for(int var2 = 0; var2 < this.eo.length; ++var2) {
         FeatherSourceFile398 var3 = this.eo[var2];
         if (!var3.he) {
            var3.dl = FeatherSourceFile403.oe(var3.fc.cg(pk).cg(var1).cg(var3.kb), var3.dl);
         }
      }

      FeatherSourceFile488[] var9 = this.fn;
      int var10 = var9.length;

      for(int var4 = 0; var4 < var10; ++var4) {
         FeatherSourceFile488 var5 = var9[var4];

         FeatherSourceFile403 var6;
         try {
            var6 = (FeatherSourceFile403)FeatherSourceFile403.qy(var5.yg.dl, var5.lv.dl).zK();
         } catch (IllegalStateException var8) {
            continue;
         }

         if (!var5.yg.he) {
            var5.yg.dl = FeatherSourceFile403.oe(var5.lv.dl, var6.cg(var5.gs));
         }
      }

   }

   public void lh(AbstractClientPlayer var1) {
      float var2 = (float)var1.field_70165_t;
      float var3 = (float)var1.field_70169_q;
      float var4 = (float)var1.field_70163_u;
      float var5 = (float)var1.field_70167_r;
      float var6 = (float)var1.field_70161_v;
      float var7 = (float)var1.field_70166_s;
      float var8 = var1.field_70761_aq;
      boolean var9 = false;
      FeatherSourceFile403 var10 = new FeatherSourceFile403(var2 - var3, var6 - var7);
      FeatherSourceFile403 var11 = new FeatherSourceFile403((float)Math.cos(Math.toRadians((double)(var8 + 90.0F))), (float)Math.sin(Math.toRadians((double)(var8 + 90.0F))));
      float var12 = FeatherSourceFile403.xj(var11, var10) / var11.zF();
      var11.Td *= var12;
      var11.Te *= var12;
      FeatherSourceFile403 var10000;
      if (var12 > 0.0F && !var9) {
         var10000 = this.eo[0].dl;
         var10000.Td -= var11.zJ() * wk;
      }

      if (!var9) {
         double var13 = (double)var4 - var1.field_70137_T;
         var10000 = this.eo[0].dl;
         var10000.Te += (float)var13 * ph;
         var10000 = this.eo[0].dl;
         var10000.Td = (float)((double)var10000.Td + var13 * (double)ia);
      }

   }

   public void nc(float var1) {
      for(int var2 = 0; var2 < this.eo.length; ++var2) {
         this.eo[var2].oe(var1);
      }

   }

   public FeatherSourceFile398[] aq() {
      return this.eo;
   }

   public FeatherSourceFile488[] cj() {
      return this.fn;
   }

   public float gq() {
      return pk;
   }

   public void xj(float var1) {
      pk = var1;
   }

   static {
      pk = xx;
      wk = xv;
      ph = be;
      ia = ql;
      sa = 0.65F;
      ga = 0.0045F;
   }
}
