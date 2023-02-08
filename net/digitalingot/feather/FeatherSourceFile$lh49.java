package net.digitalingot.feather;

import net.minecraft.client.renderer.GlStateManager;

public class FeatherSourceFile$lh49 extends FeatherSourceFile413 {
   // $FF: synthetic field
   final FeatherSourceFile570 EU;

   public FeatherSourceFile$lh49(FeatherSourceFile570 var1) {
      this.EU = var1;
   }

   public FeatherSourceFile89 hk() {
      return ((FeatherSourceFile$nc20)FeatherSourceFile570.lh(this.EU)).yT;
   }

   public void lh(FeatherSourceFile683 var1) {
      ((FeatherSourceFile$nc20)FeatherSourceFile570.nc(this.EU)).EW = (float)((double)(FeatherSourceFile851.iL() / 2) - (this.zm() + this.nt() / 2.0));
      ((FeatherSourceFile$nc20)FeatherSourceFile570.xj(this.EU)).EX = (float)((double)(FeatherSourceFile851.iM() / 2) - (this.rq() + this.jf() / 2.0));
      if (var1 == FeatherSourceFile683.MOD_LAYOUT) {
         this.aF();
      }

   }

   private void aF() {
      GlStateManager.func_179109_b((float)this.rl() / 2.0F, 0.0F, 0.0F);
      float var1 = (float)FeatherSourceFile570.oe(this.EU).field_71466_p.func_78256_a("Hello World!") / 2.0F;
      float var2 = (float)FeatherSourceFile570.oe(this.EU).field_71466_p.func_78256_a("Move Me Around") / 2.0F;
      GlStateManager.func_179152_a(4.0F, 4.0F, 4.0F);
      FeatherSourceFile570.oe(this.EU).field_71466_p.func_175063_a("Hello World!", -var1, 5.0F, 16777215);
      GlStateManager.func_179152_a(0.5F, 0.5F, 0.5F);
      FeatherSourceFile570.oe(this.EU).field_71466_p.func_175063_a("Move Me Around", -var2, 30.0F, 16777215);
   }

   public int fv() {
      return 100;
   }

   public int rl() {
      return 250;
   }
}
