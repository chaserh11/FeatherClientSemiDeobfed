package net.digitalingot.feather;

import net.minecraft.util.Vec3;

public class FeatherSourceFile801 {
   private double Qz;
   private double QA;
   private double QB;

   public FeatherSourceFile801() {
   }

   public FeatherSourceFile801(Vec3 var1) {
      this.Qz = var1.field_72450_a;
      this.QA = var1.field_72448_b;
      this.QB = var1.field_72449_c;
   }

   public FeatherSourceFile801(double var1, double var3, double var5) {
      this.Qz = var1;
      this.QA = var3;
      this.QB = var5;
   }

   public double zm() {
      return this.Qz;
   }

   public double rq() {
      return this.QA;
   }

   public void ux(double var1) {
      this.QA += var1;
   }

   public void si(double var1) {
      this.QA = var1;
   }

   public double wG() {
      return this.QB;
   }

   public void ou(double var1, double var3, double var5) {
      this.Qz = var1;
      this.QA = var3;
      this.QB = var5;
   }
}
