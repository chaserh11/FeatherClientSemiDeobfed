package net.digitalingot.feather;

import java.nio.ByteBuffer;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.WorldRenderer;
import net.minecraft.client.renderer.vertex.VertexFormat;

public final class FeatherSourceFile819 {
   public static final FeatherSourceFile819 PZ = new FeatherSourceFile819();
   private final Tessellator Qa = Tessellator.func_178181_a();
   private final WorldRenderer Qb;
   private final FeatherSourceFile802 Qc;

   public FeatherSourceFile819() {
      this.Qb = this.Qa.func_178180_c();
      this.Qc = new FeatherSourceFile802(new FeatherSourceFile805(), new FeatherSourceFile807(128));
   }

   public static void lh(int var0, VertexFormat var1) {
      PZ.Qb.func_181668_a(var0, var1);
   }

   public static void qy(float var0, float var1) {
      pq(var0, var1, 0.0F);
   }

   public static void pq(float var0, float var1, float var2) {
      PZ.Qb.func_181662_b((double)var0, (double)var1, (double)var2).func_181675_d();
   }

   public static void lh(float var0, float var1, float var2, int var3) {
      PZ.Qb.func_181662_b((double)var0, (double)var1, (double)var2).func_181666_a((float)(var3 >> 16 & 255) / 255.0F, (float)(var3 >> 8 & 255) / 255.0F, (float)(var3 & 255) / 255.0F, (float)(var3 >> 24 & 255) / 255.0F).func_181675_d();
   }

   public static void nc(float var0, float var1, int var2) {
      lh(var0, var1, 0.0F, var2);
   }

   public static void xj(float var0, float var1, float var2, float var3, float var4) {
      PZ.Qb.func_181662_b((double)var0, (double)var1, (double)var2).func_181673_a((double)var3, (double)var4).func_181675_d();
   }

   public static void lh(float var0, float var1, float var2, float var3, int var4) {
      lh(var0, var1, 0.0F, var2, var3, var4);
   }

   public static void lh(float var0, float var1, float var2, float var3, float var4, int var5) {
      PZ.Qb.func_181662_b((double)var0, (double)var1, (double)var2).func_181673_a((double)var3, (double)var4).func_181666_a((float)(var5 >> 16 & 255) / 255.0F, (float)(var5 >> 8 & 255) / 255.0F, (float)(var5 & 255) / 255.0F, (float)(var5 >> 24 & 255) / 255.0F).func_181675_d();
   }

   public static void rh() {
      PZ.Qa.func_78381_a();
   }

   public static ByteBuffer vQ() {
      PZ.Qb.func_178977_d();
      PZ.Qb.func_178965_a();
      return PZ.Qb.func_178966_f();
   }

   public void vR() {
      this.Qc.wy();
   }

   public void vS() {
      this.Qc.wA();
   }
}
