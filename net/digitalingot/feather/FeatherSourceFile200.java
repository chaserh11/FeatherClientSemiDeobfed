package net.digitalingot.feather;

import java.io.IOException;
import net.digitalingot.vendor.com.google.inject.Inject;
import net.digitalingot.vendor.com.google.inject.Provider;
import net.digitalingot.vendor.com.google.inject.Singleton;
import net.minecraft.client.Minecraft;

@Singleton
@FeatherSourceFile3(
   jj = FeatherSourceFile243.SOCIAL,
   kl = @FeatherSourceFile414(
   jc = "feather.modulename.social",
   jl = "https://assets.feathercdn.net/game/homepageicons/chat.svg",
   od = "feather.moduledescription.social",
   wr = {},
   ds = @FeatherSourceFile$lh55(
   jc = "Social",
   jm = @FeatherSourceFile655(
   kz = 5
)
)
)
)
public class FeatherSourceFile200 extends FeatherSourceFile495 {
   private final FeatherSourceFile55 kQ;
   private final FeatherSourceFile131 rb;
   private boolean Jw = false;
   private final FeatherSourceFile143 lk;
   private final Provider Jx;
   private final FeatherSourceFile207 hf;
   private final Minecraft minecraft;

   @Inject
   FeatherSourceFile200(FeatherSourceFile55 var1, FeatherSourceFile131 var2, FeatherSourceFile143 var3, Provider var4, FeatherSourceFile207 var5, Minecraft var6) {
      this.kQ = var1;
      this.rb = var2;
      this.lk = var3;
      this.Jx = var4;
      this.hf = var5;
      this.minecraft = var6;
   }

   public void ex() {
      this.kQ.lh(() -> {
         return ((FeatherSourceFile$lh25)this.fS).Jy;
      }, () -> {
         if (this.Jw) {
            this.cf();
         } else {
            this.jv();
         }

      });
      FeatherSourceFile461.ws.oe((var1) -> {
         if (var1.equals("social")) {
            this.minecraft.func_147108_a(this.lk);
            this.jv();
         }

      });
   }

   public void dZ() {
      try {
         FeatherSourceFile126 var1 = ((FeatherSourceFile700)this.Jx.get()).ez();
         ((FeatherSourceFile$lh25)this.fS).bx = var1.fw();
         ((FeatherSourceFile$lh25)this.fS).sp = var1.mx();
         ((FeatherSourceFile$lh25)this.fS).ie = var1.xl();
      } catch (IOException var2) {
      }

   }

   public void eA() {
      this.dZ();
      this.hf.rj();
   }

   public void pu() {
      try {
         ((FeatherSourceFile700)this.Jx.get()).lh(new FeatherSourceFile126(((FeatherSourceFile$lh25)this.fS).bx, ((FeatherSourceFile$lh25)this.fS).sp, ((FeatherSourceFile$lh25)this.fS).ie));
      } catch (IOException var2) {
      }

   }

   public void cf() {
      this.rb.cf();
      this.Jw = !this.Jw;
   }

   public void jv() {
      this.vt(true);
   }

   public void vt(boolean var1) {
      this.rb.jv();
      if (var1) {
         Minecraft.func_71410_x().func_147108_a(this.lk);
      }

      this.Jw = !this.Jw;
   }

   public boolean eB() {
      return this.Jw;
   }
}
