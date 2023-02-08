package net.digitalingot.feather;

public abstract class FeatherSourceFile624 extends FeatherSourceFile479 {
   protected float gW;
   protected float gX;
   protected int gY;
   protected int gZ;
   protected String s;
   protected Object hA;
   private final String hB;
   private final String hC;
   private FeatherSourceFile683 hD;

   public abstract Object ov();

   public String uh() {
      return "";
   }

   public abstract boolean mu();

   public boolean vf() {
      return true;
   }

   public FeatherSourceFile624() {
      this((String)null, (String)null);
   }

   public FeatherSourceFile624(String var1, String var2) {
      this.hB = var1;
      this.hC = var2;
   }

   public int rl() {
      return this.zb = this.bp().hN == FeatherSourceFile95.BACKGROUND ? this.bp().hO : this.gY;
   }

   public int fv() {
      return this.pp = this.bp().hN == FeatherSourceFile95.BACKGROUND ? this.bp().hP : this.gZ;
   }

   public void xi(int var1) {
      this.bp().hO = var1;
   }

   public void cg(int var1) {
      this.bp().hP = var1;
   }

   public void pu() {
      this.lh(FeatherSourceFile683.HUD_OVERLAY, true);
      this.qq();
   }

   public void lh(FeatherSourceFile683 var1) {
      this.lh(var1, var1 == FeatherSourceFile683.MOD_LAYOUT, true);
   }

   public void sy() {
      this.lh(FeatherSourceFile683.MOD_LAYOUT, true, true);
   }

   protected void lh(FeatherSourceFile683 var1, boolean var2, boolean var3) {
      if (var2 || this.vf()) {
         if (var3) {
            this.lh(var1, false);
         }

         if (this.s == null || this.s.isEmpty()) {
            return;
         }

         if (this.bp().hN == FeatherSourceFile95.BACKGROUND) {
            this.gD.nc(0, 0, this.zb, this.pp, this.bp().hH.getRGB());
            if (this.bp().hI) {
               int var4 = this.bp().hJ.getRGB();
               float var5 = (float)this.bp().hK / 20.0F;
               this.gD.nc(0, 0, this.zb, this.pp, var4, var5);
            }
         }

         this.oe(var1);
      }

   }

   protected void oe(FeatherSourceFile683 var1) {
      this.gD.lh(this.s, this.gW, this.gX, this.bp().hQ, this.bp().hR);
   }

   public int zf() {
      return 40;
   }

   public int ok() {
      return 70;
   }

   public int xk() {
      return 10;
   }

   public int cp() {
      return 25;
   }

   private void kn() {
      this.gY = FeatherSourceFile843.fo(this.s);
      this.gZ = (int)FeatherSourceFile843.xy(this.bp().hR);
   }

   protected void lh(FeatherSourceFile683 var1, boolean var2) {
      this.lh(var1, this.ov(), var2);
   }

   protected void lh(FeatherSourceFile683 var1, Object var2, boolean var3) {
      if (var3 || var2 != this.hA || this.hD != var1) {
         this.hA = var2;
         this.hD = var1;
         switch (var1) {
            case HUD_OVERLAY:
               this.ou(var2);
               break;
            case MOD_LAYOUT:
               this.pq(var2);
         }

         this.wf();
      }
   }

   protected void wf() {
      this.kn();
      this.qq();
   }

   private void qq() {
      if (this.bp().hN == FeatherSourceFile95.BACKGROUND) {
         this.gW = (float)(this.rl() - this.gY) / 2.0F;
         this.gX = (float)(this.fv() - this.gZ) / 2.0F;
      } else {
         this.gW = 0.0F;
         this.gX = 0.0F;
      }

   }

   private void ou(Object var1) {
      String var2 = String.valueOf(var1);
      int var3 = var2.length();
      if (var3 == 0) {
         this.s = "";
      } else {
         boolean var4 = this.mu();
         boolean var5 = this.hB != null && !this.hB.isEmpty() && var4;
         boolean var6 = this.hC != null && !this.hC.isEmpty() && !var4;
         boolean var7 = this.bp().hN == FeatherSourceFile95.BRACKETS;
         StringBuilder var8 = new StringBuilder((var7 ? 2 : 0) + (var5 ? this.hB.length() : (var6 ? this.hC.length() : 0)) + var3);
         if (var7) {
            var8.append('[');
         }

         if (var5) {
            var8.append(this.hB);
         }

         var8.append(var2);
         if (var6) {
            var8.append(this.hC);
         }

         if (var7) {
            var8.append(']');
         }

         this.s = var8.toString();
      }
   }

   private void pq(Object var1) {
      String var2 = this.uh();
      if (var2.isEmpty()) {
         this.ou(var1);
      } else {
         this.s = this.uh();
      }

   }

   public abstract FeatherSourceFile374 bp();

   // $FF: synthetic method
   public FeatherSourceFile89 hk() {
      return this.bp();
   }
}
