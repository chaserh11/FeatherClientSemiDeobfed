package net.digitalingot.feather.mixin.client;

import com.mojang.authlib.GameProfile;
import net.digitalingot.feather.FeatherSourceFile516;
import net.minecraft.client.entity.AbstractClientPlayer;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.client.network.NetHandlerPlayClient;
import net.minecraft.network.play.client.C01PacketChatMessage;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;
import org.spongepowered.asm.mixin.Shadow;

@Mixin({EntityPlayerSP.class})
public abstract class FeatherSourceFile97 extends AbstractClientPlayer {
   @Shadow
   @Final
   public NetHandlerPlayClient field_71174_a;

   public FeatherSourceFile97(World var1, GameProfile var2) {
      super(var1, var2);
   }

   @Overwrite
   public void func_71165_d(String var1) {
      var1 = ((FeatherSourceFile516)FeatherSourceFile516.ws.sx()).sendChat(var1);
      if (var1 != null) {
         this.field_71174_a.func_147297_a(new C01PacketChatMessage(var1));
      }

   }
}
