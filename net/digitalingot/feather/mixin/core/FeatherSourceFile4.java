package net.digitalingot.feather.mixin.core;

import java.util.List;
import net.minecraft.client.gui.GuiNewChat;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin({GuiNewChat.class})
public interface FeatherSourceFile4 {
   @Accessor("scrollPos")
   int getChatScrollbarPos();

   @Accessor("chatLines")
   List getAllMessages();

   @Accessor("drawnChatLines")
   List getTrimmedMessages();
}
