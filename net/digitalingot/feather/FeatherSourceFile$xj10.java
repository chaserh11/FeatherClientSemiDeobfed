package net.digitalingot.feather;

import org.objectweb.asm.tree.AbstractInsnNode;
import org.objectweb.asm.tree.LdcInsnNode;

class FeatherSourceFile$xj10 extends FeatherSourceFile$oe7 {
   private final Object aW;

   public FeatherSourceFile$xj10(Object var1) {
      super(18);
      this.aW = var1;
   }

   public AbstractInsnNode lh(AbstractInsnNode var1) {
      return super.lh(var1) != null && ((LdcInsnNode)var1).cst.equals(this.aW) ? var1.getNext() : null;
   }
}
