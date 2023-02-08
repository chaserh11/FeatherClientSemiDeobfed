package net.digitalingot.feather;

import java.util.UUID;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.util.IChatComponent;
import org.jetbrains.annotations.NotNull;

public class FeatherSourceFile770 extends FeatherSourceFile85 {
   public FeatherSourceFile770(@NotNull @NotNull FeatherSourceFile700 var1, @NotNull @NotNull FeatherSourceFile849 var2, @NotNull @NotNull FeatherSourceFile100 var3) {
      super(var1, var3, var2, FeatherSourceFile$lh5.LEADER);
   }

   public void lh(EntityPlayerSP var1, String[] var2) {
      if (var2.length == 0) {
         FeatherSourceFile198.lh(var1, FeatherSourceFile37.lh("feather.commands.featherparty.leader.usage"));
      } else {
         UUID var3 = this.ch.mq(var2[0]);
         if (var3 == null) {
            FeatherSourceFile198.lh(var1, FeatherSourceFile37.lh("feather.commands.targetNotFound"));
         } else {
            FeatherSourceFile628 var4 = this.xD.L().hB();
            if (!var4.gY().contains(var3)) {
               FeatherSourceFile198.lh(var1, FeatherSourceFile37.lh("feather.commands.featherparty.targetNotInParty"));
            } else {
               this.pv.iU().sm(var3);
               IChatComponent var5 = FeatherSourceFile37.lh("feather.commands.featherparty.leader.success", var2[0]);
               FeatherSourceFile198.lh(var1, var5);
            }
         }
      }
   }
}
