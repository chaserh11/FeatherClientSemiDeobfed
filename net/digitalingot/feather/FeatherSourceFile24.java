package net.digitalingot.feather;

import java.awt.Color;
import java.util.List;
import net.minecraft.util.IChatComponent;

public class FeatherSourceFile24 {
   private static final float vX = 0.8F;
   private static final int vY = 6;
   private static final int vZ = 8;
   private static final float wy = 0.7F;
   private static final int wA = 5;
   private static final int wB = 8;
   private static final int wC = 23;
   private static final float wD = 9.0F;
   protected long wE;
   protected long wF;
   protected IChatComponent wG;
   protected List wH;
   protected int zb;
   protected int pp;
   protected float wI;
   protected float wJ;
   protected float wK;
   protected float wL;
   protected FeatherSourceFile445 wM;

   public FeatherSourceFile24(String var1, String var2) {
      this(FeatherSourceFile37.xj(var1), FeatherSourceFile37.xj(var2));
   }

   public FeatherSourceFile24(IChatComponent var1, IChatComponent var2) {
      this.wF = 2000L;
      this.zb = 160;
      this.wG = var1;
      this.wH = FeatherSourceFile37.lh(var2, this.zb);
      this.pp = 23 + (int)Math.floor((double)((float)this.wH.size() * 14.0F * 0.7F));
      this.wM = new FeatherSourceFile445();
      this.as(((FeatherSourceFile$lh133)((FeatherSourceFile486)FeatherSourceFile665.nc(FeatherSourceFile486.class).ag()).pr()).tE);
   }

   public void lh(int var1, int var2, long var3, long var5) {
      FeatherSourceFile843.hS();
      FeatherSourceFile843.qy((float)var1, (float)var2, 0.0F);
      if (var5 <= 250L) {
         float var7 = this.wM.er((float)var3);
         float var8 = (1.0F - var7) * (float)this.zb / 2.0F;
         float var9 = (1.0F - var7) * (float)this.pp / 2.0F;
         FeatherSourceFile843.qy(var8, var9, 0.0F);
         FeatherSourceFile843.ou(var7, var7, 1.0F);
      }

      FeatherSourceFile249.wP.setColor(this.wI, this.wJ, this.wK, this.wL);
      FeatherSourceFile249.wP.lh(0, 0, this.zb, this.pp, 3, 1.0F);
      FeatherSourceFile843.nc(1.0F, 1.0F, 1.0F, 1.0F);
      FeatherSourceFile843.ou(0.8F, 0.8F, 1.0F);
      FeatherSourceFile843.lh((IChatComponent)this.wG, 6, 8, -1);
      FeatherSourceFile843.ou(1.25F, 1.25F, 1.0F);
      FeatherSourceFile843.ou(0.7F, 0.7F, 1.0F);

      for(int var10 = 0; var10 < this.wH.size(); ++var10) {
         int var11 = 8;
         if (var10 != 0) {
            var11 -= 5;
         }

         FeatherSourceFile843.lh((IChatComponent)this.wH.get(var10), var11, 23 + (int)((float)var10 * 14.0F), -4013632);
      }

      FeatherSourceFile843.hT();
   }

   public void lh(long var1) {
      this.wM.lh(var1, 250L, 0, (var0) -> {
         return var0;
      }, 1);
   }

   public FeatherSourceFile24 as(Color var1) {
      this.wI = (float)var1.getRed() / 255.0F;
      this.wJ = (float)var1.getGreen() / 255.0F;
      this.wK = (float)var1.getBlue() / 255.0F;
      this.wL = (float)var1.getAlpha() / 255.0F;
      return this;
   }

   public FeatherSourceFile24 lh(float var1, float var2, float var3, float var4) {
      this.wI = var1;
      this.wJ = var2;
      this.wK = var3;
      this.wL = var4;
      return this;
   }

   public FeatherSourceFile24 nc(long var1) {
      this.wF = var1;
      return this;
   }

   public int aw() {
      return this.zb;
   }

   public int zn() {
      return this.pp;
   }

   public long I() {
      return this.wF;
   }

   public long J() {
      return this.wE;
   }

   public void xj(long var1) {
      this.wE = var1;
   }
}
