package net.digitalingot.feather;

import org.objectweb.asm.tree.AbstractInsnNode;

class FeatherSourceFile$oe7 implements FeatherSourceFile$qy2 {
   private final int aX;

   public FeatherSourceFile$oe7(int var1) {
      this.aX = var1;
   }

   public AbstractInsnNode lh(AbstractInsnNode var1) {
      return var1.getOpcode() == this.aX ? var1.getNext() : null;
   }
}
