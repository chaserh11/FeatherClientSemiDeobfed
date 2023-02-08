package net.digitalingot.feather;

import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.util.MathHelper;

public class FeatherSourceFile498 {
   private FeatherSourceFile592 bj;
   private ByteBuffer ot;
   private final FloatBuffer qk;
   private final int aj;
   private final int yr;
   private short kt;
   public static final float fs = 27.43F;
   public static final float ha = 0.887F;

   public FeatherSourceFile498(int var1, int var2) {
      this.aj = var1;
      this.yr = var2;
      this.qk = FloatBuffer.allocate(416);
   }

   public void lh(FeatherSourceFile178[] var1, FeatherSourceFile178[] var2, FeatherSourceFile284 var3, int var4) {
      if (this.bj == null) {
         this.bj = new FeatherSourceFile592(this.aj, this.oe(this.yr));
      }

      this.kt = (short)MathHelper.func_76125_a(var4 * 16, 0, 255);
      FeatherSourceFile843.hS();
      GlStateManager.func_179114_b(180.0F, 0.0F, 0.0F, 1.0F);
      FeatherSourceFile282 var5 = var3.Ab();
      int var6 = var3.hm(var3.zX() / (var5.Uw - 1));
      this.bj.qy(var6);
      this.ot = this.bj.qd();
      this.lh(var2, var3);
      this.bj.render();
      FeatherSourceFile843.hT();
   }

   private int lh(int var1, int var2, float var3, float var4, float var5, float var6, float var7, float var8) {
      float var9 = this.qk.get((var1 + var2) * 2);
      float var10 = this.qk.get((var1 + var2) * 2 + 1);
      int var11 = this.bj.ot();
      int var12 = (var1 + var2) * var11;
      this.bj.lh(var12, var9, var10, var3, var4, var5, var6, var7, var8, this.kt);
      return var2 + 1;
   }

   private void lh(FeatherSourceFile178[] var1, FeatherSourceFile284 var2) {
      FeatherSourceFile276 var3 = (FeatherSourceFile276)var2.Ab();
      var3.lh(var2.zX(), this.qk);
      float var4 = -0.3125F;
      float var5 = 0.625F / (float)(var1.length - 1);
      int var6 = 0;
      int var7 = 0;
      int var8 = 0;
      int var9 = 0;
      int var10 = 0;
      int var11 = 0;
      this.ot.rewind();
      FeatherSourceFile398 var12 = new FeatherSourceFile398();

      for(int var13 = 0; var13 < var1.length; ++var13) {
         FeatherSourceFile178 var14 = var1[var13];
         FeatherSourceFile403 var15 = null;
         FeatherSourceFile403 var16 = null;

         for(int var17 = 0; var17 < var14.aq().length; ++var17) {
            var12.dl.Td = var14.aq()[var17].dl.Td;
            var12.dl.Te = var14.aq()[var17].dl.Te;
            FeatherSourceFile403 var10000 = var12.dl;
            var10000.Te -= var14.aq()[0].dl.Te;
            var10000 = var12.dl;
            var10000.Td = (float)((double)var10000.Td + (0.125 - (double)var14.aq()[0].dl.Td));
            if (var17 != 15) {
               var15 = FeatherSourceFile403.ou(var1[var13].aq()[var17 + 1].dl, var1[var13].aq()[var17].dl);
               var16 = var15.zL();
               var15.sb(0.887F);
               var15.xi(27.43F);
               var16.sb(0.0625F);
            }

            if (var17 == 0) {
               var10 = this.lh(FeatherSourceFile239.vw, var10, var4, var12.dl.Te, var12.dl.Td, 0.0F, 1.0F, 0.0F);
               var10 = this.lh(FeatherSourceFile239.vw, var10, var4, var12.dl.Te + var16.Te, var12.dl.Td + var16.Td, 0.0F, 1.0F, 0.0F);
            }

            if (var17 == 15) {
               var11 = this.lh(FeatherSourceFile239.mn, var11, var4, var12.dl.Te, var12.dl.Td, 0.0F, -1.0F, 0.0F);
               var11 = this.lh(FeatherSourceFile239.mn, var11, var4, var12.dl.Te + var16.Te, var12.dl.Td + var16.Td, 0.0F, -1.0F, 0.0F);
            }

            if (var13 == 0) {
               var8 = this.lh(FeatherSourceFile239.yq, var8, var4, var12.dl.Te, var12.dl.Td, 1.0F, 0.0F, 0.0F);
               var8 = this.lh(FeatherSourceFile239.yq, var8, var4, var12.dl.Te + var16.Te, var12.dl.Td + var16.Td, 1.0F, 0.0F, 0.0F);
            }

            if (var13 == 3) {
               var9 = this.lh(FeatherSourceFile239.es, var9, var4, var12.dl.Te, var12.dl.Td, -1.0F, 0.0F, 0.0F);
               var9 = this.lh(FeatherSourceFile239.es, var9, var4, var12.dl.Te + var16.Te, var12.dl.Td + var16.Td, -1.0F, 0.0F, 0.0F);
            }

            var6 = this.lh(FeatherSourceFile239.po, var6, var4, var12.dl.Te, var12.dl.Td, 0.0F, -var15.Te, -var15.Td);
            var7 = this.lh(FeatherSourceFile239.gn, var7, var4, var12.dl.Te + var16.Te, var12.dl.Td + var16.Td, 0.0F, var15.Te, var15.Td);
         }

         var4 += var5;
      }

      this.ot.rewind();
   }

   private IntBuffer oe(int var1) {
      IntBuffer var2 = FeatherSourceFile441.sp(var1);

      for(int var3 = 0; var3 < 4; ++var3) {
         for(int var4 = 0; var4 < 16; ++var4) {
            if (var4 == 15) {
               if (var3 != 3) {
                  var2.put(FeatherSourceFile239.mn + var3 * 2).put(FeatherSourceFile239.mn + var3 * 2 + 2).put(FeatherSourceFile239.mn + var3 * 2 + 3).put(FeatherSourceFile239.mn + var3 * 2 + 3).put(FeatherSourceFile239.mn + var3 * 2 + 1).put(FeatherSourceFile239.mn + var3 * 2);
               }
            } else {
               if (var4 == 0 && var3 != 3) {
                  var2.put(FeatherSourceFile239.vw + var3 * 2).put(FeatherSourceFile239.vw + var3 * 2 + 1).put(FeatherSourceFile239.vw + var3 * 2 + 3).put(FeatherSourceFile239.vw + var3 * 2 + 3).put(FeatherSourceFile239.vw + var3 * 2 + 2).put(FeatherSourceFile239.vw + var3 * 2);
               }

               if (var3 == 3) {
                  var2.put(FeatherSourceFile239.es + var4 * 2).put(FeatherSourceFile239.es + var4 * 2 + 1).put(FeatherSourceFile239.es + var4 * 2 + 3).put(FeatherSourceFile239.es + var4 * 2 + 3).put(FeatherSourceFile239.es + var4 * 2 + 2).put(FeatherSourceFile239.es + var4 * 2);
               } else {
                  if (var3 == 0) {
                     var2.put(FeatherSourceFile239.yq + var4 * 2).put(FeatherSourceFile239.yq + var4 * 2 + 2).put(FeatherSourceFile239.yq + var4 * 2 + 3).put(FeatherSourceFile239.yq + var4 * 2 + 3).put(FeatherSourceFile239.yq + var4 * 2 + 1).put(FeatherSourceFile239.yq + var4 * 2);
                  }

                  int var5 = FeatherSourceFile239.po + 16 * var3 + var4;
                  var2.put(var5).put(var5 + 16).put(var5 + 16 + 1).put(var5 + 16 + 1).put(var5 + 1).put(var5);
                  var5 = FeatherSourceFile239.gn + 16 * var3 + var4;
                  var2.put(var5).put(var5 + 1).put(var5 + 16 + 1).put(var5 + 16 + 1).put(var5 + 16).put(var5);
               }
            }
         }
      }

      var2.rewind();
      return var2;
   }
}
