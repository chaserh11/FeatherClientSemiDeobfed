package net.digitalingot.feather;

import java.text.MessageFormat;
import java.util.Iterator;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.client.renderer.chunk.CompiledChunk;
import net.minecraft.util.BlockPos;
import net.minecraft.util.MathHelper;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.biome.WorldChunkManager;
import net.minecraft.world.chunk.Chunk;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.math.NumberUtils;

public class FeatherSourceFile$nc26 extends FeatherSourceFile413 {
   private float Ap;
   private float Aq;
   private float Ar;
   private int As;
   private int At;
   private float Au;
   private String Av;
   private String Aw;
   private int Ax;
   private int Ay;
   private int Az;
   private int AA;
   // $FF: synthetic field
   final FeatherSourceFile382 AB;

   public FeatherSourceFile$nc26(FeatherSourceFile382 var1) {
      this.AB = var1;
   }

   public void lh(FeatherSourceFile683 var1) {
      EntityPlayerSP var2 = FeatherSourceFile382.lh(this.AB).field_71439_g;
      if (var2 != null && FeatherSourceFile382.lh(this.AB).field_71441_e != null) {
         this.Ap = (float)Math.round(var2.field_70169_q * 100.0) / 100.0F;
         this.Aq = (float)Math.round(var2.field_70167_r * 100.0) / 100.0F;
         this.Ar = (float)Math.round(var2.field_70166_s * 100.0) / 100.0F;
         this.As = var2.field_70176_ah;
         this.At = var2.field_70164_aj;
         this.Au = MathHelper.func_76142_g(var2.field_70177_z);
         BlockPos var3 = new BlockPos((double)this.Ap, (double)this.Aq, (double)this.Ar);
         Chunk var4 = FeatherSourceFile382.lh(this.AB).field_71441_e.func_175726_f(var3);
         WorldChunkManager var5 = FeatherSourceFile382.lh(this.AB).field_71441_e.func_72959_q();
         BiomeGenBase var6 = var4.func_177411_a(new BlockPos((int)this.Ap & 15, (int)this.Aq, (int)this.Ar & 15), var5);
         this.Av = var6.field_76791_y;
         this.Av = StringUtils.capitalize(this.Av.replace("minecraft:", "").replace("_", " "));
         this.Ax = 0;
         this.Ay = 2;
         this.Az = 0;
         this.AA = 0;
         if (((FeatherSourceFile$lh59)FeatherSourceFile382.nc(this.AB)).Ao.hG) {
            this.Az = 4;
            this.Ay = 4;
         }

         this.aH();
      }
   }

   public void sy() {
      EntityPlayerSP var1 = FeatherSourceFile382.lh(this.AB).field_71439_g;
      if (var1 != null) {
         this.lh((FeatherSourceFile683)null);
      } else {
         this.gD.lh("Preview in-game", 0.0F, 0.0F, ((FeatherSourceFile$lh59)FeatherSourceFile382.xj(this.AB)).Ag, true);
      }

   }

   private void aH() {
      if (((FeatherSourceFile$lh59)FeatherSourceFile382.oe(this.AB)).Ao.hG) {
         this.gD.nc(0, 0, this.rl(), this.fv(), ((FeatherSourceFile$lh59)FeatherSourceFile382.qy(this.AB)).Ao.hH.getRGB());
         if (((FeatherSourceFile$lh59)FeatherSourceFile382.ou(this.AB)).Ao.hI) {
            this.gD.nc(0, 0, this.rl(), this.fv(), ((FeatherSourceFile$lh59)FeatherSourceFile382.pq(this.AB)).Ao.hJ.getRGB(), (float)((FeatherSourceFile$lh59)FeatherSourceFile382.as(this.AB)).Ao.hK);
         }
      }

      this.aI();
      if (((FeatherSourceFile$lh59)FeatherSourceFile382.km(this.AB)).Aj) {
         this.aJ();
      }

      if (((FeatherSourceFile$lh59)FeatherSourceFile382.mq(this.AB)).Am) {
         this.aK();
      }

      if (((FeatherSourceFile$lh59)FeatherSourceFile382.mr(this.AB)).Ak) {
         this.aL();
      }

      if (((FeatherSourceFile$lh59)FeatherSourceFile382.ux(this.AB)).Al) {
         this.aM();
      }

   }

   private void aI() {
      String var1 = this.eg(this.Ap);
      String var2 = this.eg(this.Aq);
      String var3 = this.eg(this.Ar);
      if (((FeatherSourceFile$lh59)FeatherSourceFile382.si(this.AB)).Ae == FeatherSourceFile$lh$lh14.VERTICAL) {
         int var4 = this.lh("X: ", this.eg(this.Ap), this.Az, this.Ay);
         this.Ay += 12;
         int var5 = 0;
         if (((FeatherSourceFile$lh59)FeatherSourceFile382.wz(this.AB)).Ah) {
            var5 = this.lh("Y: ", var2, this.Az, this.Ay);
            this.Ay += 12;
         }

         int var6 = this.lh("Z: ", var3, this.Az, this.Ay);
         this.Ay += 12;
         this.Ax = NumberUtils.max(new int[]{var4, var5, var6});
         this.AA = this.Ax;
      } else {
         this.Az += this.lh("", MessageFormat.format(this.Aw, var1, var2, var3), this.Az, this.Ay);
      }

   }

   private void aJ() {
      if (((FeatherSourceFile$lh59)FeatherSourceFile382.lt(this.AB)).Ae == FeatherSourceFile$lh$lh14.VERTICAL) {
         byte var1 = 2;
         if (((FeatherSourceFile$lh59)FeatherSourceFile382.hb(this.AB)).Ao.hG) {
            this.Ax += 4;
            var1 = 4;
         }

         int var2 = this.lh("  " + FeatherSourceFile37.nc("feather.modules.coordinates.chunkX") + ": ", Integer.toString(this.As), this.Ax, var1);
         int var3 = this.lh("  " + FeatherSourceFile37.nc("feather.modules.coordinates.chunkZ") + ": ", Integer.toString(this.At), this.Ax, var1 + 12);
         this.AA += NumberUtils.max(new int[]{var2, var3});
      } else {
         this.Az += this.lh("", MessageFormat.format(" ({0}, {1})", this.As, this.At), this.Az, this.Ay);
      }

   }

   private void aK() {
      if (((FeatherSourceFile$lh59)FeatherSourceFile382.ep(this.AB)).Ae == FeatherSourceFile$lh$lh14.VERTICAL) {
         this.Ay += 12;
         int var1 = this.lh(this.aP(), ((FeatherSourceFile$lh59)FeatherSourceFile382.qr(this.AB)).An ? MessageFormat.format(" ({0})", FeatherSourceFile382.eg(this.AB).format((double)this.Au)) : "", this.Az, this.Ay);
         this.Ay += 12;
         if (var1 > this.AA) {
            this.AA = var1;
         }
      } else {
         this.Az += this.lh(" ", this.aP(), this.Az, this.Ay);
         if (((FeatherSourceFile$lh59)FeatherSourceFile382.oy(this.AB)).An) {
            this.Az += this.lh("", MessageFormat.format(" ({0})", FeatherSourceFile382.eg(this.AB).format((double)this.Au)), this.Az, this.Ay);
         }
      }

   }

   private void aL() {
      if (((FeatherSourceFile$lh59)FeatherSourceFile382.ug(this.AB)).Ae == FeatherSourceFile$lh$lh14.VERTICAL) {
         if (!((FeatherSourceFile$lh59)FeatherSourceFile382.hv(this.AB)).Am) {
            this.Ay += 12;
         }

         int var1 = this.lh(FeatherSourceFile37.nc("feather.titles.biome") + ": ", this.Av, this.Az, this.Ay);
         this.Ay += 12;
         if (var1 > this.AA) {
            this.AA = var1;
         }
      } else {
         this.Az += this.lh(" ", this.Av, this.Az, this.Ay);
      }

   }

   private void aM() {
      if (((FeatherSourceFile$lh59)FeatherSourceFile382.sm(this.AB)).Ae == FeatherSourceFile$lh$lh14.VERTICAL) {
         if (!((FeatherSourceFile$lh59)FeatherSourceFile382.ly(this.AB)).Am && !((FeatherSourceFile$lh59)FeatherSourceFile382.rp(this.AB)).Ak) {
            this.Ay += 12;
         }

         int var1 = this.lh(FeatherSourceFile37.nc("feather.modules.coordinates.chunks") + ": ", this.aN(), this.Az, this.Ay);
         this.Ay += 12;
         if (var1 > this.AA) {
            this.AA = var1;
         }
      } else {
         this.Az += this.lh(" ", this.aN(), this.Az, this.Ay);
      }

   }

   private int lh(String var1, String var2, int var3, int var4) {
      this.gD.lh(var1, (float)var3, (float)var4, ((FeatherSourceFile$lh59)FeatherSourceFile382.tx(this.AB)).Af, ((FeatherSourceFile$lh59)FeatherSourceFile382.wn(this.AB)).hR);
      this.gD.lh(var2, (float)(var3 + this.gD.vr(var1)), (float)var4, ((FeatherSourceFile$lh59)FeatherSourceFile382.jh(this.AB)).Ag, ((FeatherSourceFile$lh59)FeatherSourceFile382.gr(this.AB)).hR);
      return this.oe(var1, var2);
   }

   private String aN() {
      if (FeatherSourceFile678.nw()) {
         return FeatherSourceFile382.lh(this.AB).field_71438_f.func_72735_c().replace("C: ", "");
      } else {
         int var1 = ((net.digitalingot.feather.mixin.core.FeatherSourceFile17)FeatherSourceFile382.lh(this.AB).field_71438_f).getViewFrustum().field_178164_f.length;
         int var2 = this.aO();
         return MessageFormat.format("{0}/{1} {2}", var2, var1, FeatherSourceFile382.lh(this.AB).field_175612_E ? "(s)" : "");
      }
   }

   private int aO() {
      int var1 = 0;
      Iterator var2 = ((net.digitalingot.feather.mixin.core.FeatherSourceFile17)FeatherSourceFile382.lh(this.AB).field_71438_f).getRenderInfos().iterator();

      while(var2.hasNext()) {
         Object var3 = var2.next();
         net.digitalingot.feather.mixin.core.FeatherSourceFile15 var4 = (net.digitalingot.feather.mixin.core.FeatherSourceFile15)var3;
         CompiledChunk var5 = CompiledChunk.field_178502_a;
         CompiledChunk var6 = var4.getRenderChunk().field_178590_b;
         boolean var7 = var6.func_178489_a();
         if (var6 != var5 && !var7) {
            ++var1;
         }
      }

      return var1;
   }

   private int oe(String... var1) {
      int var2 = 0;
      String[] var3 = var1;
      int var4 = var1.length;

      for(int var5 = 0; var5 < var4; ++var5) {
         String var6 = var3[var5];
         var2 += this.gD.vr(var6);
      }

      return var2;
   }

   private String aP() {
      double var1 = (double)(this.Au + 180.0F);
      var1 += 22.5;
      var1 %= 360.0;
      var1 /= 45.0;
      return FeatherSourceFile37.nc(FeatherSourceFile382.aG()[MathHelper.func_76128_c(var1)]);
   }

   private String eg(float var1) {
      return ((FeatherSourceFile$lh59)FeatherSourceFile382.oh(this.AB)).Ai ? FeatherSourceFile382.eg(this.AB).format((double)var1) : String.valueOf((int)var1);
   }

   public int rl() {
      if (FeatherSourceFile382.lh(this.AB).field_71439_g == null) {
         return this.oe("Preview in-game");
      } else if (((FeatherSourceFile$lh59)FeatherSourceFile382.hg(this.AB)).Ao.hG) {
         int var1;
         if (((FeatherSourceFile$lh59)FeatherSourceFile382.et(this.AB)).Ae == FeatherSourceFile$lh$lh14.VERTICAL) {
            var1 = NumberUtils.max(new int[]{this.oe("X: ", this.eg(this.Ap)), this.oe("Y: ", this.eg(this.Aq)), this.oe("Z: ", this.eg(this.Ar))});
            if (((FeatherSourceFile$lh59)FeatherSourceFile382.yl(this.AB)).Aj) {
               String var2 = Integer.toString(this.As);
               String var3 = Integer.toString(this.At);
               int var4;
               if (var2.length() > var3.length()) {
                  var4 = this.As;
               } else {
                  var4 = this.At;
               }

               var1 += this.oe("  " + FeatherSourceFile37.nc("feather.modules.coordinates.chunkX") + ": ", Integer.toString(var4));
            }

            int var5;
            if (((FeatherSourceFile$lh59)FeatherSourceFile382.ai(this.AB)).Am) {
               var5 = this.oe(this.aP());
               if (((FeatherSourceFile$lh59)FeatherSourceFile382.ja(this.AB)).An) {
                  var5 += this.oe(MessageFormat.format(" ({0})", FeatherSourceFile382.eg(this.AB).format((double)this.Au)));
               }

               if (var5 > var1) {
                  var1 = var5;
               }
            }

            if (((FeatherSourceFile$lh59)FeatherSourceFile382.qn(this.AB)).Ak) {
               var5 = this.oe(FeatherSourceFile37.nc("feather.titles.biome") + ": ", this.Av);
               if (var5 > var1) {
                  var1 = var5;
               }
            }

            if (((FeatherSourceFile$lh59)FeatherSourceFile382.er(this.AB)).Al) {
               var5 = this.oe(FeatherSourceFile37.nc("feather.modules.coordinates.chunks") + ": ", this.aN());
               if (var5 > var1) {
                  var1 = var5;
               }
            }
         } else {
            var1 = this.oe(MessageFormat.format(this.Aw, this.eg(this.Ap), this.eg(this.Aq), this.eg(this.Ar)));
            if (((FeatherSourceFile$lh59)FeatherSourceFile382.zd(this.AB)).Aj) {
               var1 += this.oe(MessageFormat.format(" ({0}, {1})", this.As, this.At));
            }

            if (((FeatherSourceFile$lh59)FeatherSourceFile382.ps(this.AB)).Am) {
               var1 += this.oe(" ", this.aP());
               if (((FeatherSourceFile$lh59)FeatherSourceFile382.xm(this.AB)).An) {
                  var1 += this.oe(MessageFormat.format(" ({0})", FeatherSourceFile382.eg(this.AB).format((double)this.Au)));
               }
            }

            if (((FeatherSourceFile$lh59)FeatherSourceFile382.ku(this.AB)).Ak) {
               var1 += this.oe(" ", this.Av);
            }

            if (((FeatherSourceFile$lh59)FeatherSourceFile382.vt(this.AB)).Al) {
               var1 += this.oe(" ", this.aN());
            }
         }

         return var1 + 8;
      } else {
         return ((FeatherSourceFile$lh59)FeatherSourceFile382.ck(this.AB)).Ae == FeatherSourceFile$lh$lh14.HORIZONTAL ? this.Az : this.AA;
      }
   }

   public int fv() {
      if (FeatherSourceFile382.lh(this.AB).field_71439_g == null) {
         return 12;
      } else if (((FeatherSourceFile$lh59)FeatherSourceFile382.xy(this.AB)).Ao.hG) {
         int var1;
         if (((FeatherSourceFile$lh59)FeatherSourceFile382.fh(this.AB)).Ae == FeatherSourceFile$lh$lh14.VERTICAL) {
            var1 = 24;
            if (((FeatherSourceFile$lh59)FeatherSourceFile382.xi(this.AB)).Ah) {
               var1 += 12;
            }

            if (((FeatherSourceFile$lh59)FeatherSourceFile382.cg(this.AB)).Am) {
               var1 += 24;
            }

            if (((FeatherSourceFile$lh59)FeatherSourceFile382.sb(this.AB)).Ak) {
               var1 += 12;
               if (!((FeatherSourceFile$lh59)FeatherSourceFile382.jr(this.AB)).Am) {
                  var1 += 12;
               }
            }

            if (((FeatherSourceFile$lh59)FeatherSourceFile382.rt(this.AB)).Al) {
               var1 += 12;
               if (!((FeatherSourceFile$lh59)FeatherSourceFile382.nb(this.AB)).Am && !((FeatherSourceFile$lh59)FeatherSourceFile382.gy(this.AB)).Ak) {
                  var1 += 12;
               }
            }
         } else {
            var1 = 12;
         }

         return var1 + 4;
      } else {
         return ((FeatherSourceFile$lh59)FeatherSourceFile382.bh(this.AB)).Ae == FeatherSourceFile$lh$lh14.HORIZONTAL ? 12 : this.Ay;
      }
   }

   public void pu() {
      this.Aw = ((FeatherSourceFile$lh59)FeatherSourceFile382.mm(this.AB)).Ah ? "({0}, {1}, {2})" : "({0}, {2})";
   }

   public FeatherSourceFile89 hk() {
      return ((FeatherSourceFile$lh59)FeatherSourceFile382.xe(this.AB)).Ao;
   }
}
