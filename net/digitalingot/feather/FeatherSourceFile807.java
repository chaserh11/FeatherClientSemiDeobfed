package net.digitalingot.feather;

import java.util.Arrays;

public class FeatherSourceFile807 implements FeatherSourceFile806 {
   private final int QC;
   private final byte[] QD;
   private int QE;
   private int QF;
   private int QG;

   public FeatherSourceFile807(int var1) {
      this.QC = var1 * 2;
      this.QD = new byte[this.QC * this.QC * this.QC / 4];
   }

   public void ir() {
      Arrays.fill(this.QD, (byte)0);
   }

   public void si(int var1, int var2, int var3) {
      this.QE = var1 + var2 * this.QC + var3 * this.QC * this.QC;
      this.QF = this.QE / 4;
      this.QG = this.QE % 4 * 2;
      byte[] var10000 = this.QD;
      int var10001 = this.QF;
      var10000[var10001] = (byte)(var10000[var10001] | 1 << this.QG);
   }

   public void wz(int var1, int var2, int var3) {
      this.QE = var1 + var2 * this.QC + var3 * this.QC * this.QC;
      this.QF = this.QE / 4;
      this.QG = this.QE % 4 * 2;
      byte[] var10000 = this.QD;
      int var10001 = this.QF;
      var10000[var10001] = (byte)(var10000[var10001] | 1 << this.QG + 1);
   }

   public int lt(int var1, int var2, int var3) {
      this.QE = var1 + var2 * this.QC + var3 * this.QC * this.QC;
      this.QF = this.QE / 4;
      this.QG = this.QE % 4 * 2;
      return this.QD[this.QF] >> this.QG & 3;
   }

   public void wH() {
      byte[] var10000 = this.QD;
      int var10001 = this.QF;
      var10000[var10001] = (byte)(var10000[var10001] | 1 << this.QG);
   }

   public void wI() {
      byte[] var10000 = this.QD;
      int var10001 = this.QF;
      var10000[var10001] = (byte)(var10000[var10001] | 1 << this.QG + 1);
   }
}
