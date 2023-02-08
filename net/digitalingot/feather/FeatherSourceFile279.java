package net.digitalingot.feather;

import com.mojang.authlib.GameProfile;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import net.digitalingot.vendor.javax.inject.Inject;
import net.digitalingot.vendor.javax.inject.Singleton;
import net.minecraft.client.Minecraft;
import net.minecraft.util.Session;
import org.jetbrains.annotations.NotNull;

@Singleton
public class FeatherSourceFile279 {
   @NotNull
   private final @NotNull Minecraft minecraft;
   @NotNull
   private final @NotNull FeatherSourceFile253 fe;
   @NotNull
   private final @NotNull FeatherSourceFile663 sK;
   @NotNull
   private @NotNull List cG = new ArrayList();

   @Inject
   FeatherSourceFile279(@NotNull @NotNull Minecraft var1, @NotNull @NotNull FeatherSourceFile253 var2, @NotNull @NotNull FeatherSourceFile663 var3) {
      this.minecraft = var1;
      this.fe = var2;
      this.sK = var3;
   }

   public void fe() {
      this.fe.nc(new FeatherSourceFile577(), new Consumer() {
         public void lh(FeatherSourceFile25 var1) {
            FeatherSourceFile279.this.cG = var1.bl();
            UUID var2 = FeatherSourceFile279.this.minecraft.func_110432_I().func_148256_e().getId();
            List var3 = (List)FeatherSourceFile279.this.cG.stream().map(FeatherSourceFile$lh6::lh).collect(Collectors.toList());
            FeatherSourceFile279.this.fe.nc(new FeatherSourceFile306(var2, var3));
         }

         // $FF: synthetic method
         public void accept(Object var1) {
            this.lh((FeatherSourceFile25)var1);
         }
      }, (Consumer)null);
      if (FeatherSourceFile747.pq()) {
         GameProfile var1 = this.minecraft.func_110432_I().func_148256_e();
         this.cG.add(new FeatherSourceFile$lh30("support@feathermc.com", var1.getId(), var1.getName(), ""));
         List var2 = (List)this.cG.stream().map(FeatherSourceFile$lh6::lh).collect(Collectors.toList());
         this.fe.nc(new FeatherSourceFile306(var1.getId(), var2));
      }

      this.sK.lh(new FeatherSourceFile$nc12(this));
   }

   public void km(UUID var1) {
      FeatherSourceFile311.Sb.info("Changing account to " + var1 + "...");
      Minecraft var2 = this.minecraft;
      net.digitalingot.feather.mixin.core.FeatherSourceFile9 var3 = (net.digitalingot.feather.mixin.core.FeatherSourceFile9)var2;
      FeatherSourceFile$lh30 var4 = (FeatherSourceFile$lh30)this.cG.stream().filter((var1x) -> {
         return var1x.sd().equals(var1);
      }).findFirst().orElseThrow(IllegalArgumentException::new);
      Session var5 = new Session(var4.getName(), var4.sd().toString(), var4.ry(), "mojang");
      var3.setSession(var5);
      ((FeatherSourceFile370)FeatherSourceFile370.ws.sx()).changeAccount();
   }
}
