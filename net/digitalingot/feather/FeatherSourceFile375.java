package net.digitalingot.feather;

import net.minecraft.client.gui.GuiButton;

public class FeatherSourceFile375 {
   private final String s;
   private int id;
   private int kj;
   private int yu;
   private int zb;
   private int pp;

   private FeatherSourceFile375(String var1) {
      this.s = var1;
   }

   public FeatherSourceFile375 pg(int var1) {
      this.id = var1;
      return this;
   }

   public FeatherSourceFile375 nh(int var1) {
      this.kj = var1;
      return this;
   }

   public FeatherSourceFile375 xz(int var1) {
      this.yu = var1;
      return this;
   }

   public FeatherSourceFile375 oh(int var1, int var2) {
      this.kj = var1;
      this.yu = var2;
      return this;
   }

   public FeatherSourceFile375 hg(int var1, int var2) {
      this.zb = var1;
      this.pp = var2;
      return this;
   }

   public GuiButton yY() {
      return new GuiButton(this.id, this.kj, this.yu, this.zb, this.pp, this.s);
   }

   public static FeatherSourceFile375 ot(String var0) {
      return new FeatherSourceFile375(var0);
   }
}
