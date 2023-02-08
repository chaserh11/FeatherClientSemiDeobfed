package net.digitalingot.feather;

import com.google.common.base.Preconditions;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.function.Consumer;
import net.digitalingot.fwebp.WebPAnimDecoder;
import net.digitalingot.fwebp.WebPAnimFrame;
import net.digitalingot.fwebp.WebPAnimInfo;
import net.digitalingot.fwebp.WebPImage;

public class FeatherSourceFile274 extends FeatherSourceFile280 {
   protected WebPImage UY;
   protected Consumer UZ;
   protected FeatherSourceFile270 Va;
   protected int Vb = 0;
   protected int Vc = 0;
   protected int Vd = 0;
   protected int Ve;
   protected int Vf;

   public FeatherSourceFile274() {
   }

   public FeatherSourceFile274(FeatherSourceFile282 var1) {
      this.UC = var1;
   }

   public void Ad() {
      super.Ad();
      Preconditions.checkNotNull(this.UY);
   }

   public FeatherSourceFile274 lh(WebPImage var1) {
      this.UY = var1;
      return this;
   }

   public void pq(Consumer var1) {
      this.UZ = var1;
   }

   public boolean Ae() {
      this.Ad();
      WebPAnimDecoder var1 = new WebPAnimDecoder(this.UY);

      label88: {
         boolean var23;
         label87: {
            boolean var25;
            try {
               WebPAnimInfo var2 = var1.getInfo();
               if (this.Ve == 0 || this.Vf == 0) {
                  this.Ve = var2.getCanvasWidth();
                  this.Vf = var2.getCanvasHeight();
               }

               if (this.Vf != var2.getCanvasWidth() || this.Vf != var2.getCanvasHeight()) {
                  FeatherSourceFile311.Sb.error("[Webp] Tiles should be the same size!!!");
                  var23 = false;
                  break label87;
               }

               int var3 = var1.getInfo().getFrameCount();
               if (this.UF == 0) {
                  this.UF = var3;
               }

               this.UC.qr(var2.getCanvasWidth(), var2.getCanvasHeight(), this.UF);
               if (this.UE == null) {
                  this.UE = FeatherSourceFile288.dz(this.UC.Ut);
               }

               if (this.UD == null) {
                  this.UD = FeatherSourceFile441.bx(this.UC.textureWidth * 4 * this.UC.textureHeight);
               }

               int[] var4 = new int[var3];
               int[] var5 = new int[var3];
               int var6 = 0;
               boolean var7 = true;
               int var8 = 0;
               Iterator var9 = var1.iterator();

               while(true) {
                  if (!var9.hasNext()) {
                     this.Va = (FeatherSourceFile270)(var7 ? new FeatherSourceFile268(var3, var4[0]) : new FeatherSourceFile272(var4, var5, var8));
                     break label88;
                  }

                  WebPAnimFrame var10 = (WebPAnimFrame)var9.next();
                  ByteBuffer var11 = var10.getPixels();
                  int var12 = this.Vd % this.UC.Uu;
                  int var13 = var12 * this.UC.Ur;
                  int var14 = (int)Math.floor((double)((float)this.Vd / (float)this.UC.Uu));
                  int var15 = var14 * this.UC.Us;
                  int var16 = var15 * this.UC.textureWidth * 4 + var13 * 4;
                  FeatherSourceFile371 var17 = new FeatherSourceFile371(0, 0, this.UC.Ur, this.UC.Us);
                  this.lh(var17, var11, var16, var2.getCanvasWidth());
                  if (this.UZ != null) {
                     float var18 = (float)var12 / (float)this.UC.Uu;
                     float var19 = (float)var14 / (float)this.UC.Uv;
                     FeatherSourceFile286 var20 = new FeatherSourceFile286(var18, var19, var18 + this.UC.Uy, var19 + this.UC.Uz);
                     this.UZ.accept(var20);
                  }

                  var4[var6] = var10.getDuration();
                  var8 += var10.getDuration();
                  var5[var6] = var8;
                  ++this.Vb;
                  ++var6;
                  if (var6 >= 2 && var7 && var4[var6 - 2] != var4[var6 - 1]) {
                     var7 = false;
                  }

                  if (++this.Vd == this.UC.Uw) {
                     boolean var24 = this.Ag();
                     if (!var24) {
                        var25 = false;
                        break;
                     }

                     this.Vd = 0;
                     ++this.Vc;
                  }
               }
            } catch (Throwable var22) {
               try {
                  var1.close();
               } catch (Throwable var21) {
                  var22.addSuppressed(var21);
               }

               throw var22;
            }

            var1.close();
            return var25;
         }

         var1.close();
         return var23;
      }

      var1.close();
      return true;
   }

   public boolean Ag() {
      if (this.Vd <= 0) {
         return false;
      } else {
         int var1 = this.UE.get(this.Vc);
         int var2 = FeatherSourceFile288.lh(var1, 4, this.UC.textureWidth, this.UC.textureHeight, this.UD);
         if (var2 != 0) {
            FeatherSourceFile288.lh(this.UE);
            FeatherSourceFile311.Sb.error("[Cloak] Error generating cloak animation #3: " + var2);
            return false;
         } else {
            return true;
         }
      }
   }

   public FeatherSourceFile284 Ah() {
      return new FeatherSourceFile284(this.UE, this.Va, this.UC);
   }

   public FeatherSourceFile270 Ai() {
      return this.Va;
   }
}
