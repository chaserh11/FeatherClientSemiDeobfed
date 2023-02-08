package net.digitalingot.feather;

import java.net.InetAddress;
import java.net.UnknownHostException;
import net.minecraft.client.Minecraft;
import net.minecraft.client.multiplayer.ServerAddress;
import net.minecraft.client.multiplayer.ServerData;
import net.minecraft.network.EnumConnectionState;
import net.minecraft.network.NetworkManager;
import net.minecraft.network.handshake.client.C00Handshake;
import net.minecraft.network.status.INetHandlerStatusClient;
import net.minecraft.network.status.client.C00PacketServerQuery;
import net.minecraft.network.status.client.C01PacketPing;
import net.minecraft.network.status.server.S00PacketServerInfo;
import net.minecraft.network.status.server.S01PacketPong;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.ChatComponentTranslation;
import net.minecraft.util.IChatComponent;
import org.jetbrains.annotations.NotNull;

public class FeatherSourceFile294 extends FeatherSourceFile296 {
   public void lh(final ServerData var1, final Runnable var2) {
      ServerAddress var3 = ServerAddress.func_78860_a(var1.field_78845_b);

      try {
         this.TZ = NetworkManager.func_181124_a(InetAddress.getByName(var3.func_78861_a()), var3.func_78864_b(), false);
      } catch (UnknownHostException var6) {
         FeatherSourceFile311.Sb.error("Failed to resolve server address: " + var3);
         return;
      }

      this.TZ.func_150719_a(new INetHandlerStatusClient() {
         private boolean Ua;
         private boolean Ub;
         private long Uc;

         public @NotNull void func_147397_a(@NotNull @NotNull S00PacketServerInfo var1x) {
            if (this.Ub) {
               FeatherSourceFile294.this.TZ.func_150718_a(new ChatComponentTranslation("multiplayer.status.unrequested", new Object[0]));
            } else {
               this.Ub = true;
               this.Uc = Minecraft.func_71386_F();
               FeatherSourceFile294.this.TZ.func_179290_a(new C01PacketPing(this.Uc));
               this.Ua = true;
            }

         }

         public @NotNull void func_147398_a(@NotNull @NotNull S01PacketPong var1x) {
            long var2x = this.Uc;
            long var4 = Minecraft.func_71386_F();
            var1.field_78844_e = var4 - var2x;
            FeatherSourceFile294.this.TZ.func_150718_a(new ChatComponentText("Finished"));
         }

         public @NotNull void func_147231_a(@NotNull @NotNull IChatComponent var1x) {
            if (!this.Ua) {
               FeatherSourceFile311.Sb.error("This should never happen!");
            }

            var2.run();
         }
      });

      try {
         this.TZ.func_179290_a(new C00Handshake(47, var3.func_78861_a(), var3.func_78864_b(), EnumConnectionState.STATUS));
         this.TZ.func_179290_a(new C00PacketServerQuery());
      } catch (Throwable var5) {
         FeatherSourceFile311.Sb.error(var5);
      }

   }

   public void wY() {
      if (this.TZ != null) {
         if (this.TZ.func_150724_d()) {
            this.TZ.func_74428_b();
         } else {
            this.TZ.func_179293_l();
            this.TZ = null;
         }
      }

   }
}
