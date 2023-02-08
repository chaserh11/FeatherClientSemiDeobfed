package net.digitalingot.feather;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.WorldRenderer;
import net.minecraft.client.renderer.texture.TextureManager;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.client.shader.Framebuffer;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.util.glu.Project;

public class FeatherSourceFile142 {
   private static final ResourceLocation[] sq = new ResourceLocation[]{new ResourceLocation("feather:textures/gui/panorama/panorama_0.png"), new ResourceLocation("feather:textures/gui/panorama/panorama_1.png"), new ResourceLocation("feather:textures/gui/panorama/panorama_2.png"), new ResourceLocation("feather:textures/gui/panorama/panorama_3.png"), new ResourceLocation("feather:textures/gui/panorama/panorama_4.png"), new ResourceLocation("feather:textures/gui/panorama/panorama_5.png")};
   private final Minecraft minecraft = Minecraft.func_71410_x();
   private float hw;

   public void pq(float var1) {
      this.hw += var1 * 0.35F;
      this.lh(this.minecraft, (float)Math.sin((double)(this.hw * 0.001F)) * 5.0F + 25.0F, -this.hw * 0.1F);
   }

   private void lh(Minecraft var1, float var2, float var3) {
      Tessellator var4 = Tessellator.func_178181_a();
      WorldRenderer var5 = var4.func_178180_c();
      GlStateManager.func_179128_n(5889);
      GlStateManager.func_179094_E();
      GlStateManager.func_179096_D();
      Framebuffer var6 = var1.func_147110_a();
      float var7 = (float)var6.field_147621_c / (float)var6.field_147618_d;
      Project.gluPerspective(85.0F, var7, 0.05F, 10.0F);
      GlStateManager.func_179128_n(5888);
      GlStateManager.func_179094_E();
      GlStateManager.func_179096_D();
      GlStateManager.func_179131_c(1.0F, 1.0F, 1.0F, 1.0F);
      GlStateManager.func_179114_b(180.0F, 1.0F, 0.0F, 0.0F);
      GlStateManager.func_179147_l();
      GlStateManager.func_179118_c();
      GlStateManager.func_179129_p();
      GlStateManager.func_179132_a(false);
      GlStateManager.func_179120_a(770, 771, 1, 0);
      TextureManager var8 = var1.func_110434_K();

      for(int var9 = 0; var9 < 4; ++var9) {
         GlStateManager.func_179094_E();
         float var10 = ((float)(var9 % 2) / 2.0F - 0.5F) / 256.0F;
         float var11 = ((float)(var9 / 2) / 2.0F - 0.5F) / 256.0F;
         GlStateManager.func_179109_b(var10, var11, 0.0F);
         GlStateManager.func_179114_b(var2, 1.0F, 0.0F, 0.0F);
         GlStateManager.func_179114_b(var3, 0.0F, 1.0F, 0.0F);
         int var12 = 255 / (var9 + 1);
         var8.func_110577_a(sq[0]);
         var5.func_181668_a(7, DefaultVertexFormats.field_181709_i);
         var5.func_181662_b(-1.0, -1.0, 1.0).func_181673_a(0.0, 0.0).func_181669_b(255, 255, 255, var12).func_181675_d();
         var5.func_181662_b(-1.0, 1.0, 1.0).func_181673_a(0.0, 1.0).func_181669_b(255, 255, 255, var12).func_181675_d();
         var5.func_181662_b(1.0, 1.0, 1.0).func_181673_a(1.0, 1.0).func_181669_b(255, 255, 255, var12).func_181675_d();
         var5.func_181662_b(1.0, -1.0, 1.0).func_181673_a(1.0, 0.0).func_181669_b(255, 255, 255, var12).func_181675_d();
         var4.func_78381_a();
         var8.func_110577_a(sq[1]);
         var5.func_181668_a(7, DefaultVertexFormats.field_181709_i);
         var5.func_181662_b(1.0, -1.0, 1.0).func_181673_a(0.0, 0.0).func_181669_b(255, 255, 255, var12).func_181675_d();
         var5.func_181662_b(1.0, 1.0, 1.0).func_181673_a(0.0, 1.0).func_181669_b(255, 255, 255, var12).func_181675_d();
         var5.func_181662_b(1.0, 1.0, -1.0).func_181673_a(1.0, 1.0).func_181669_b(255, 255, 255, var12).func_181675_d();
         var5.func_181662_b(1.0, -1.0, -1.0).func_181673_a(1.0, 0.0).func_181669_b(255, 255, 255, var12).func_181675_d();
         var4.func_78381_a();
         var8.func_110577_a(sq[2]);
         var5.func_181668_a(7, DefaultVertexFormats.field_181709_i);
         var5.func_181662_b(1.0, -1.0, -1.0).func_181673_a(0.0, 0.0).func_181669_b(255, 255, 255, var12).func_181675_d();
         var5.func_181662_b(1.0, 1.0, -1.0).func_181673_a(0.0, 1.0).func_181669_b(255, 255, 255, var12).func_181675_d();
         var5.func_181662_b(-1.0, 1.0, -1.0).func_181673_a(1.0, 1.0).func_181669_b(255, 255, 255, var12).func_181675_d();
         var5.func_181662_b(-1.0, -1.0, -1.0).func_181673_a(1.0, 0.0).func_181669_b(255, 255, 255, var12).func_181675_d();
         var4.func_78381_a();
         var8.func_110577_a(sq[3]);
         var5.func_181668_a(7, DefaultVertexFormats.field_181709_i);
         var5.func_181662_b(-1.0, -1.0, -1.0).func_181673_a(0.0, 0.0).func_181669_b(255, 255, 255, var12).func_181675_d();
         var5.func_181662_b(-1.0, 1.0, -1.0).func_181673_a(0.0, 1.0).func_181669_b(255, 255, 255, var12).func_181675_d();
         var5.func_181662_b(-1.0, 1.0, 1.0).func_181673_a(1.0, 1.0).func_181669_b(255, 255, 255, var12).func_181675_d();
         var5.func_181662_b(-1.0, -1.0, 1.0).func_181673_a(1.0, 0.0).func_181669_b(255, 255, 255, var12).func_181675_d();
         var4.func_78381_a();
         var8.func_110577_a(sq[4]);
         var5.func_181668_a(7, DefaultVertexFormats.field_181709_i);
         var5.func_181662_b(-1.0, -1.0, -1.0).func_181673_a(0.0, 0.0).func_181669_b(255, 255, 255, var12).func_181675_d();
         var5.func_181662_b(-1.0, -1.0, 1.0).func_181673_a(0.0, 1.0).func_181669_b(255, 255, 255, var12).func_181675_d();
         var5.func_181662_b(1.0, -1.0, 1.0).func_181673_a(1.0, 1.0).func_181669_b(255, 255, 255, var12).func_181675_d();
         var5.func_181662_b(1.0, -1.0, -1.0).func_181673_a(1.0, 0.0).func_181669_b(255, 255, 255, var12).func_181675_d();
         var4.func_78381_a();
         var8.func_110577_a(sq[5]);
         var5.func_181668_a(7, DefaultVertexFormats.field_181709_i);
         var5.func_181662_b(-1.0, 1.0, 1.0).func_181673_a(0.0, 0.0).func_181669_b(255, 255, 255, var12).func_181675_d();
         var5.func_181662_b(-1.0, 1.0, -1.0).func_181673_a(0.0, 1.0).func_181669_b(255, 255, 255, var12).func_181675_d();
         var5.func_181662_b(1.0, 1.0, -1.0).func_181673_a(1.0, 1.0).func_181669_b(255, 255, 255, var12).func_181675_d();
         var5.func_181662_b(1.0, 1.0, 1.0).func_181673_a(1.0, 0.0).func_181669_b(255, 255, 255, var12).func_181675_d();
         var4.func_78381_a();
         GlStateManager.func_179121_F();
         GlStateManager.func_179135_a(true, true, true, false);
      }

      GlStateManager.func_179135_a(true, true, true, true);
      GlStateManager.func_179128_n(5889);
      GlStateManager.func_179121_F();
      GlStateManager.func_179128_n(5888);
      GlStateManager.func_179121_F();
      GlStateManager.func_179132_a(true);
      GlStateManager.func_179089_o();
      GlStateManager.func_179126_j();
   }
}
