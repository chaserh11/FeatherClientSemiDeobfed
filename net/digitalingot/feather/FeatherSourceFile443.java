package net.digitalingot.feather;

import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.WorldRenderer;
import net.minecraft.client.renderer.vertex.VertexFormat;

public class FeatherSourceFile443 {
   public static FeatherSourceFile443 RM = new FeatherSourceFile443(Tessellator.func_178181_a());
   private final Tessellator RN;
   private final WorldRenderer RO;

   private FeatherSourceFile443(Tessellator var1) {
      this.RN = var1;
      this.RO = var1.func_178180_c();
   }

   public FeatherSourceFile443 nc(int var1, VertexFormat var2) {
      this.RO.func_181668_a(var1, var2);
      return this;
   }

   public FeatherSourceFile443 as(float var1, float var2, float var3) {
      this.RO.func_181662_b((double)var1, (double)var2, (double)var3);
      return this;
   }

   public FeatherSourceFile443 pq(double var1, double var3, double var5) {
      this.RO.func_181662_b(var1, var3, var5);
      return this;
   }

   public FeatherSourceFile443 km(int var1, int var2, int var3, int var4) {
      this.RO.func_181669_b(var1, var2, var3, var4);
      return this;
   }

   public FeatherSourceFile443 qy(float var1, float var2, float var3, float var4) {
      this.RO.func_181666_a(var1, var2, var3, var4);
      return this;
   }

   public FeatherSourceFile443 ou(float var1, float var2) {
      this.RO.func_181673_a((double)var1, (double)var2);
      return this;
   }

   public FeatherSourceFile443 xZ() {
      this.RO.func_181675_d();
      return this;
   }

   public WorldRenderer yA() {
      return this.RO;
   }

   public void lx() {
      this.RN.func_78381_a();
   }
}
