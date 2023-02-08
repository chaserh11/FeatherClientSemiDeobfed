package net.digitalingot.feather;

import java.util.List;
import net.minecraft.client.gui.GuiNewChat;

public interface FeatherSourceFile506 {
   List getUsedTrimmedMessages();

   static List lh(GuiNewChat var0) {
      return var0 instanceof FeatherSourceFile506 ? ((FeatherSourceFile506)var0).getUsedTrimmedMessages() : ((net.digitalingot.feather.mixin.core.FeatherSourceFile4)var0).getTrimmedMessages();
   }
}
