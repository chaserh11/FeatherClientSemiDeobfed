package net.digitalingot.feather;

import java.util.Iterator;
import java.util.ListIterator;
import org.objectweb.asm.tree.AbstractInsnNode;
import org.objectweb.asm.tree.ClassNode;
import org.objectweb.asm.tree.FrameNode;
import org.objectweb.asm.tree.InsnNode;
import org.objectweb.asm.tree.IntInsnNode;
import org.objectweb.asm.tree.LabelNode;
import org.objectweb.asm.tree.LineNumberNode;
import org.objectweb.asm.tree.MethodNode;

public class FeatherSourceFile482 implements FeatherSourceFile640 {
   private static final FeatherSourceFile$nc37 aR = new FeatherSourceFile$nc37(new FeatherSourceFile$qy2[]{new FeatherSourceFile$xj10(255L), new FeatherSourceFile$oe7(127), new FeatherSourceFile$xj10(32L), new FeatherSourceFile$oe7(148)});

   public void lh(ClassNode var1) {
      Iterator var2 = var1.methods.iterator();

      while(var2.hasNext()) {
         MethodNode var3 = (MethodNode)var2.next();
         if ("doHandleMessage".equals(var3.name)) {
            this.lh(var3);
            break;
         }
      }

   }

   private void lh(MethodNode var1) {
      ListIterator var2 = var1.instructions.iterator();

      while(var2.hasNext()) {
         AbstractInsnNode var3 = (AbstractInsnNode)var2.next();
         if (!(var3 instanceof LineNumberNode) && !(var3 instanceof FrameNode) && !(var3 instanceof LabelNode)) {
            FeatherSourceFile$lh91 var4 = new FeatherSourceFile$lh91(aR, var3);
            if (var4.yt()) {
               break;
            }

            for(int var5 = 0; var2.hasNext() && var5 < var4.nn(); ++var5) {
               var2.next();
            }
         }
      }

      if (var2.hasNext()) {
         var2.set(new IntInsnNode(16, 16));
         var2.next();
         var2.set(new InsnNode(123));
         var2.next();
         var2.set(new InsnNode(10));
      }
   }
}
