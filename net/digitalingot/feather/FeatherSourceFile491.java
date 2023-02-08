package net.digitalingot.feather;

import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.util.IChatComponent;
import org.jetbrains.annotations.NotNull;

public class FeatherSourceFile491 extends FeatherSourceFile85 {
   protected FeatherSourceFile491(@NotNull @NotNull FeatherSourceFile700 var1, @NotNull @NotNull FeatherSourceFile849 var2, @NotNull @NotNull FeatherSourceFile100 var3) {
      super(var1, var2, var3);
   }

   public void lh(EntityPlayerSP var1, String[] var2) {
      FeatherSourceFile627 var3 = this.xD.rb(var2.length == 0 ? null : var2[0]);
      if (var3 == null) {
         FeatherSourceFile198.lh(var1, FeatherSourceFile37.lh("feather.commands.featherparty.inviteNotFound"));
      } else {
         this.pv.iU().xj(var3.hC(), false);
         IChatComponent var4 = FeatherSourceFile37.lh("feather.commands.featherparty.deny.success");
         FeatherSourceFile198.lh(var1, var4);
      }
   }
}
