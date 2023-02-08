package net.digitalingot.feather;

import java.net.Inet4Address;
import java.net.InetSocketAddress;
import java.net.UnknownHostException;
import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;
import net.digitalingot.vendor.javax.inject.Inject;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiMainMenu;
import net.minecraft.client.multiplayer.GuiConnecting;
import net.minecraft.client.network.NetHandlerPlayClient;

public class FeatherSourceFile452 {
   private final Minecraft minecraft;
   private final FeatherSourceFile253 fe;

   @Inject
   FeatherSourceFile452(Minecraft var1, FeatherSourceFile253 var2) {
      this.minecraft = var1;
      this.fe = var2;
   }

   public CompletableFuture xU() {
      final CompletableFuture var1 = new CompletableFuture();
      this.fe.nc(new FeatherSourceFile777(), new Consumer() {
         public void lh(FeatherSourceFile783 var1x) {
            FeatherSourceFile451 var2 = new FeatherSourceFile451(var1x.qg(), var1x.jw());
            var1.complete(var2);
         }

         // $FF: synthetic method
         public void accept(Object var1x) {
            this.lh((FeatherSourceFile783)var1x);
         }
      }, (Consumer)null);
      return var1;
   }

   public void lh(FeatherSourceFile451 var1, FeatherSourceFile449 var2) {
      this.nc(var1, var2).thenAccept((var1x) -> {
         NetHandlerPlayClient var2 = this.minecraft.func_147114_u();
         if (var2 != null) {
            var2.func_147298_b().func_150718_a(FeatherSourceFile37.xj(""));
         }

         String var3 = var1x.getHostString();
         int var4 = var1x.getPort();
         GuiConnecting var5 = new GuiConnecting(new GuiMainMenu(), this.minecraft, var3, var4);
         this.minecraft.func_147108_a(var5);
      });
   }

   public CompletableFuture nc(FeatherSourceFile451 var1, FeatherSourceFile449 var2) {
      var1.lh(var2);
      final CompletableFuture var3 = new CompletableFuture();
      FeatherSourceFile386 var4 = new FeatherSourceFile386(var1.qg(), var2.xX(), var2.lo());
      this.fe.nc(var4, new Consumer() {
         public void lh(FeatherSourceFile57 var1) {
            try {
               InetSocketAddress var2 = new InetSocketAddress(Inet4Address.getLocalHost(), var1.cr());
               FeatherSourceFile311.Sb.info("Created local P2P tunnel - port to connect to: {}", new Object[]{var1.cr()});
               var3.complete(var2);
            } catch (UnknownHostException var3x) {
               var3.completeExceptionally(var3x);
            }

         }

         // $FF: synthetic method
         public void accept(Object var1) {
            this.lh((FeatherSourceFile57)var1);
         }
      }, (Consumer)null);
      return var3;
   }
}
