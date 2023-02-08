package net.digitalingot.feather;

import java.nio.ByteBuffer;
import java.util.Iterator;
import net.digitalingot.fwebp.WebPAnimDecoder;
import net.digitalingot.fwebp.WebPAnimFrame;
import net.digitalingot.fwebp.WebPAnimInfo;

public class FeatherSourceFile278 extends FeatherSourceFile274 {
   public FeatherSourceFile278(FeatherSourceFile282 var1) {
      this.UC = var1;
   }

   public boolean Ae() {
      this.Ad();
      FeatherSourceFile276 var1 = (FeatherSourceFile276)this.UC;
      WebPAnimDecoder var2 = new WebPAnimDecoder(this.UY);

      label88: {
         boolean var31;
         label87: {
            boolean var28;
            label86: {
               boolean var34;
               try {
                  label92: {
                     WebPAnimInfo var3 = var2.getInfo();
                     var1.qr(var3.getCanvasWidth(), var3.getCanvasHeight(), var3.getFrameCount());
                     FeatherSourceFile371 var4 = FeatherSourceFile371.lh(FeatherSourceFile276.UG, var3.getCanvasWidth(), var3.getCanvasHeight());
                     FeatherSourceFile371 var5 = FeatherSourceFile371.lh(FeatherSourceFile276.UH, var3.getCanvasWidth(), var3.getCanvasHeight());
                     FeatherSourceFile371 var6 = FeatherSourceFile371.lh(FeatherSourceFile276.UI, var3.getCanvasWidth(), var3.getCanvasHeight());
                     FeatherSourceFile371 var7 = FeatherSourceFile371.lh(FeatherSourceFile276.UJ, var3.getCanvasWidth(), var3.getCanvasHeight());
                     FeatherSourceFile371 var8 = FeatherSourceFile371.lh(FeatherSourceFile276.UK, var3.getCanvasWidth(), var3.getCanvasHeight());
                     FeatherSourceFile371 var9 = FeatherSourceFile371.lh(FeatherSourceFile276.UL, var3.getCanvasWidth(), var3.getCanvasHeight());
                     int var10 = var2.getInfo().getFrameCount();
                     int var11 = var1.Ut;
                     this.UD = FeatherSourceFile441.bx(var1.textureWidth * 4 * var1.textureHeight);
                     this.UE = FeatherSourceFile288.dz(var11);
                     if (this.UE == null) {
                        var31 = false;
                        break label87;
                     }

                     int[] var12 = new int[var10];
                     int[] var13 = new int[var10];
                     boolean var14 = true;
                     int var15 = 0;
                     int var16 = 0;
                     int var17 = 0;
                     int var18 = 0;
                     Iterator var19 = var2.iterator();
                     WebPAnimFrame var20 = null;

                     while(var19.hasNext() || var18 == 1) {
                        WebPAnimFrame var21;
                        if (var18 == 0) {
                           var21 = (WebPAnimFrame)var19.next();
                           var20 = var21;
                        } else if (var18 == 1) {
                           var21 = var20;
                           --var16;
                           var15 -= var20.getDuration();
                        } else {
                           var21 = (WebPAnimFrame)var19.next();
                        }

                        ByteBuffer var22 = var21.getPixels();
                        int var23 = var18 % var1.Uu * var1.UU;
                        int var24 = (int)Math.floor((double)((float)var18 / (float)var1.Uu)) * var1.UV;
                        int var25 = var24 * var1.textureWidth * 4 + var23 * 4;
                        int var27;
                        if (var18 == 0) {
                           this.lh(var4, var22, var25, var3.getCanvasWidth());
                        } else {
                           FeatherSourceFile371 var26 = new FeatherSourceFile371(0, 0, var6.zb + var5.zb + var7.zb, var8.pp + var5.pp);
                           this.lh(var26, var22, var25, var3.getCanvasWidth());
                           var27 = var25 + var1.textureWidth * var1.Us * 4;
                           this.lh(var9, var22, var27, var3.getCanvasWidth());
                        }

                        var12[var16] = var21.getDuration();
                        var15 += var21.getDuration();
                        var13[var16] = var15;
                        ++var16;
                        if (var16 >= 2 && var14 && var12[var16 - 2] != var12[var16 - 1]) {
                           var14 = false;
                        }

                        ++var18;
                        if (var18 == var1.Uw) {
                           int var35 = this.UE.get(var17);
                           var27 = FeatherSourceFile288.lh(var35, 4, var1.textureWidth, var1.textureHeight, this.UD);
                           if (var27 != 0) {
                              FeatherSourceFile288.lh(this.UE);
                              FeatherSourceFile311.Sb.error("[Cloak] Error generating cloak animation #2: " + var27);
                              var28 = false;
                              break label86;
                           }

                           var18 = 0;
                           ++var17;
                        }
                     }

                     if (var18 > 0) {
                        int var32 = this.UE.get(var17);
                        int var33 = FeatherSourceFile288.lh(var32, 4, var1.textureWidth, var1.textureHeight, this.UD);
                        if (var33 != 0) {
                           FeatherSourceFile288.lh(this.UE);
                           FeatherSourceFile311.Sb.error("[Cloak] Error generating cloak animation #3: " + var33);
                           var34 = false;
                           break label92;
                        }
                     }

                     this.Va = (FeatherSourceFile270)(var14 ? new FeatherSourceFile268(var10, var12[0]) : new FeatherSourceFile272(var12, var13, var15));
                     break label88;
                  }
               } catch (Throwable var30) {
                  try {
                     var2.close();
                  } catch (Throwable var29) {
                     var30.addSuppressed(var29);
                  }

                  throw var30;
               }

               var2.close();
               return var34;
            }

            var2.close();
            return var28;
         }

         var2.close();
         return var31;
      }

      var2.close();
      return true;
   }
}
