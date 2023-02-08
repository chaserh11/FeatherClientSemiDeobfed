package net.digitalingot.feather;

import net.minecraft.util.ResourceLocation;

public class FeatherSourceFile475 {
   protected ResourceLocation qv;
   private int ht;
   private int pc;
   private int zr;
   private int gl;
   protected int textureWidth;
   protected int textureHeight;
   protected boolean ay;
   protected float is;
   protected float dr;
   protected float wl;
   protected float ww;

   public FeatherSourceFile475(float var1, float var2, float var3, float var4) {
      this.is = 1.0F;
      this.dr = 1.0F;
      this.wl = 1.0F;
      this.ww = 1.0F;
      this.setColor(var1, var2, var3, var4);
   }

   public FeatherSourceFile475(ResourceLocation var1, int var2, int var3) {
      this(var1, var2, var3, 0, 0, var2, var3);
   }

   public FeatherSourceFile475(ResourceLocation var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      this.is = 1.0F;
      this.dr = 1.0F;
      this.wl = 1.0F;
      this.ww = 1.0F;
      this.qv = var1;
      this.textureWidth = var2;
      this.textureHeight = var3;
      this.ht = var4;
      this.pc = var5;
      this.zr = var6;
      this.gl = var7;
   }

   public void lh(int var1, int var2, int var3, int var4, float var5) {
      this.wq();
      if (this.qv != null) {
         FeatherSourceFile843.lh(0, this.qv);
         FeatherSourceFile843.nc(this.is, this.wl, this.dr, this.ww * var5);
         FeatherSourceFile843.lh(var1, var2, var3, var4, this.ht, this.pc, this.zr, this.gl, this.textureWidth, this.textureHeight);
      } else {
         FeatherSourceFile843.nc(this.is, this.wl, this.dr, this.ww * var5);
         FeatherSourceFile841.vK().xj(var1, var2 + var4, var1 + var3, var2, FeatherSourceFile341.mq((int)(this.is * 255.0F), (int)(this.wl * 255.0F), (int)(this.dr * 255.0F), (int)(this.ww * var5 * 255.0F)));
      }

      this.jz();
   }

   protected void wq() {
      if (this.ay) {
         FeatherSourceFile843.wq();
      }

   }

   protected void jz() {
      if (this.ay) {
         FeatherSourceFile843.jz();
      }

   }

   public float vj() {
      return this.is;
   }

   public void as(float var1) {
      this.is = var1;
   }

   public float lk() {
      return this.wl;
   }

   public void km(float var1) {
      this.wl = var1;
   }

   public float qt() {
      return this.dr;
   }

   public void mq(float var1) {
      this.dr = var1;
   }

   public float rd() {
      return this.ww;
   }

   public void mr(float var1) {
      this.ww = var1;
   }

   public void ug(boolean var1) {
      this.ay = var1;
   }

   public void setColor(float var1, float var2, float var3, float var4) {
      this.is = var1;
      this.wl = var2;
      this.dr = var3;
      this.ww = var4;
   }

   public ResourceLocation df() {
      return this.qv;
   }

   public void lh(ResourceLocation var1) {
      this.qv = var1;
   }

   public int ac() {
      return this.ht;
   }

   public void et(int var1) {
      this.ht = var1;
   }

   public int lu() {
      return this.pc;
   }

   public void yl(int var1) {
      this.pc = var1;
   }

   public int xs() {
      return this.zr;
   }

   public void ai(int var1) {
      this.zr = var1;
   }

   public int xu() {
      return this.gl;
   }

   public void ja(int var1) {
      this.gl = var1;
   }

   public int mj() {
      return this.textureWidth;
   }

   public void qn(int var1) {
      this.textureWidth = var1;
   }

   public int te() {
      return this.textureHeight;
   }

   public void er(int var1) {
      this.textureHeight = var1;
   }
}
