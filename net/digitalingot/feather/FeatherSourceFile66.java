package net.digitalingot.feather;

import java.util.Locale;
import net.digitalingot.vendor.javax.inject.Inject;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiChat;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.renderer.EntityRenderer;
import net.minecraft.util.ResourceLocation;

public class FeatherSourceFile66 implements FeatherSourceFile421 {
   private static final String mZ = "{\"targets\":[\"largeBlur\",\"smallBlur\",\"temp\",\"swap\"],\"passes\":[{\"name\":\"blur\",\"intarget\":\"minecraft:main\",\"outtarget\":\"temp\",\"uniforms\":[{\"name\":\"BlurDir\",\"values\":[1.0,0.0]},{\"name\":\"Radius\",\"values\":[%.2f]}]},{\"name\":\"blur\",\"intarget\":\"temp\",\"outtarget\":\"largeBlur\",\"uniforms\":[{\"name\":\"BlurDir\",\"values\":[0.0,1.0]},{\"name\":\"Radius\",\"values\":[%.2f]}]},{\"name\":\"blur\",\"intarget\":\"minecraft:main\",\"outtarget\":\"temp\",\"uniforms\":[{\"name\":\"BlurDir\",\"values\":[1.0,0.0]},{\"name\":\"Radius\",\"values\":[%.2f]}]},{\"name\":\"blur\",\"intarget\":\"temp\",\"outtarget\":\"smallBlur\",\"uniforms\":[{\"name\":\"BlurDir\",\"values\":[0.0,1.0]},{\"name\":\"Radius\",\"values\":[%.2f]}]},{\"name\":\"spider\",\"intarget\":\"smallBlur\",\"outtarget\":\"temp\",\"auxtargets\":[{\"name\":\"BlurSampler\",\"id\":\"swap\"}],\"uniforms\":[{\"name\":\"InScale\",\"values\":[1.0,1.0]},{\"name\":\"InOffset\",\"values\":[0.0,0.0]}]},{\"name\":\"blit\",\"intarget\":\"temp\",\"outtarget\":\"minecraft:main\"}]}";
   private static final ResourceLocation nA = FeatherSourceFile420.gk("menublur");
   private static final FeatherSourceFile465 sP = FeatherSourceFile665.nc(FeatherSourceFile522.class);
   private GuiScreen sQ = null;
   private Object sR = null;
   private final FeatherSourceFile420 ux;
   private final Minecraft minecraft;

   @Inject
   public FeatherSourceFile66(FeatherSourceFile420 var1, Minecraft var2) {
      this.ux = var1;
      this.minecraft = var2;
   }

   public FeatherSourceFile842 createRuntimeResource() {
      return new FeatherSourceFile419(this.hl());
   }

   public void fe() {
      FeatherSourceFile623.iw.oe(this::xj);
      FeatherSourceFile623.ir.oe(this::um);
   }

   private GuiScreen xj(GuiScreen var1) {
      if (this.minecraft.field_71441_e == null) {
         return var1;
      } else {
         boolean var2 = var1 instanceof FeatherSourceFile372 && ((FeatherSourceFile372)var1).isMinecraftScreen();
         boolean var3 = var1 instanceof FeatherSourceFile372 && ((FeatherSourceFile372)var1).isFeatherScreen();
         boolean var4 = ((FeatherSourceFile$lh135)((FeatherSourceFile522)sP.ag()).pr()).mG;
         boolean var5 = ((FeatherSourceFile$lh135)((FeatherSourceFile522)sP.ag()).pr()).mH;
         if (var4 && (var2 || var3) && (var3 || !var5)) {
            if (!(var1 instanceof GuiChat) && this.sQ == null) {
               if (this.ux.qy(nA) != this) {
                  this.ux.lh(nA, this);
               }

               this.sQ = var1;
               this.uw();
            }

            return var1;
         } else {
            this.lr();
            this.ux.ou(nA);
            return var1;
         }
      }
   }

   private void um() {
      this.sQ = null;
      this.lr();
   }

   private String hl() {
      double var1 = ((FeatherSourceFile$lh135)((FeatherSourceFile522)sP.ag()).pr()).mI;
      return String.format(Locale.ROOT, "{\"targets\":[\"largeBlur\",\"smallBlur\",\"temp\",\"swap\"],\"passes\":[{\"name\":\"blur\",\"intarget\":\"minecraft:main\",\"outtarget\":\"temp\",\"uniforms\":[{\"name\":\"BlurDir\",\"values\":[1.0,0.0]},{\"name\":\"Radius\",\"values\":[%.2f]}]},{\"name\":\"blur\",\"intarget\":\"temp\",\"outtarget\":\"largeBlur\",\"uniforms\":[{\"name\":\"BlurDir\",\"values\":[0.0,1.0]},{\"name\":\"Radius\",\"values\":[%.2f]}]},{\"name\":\"blur\",\"intarget\":\"minecraft:main\",\"outtarget\":\"temp\",\"uniforms\":[{\"name\":\"BlurDir\",\"values\":[1.0,0.0]},{\"name\":\"Radius\",\"values\":[%.2f]}]},{\"name\":\"blur\",\"intarget\":\"temp\",\"outtarget\":\"smallBlur\",\"uniforms\":[{\"name\":\"BlurDir\",\"values\":[0.0,1.0]},{\"name\":\"Radius\",\"values\":[%.2f]}]},{\"name\":\"spider\",\"intarget\":\"smallBlur\",\"outtarget\":\"temp\",\"auxtargets\":[{\"name\":\"BlurSampler\",\"id\":\"swap\"}],\"uniforms\":[{\"name\":\"InScale\",\"values\":[1.0,1.0]},{\"name\":\"InOffset\",\"values\":[0.0,0.0]}]},{\"name\":\"blit\",\"intarget\":\"temp\",\"outtarget\":\"minecraft:main\"}]}", var1, var1, var1, var1);
   }

   private void uw() {
      EntityRenderer var1 = this.minecraft.field_71460_t;
      net.digitalingot.feather.mixin.core.FeatherSourceFile10 var2 = (net.digitalingot.feather.mixin.core.FeatherSourceFile10)var1;
      if (this.sR == null || var2.feather$getEffect() != this.sR) {
         var2.feather$loadShader(nA);
         this.sR = var2.feather$getEffect();
      }

   }

   private void lr() {
      EntityRenderer var1 = this.minecraft.field_71460_t;
      net.digitalingot.feather.mixin.core.FeatherSourceFile10 var2 = (net.digitalingot.feather.mixin.core.FeatherSourceFile10)var1;
      if (this.sR != null) {
         if (var2.feather$getEffect() == this.sR) {
            var1.func_181022_b();
         }

         this.sR = null;
      }

   }
}
