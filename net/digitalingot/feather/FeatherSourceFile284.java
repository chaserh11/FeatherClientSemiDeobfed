package net.digitalingot.feather;

import java.nio.IntBuffer;
import org.lwjgl.opengl.GL11;

public class FeatherSourceFile284 implements AutoCloseable {
   private FeatherSourceFile282 Un;
   private final IntBuffer Uo;
   private final FeatherSourceFile270 Up;
   private long Uq;

   public FeatherSourceFile284(IntBuffer var1, FeatherSourceFile270 var2, FeatherSourceFile282 var3) {
      this.Uo = var1;
      this.Up = var2;
      this.Un = var3;
   }

   public int zX() {
      return this.Up.zX();
   }

   public long zY() {
      return this.Uq;
   }

   public void ux(long var1) {
      this.Uq = var1;
   }

   public int zZ() {
      return this.Up.zZ();
   }

   public int hm(int var1) {
      return this.Uo.get(var1);
   }

   public int qp(int var1) {
      return this.Up.qp(var1);
   }

   public int Aa() {
      return this.Un.Uw;
   }

   public void lh(FeatherSourceFile282 var1) {
      this.Un = var1;
   }

   public FeatherSourceFile282 Ab() {
      return this.Un;
   }

   public boolean equals(Object var1) {
      return this.Un.nc((FeatherSourceFile282)var1);
   }

   public void close() {
      GL11.glDeleteTextures(this.Uo);
   }
}
