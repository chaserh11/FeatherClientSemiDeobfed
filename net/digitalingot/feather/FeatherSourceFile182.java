package net.digitalingot.feather;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import net.digitalingot.vendor.javax.inject.Inject;
import net.digitalingot.vendor.javax.inject.Singleton;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import org.jetbrains.annotations.NotNull;

@Singleton
public class FeatherSourceFile182 extends FeatherSourceFile735 {
   @NotNull
   private final @NotNull Map xE = new HashMap();
   @NotNull
   private final @NotNull FeatherSourceFile100 xD;

   @Inject
   FeatherSourceFile182(@NotNull @NotNull FeatherSourceFile700 var1, @NotNull @NotNull FeatherSourceFile849 var2, @NotNull @NotNull FeatherSourceFile100 var3) {
      super("featherparty", Collections.singletonList("fparty"));
      this.xD = var3;
      this.xE.put("create", new FeatherSourceFile147(var1, var2, var3));
      this.xE.put("accept", new FeatherSourceFile442(var1, var2, var3));
      this.xE.put("deny", new FeatherSourceFile491(var1, var2, var3));
      FeatherSourceFile469 var4 = new FeatherSourceFile469(var1, var2, var3);
      this.xE.put("info", var4);
      this.xE.put("list", var4);
      this.xE.put("leave", new FeatherSourceFile51(var1, var2, var3));
      this.xE.put("mode", new FeatherSourceFile764(var1, var2, var3));
      this.xE.put("leader", new FeatherSourceFile770(var1, var2, var3));
      this.xE.put("remove", new FeatherSourceFile330(var1, var2, var3));
      this.xE.put("invite", new FeatherSourceFile743(var1, var2, var3));
   }

   public void lh(@NotNull @NotNull String[] var1) {
      EntityPlayerSP var2 = Minecraft.func_71410_x().field_71439_g;
      if (var1.length == 0) {
         FeatherSourceFile198.lh(var2, FeatherSourceFile37.lh("feather.commands.featherparty.base.usage"));
      } else {
         String var3 = var1[0].toLowerCase();
         FeatherSourceFile85 var4 = (FeatherSourceFile85)this.xE.get(var3);
         if (var4 == null) {
            FeatherSourceFile198.lh(var2, FeatherSourceFile37.lh("feather.commands.featherparty.base.usage"));
         } else {
            switch (var4.Q()) {
               case NOT_IN_PARTY:
                  if (this.O()) {
                     FeatherSourceFile198.lh(var2, FeatherSourceFile37.lh("feather.commands.featherparty.error.alreadyInParty"));
                     return;
                  }
                  break;
               case IN_PARTY:
                  if (!this.O()) {
                     FeatherSourceFile198.lh(var2, FeatherSourceFile37.lh("feather.commands.featherparty.notInParty"));
                     return;
                  }
                  break;
               case LEADER:
                  if (!this.P()) {
                     FeatherSourceFile198.lh(var2, FeatherSourceFile37.lh("feather.commands.featherparty.notLeader"));
                     return;
                  }
            }

            String[] var5 = new String[var1.length - 1];
            System.arraycopy(var1, 1, var5, 0, var5.length);
            var4.lh(var2, var5);
         }
      }
   }

   private boolean O() {
      return this.xD.L().hB() != null;
   }

   private boolean P() {
      FeatherSourceFile628 var1 = this.xD.L().hB();
      if (var1 == null) {
         return false;
      } else {
         UUID var2 = Minecraft.func_71410_x().func_110432_I().func_148256_e().getId();
         return var1.gX().equals(var2);
      }
   }
}
