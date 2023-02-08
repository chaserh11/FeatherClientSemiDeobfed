package net.digitalingot.feather.mixin.client;

import net.digitalingot.feather.FeatherSourceFile$lh33;
import net.digitalingot.feather.FeatherSourceFile172;
import net.digitalingot.feather.FeatherSourceFile413;
import net.digitalingot.feather.FeatherSourceFile465;
import net.digitalingot.feather.FeatherSourceFile665;
import net.digitalingot.feather.FeatherSourceFile788;
import net.digitalingot.feather.FeatherSourceFile852;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.Gui;
import net.minecraft.client.gui.GuiIngame;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.boss.BossStatus;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.At.Shift;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({GuiIngame.class})
public abstract class FeatherSourceFile163 extends Gui {
   @Unique
   private static final FeatherSourceFile465 WA = FeatherSourceFile665.nc(FeatherSourceFile172.class);
   @Final
   @Shadow
   protected Minecraft field_73839_d;

   @Inject(
      method = {"renderBossHealth()V"},
      at = {@At(
   value = "FIELD",
   target = "Lnet/minecraft/entity/boss/BossStatus;statusBarTime:I",
   opcode = 179,
   ordinal = 0,
   shift = Shift.AFTER
)},
      cancellable = true,
      require = 1,
      allow = 1
   )
   private void ly(CallbackInfo var1) {
      var1.cancel();
      FeatherSourceFile172 var2 = (FeatherSourceFile172)WA.ag();
      if (var2.uj() && !(this.field_73839_d.field_71462_r instanceof FeatherSourceFile788)) {
         FeatherSourceFile413 var3 = var2.vb();
         FeatherSourceFile852 var4 = var3.yb();
         var4.xj();
         FeatherSourceFile$lh33 var5 = (FeatherSourceFile$lh33)var2.pr();
         int var6 = var3.rl();
         int var7 = (int)(BossStatus.field_82828_a * (float)(var6 + 1));
         double var8 = var3.hk().ee();
         GlStateManager.func_179094_E();
         GlStateManager.func_179137_b(var3.zm(), var3.rq(), 0.0);
         GlStateManager.func_179139_a(var8, var8, 0.0);
         this.func_73729_b(0, 12, 0, 74, 182, 5);
         this.func_73729_b(0, 12, 0, 74, 182, 5);
         if (var7 > 0) {
            this.func_73729_b(0, 12, 0, 79, var7, 5);
         }

         String var10 = BossStatus.field_82827_c;
         var4.lh(var5.zP ? FeatherSourceFile172.zO.matcher(var10).replaceAll("") : var10, (float)((var6 - var4.vr(var10)) / 2), 2.0F, var5.hQ, var5.hR);
         GlStateManager.func_179131_c(1.0F, 1.0F, 1.0F, 1.0F);
         this.field_73839_d.func_110434_K().func_110577_a(field_110324_m);
         GlStateManager.func_179121_F();
         var4.vO();
         var3.cg(19);
      }
   }
}
