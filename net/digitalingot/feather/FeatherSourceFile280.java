package net.digitalingot.feather;

import com.google.common.base.Preconditions;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;

public abstract class FeatherSourceFile280 {
   protected static final int UB = 4;
   protected FeatherSourceFile282 UC;
   protected ByteBuffer UD;
   protected IntBuffer UE;
   protected int UF;

   protected void Ad() {
      Preconditions.checkState(this.UC != null);
   }

   protected void lh(FeatherSourceFile371 var1, ByteBuffer var2, int var3, int var4) {
      int var5 = var1.dB + var1.zb;
      if (var5 > this.UC.textureWidth) {
         var5 = this.UC.textureWidth;
         FeatherSourceFile311.Sb.warn("[Cosmetics] Right side was excessive during building");
      }

      int var6 = var1.dC + var1.pp;
      if (var6 > this.UC.textureHeight) {
         var6 = this.UC.textureHeight;
         FeatherSourceFile311.Sb.warn("[Cosmetics] Bottom side was excessive during building");
      }

      try {
         int var7 = 0;

         for(int var8 = var1.dC; var8 < var6; ++var7) {
            int var9 = var3 + var7 * this.UC.textureWidth * 4;
            ByteBuffer var10 = var2.asReadOnlyBuffer();
            var10.position((var4 * var8 + var1.dB) * 4);
            var10.limit(var10.position() + (var5 - var1.dB) * 4);
            this.UD.position(var9);
            this.UD.put(var10);
            ++var8;
         }

      } catch (Throwable var11) {
      }
   }

   public void jy(int var1) {
      this.UF = var1;
   }
}
