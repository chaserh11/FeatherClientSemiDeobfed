package net.digitalingot.feather;

import java.nio.ByteBuffer;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.vertex.VertexBuffer;
import net.minecraft.client.renderer.vertex.VertexFormat;
import org.lwjgl.opengl.GL11;

public class FeatherSourceFile811 {
   private final VertexBuffer QH;
   private final VertexFormat QI;
   private boolean QJ;
   private int QK;

   public FeatherSourceFile811(VertexFormat var1) {
      this.QH = new VertexBuffer(var1);
      this.QI = var1;
   }

   public boolean wJ() {
      return this.QJ;
   }

   public void wK() {
      int var1 = this.QI.func_177338_f();
      this.me(var1);
      this.re(var1);
   }

   public void wL() {
      GL11.glDisableClientState(32884);
      GL11.glDisableClientState(32888);
      OpenGlHelper.func_77472_b(OpenGlHelper.field_77478_a);
   }

   public void wM() {
      this.lh(FeatherSourceFile819.vQ());
      this.QJ = true;
   }

   public void mf(int var1) {
      ((FeatherSourceFile812)this.QH).feather$bufferData(FeatherSourceFile819.vQ(), var1);
   }

   public void lh(ByteBuffer var1) {
      this.QH.func_181722_a(var1);
   }

   public void lh(ByteBuffer var1, int var2) {
      ((FeatherSourceFile812)this.QH).feather$bufferData(var1, var2);
   }

   public void nc(int var1, long var2, ByteBuffer var4) {
      FeatherSourceFile820.lh(var1, var2, var4);
   }

   public void ye(int var1) {
      this.QH.func_177358_a(var1);
   }

   public void vU() {
      this.QH.func_177359_a();
   }

   public void wN() {
      this.QH.func_177361_b();
   }

   public void me(int var1) {
      GL11.glVertexPointer(3, 5126, var1, 0L);
      GL11.glEnableClientState(32884);
   }

   public void hz(int var1) {
      GL11.glColorPointer(4, 5121, var1, 0L);
      GL11.glEnableClientState(32886);
   }

   public void re(int var1) {
      GL11.glTexCoordPointer(2, 5126, var1, 0L);
      GL11.glEnableClientState(32888);
      OpenGlHelper.func_77472_b(OpenGlHelper.field_77478_a);
   }
}
