package net.digitalingot.feather;

import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelHandler;
import net.minecraft.network.PacketBuffer;
import net.minecraftforge.fml.common.network.FMLEmbeddedChannel;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.network.internal.FMLProxyPacket;
import net.minecraftforge.fml.relauncher.Side;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class FeatherSourceFile456 {
   @Nullable
   private static @Nullable FMLEmbeddedChannel Ru;

   static @NotNull @NotNull void lh(@NotNull @NotNull String var0, @NotNull @NotNull FeatherSourceFile453 var1) {
      if (!NetworkRegistry.INSTANCE.hasChannel(var0, Side.CLIENT)) {
         Ru = (FMLEmbeddedChannel)NetworkRegistry.INSTANCE.newChannel(var0, new ChannelHandler[]{new FeatherSourceFile$lh17(var1)}).get(Side.CLIENT);
      }

   }

   static @NotNull void lh(@NotNull @NotNull String var0, byte[] var1) {
      if (Ru == null) {
         throw new IllegalStateException("Channel not yet registered");
      } else {
         Ru.writeAndFlush(new FMLProxyPacket(new PacketBuffer(Unpooled.wrappedBuffer(var1)), var0));
      }
   }
}
