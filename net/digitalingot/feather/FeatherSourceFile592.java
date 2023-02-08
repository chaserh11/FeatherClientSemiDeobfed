package net.digitalingot.feather;

import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.util.MathHelper;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL15;
import org.lwjgl.opengl.GL20;

public class FeatherSourceFile592 {
   public static int sf = 32;
   public static int of;
   private final int qi;
   private final int pd;
   private final ByteBuffer ot;
   private final IntBuffer ex;
   private int it;
   private boolean jn;
   private boolean hi;
   private final FeatherSourceFile401 ll = new FeatherSourceFile401(0.0F, 1.0F, 0.0F);

   public FeatherSourceFile592(int var1, IntBuffer var2) {
      this.ex = var2;
      if (FeatherSourceFile785.nw()) {
         of = 48;
      }

      if (FeatherSourceFile721.nw()) {
         of = 56;
      }

      this.ot = FeatherSourceFile441.bx(var1 * of);
      this.qi = GL15.glGenBuffers();
      this.pd = GL15.glGenBuffers();
      GL15.glBindBuffer(34962, this.qi);
      GL15.glBufferData(34962, (long)this.ot.capacity() * 4L, 35048);
      GL15.glBindBuffer(34963, this.pd);
      GL15.glBufferData(34963, var2, 35044);
      GL15.glBindBuffer(34962, 0);
      GL15.glBindBuffer(34963, 0);
   }

   public int lh(int var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, float var9, short var10) {
      this.ot.putFloat(var1, var4);
      var1 += 4;
      this.ot.putFloat(var1, var5);
      var1 += 4;
      this.ot.putFloat(var1, var6);
      var1 += 4;
      if (this.hi) {
         this.ot.put(var1, (byte)-1);
         ++var1;
         this.ot.put(var1, (byte)-1);
         ++var1;
         this.ot.put(var1, (byte)-1);
         ++var1;
         this.ot.put(var1, (byte)-1);
         ++var1;
      }

      if (!this.hi) {
         this.ot.putFloat(var1, var7);
         var1 += 4;
         this.ot.putFloat(var1, var8);
         var1 += 4;
         this.ot.putFloat(var1, var9);
         var1 += 4;
      }

      this.ot.putFloat(var1, var2);
      var1 += 4;
      this.ot.putFloat(var1, var3);
      var1 += 4;
      if (this.hi) {
         var1 += 4;
      }

      if (this.hi) {
         this.ot.put(var1, ou(var7));
         ++var1;
         this.ot.put(var1, ou(var8));
         ++var1;
         this.ot.put(var1, ou(var9));
         ++var1;
         ++var1;
      }

      if (this.hi) {
         this.ot.putFloat(var1, 0.0F);
         var1 += 4;
         this.ot.putFloat(var1, 0.0F);
         var1 += 4;
         this.ot.putShort(var1, qy(1.0F));
         var1 += 2;
         this.ot.putShort(var1, qy(0.0F));
         var1 += 2;
         this.ot.putShort(var1, qy(0.0F));
         var1 += 2;
         this.ot.putShort(var1, qy(1.0F));
         var1 += 2;
         var1 += 6;
         var1 += 2;
      }

      return var1;
   }

   public void render() {
      this.hi = FeatherSourceFile721.es();
      GlStateManager.func_179084_k();
      GlStateManager.func_179089_o();
      GlStateManager.func_179126_j();
      GlStateManager.func_179143_c(515);
      GlStateManager.func_179103_j(7425);
      GlStateManager.func_179144_i(this.it);
      GL15.glBindBuffer(34962, this.qi);
      GL15.glBufferSubData(34962, 0L, this.ot);
      if (!this.hi) {
         GL11.glVertexPointer(3, 5126, sf, 0L);
         GL11.glNormalPointer(5126, sf, 12L);
         GL11.glTexCoordPointer(2, 5126, sf, 24L);
      } else {
         GL11.glVertexPointer(3, 5126, 56, 0L);
         GL11.glColorPointer(4, 5121, 56, 12L);
         GL11.glTexCoordPointer(2, 5126, 56, 16L);
         GL11.glNormalPointer(5120, 56, 28L);
         GL20.glVertexAttribPointer(FeatherSourceFile721.wv, 2, 5126, false, 56, 32L);
         GL20.glVertexAttribPointer(11, 4, 5122, false, 56, 40L);
         GL20.glVertexAttribPointer(12, 3, 5122, false, 56, 48L);
         GL20.glEnableVertexAttribArray(FeatherSourceFile721.wv);
         GL20.glEnableVertexAttribArray(11);
         GL20.glEnableVertexAttribArray(12);
      }

      GL15.glBindBuffer(34962, 0);
      GL11.glEnableClientState(32884);
      GL11.glEnableClientState(32885);
      GL11.glEnableClientState(32888);
      GL15.glBindBuffer(34963, this.pd);
      GL11.glDrawElements(4, this.ex.capacity(), 5125, 0L);
      GL15.glBindBuffer(34963, 0);
      GL11.glDisableClientState(32884);
      GL11.glDisableClientState(32885);
      GL11.glDisableClientState(32888);
      GlStateManager.func_179103_j(7424);
   }

   public ByteBuffer qd() {
      return this.ot;
   }

   public int ot() {
      if (FeatherSourceFile785.po()) {
         return 48;
      } else {
         return FeatherSourceFile721.es() ? 56 : sf;
      }
   }

   public void qy(int var1) {
      this.it = var1;
   }

   public static short qy(float var0) {
      return (short)((int)(MathHelper.func_76131_a(var0, -1.0F, 1.0F) * 32767.0F) & '\uffff');
   }

   public static byte ou(float var0) {
      return (byte)((int)(MathHelper.func_76131_a(var0, -1.0F, 1.0F) * 127.0F) & 255);
   }

   static {
      of = sf;
   }
}
