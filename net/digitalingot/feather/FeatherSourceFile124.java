package net.digitalingot.feather;

import net.digitalingot.vendor.com.google.inject.Inject;
import net.digitalingot.vendor.com.google.inject.Singleton;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiScreen;

@Singleton
public class FeatherSourceFile124 {
   private static final int zs = 60;
   private final Minecraft minecraft;
   private final FeatherSourceFile113 gb;
   private final FeatherSourceFile454 uz;
   private FeatherSourceFile744 hs;
   private FeatherSourceFile65 kk;
   private FeatherSourceFile695 qc;

   @Inject
   FeatherSourceFile124(Minecraft var1, FeatherSourceFile113 var2, FeatherSourceFile454 var3) {
      this.minecraft = var1;
      this.gb = var2;
      this.uz = var3;
      FeatherSourceFile48.ws.oe((var1x, var2x) -> {
         if (this.fr()) {
            this.hs.func_175273_b(this.minecraft, FeatherSourceFile851.iL(), FeatherSourceFile851.iM());
         }

      });
      FeatherSourceFile564.ym.oe((var1x) -> {
         if (this.fr()) {
            this.hs.ep(60);
         }

      });
      FeatherSourceFile725.wi.oe((var1x, var2x) -> {
         this.minecraft.func_152344_a(this::rg);
      });
      FeatherSourceFile83.gp.oe((var1x) -> {
         if (var1x.contains("feather:client")) {
            this.minecraft.func_152344_a(this::rg);
         }

      });
      if (FeatherSourceFile747.as()) {
         FeatherSourceFile653.ws.oe((var1x) -> {
            (new FeatherSourceFile669(this)).lh(var1x);
         });
      }

   }

   private void oc() {
      if (this.hs == null) {
         this.kk = new FeatherSourceFile65(this.uz);
         this.kk.zy();
         this.qc = new FeatherSourceFile695(this);
         FeatherSourceFile799 var1 = new FeatherSourceFile799(this.gb, this, this.kk, this.qc);
         FeatherSourceFile104 var2 = var1.eg("http://fui-root/");
         this.hs = new FeatherSourceFile744(var1, var2, this.qc);
      }
   }

   public void rg() {
      if (this.hs != null) {
         if (this.minecraft.field_71462_r == this.hs) {
            this.minecraft.func_147108_a((GuiScreen)null);
         }

         this.hs.cm();
         this.hs = null;
         this.kk.bd();
         this.kk = null;
         this.qc = null;
      }

   }

   public void lh(String var1, boolean var2) {
      if (this.hs != null) {
         boolean var3 = this.minecraft.field_71462_r == this.hs;
         if (var3) {
            if (var2) {
               this.qc.ly(var1);
            } else {
               this.minecraft.func_147108_a((GuiScreen)null);
            }
         } else if (var2) {
            this.minecraft.func_147108_a(this.hs);
            if (this.minecraft.field_71462_r == this.hs) {
               this.qc.ly(var1);
            }
         }

      }
   }

   public void nc(String var1, boolean var2) {
      if (this.hs != null) {
         if (var2) {
            this.qc.tx(var1);
         } else {
            this.qc.wn(var1);
         }

      }
   }

   public void lh(String var1, String var2) {
      this.oc();
      this.qc.lh(var1, var2);
   }

   public void sm(String var1) {
      if (this.hs != null) {
         this.qc.sm(var1);
      }
   }

   public void oe(String var1, String var2) {
      this.qc.nc(var1, var2);
   }

   public void nc(int var1, boolean var2, byte[] var3) {
      this.kk.lh(var1, var2, var3);
   }

   void gr(String var1) {
      this.uz.aq(var1);
   }

   void qy(String var1, String var2) {
      this.uz.wz(var1, var2);
   }

   void lh(String var1, int var2) {
      this.uz.cj(var1);
      if (var2 == 0) {
         this.rg();
      }

   }

   void oh(String var1) {
      this.uz.ut(var1);
   }

   void hg(String var1) {
      this.uz.gx(var1);
   }

   void nc(String var1, int var2) {
      this.uz.gq(var1);
      if (var2 > 0) {
         if (this.zp()) {
            this.hs.eg(false);
         } else if (this.hs.oq()) {
            this.hs.func_175273_b(this.minecraft, FeatherSourceFile851.iL(), FeatherSourceFile851.iM());
            this.hs.qr(false);
         }
      }

   }

   void xj(String var1, int var2) {
      this.uz.tk(var1);
      if (var2 == 0) {
         if (this.zp()) {
            this.hs.eg(true);
         } else {
            this.hs.qr(true);
         }
      }

   }

   void et(String var1) {
      if (this.hs != null) {
         this.hs.oy(var1);
      }

   }

   public boolean zp() {
      return this.minecraft.field_71462_r == this.hs;
   }

   private boolean fr() {
      return this.hs != null && !this.hs.oq() && !this.zp();
   }
}
