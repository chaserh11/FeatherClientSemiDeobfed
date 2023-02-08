package net.digitalingot.feather;

import org.lwjgl.opengl.GL11;

public class FeatherSourceFile852 extends FeatherSourceFile841 {
   private final FeatherSourceFile413 PU;
   private boolean PV;

   public FeatherSourceFile852(FeatherSourceFile413 var1) {
      this.PU = var1;
   }

   public void vO() {
      this.PV = false;
   }

   public void xj() {
      this.PV = true;
   }

   public void lx() {
      GL11.glPopMatrix();
      this.PV = false;
   }

   public void vP() {
      GL11.glPushMatrix();
      FeatherSourceFile89 var1 = this.PU.hk();
      GL11.glTranslated(this.PU.zm(), this.PU.rq(), 0.0);
      float var2 = (float)var1.ee();
      GL11.glScalef(var2, var2, 1.0F);
      this.PV = true;
   }

   protected float yl(float var1) {
      FeatherSourceFile89 var2 = this.PU.hk();
      return var1;
   }

   protected float ai(float var1) {
      FeatherSourceFile89 var2 = this.PU.hk();
      return var1;
   }
}
