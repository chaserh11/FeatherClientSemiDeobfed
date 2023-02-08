package net.digitalingot.feather;

import net.minecraft.util.ResourceLocation;

public class FeatherSourceFile528 extends FeatherSourceFile475 {
   private final int ao;
   private final int uv;
   private final int jb;
   private final int ry;
   private int uw;
   private int lr;
   private int a;
   private int b;
   private int c;

   public FeatherSourceFile528(ResourceLocation var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      super(var1, var2, var3);
      this.c = 5;
      this.uv = var5;
      this.ao = var4;
      this.ry = var7;
      this.jb = var6;
   }

   public FeatherSourceFile528(FeatherSourceFile528 var1) {
      this(var1.qv, var1.textureWidth, var1.textureHeight, var1.ao, var1.uv, var1.jb, var1.ry);
      this.c = var1.c;
      this.uw = var1.uw;
      this.b = var1.b;
      this.lr = var1.lr;
      this.a = var1.a;
   }

   public void zd(int var1) {
      this.c = var1;
   }

   public void lh(int var1, int var2, int var3, int var4, float var5) {
      if (this.c != -1) {
         this.lh(var1, var2, var3, var4, this.c, var5);
      } else {
         this.lh(var1, var2, var3, var4, this.uw, this.lr, this.a, this.b, var5);
      }

   }

   public void lh(int var1, int var2, int var3, int var4, int var5, float var6) {
      this.lh(var1, var2, var3, var4, var5, var5, var5, var5, var6);
   }

   public void lh(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, float var9) {
      this.wq();
      FeatherSourceFile843.lh(0, this.qv);
      FeatherSourceFile843.nc(this.is, this.wl, this.dr, this.ww * var9);
      FeatherSourceFile843.lh(var1, var2, var5, var6, 0, 0, this.ao, this.uv, this.textureWidth, this.textureHeight);
      FeatherSourceFile843.lh(var1 + var3 - var7, var2, var7, var6, this.jb, 0, this.textureWidth - this.jb, this.uv, this.textureWidth, this.textureHeight);
      FeatherSourceFile843.lh(var1, var2 + var6, var5, var4 - var8 - var6, 0, this.uv, this.ao, this.ry - this.uv, this.textureWidth, this.textureHeight);
      FeatherSourceFile843.lh(var1 + var3 - var7, var2 + var6, var7, var4 - var8 - var6, this.jb, this.uv, this.textureWidth - this.jb, this.ry - this.uv, this.textureWidth, this.textureHeight);
      FeatherSourceFile843.lh(var1 + var5, var2 + var6, var3 - var7 - var5, var4 - var8 - var6, this.ao, this.uv, this.jb - this.ao, this.ry - this.uv, this.textureWidth, this.textureHeight);
      FeatherSourceFile843.lh(var1 + var5, var2, var3 - var7 - var5, var6, this.ao, 0, this.jb - this.ao, this.uv, this.textureWidth, this.textureHeight);
      FeatherSourceFile843.lh(var1 + var5, var2 + (var4 - var8), var3 - var7 - var5, var8, this.ao, this.ry, this.jb - this.ao, this.textureHeight - this.ry, this.textureWidth, this.textureHeight);
      FeatherSourceFile843.lh(var1, var2 + (var4 - var8), var5, var8, 0, this.ry, this.ao, this.textureHeight - this.ry, this.textureWidth, this.textureHeight);
      FeatherSourceFile843.lh(var1 + var3 - var7, var2 + (var4 - var8), var7, var8, this.jb, this.ry, this.textureWidth - this.jb, this.textureHeight - this.ry, this.textureWidth, this.textureHeight);
      this.jz();
   }

   public void lh(int var1, int var2, int var3, int var4) {
      this.c = -1;
      this.uw = var1;
      this.lr = var2;
      this.a = var3;
      this.b = var4;
   }
}
