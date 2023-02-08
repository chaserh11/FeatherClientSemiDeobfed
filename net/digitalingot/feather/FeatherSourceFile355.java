package net.digitalingot.feather;

import java.util.Iterator;
import java.util.List;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.ResourcePackRepository.Entry;
import net.minecraft.util.ResourceLocation;

public class FeatherSourceFile355 implements FeatherSourceFile319 {
   private final ResourceLocation SB = new ResourceLocation("textures/misc/unknown_pack.png");

   public void lh(FeatherSourceFile841 var1, Entry var2, float var3, float var4, FeatherSourceFile225 var5, boolean var6) {
      var1.lh(var2.func_110515_d(), var3, var4, var5, var6);
   }

   public void lh(FeatherSourceFile841 var1, Entry var2, float var3, float var4, int var5, boolean var6) {
      List var7 = Minecraft.func_71410_x().field_71466_p.func_78271_c(var2.func_110519_e(), 157);
      int var8 = 0;

      for(Iterator var9 = var7.iterator(); var9.hasNext(); var8 += 12) {
         String var10 = (String)var9.next();
         var1.lh(var10, var3, var4 + (float)var8, var5, var6, false);
      }

   }

   public void lh(Entry var1) {
      var1.func_110518_a(Minecraft.func_71410_x().func_110434_K());
   }

   public void yG() {
      Minecraft.func_71410_x().func_110434_K().func_110577_a(this.SB);
   }

   // $FF: synthetic method
   public void lt(Object var1) {
      this.lh((Entry)var1);
   }
}
