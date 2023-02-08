package net.digitalingot.feather;

import com.google.common.collect.ImmutableMap;
import java.util.Map;
import net.minecraft.launchwrapper.IClassTransformer;
import org.objectweb.asm.ClassReader;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.tree.ClassNode;

public class FeatherSourceFile775 implements IClassTransformer {
   private static final Map aQ = ImmutableMap.builder().put("org.lwjgl.opengl.WindowsDisplay", new FeatherSourceFile482()).build();

   public byte[] transform(String var1, String var2, byte[] var3) {
      FeatherSourceFile640 var4 = (FeatherSourceFile640)aQ.get(var1);
      if (var4 != null) {
         ClassReader var5 = new ClassReader(var3);
         ClassNode var6 = new ClassNode();
         var5.accept(var6, 4);
         var4.lh(var6);
         ClassWriter var7 = new ClassWriter(var5, 2);
         var6.accept(var7);
         var3 = var7.toByteArray();
      }

      return var3;
   }
}
