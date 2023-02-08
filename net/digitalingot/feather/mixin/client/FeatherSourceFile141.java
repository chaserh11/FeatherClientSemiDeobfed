package net.digitalingot.feather.mixin.client;

import net.digitalingot.feather.FeatherSourceFile465;
import net.digitalingot.feather.FeatherSourceFile638;
import net.digitalingot.feather.FeatherSourceFile665;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.WorldRenderer;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.entity.RenderTNTPrimed;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.entity.item.EntityTNTPrimed;
import org.lwjgl.opengl.GL11;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({RenderTNTPrimed.class})
public class FeatherSourceFile141 {
   @Unique
   private static final FeatherSourceFile465 Wd = FeatherSourceFile665.nc(FeatherSourceFile638.class);

   @Inject(
      method = {"doRender(Lnet/minecraft/entity/item/EntityTNTPrimed;DDDFF)V"},
      at = {@At("TAIL")}
   )
   private void lh(EntityTNTPrimed var1, double var2, double var4, double var6, float var8, float var9, CallbackInfo var10) {
      FeatherSourceFile638 var11 = (FeatherSourceFile638)Wd.ag();
      if (var11.uj()) {
         this.lh(var1, FeatherSourceFile638.lh(var1, var9), var2, var4, var6, var11.nc(var1), var11.ed());
      }
   }

   private void lh(EntityTNTPrimed var1, String var2, double var3, double var5, double var7, int var9, boolean var10) {
      float var11 = var1.field_70131_O + 0.5F;
      GlStateManager.func_179094_E();
      GlStateManager.func_179137_b(var3, var5 + (double)var11, var7);
      GL11.glNormal3f(0.0F, 1.0F, 0.0F);
      RenderManager var12 = Minecraft.func_71410_x().func_175598_ae();
      GlStateManager.func_179114_b(-var12.field_78735_i, 0.0F, 1.0F, 0.0F);
      GlStateManager.func_179114_b((float)(Minecraft.func_71410_x().field_71474_y.field_74320_O == 2 ? -1 : 1) * var12.field_78732_j, 1.0F, 0.0F, 0.0F);
      GlStateManager.func_179152_a(-0.025F, -0.025F, 0.025F);
      GlStateManager.func_179140_f();
      GlStateManager.func_179132_a(false);
      GlStateManager.func_179097_i();
      GlStateManager.func_179147_l();
      GlStateManager.func_179120_a(770, 771, 1, 0);
      int var13 = Minecraft.func_71410_x().field_71466_p.func_78256_a(var2) / 2;
      int var14 = "deadmau5".equals(var2) ? -10 : 0;
      GlStateManager.func_179090_x();
      Tessellator var15 = Tessellator.func_178181_a();
      WorldRenderer var16 = var15.func_178180_c();
      var16.func_181668_a(7, DefaultVertexFormats.field_181706_f);
      var16.func_181662_b((double)(-var13 - 1), (double)(-1 + var14), 0.0).func_181666_a(0.0F, 0.0F, 0.0F, 0.25F).func_181675_d();
      var16.func_181662_b((double)(-var13 - 1), (double)(8 + var14), 0.0).func_181666_a(0.0F, 0.0F, 0.0F, 0.25F).func_181675_d();
      var16.func_181662_b((double)(var13 + 1), (double)(8 + var14), 0.0).func_181666_a(0.0F, 0.0F, 0.0F, 0.25F).func_181675_d();
      var16.func_181662_b((double)(var13 + 1), (double)(-1 + var14), 0.0).func_181666_a(0.0F, 0.0F, 0.0F, 0.25F).func_181675_d();
      var15.func_78381_a();
      GlStateManager.func_179098_w();
      Minecraft.func_71410_x().field_71466_p.func_175065_a(var2, (float)(-var13), (float)var14, var9, var10);
      GlStateManager.func_179126_j();
      GlStateManager.func_179132_a(true);
      Minecraft.func_71410_x().field_71466_p.func_175065_a(var2, (float)(-var13), (float)var14, var9, var10);
      GlStateManager.func_179145_e();
      GlStateManager.func_179084_k();
      GlStateManager.func_179131_c(1.0F, 1.0F, 1.0F, 1.0F);
      GlStateManager.func_179121_F();
   }
}
