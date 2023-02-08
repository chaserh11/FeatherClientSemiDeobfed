package net.digitalingot.feather;

import java.lang.reflect.Array;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import net.digitalingot.vendor.javax.inject.Inject;
import net.digitalingot.vendor.javax.inject.Singleton;
import net.minecraft.client.Minecraft;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.lwjgl.opengl.GL11;

@Singleton
public class FeatherSourceFile776 {
   private static FeatherSourceFile776 gM;
   private final Minecraft minecraft;
   private final FeatherSourceFile665 hb;
   private FeatherSourceFile360[] gN;
   private FeatherSourceFile683 gO;
   private boolean gP;
   @Nullable
   private @Nullable FeatherSourceFile19 gQ;
   private FeatherSourceFile685 gR;

   @Inject
   FeatherSourceFile776(Minecraft var1, FeatherSourceFile665 var2) {
      gM = this;
      this.minecraft = var1;
      this.hb = var2;
   }

   private void pe() {
      List var1 = this.fz();
      this.gN = (FeatherSourceFile360[])Array.newInstance(FeatherSourceFile360.class, var1.size());
      var1.toArray(this.gN);
   }

   private void nd() {
      if (this.gP) {
         this.pe();
         this.gP = false;
      }

   }

   private void nc(FeatherSourceFile683 var1) {
      if (this.minecraft.field_71439_g != null && this.minecraft.field_71441_e != null) {
         if (!this.qz() || var1 == FeatherSourceFile683.MOD_LAYOUT) {
            if (!FeatherSourceFile6.xv()) {
               if (!FeatherSourceFile93.ly().zd()) {
                  this.gO = var1;
                  FeatherSourceFile360[] var2 = this.gN;
                  int var3 = var2.length;

                  for(int var4 = 0; var4 < var3; ++var4) {
                     FeatherSourceFile360 var5 = var2[var4];
                     this.lh(var5, var1);
                  }

               }
            }
         }
      }
   }

   private @NotNull void lh(@NotNull @NotNull FeatherSourceFile360 var1, FeatherSourceFile683 var2) {
      Iterator var3 = var1.hh().iterator();

      while(var3.hasNext()) {
         FeatherSourceFile413 var4 = (FeatherSourceFile413)var3.next();
         this.lh(var4, var2);
      }

   }

   private @NotNull void lh(@NotNull @NotNull FeatherSourceFile413 var1, FeatherSourceFile683 var2) {
      if (var1.hk().ca()) {
         if (var1.ti()) {
            FeatherSourceFile852 var3 = var1.yb();
            var3.xj();
            float var4 = (float)var1.hk().ee();
            GL11.glPushMatrix();
            GL11.glTranslated(var1.zm(), var1.rq(), 0.0);
            GL11.glScalef(var4, var4, 1.0F);
            var1.lh(var2);
            GL11.glPopMatrix();
            var3.vO();
         }
      }
   }

   public void ul() {
      if (this.gQ != null) {
         FeatherSourceFile685 var1 = this.gR;
         FeatherSourceFile$lh89 var2 = this.gQ.kg();
         float var3 = FeatherSourceFile851.iP();
         double var4 = FeatherSourceFile851.iN();
         double var6 = 1.0;
         byte var8 = 8;
         int var9 = var2.jp().ax() - var2.bz().ax();
         int var10 = var2.jp().ob() - var2.bz().ob();
         if ((double)(var1.no() + var8 * 2) > (double)var9 / var4) {
            var6 = 1.0 / (double)(var1.no() + var8 * 2) * ((double)var9 / var4);
         }

         int var11 = (int)((double)var1.no() * var6);
         int var12 = (int)((double)var1.sv() * var6);
         int var13 = (int)((double)(var2.bz().ax() + var9 / 2) / var4 / (double)var3 - (double)(var11 / 2));
         int var14 = (int)((double)(var2.bz().ob() + var10 / 2) / var4 / (double)var3 - (double)(var12 / 2));
         GL11.glPushMatrix();
         GL11.glTranslated((double)var13, (double)var14, 0.0);
         GL11.glScalef((float)var6, (float)var6, 1.0F);
         var1.sy();
         GL11.glPopMatrix();
      }

   }

   private void oe(FeatherSourceFile495 var1) {
      if (var1 instanceof FeatherSourceFile360) {
         this.gP = true;
      }

   }

   public void fe() {
      this.pe();
      FeatherSourceFile149.oc.oe((var1) -> {
         if (var1 == FeatherSourceFile$xj20.START) {
            this.nd();
         }

      });
      FeatherSourceFile686.ws.oe(this::oe);
      FeatherSourceFile154.ws.oe(this::oe);
      FeatherSourceFile564.ym.oe((var1) -> {
         this.nc(FeatherSourceFile683.HUD_OVERLAY);
      });
   }

   private boolean qz() {
      return this.minecraft.field_71462_r instanceof FeatherSourceFile788;
   }

   private List fz() {
      return (List)this.hb.dx().stream().filter(FeatherSourceFile495::uj).filter((var0) -> {
         return var0 instanceof FeatherSourceFile360;
      }).map((var0) -> {
         return (FeatherSourceFile360)var0;
      }).collect(Collectors.toList());
   }

   public @Nullable void lh(@Nullable @Nullable FeatherSourceFile19 var1) {
      this.gQ = var1;
      if (var1 != null) {
         this.gR = (FeatherSourceFile685)this.hb.xj(this.gQ.xb());
         if (this.gR instanceof FeatherSourceFile360) {
            ((FeatherSourceFile360)this.gR).pu();
         }
      } else {
         this.gR = null;
      }

   }

   public FeatherSourceFile683 zj() {
      return this.gO;
   }

   public void xj(FeatherSourceFile683 var1) {
      this.gO = var1;
   }

   public static FeatherSourceFile776 ny() {
      return gM;
   }
}
