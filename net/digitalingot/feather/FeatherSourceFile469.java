package net.digitalingot.feather;

import java.util.Iterator;
import java.util.Map;
import java.util.UUID;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.util.IChatComponent;
import org.jetbrains.annotations.NotNull;

public class FeatherSourceFile469 extends FeatherSourceFile85 {
   public FeatherSourceFile469(@NotNull @NotNull FeatherSourceFile700 var1, @NotNull @NotNull FeatherSourceFile849 var2, @NotNull @NotNull FeatherSourceFile100 var3) {
      super(var1, var3, var2, FeatherSourceFile$lh5.IN_PARTY);
   }

   public void lh(EntityPlayerSP var1, String[] var2) {
      FeatherSourceFile628 var3 = this.xD.L().hB();
      String var4 = this.ch.lh(var3.gX());
      Map var5 = this.ch.lh((UUID[])var3.gY().toArray(new UUID[0]));
      IChatComponent var6 = FeatherSourceFile37.lh("feather.commands.featherparty.info.heading");
      IChatComponent var7 = FeatherSourceFile37.lh(var3.gZ() == FeatherSourceFile$nc10.EVERYONE ? "feather.commands.featherparty.info.modeEveryone" : "feather.commands.featherparty.info.modeProximity");
      IChatComponent var8 = FeatherSourceFile37.lh("feather.commands.featherparty.info.owner", var4);
      FeatherSourceFile198.lh(var1, var6);
      FeatherSourceFile198.lh(var1, var7);
      FeatherSourceFile198.lh(var1, var8);
      Iterator var9 = var5.values().iterator();

      while(var9.hasNext()) {
         String var10 = (String)var9.next();
         IChatComponent var11 = FeatherSourceFile37.lh("feather.commands.featherparty.info.member", var10);
         FeatherSourceFile198.lh(var1, var11);
      }

   }
}
