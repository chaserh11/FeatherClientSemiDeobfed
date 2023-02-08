package net.digitalingot.feather;

import java.nio.file.Path;
import net.minecraft.client.gui.GuiScreenResourcePacks;
import net.minecraft.util.ResourceLocation;

public class FeatherSourceFile260 extends FeatherSourceFile262 {
   private static final ResourceLocation TP = new ResourceLocation("feather:textures/gui/packorganizer/folder.png");
   private static final int TQ = 25;
   private static final int TR = 19;

   public FeatherSourceFile260(FeatherSourceFile216 var1, GuiScreenResourcePacks var2, Path var3, int var4, int var5) {
      super(var2, var1, var3, var4, var5);
   }

   protected ResourceLocation zQ() {
      return TP;
   }

   protected int zR() {
      return 25;
   }

   protected int zS() {
      return 19;
   }
}
