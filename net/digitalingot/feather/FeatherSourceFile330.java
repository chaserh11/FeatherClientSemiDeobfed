package net.digitalingot.feather;

import java.util.UUID;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.util.IChatComponent;
import org.jetbrains.annotations.NotNull;

public class FeatherSourceFile330 extends FeatherSourceFile85 {
   public FeatherSourceFile330(@NotNull @NotNull FeatherSourceFile700 var1, @NotNull @NotNull FeatherSourceFile849 var2, @NotNull @NotNull FeatherSourceFile100 var3) {
      super(var1, var3, var2, FeatherSourceFile$lh5.LEADER);
   }

   public void lh(EntityPlayerSP var1, String[] var2) {
      if (var2.length == 0) {
         FeatherSourceFile198.lh(var1, FeatherSourceFile37.lh("feather.commands.featherparty.remove.usage"));
      } else {
         String var3 = var2[0];
         UUID var4 = this.ch.mq(var3);
         FeatherSourceFile628 var5 = this.xD.L().hB();
         if (var4 != null && var5.gY().contains(var4)) {
            this.pv.iU().rp(var4);
            IChatComponent var6 = FeatherSourceFile37.lh("feather.commands.featherparty.remove.success", var3);
            FeatherSourceFile198.lh(var1, var6);
         } else {
            FeatherSourceFile198.lh(var1, FeatherSourceFile37.lh("feather.commands.targetNotFound"));
         }
      }
   }
}
