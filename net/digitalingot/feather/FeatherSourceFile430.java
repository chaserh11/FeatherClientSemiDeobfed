package net.digitalingot.feather;

import java.net.InetSocketAddress;
import net.digitalingot.vendor.javax.inject.Inject;
import net.digitalingot.vendor.javax.inject.Singleton;
import net.minecraft.client.Minecraft;
import net.minecraft.network.NetworkManager;

@Singleton
public class FeatherSourceFile430 {
   private final Minecraft minecraft;
   private final FeatherSourceFile428 lI;
   private final FeatherSourceFile427 Rh;
   private final FeatherSourceFile426 ab;
   private final FeatherSourceFile431 Ri;
   private final FeatherSourceFile454 uz;
   private boolean Rj;

   @Inject
   FeatherSourceFile430(Minecraft var1, FeatherSourceFile428 var2, FeatherSourceFile427 var3, FeatherSourceFile426 var4, FeatherSourceFile431 var5, FeatherSourceFile454 var6) {
      this.minecraft = var1;
      this.lI = var2;
      this.Rh = var3;
      this.ab = var4;
      this.Ri = var5;
      this.uz = var6;
   }

   public void fe() {
      this.xF();
      this.Ri.fe();
      this.lI.fe();
      this.Rh.fe();
      this.ab.fe();
      this.uz.fe();
   }

   private void xF() {
      FeatherSourceFile725.ar.oe((var1, var2) -> {
         if (!FeatherSourceFile6.xv()) {
            NetworkManager var3 = var2.func_147298_b();
            if (!var3.func_150731_c() && !this.minecraft.func_71356_B()) {
               if (!this.Rj) {
                  InetSocketAddress var4 = (InetSocketAddress)var3.func_74430_c();
                  String var5 = var4.getHostName();
                  var5 = var5.endsWith(".") ? var5.substring(0, var5.length() - 1) : var5;
                  short var6 = (short)var4.getPort();
                  ((FeatherSourceFile357)FeatherSourceFile357.ws.sx()).login(var1, var5, var6);
                  this.Rj = true;
               }
            }
         }
      });
      FeatherSourceFile725.wi.oe((var1, var2) -> {
         this.Rj = false;
      });
   }
}
