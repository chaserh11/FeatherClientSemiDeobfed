package net.digitalingot.feather;

import java.util.Map;
import net.minecraft.client.renderer.GlStateManager;

public class FeatherSourceFile818 {
   private final Map Qd;
   private final int zb;
   private final int pp;
   private final int Qe;

   public FeatherSourceFile818(Map var1, int var2, int var3, int var4) {
      this.Qd = var1;
      this.zb = var2;
      this.pp = var3;
      this.Qe = var4;
   }

   public FeatherSourceFile824 pg(String var1) {
      return (FeatherSourceFile824)this.Qd.get(var1);
   }

   public int rl() {
      return this.zb;
   }

   public int fv() {
      return this.pp;
   }

   public int vT() {
      return this.Qe;
   }

   public void vU() {
      GlStateManager.func_179144_i(this.vT());
   }

   public void vV() {
      GlStateManager.func_179150_h(this.vT());
   }
}
