package net.digitalingot.feather;

import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import net.minecraft.util.MathHelper;

public class FeatherSourceFile553 {
   private static final int qd = 24;
   private ByteBuffer ot;
   private FeatherSourceFile592 bj;
   private final FloatBuffer qk = FloatBuffer.allocate(416);
   private final FeatherSourceFile401 qf = new FeatherSourceFile401(0.0F, -1.0F, -1.0F);
   private final FeatherSourceFile401 mi = new FeatherSourceFile401(0.0F, 1.0F, 1.0F);
   private short kt;

   public void lh(FeatherSourceFile284 var1, int var2) {
      if (this.bj == null) {
         this.bj = new FeatherSourceFile592(24, this.ys());
      }

      this.kt = (short)MathHelper.func_76125_a(var2 * 16, 0, 255);
      FeatherSourceFile282 var3 = var1.Ab();
      int var4 = var1.hm(var1.zX() / (var3.Uw - 1));
      this.bj.qy(var4);
      this.ot = this.bj.qd();
      this.lh(var1);
      this.bj.render();
   }

   private int lh(int var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, float var9) {
      var1 = this.bj.lh(var1, var2, var3, var4, var5, var6, var7, var8, var9, this.kt);
      return var1;
   }

   private void lh(FeatherSourceFile284 var1) {
      float var2 = 0.3125F;
      int var3 = 0;
      byte var5 = 16;
      byte var6 = 4;
      FeatherSourceFile276 var7 = (FeatherSourceFile276)var1.Ab();
      var7.lh(var1.zX(), this.qk);
      int var4 = FeatherSourceFile239.po * 2;
      var3 = this.lh(var3, this.qk.get(var4), this.qk.get(var4 + 1), -var2, 0.0F, 0.0625F, this.mi.Td, this.mi.Te, this.mi.Ty);
      var4 = (FeatherSourceFile239.po + (var6 - 1) * var5) * 2;
      var3 = this.lh(var3, this.qk.get(var4), this.qk.get(var4 + 1), var2, 0.0F, 0.0625F, this.mi.Td, this.mi.Te, this.mi.Ty);
      var4 = (FeatherSourceFile239.po + (var5 - 1) + (var6 - 1) * var5) * 2;
      var3 = this.lh(var3, this.qk.get(var4), this.qk.get(var4 + 1), var2, 1.0F, 0.0625F, this.mi.Td, this.mi.Te, this.mi.Ty);
      var4 = (FeatherSourceFile239.po + (var5 - 1)) * 2;
      var3 = this.lh(var3, this.qk.get(var4), this.qk.get(var4 + 1), -var2, 1.0F, 0.0625F, this.mi.Td, this.mi.Te, this.mi.Ty);
      var4 = FeatherSourceFile239.gn * 2;
      var3 = this.lh(var3, this.qk.get(var4), this.qk.get(var4 + 1), -var2, 0.0F, 0.0F, this.qf.Td, this.qf.Te, this.qf.Ty);
      var4 = (FeatherSourceFile239.gn + (var5 - 1)) * 2;
      var3 = this.lh(var3, this.qk.get(var4), this.qk.get(var4 + 1), -var2, 1.0F, 0.0F, this.qf.Td, this.qf.Te, this.qf.Ty);
      var4 = (FeatherSourceFile239.gn + (var5 - 1) + (var6 - 1) * var5) * 2;
      var3 = this.lh(var3, this.qk.get(var4), this.qk.get(var4 + 1), var2, 1.0F, 0.0F, this.qf.Td, this.qf.Te, this.qf.Ty);
      var4 = (FeatherSourceFile239.gn + (var6 - 1) * var5) * 2;
      var3 = this.lh(var3, this.qk.get(var4), this.qk.get(var4 + 1), var2, 0.0F, 0.0F, this.qf.Td, this.qf.Te, this.qf.Ty);
      var4 = (FeatherSourceFile239.yq + 1) * 2;
      var3 = this.lh(var3, this.qk.get(var4), this.qk.get(var4 + 1), -var2, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F);
      var4 = FeatherSourceFile239.yq * 2;
      var3 = this.lh(var3, this.qk.get(var4), this.qk.get(var4 + 1), -var2, 0.0F, 0.0625F, 1.0F, 0.0F, 0.0F);
      var4 = (FeatherSourceFile239.yq + (var5 - 1) * 2) * 2;
      var3 = this.lh(var3, this.qk.get(var4), this.qk.get(var4 + 1), -var2, 1.0F, 0.0625F, 1.0F, 0.0F, 0.0F);
      var4 = (FeatherSourceFile239.yq + (var5 - 1) * 2 + 1) * 2;
      var3 = this.lh(var3, this.qk.get(var4), this.qk.get(var4 + 1), -var2, 1.0F, 0.0F, 1.0F, 0.0F, 0.0F);
      var4 = (FeatherSourceFile239.es + 1) * 2;
      var3 = this.lh(var3, this.qk.get(var4), this.qk.get(var4 + 1), var2, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
      var4 = (FeatherSourceFile239.es + (var5 - 1) * 2 + 1) * 2;
      var3 = this.lh(var3, this.qk.get(var4), this.qk.get(var4 + 1), var2, 1.0F, 0.0F, -1.0F, 0.0F, 0.0F);
      var4 = (FeatherSourceFile239.es + (var5 - 1) * 2) * 2;
      var3 = this.lh(var3, this.qk.get(var4), this.qk.get(var4 + 1), var2, 1.0F, 0.0625F, -1.0F, 0.0F, 0.0F);
      var4 = FeatherSourceFile239.es * 2;
      var3 = this.lh(var3, this.qk.get(var4), this.qk.get(var4 + 1), var2, 0.0F, 0.0625F, -1.0F, 0.0F, 0.0F);
      var4 = (FeatherSourceFile239.vw + 1) * 2;
      var3 = this.lh(var3, this.qk.get(var4), this.qk.get(var4 + 1), -var2, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F);
      var4 = (FeatherSourceFile239.vw + (var6 - 1) * 2 + 1) * 2;
      var3 = this.lh(var3, this.qk.get(var4), this.qk.get(var4 + 1), var2, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F);
      var4 = (FeatherSourceFile239.vw + (var6 - 1) * 2) * 2;
      var3 = this.lh(var3, this.qk.get(var4), this.qk.get(var4 + 1), var2, 0.0F, 0.0625F, 0.0F, 1.0F, 0.0F);
      var4 = FeatherSourceFile239.vw * 2;
      var3 = this.lh(var3, this.qk.get(var4), this.qk.get(var4 + 1), -var2, 0.0F, 0.0625F, 0.0F, 1.0F, 0.0F);
      var4 = FeatherSourceFile239.mn * 2;
      var3 = this.lh(var3, this.qk.get(var4), this.qk.get(var4 + 1), -var2, 1.0F, 0.0F, 0.0F, -1.0F, 0.0F);
      var4 = (FeatherSourceFile239.mn + 1) * 2;
      var3 = this.lh(var3, this.qk.get(var4), this.qk.get(var4 + 1), -var2, 1.0F, 0.0625F, 0.0F, -1.0F, 0.0F);
      var4 = (FeatherSourceFile239.mn + (var6 - 1) * 2 + 1) * 2;
      var3 = this.lh(var3, this.qk.get(var4), this.qk.get(var4 + 1), var2, 1.0F, 0.0625F, 0.0F, -1.0F, 0.0F);
      var4 = (FeatherSourceFile239.mn + (var6 - 1) * 2) * 2;
      this.lh(var3, this.qk.get(var4), this.qk.get(var4 + 1), var2, 1.0F, 0.0F, 0.0F, -1.0F, 0.0F);
      this.ot.rewind();
   }

   private IntBuffer ys() {
      IntBuffer var1 = FeatherSourceFile441.sp(48);

      for(int var2 = 0; var2 < 24; var2 += 4) {
         var1.put(var2).put(var2 + 1).put(var2 + 2);
         var1.put(var2 + 2).put(var2 + 3).put(var2);
      }

      var1.rewind();
      return var1;
   }
}
