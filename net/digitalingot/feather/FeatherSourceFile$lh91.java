package net.digitalingot.feather;

import org.objectweb.asm.tree.AbstractInsnNode;

class FeatherSourceFile$lh91 {
   private final FeatherSourceFile$nc37 aS;
   private final AbstractInsnNode aT;
   private int aU;

   public FeatherSourceFile$lh91(FeatherSourceFile$nc37 var1, AbstractInsnNode var2) {
      this.aS = var1;
      this.aT = var2;
   }

   public boolean yt() {
      AbstractInsnNode var1 = this.aT;
      this.aU = 0;
      FeatherSourceFile$qy2[] var2 = FeatherSourceFile$nc37.lh(this.aS);
      int var3 = var2.length;

      for(int var4 = 0; var4 < var3; ++var4) {
         FeatherSourceFile$qy2 var5 = var2[var4];
         AbstractInsnNode var6 = var5.lh(var1);
         if (var6 == null) {
            return false;
         }

         var1 = var6;
         ++this.aU;
      }

      return var1 != null;
   }

   public int nn() {
      return this.aU;
   }
}
