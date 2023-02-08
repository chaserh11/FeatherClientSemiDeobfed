package net.digitalingot.feather;

import java.util.UUID;
import net.digitalingot.vendor.javax.inject.Inject;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.util.IChatComponent;
import org.jetbrains.annotations.NotNull;

public class FeatherSourceFile342 implements FeatherSourceFile35 {
   @NotNull
   private final @NotNull Minecraft minecraft;
   @NotNull
   private final @NotNull FeatherSourceFile700 ch;
   @NotNull
   private final @NotNull FeatherSourceFile100 xD;

   @Inject
   FeatherSourceFile342(@NotNull @NotNull Minecraft var1, @NotNull @NotNull FeatherSourceFile700 var2, @NotNull @NotNull FeatherSourceFile100 var3) {
      this.minecraft = var1;
      this.ch = var2;
      this.xD = var3;
   }

   public void lh(FeatherSourceFile628 var1) {
   }

   public void lh(FeatherSourceFile627 var1) {
      String var2 = this.ch.lh(var1.hD());
      IChatComponent var3 = FeatherSourceFile37.lh("feather.commands.featherparty.receivedInvite", var2);
      EntityPlayerSP var4 = this.minecraft.field_71439_g;
      if (var4 != null) {
         FeatherSourceFile198.lh(var4, var3);
      }

   }

   public void mr(UUID var1) {
      String var2 = this.ch.lh(var1);
      IChatComponent var3 = FeatherSourceFile37.lh("feather.commands.featherparty.inviteDenied", var2);
      EntityPlayerSP var4 = this.minecraft.field_71439_g;
      if (var4 != null) {
         FeatherSourceFile198.lh(var4, var3);
      }

   }

   public void N() {
      if (this.xD.M()) {
         IChatComponent var1 = FeatherSourceFile37.lh("feather.commands.featherparty.kicked");
         EntityPlayerSP var2 = this.minecraft.field_71439_g;
         if (var2 != null) {
            FeatherSourceFile198.lh(var2, var1);
         }

      }
   }
}
