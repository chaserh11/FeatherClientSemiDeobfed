package net.digitalingot.feather;

import com.google.common.base.Charsets;
import com.google.common.collect.Lists;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.ByteBufInputStream;
import io.netty.buffer.Unpooled;
import io.netty.handler.codec.base64.Base64;
import java.awt.image.BufferedImage;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import net.minecraft.client.Minecraft;
import net.minecraft.client.multiplayer.ServerAddress;
import net.minecraft.client.multiplayer.ServerData;
import net.minecraft.client.renderer.texture.DynamicTexture;
import net.minecraft.client.renderer.texture.TextureUtil;
import net.minecraft.network.EnumConnectionState;
import net.minecraft.network.NetworkManager;
import net.minecraft.network.ServerStatusResponse;
import net.minecraft.network.handshake.client.C00Handshake;
import net.minecraft.network.status.INetHandlerStatusClient;
import net.minecraft.network.status.client.C00PacketServerQuery;
import net.minecraft.network.status.server.S00PacketServerInfo;
import net.minecraft.network.status.server.S01PacketPong;
import net.minecraft.util.ChatComponentTranslation;
import net.minecraft.util.IChatComponent;
import net.minecraft.util.ResourceLocation;
import org.apache.commons.lang3.Validate;
import org.jetbrains.annotations.NotNull;

public class FeatherSourceFile292 {
   private static final List Ug = Collections.synchronizedList(Lists.newArrayList());

   public static void nc(final ServerData var0, final Runnable var1) {
      try {
         ServerAddress var2 = ServerAddress.func_78860_a(var0.field_78845_b);
         final NetworkManager var3 = NetworkManager.func_181124_a(InetAddress.getByName(var2.func_78861_a()), var2.func_78864_b(), false);
         Ug.add(var3);
         var3.func_150719_a(new INetHandlerStatusClient() {
            private boolean Ua;
            private boolean Ub;

            public @NotNull void func_147397_a(@NotNull @NotNull S00PacketServerInfo var1x) {
               if (this.Ub) {
                  var3.func_150718_a(new ChatComponentTranslation("multiplayer.status.unrequested", new Object[0]));
               } else {
                  this.Ub = true;
                  ServerStatusResponse var2 = var1x.func_149294_c();
                  if (var2.func_151316_d() != null) {
                     String var3x = var2.func_151316_d();
                     if (var3x.startsWith("data:image/png;base64,")) {
                        var0.func_147407_a(var3x.substring(22));
                        Minecraft.func_71410_x().func_152344_a(var1);
                     } else {
                        FeatherSourceFile311.Sb.error("Invalid server icon (unknown format)");
                     }
                  } else {
                     var0.func_147407_a((String)null);
                  }

                  this.Ua = true;
               }

            }

            public @NotNull void func_147398_a(@NotNull @NotNull S01PacketPong var1x) {
            }

            public @NotNull void func_147231_a(@NotNull @NotNull IChatComponent var1x) {
               if (!this.Ua) {
                  FeatherSourceFile311.Sb.error("Can't ping {}: {}", new Object[]{var0.field_78845_b, var1x.func_150260_c()});
               }

            }
         });

         try {
            var3.func_179290_a(new C00Handshake(47, var2.func_78861_a(), var2.func_78864_b(), EnumConnectionState.STATUS));
            var3.func_179290_a(new C00PacketServerQuery());
         } catch (Throwable var5) {
            FeatherSourceFile311.Sb.error(var5);
         }
      } catch (UnknownHostException var6) {
         var6.printStackTrace();
      }

   }

   public static void wY() {
      synchronized(Ug) {
         Iterator var1 = Ug.iterator();

         while(var1.hasNext()) {
            NetworkManager var2 = (NetworkManager)var1.next();
            if (var2.func_150724_d()) {
               var2.func_74428_b();
            } else {
               var1.remove();
               var2.func_179293_l();
            }
         }

      }
   }

   public static void nc(ResourceLocation var0, String var1) {
      ByteBuf var2 = Unpooled.copiedBuffer(var1, Charsets.UTF_8);
      ByteBuf var3 = Base64.decode(var2);

      BufferedImage var4;
      label58: {
         try {
            var4 = TextureUtil.func_177053_a(new ByteBufInputStream(var3));
            Validate.validState(var4.getWidth() == 64, "Must be 64 pixels wide", new Object[0]);
            Validate.validState(var4.getHeight() == 64, "Must be 64 pixels high", new Object[0]);
            break label58;
         } catch (Throwable var9) {
            FeatherSourceFile311.Sb.error("Invalid icon for server", var9);
         } finally {
            var2.release();
            var3.release();
         }

         return;
      }

      DynamicTexture var5 = new DynamicTexture(var4.getWidth(), var4.getHeight());
      Minecraft.func_71410_x().func_110434_K().func_110579_a(var0, var5);
      var4.getRGB(0, 0, var4.getWidth(), var4.getHeight(), var5.func_110565_c(), 0, var4.getWidth());
      var5.func_110564_a();
   }
}
