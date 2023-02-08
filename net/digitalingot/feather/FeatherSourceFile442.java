package net.digitalingot.feather;

import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.util.IChatComponent;
import org.jetbrains.annotations.NotNull;

public class FeatherSourceFile442 extends FeatherSourceFile85 {
   public FeatherSourceFile442(@NotNull @NotNull FeatherSourceFile700 var1, @NotNull @NotNull FeatherSourceFile849 var2, @NotNull @NotNull FeatherSourceFile100 var3) {
      super(var1, var3, var2, FeatherSourceFile$lh5.NOT_IN_PARTY);
   }

   public void lh(EntityPlayerSP var1, String[] var2) {
      FeatherSourceFile627 var3 = this.xD.rb(var2.length == 0 ? null : var2[0]);
      if (var3 == null) {
         FeatherSourceFile198.lh(var1, FeatherSourceFile37.lh("feather.commands.featherparty.error.inviteNotFound"));
      } else {
         this.pv.iU().xj(var3.hC(), true);
         IChatComponent var4 = FeatherSourceFile37.lh("feather.commands.featherparty.accept.success");
         FeatherSourceFile198.lh(var1, var4);
      }
   }
}
