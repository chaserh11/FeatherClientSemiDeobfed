package net.digitalingot.feather;

import java.util.concurrent.TimeUnit;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.util.IChatComponent;
import org.jetbrains.annotations.NotNull;

public class FeatherSourceFile147 extends FeatherSourceFile85 {
   private long xG = -1L;

   public FeatherSourceFile147(@NotNull @NotNull FeatherSourceFile700 var1, @NotNull @NotNull FeatherSourceFile849 var2, @NotNull @NotNull FeatherSourceFile100 var3) {
      super(var1, var3, var2, FeatherSourceFile$lh5.NOT_IN_PARTY);
   }

   public void lh(EntityPlayerSP var1, String[] var2) {
      if (System.currentTimeMillis() - this.xG >= TimeUnit.SECONDS.toMillis(3L)) {
         this.xG = System.currentTimeMillis();
         this.pv.iU().iY();
         IChatComponent var3 = FeatherSourceFile37.lh("feather.commands.featherparty.create.success");
         FeatherSourceFile198.lh(var1, var3);
      }
   }
}
