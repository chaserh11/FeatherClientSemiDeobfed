package net.digitalingot.feather;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.util.ResourceLocation;

public class FeatherSourceFile817 extends FontRenderer {
   private final FontRenderer PW;

   public FeatherSourceFile817() {
      super(Minecraft.func_71410_x().field_71474_y, new ResourceLocation("textures/font/ascii.png"), Minecraft.func_71410_x().func_110434_K(), false);
      this.PW = Minecraft.func_71410_x().field_71466_p;
   }

   public int func_175065_a(String var1, float var2, float var3, int var4, boolean var5) {
      return this.PW.func_175065_a(var1, var2 + 1.0F, var3 + 1.0F, var4, var5);
   }

   public int vr(String var1) {
      return this.func_78256_a(var1);
   }

   public int func_78256_a(String var1) {
      return this.PW.func_78256_a(var1);
   }

   public int func_78263_a(char var1) {
      return this.PW.func_78263_a(var1);
   }

   public int xj(String var1, float var2, float var3, int var4, boolean var5) {
      return this.PW.func_175065_a(var1, var2, var3, var4, var5);
   }
}
