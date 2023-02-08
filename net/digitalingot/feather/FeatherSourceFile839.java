package net.digitalingot.feather;

import net.minecraft.client.renderer.vertex.DefaultVertexFormats;

public enum FeatherSourceFile839 {
   ALL,
   LEFT,
   RIGHT,
   TOP,
   BOTTOM;

   public void draw(int var1, int var2, int var3, int var4, float var5, float var6, float var7, float var8) {
      FeatherSourceFile443 var9 = FeatherSourceFile443.RM;
      var9.nc(3, DefaultVertexFormats.field_181706_f);
      if (this == ALL || this == LEFT || this == BOTTOM) {
         var9.as((float)var1, (float)var4, 0.0F).qy(var5, var6, var7, var8).xZ();
      }

      if (this == ALL || this == RIGHT || this == BOTTOM) {
         var9.as((float)var3, (float)var4, 0.0F).qy(var5, var6, var7, var8).xZ();
      }

      if (this == ALL || this == RIGHT || this == TOP) {
         var9.as((float)var3, (float)var2, 0.0F).qy(var5, var6, var7, var8).xZ();
      }

      if (this == ALL || this == LEFT || this == TOP) {
         var9.as((float)var1, (float)var2, 0.0F).qy(var5, var6, var7, var8).xZ();
      }

      if (this == ALL) {
         var9.as((float)var1, (float)var4, 0.0F).qy(var5, var6, var7, var8).xZ();
      }

      var9.lx();
   }

   // $FF: synthetic method
   private static FeatherSourceFile839[] $values() {
      return new FeatherSourceFile839[]{ALL, LEFT, RIGHT, TOP, BOTTOM};
   }
}
