package net.digitalingot.feather;

import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class FeatherSourceFile282 {
   public int Ur;
   public int Us;
   public int Ut;
   public int textureWidth;
   public int textureHeight;
   public int Uu;
   public int Uv;
   public int Uw;
   public int Ux;
   public float Uy;
   public float Uz;
   protected long UA = -1L;

   public FeatherSourceFile282(int var1) {
      this.Ux = var1;
   }

   public void qr(int var1, int var2, int var3) {
      this.Ur = var1;
      this.Us = var2;
      this.Uu = (int)Math.floor((double)((float)this.Ux / (float)var1));
      float var4 = (float)(Math.ceil((double)((float)var3 / (float)this.Uu)) * (double)var2);
      this.Ut = (int)Math.ceil((double)(var4 / (float)this.Ux));
      this.textureHeight = (int)(var4 / (float)this.Ut);
      this.Uv = (int)Math.floor((double)((float)this.textureHeight / (float)var2));
      this.Uw = this.Uu * this.Uv;
      this.textureWidth = this.Uu * var1;
      this.textureHeight = this.Uv * var2;
      this.Uy = (float)var1 / (float)this.textureWidth;
      this.Uz = (float)var2 / (float)this.textureHeight;
   }

   protected long Ac() {
      if (this.UA != -1L) {
         return this.UA;
      } else {
         MessageDigest var1;
         try {
            var1 = MessageDigest.getInstance("SHA-256");
         } catch (NoSuchAlgorithmException var7) {
            throw new RuntimeException(var7);
         }

         ByteBuffer var2 = ByteBuffer.allocate(12);
         var2.putInt(0, this.Ux);
         var2.putInt(4, this.Ur);
         var2.putInt(8, this.Us);
         var1.update(var2);
         byte[] var3 = var1.digest();
         long var4 = 0L;

         for(int var6 = 0; var6 < 8; ++var6) {
            var4 = (var4 << 8) + (long)(var3[var6] & 255);
         }

         this.UA = var4;
         return var4;
      }
   }

   public boolean nc(FeatherSourceFile282 var1) {
      return this.Ac() == var1.Ac();
   }
}
