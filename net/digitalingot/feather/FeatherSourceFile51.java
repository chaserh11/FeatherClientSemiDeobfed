package net.digitalingot.feather;

import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.util.IChatComponent;
import org.jetbrains.annotations.NotNull;

public class FeatherSourceFile51 extends FeatherSourceFile85 {
   public FeatherSourceFile51(@NotNull @NotNull FeatherSourceFile700 var1, @NotNull @NotNull FeatherSourceFile849 var2, @NotNull @NotNull FeatherSourceFile100 var3) {
      super(var1, var3, var2, FeatherSourceFile$lh5.IN_PARTY);
   }

   public void lh(EntityPlayerSP var1, String[] var2) {
      this.xD.L().nc((FeatherSourceFile628)null);
      this.pv.iU().iZ();
      IChatComponent var3 = FeatherSourceFile37.lh("feather.commands.featherparty.leave.success");
      FeatherSourceFile198.lh(var1, var3);
      this.xD.oe(System.currentTimeMillis());
   }
}
