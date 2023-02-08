package net.digitalingot.feather;

import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.util.IChatComponent;
import org.jetbrains.annotations.NotNull;

public class FeatherSourceFile764 extends FeatherSourceFile85 {
   public FeatherSourceFile764(@NotNull @NotNull FeatherSourceFile700 var1, @NotNull @NotNull FeatherSourceFile849 var2, @NotNull @NotNull FeatherSourceFile100 var3) {
      super(var1, var3, var2, FeatherSourceFile$lh5.LEADER);
   }

   public void lh(EntityPlayerSP var1, String[] var2) {
      if (var2.length == 0) {
         FeatherSourceFile198.lh(var1, FeatherSourceFile37.lh("feather.commands.featherparty.mode.usage"));
      } else {
         FeatherSourceFile$nc10 var4;
         String var5;
         switch (var2[0].toLowerCase()) {
            case "normal":
            case "n":
               var4 = FeatherSourceFile$nc10.EVERYONE;
               var5 = "feather.commands.featherparty.mode.successNormal";
               break;
            case "proximity":
            case "p":
               var4 = FeatherSourceFile$nc10.PROXIMITY;
               var5 = "feather.commands.featherparty.mode.successProximity";
               break;
            default:
               FeatherSourceFile198.lh(var1, FeatherSourceFile37.lh("feather.commands.featherparty.mode.usage"));
               return;
         }

         this.pv.iU().lh(var4);
         IChatComponent var6 = FeatherSourceFile37.lh(var5);
         FeatherSourceFile198.lh(var1, var6);
      }
   }
}
