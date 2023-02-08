package net.digitalingot.feather;

import net.minecraft.client.multiplayer.ServerData;
import net.minecraft.network.NetworkManager;
import net.minecraft.util.ChatComponentTranslation;
import net.minecraft.util.IChatComponent;

public abstract class FeatherSourceFile296 {
   protected NetworkManager TZ;

   public abstract void lh(ServerData var1, Runnable var2);

   protected IChatComponent bj(String var1) {
      return new ChatComponentTranslation(var1, new Object[0]);
   }

   public void ir() {
   }
}
