package net.digitalingot.feather.mixin.client;

import java.awt.Color;
import java.util.List;
import net.digitalingot.feather.FeatherSourceFile214;
import net.digitalingot.feather.FeatherSourceFile841;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.Gui;
import net.minecraft.client.gui.GuiScreenResourcePacks;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.resources.ResourcePackListEntry;
import net.minecraft.util.IChatComponent;
import net.minecraft.util.ResourceLocation;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;

@Mixin({ResourcePackListEntry.class})
public abstract class FeatherSourceFile14 implements FeatherSourceFile214 {
   @Shadow
   @Final
   private static ResourceLocation field_148316_c;
   @Shadow
   @Final
   private static IChatComponent field_183020_d;
   @Shadow
   @Final
   private static IChatComponent field_183021_e;
   @Shadow
   @Final
   private static IChatComponent field_183022_f;
   @Shadow
   @Final
   protected Minecraft field_148317_a;
   @Shadow
   @Final
   protected GuiScreenResourcePacks field_148315_b;

   @Shadow
   protected abstract String func_148312_b();

   @Shadow
   protected abstract int func_183019_a();

   @Shadow
   protected abstract void func_148313_c();

   @Shadow
   protected abstract String func_148311_a();

   @Shadow
   protected abstract boolean func_148310_d();

   @Shadow
   protected abstract boolean func_148309_e();

   @Shadow
   protected abstract boolean func_148314_g();

   @Shadow
   protected abstract boolean func_148307_h();

   public String getTitle() {
      return this.func_148312_b();
   }

   @Overwrite
   public void func_180790_a(int var1, int var2, int var3, int var4, int var5, int var6, int var7, boolean var8) {
      int var9 = this.func_183019_a();
      if (var9 != 1) {
         GlStateManager.func_179131_c(1.0F, 1.0F, 1.0F, 1.0F);
         Gui.func_73734_a(var2 - 1, var3 - 1, var2 + var4 - 9, var3 + var5 + 1, -8978432);
      }

      if (var8) {
         FeatherSourceFile841.vK().xj(var2 - 1, var3 - 1, var2 + var4 - 9, var3 + var5 + 1, (new Color(255, 255, 255, 50)).getRGB());
      }

      this.func_148313_c();
      GlStateManager.func_179131_c(1.0F, 1.0F, 1.0F, 1.0F);
      Gui.func_146110_a(var2, var3, 0.0F, 0.0F, 32, 32, 32.0F, 32.0F);
      String var10 = this.func_148312_b();
      String var11 = this.func_148311_a();
      int var12;
      int var14;
      if ((this.field_148317_a.field_71474_y.field_85185_A || var8) && this.func_148310_d()) {
         this.field_148317_a.func_110434_K().func_110577_a(field_148316_c);
         Gui.func_73734_a(var2, var3, var2 + 32, var3 + 32, -1601138544);
         GlStateManager.func_179131_c(1.0F, 1.0F, 1.0F, 1.0F);
         var12 = var7 - var3;
         if (var9 < 1) {
            var10 = field_183020_d.func_150254_d();
            var11 = field_183021_e.func_150254_d();
         } else if (var9 > 1) {
            var10 = field_183020_d.func_150254_d();
            var11 = field_183022_f.func_150254_d();
         }

         int var13 = var2 + var4 - 45;
         var14 = var6 - var13;
         if (!this.func_148309_e()) {
            if (this.func_148314_g()) {
               if (var14 < 32 && var14 > 16 && var12 < 16) {
                  Gui.func_146110_a(var13, var3, 96.0F, 32.0F, 32, 32, 256.0F, 256.0F);
               } else {
                  Gui.func_146110_a(var13, var3, 96.0F, 0.0F, 32, 32, 256.0F, 256.0F);
               }
            }

            if (this.func_148307_h()) {
               if (var14 < 32 && var14 > 16 && var12 > 16) {
                  Gui.func_146110_a(var13, var3, 64.0F, 32.0F, 32, 32, 256.0F, 256.0F);
               } else {
                  Gui.func_146110_a(var13, var3, 64.0F, 0.0F, 32, 32, 256.0F, 256.0F);
               }
            }
         }
      }

      var12 = this.field_148317_a.field_71466_p.func_78256_a(var10);
      if (var12 > 157) {
         var10 = this.field_148317_a.field_71466_p.func_78269_a(var10, 157 - this.field_148317_a.field_71466_p.func_78256_a("...")) + "...";
      }

      this.field_148317_a.field_71466_p.func_175063_a(var10, (float)(var2 + 32 + 2), (float)(var3 + 1), 16777215);
      List var15 = this.field_148317_a.field_71466_p.func_78271_c(var11, 157);

      for(var14 = 0; var14 < 2 && var14 < var15.size(); ++var14) {
         this.field_148317_a.field_71466_p.func_175063_a((String)var15.get(var14), (float)(var2 + 32 + 2), (float)(var3 + 12 + 10 * var14), 8421504);
      }

   }

   @ModifyConstant(
      method = {"mousePressed"},
      constant = {@Constant(
   intValue = 32
)}
   )
   private int gq(int var1) {
      return ((FeatherSourceFile89)this.field_148315_b).getAvailableResourcePacksList().func_148139_c();
   }

   @ModifyConstant(
      method = {"mousePressed"},
      constant = {@Constant(
   intValue = 16,
   ordinal = 0
)}
   )
   private int tk(int var1) {
      return ((FeatherSourceFile89)this.field_148315_b).getSelectedResourcePacksList().func_148139_c() - 30;
   }

   @ModifyConstant(
      method = {"mousePressed"},
      constant = {@Constant(
   intValue = 16,
   ordinal = 1
)}
   )
   private int ut(int var1) {
      return ((FeatherSourceFile89)this.field_148315_b).getSelectedResourcePacksList().func_148139_c() - 30;
   }

   @ModifyConstant(
      method = {"mousePressed"},
      constant = {@Constant(
   intValue = 16,
   ordinal = 3
)}
   )
   private int gx(int var1) {
      return ((FeatherSourceFile89)this.field_148315_b).getSelectedResourcePacksList().func_148139_c() - 30;
   }
}
