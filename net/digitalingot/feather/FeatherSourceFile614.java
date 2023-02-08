package net.digitalingot.feather;

import java.util.Locale;
import net.digitalingot.vendor.com.google.inject.Singleton;
import net.digitalingot.vendor.javax.inject.Inject;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.EntityRenderer;
import net.minecraft.util.ResourceLocation;

@Singleton
@FeatherSourceFile3(
   jj = FeatherSourceFile243.MOTION_BLUR,
   kl = @FeatherSourceFile414(
   jc = "feather.modulename.motionblur",
   jl = "https://assets.feathercdn.net/game/mods/motionblur.svg",
   od = "feather.moduledescription.motionblur",
   wr = {FeatherSourceFile$lh3.PVP}
)
)
public class FeatherSourceFile614 extends FeatherSourceFile495 implements FeatherSourceFile421 {
   private static final String mZ = "{\"targets\":[\"swap\",\"previous\"],\"passes\":[{\"name\":\"phosphor\",\"intarget\":\"minecraft:main\",\"outtarget\":\"swap\",\"auxtargets\":[{\"name\":\"PrevSampler\",\"id\":\"previous\"}],\"uniforms\":[{\"name\":\"Phosphor\",\"values\":[%.2f, %.2f, %.2f]}]},{\"name\":\"blit\",\"intarget\":\"swap\",\"outtarget\":\"previous\"},{\"name\":\"blit\",\"intarget\":\"swap\",\"outtarget\":\"minecraft:main\"}]}";
   private static final ResourceLocation nA = FeatherSourceFile420.gk("motionblur");
   private final Minecraft minecraft;
   private final FeatherSourceFile434 xj;
   private final FeatherSourceFile420 ux;
   private Object nB = null;

   @Inject
   FeatherSourceFile614(Minecraft var1, FeatherSourceFile434 var2, FeatherSourceFile420 var3) {
      this.minecraft = var1;
      this.xj = var2;
      this.ux = var3;
   }

   public void ex() {
      FeatherSourceFile149.oc.oe((var1) -> {
         if (var1 == FeatherSourceFile$xj20.START) {
            if (this.uj()) {
               if (this.minecraft.field_71441_e != null && this.minecraft.field_71462_r == null) {
                  this.ur();
               }
            }
         }
      });
      FeatherSourceFile660.ws.oe(() -> {
         if (this.uj()) {
            this.nB = null;
         }

      });
   }

   public void ml() {
      this.ux.lh(nA, this);
      this.nB = null;
   }

   public void ze() {
      this.nx();
      this.ux.ou(nA);
   }

   public void pu() {
      this.xj.lh(() -> {
         if (this.uj()) {
            this.nB = null;
         }

      }, 1L);
   }

   private void ur() {
      EntityRenderer var1 = this.minecraft.field_71460_t;
      net.digitalingot.feather.mixin.core.FeatherSourceFile10 var2 = (net.digitalingot.feather.mixin.core.FeatherSourceFile10)var1;
      if (this.nB == null || var2.feather$getEffect() != this.nB) {
         var2.feather$loadShader(nA);
         this.nB = var2.feather$getEffect();
      }

   }

   private void nx() {
      EntityRenderer var1 = this.minecraft.field_71460_t;
      net.digitalingot.feather.mixin.core.FeatherSourceFile10 var2 = (net.digitalingot.feather.mixin.core.FeatherSourceFile10)var1;
      if (this.nB != null) {
         if (var2.feather$getEffect() == this.nB) {
            var1.func_181022_b();
         }

         this.nB = null;
      }

   }

   public FeatherSourceFile842 createRuntimeResource() {
      return new FeatherSourceFile419(this.hl());
   }

   private String hl() {
      double var1 = 0.6 + ((FeatherSourceFile$lh132)this.fS).nC / 251.0;
      return String.format(Locale.ROOT, "{\"targets\":[\"swap\",\"previous\"],\"passes\":[{\"name\":\"phosphor\",\"intarget\":\"minecraft:main\",\"outtarget\":\"swap\",\"auxtargets\":[{\"name\":\"PrevSampler\",\"id\":\"previous\"}],\"uniforms\":[{\"name\":\"Phosphor\",\"values\":[%.2f, %.2f, %.2f]}]},{\"name\":\"blit\",\"intarget\":\"swap\",\"outtarget\":\"previous\"},{\"name\":\"blit\",\"intarget\":\"swap\",\"outtarget\":\"minecraft:main\"}]}", var1, var1, var1);
   }
}
