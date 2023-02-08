package net.digitalingot.feather;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import net.digitalingot.vendor.javax.inject.Inject;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import org.jetbrains.annotations.NotNull;

public class FeatherSourceFile297 extends FeatherSourceFile735 {
   @NotNull
   private final @NotNull Minecraft minecraft;
   @NotNull
   private final @NotNull FeatherSourceFile700 ch;
   @NotNull
   private final @NotNull FeatherSourceFile633 JP;

   @Inject
   FeatherSourceFile297(@NotNull @NotNull Minecraft var1, @NotNull @NotNull FeatherSourceFile700 var2, @NotNull @NotNull FeatherSourceFile633 var3) {
      super("feathermute", Collections.singletonList("fmute"));
      this.minecraft = var1;
      this.ch = var2;
      this.JP = var3;
   }

   public void lh(@NotNull @NotNull String[] var1) {
      EntityPlayerSP var2 = this.minecraft.field_71439_g;
      if (var1.length == 0) {
         FeatherSourceFile198.lh(var2, FeatherSourceFile37.lh("feather.commands.feathermute.base.usage"));
      } else {
         switch (var1[0].toLowerCase()) {
            case "add":
            case "remove":
               this.lh(var2, var1, var3);
               break;
            case "list":
               List var6 = this.JP.fL();
               if (var6.isEmpty()) {
                  FeatherSourceFile198.lh(var2, FeatherSourceFile37.lh("feather.commands.feathermute.list.empty"));
                  break;
               } else {
                  FeatherSourceFile198.lh(var2, FeatherSourceFile37.lh("feather.commands.feathermute.list.heading"));
                  Iterator var7 = var6.iterator();

                  while(var7.hasNext()) {
                     FeatherSourceFile384 var8 = (FeatherSourceFile384)var7.next();
                     FeatherSourceFile198.lh(var2, FeatherSourceFile37.lh("feather.commands.feathermute.list.entry", var8.me(), var8.oa()));
                  }

                  return;
               }
            default:
               FeatherSourceFile198.lh(var2, FeatherSourceFile37.lh("feather.commands.feathermute.base.usage"));
         }

      }
   }

   private @NotNull @NotNull void lh(@NotNull @NotNull EntityPlayerSP var1, @NotNull @NotNull String[] var2, @NotNull @NotNull String var3) {
      if (var2.length < 2) {
         FeatherSourceFile198.lh(var1, FeatherSourceFile37.lh("feather.commands.feathermute.base.usage"));
      } else {
         String var4 = var2[1];
         UUID var5 = this.ch.mq(var4);
         if (var5 == null) {
            FeatherSourceFile198.lh(var1, FeatherSourceFile37.lh("feather.commands.feathermute.invalidUsername"));
         } else {
            if (var3.equals("add")) {
               if (this.JP.eg(var5)) {
                  FeatherSourceFile198.lh(var1, FeatherSourceFile37.lh("feather.commands.feathermute.add.success", var4));
               } else {
                  FeatherSourceFile198.lh(var1, FeatherSourceFile37.lh("feather.commands.feathermute.add.failure", var4));
               }
            } else if (this.JP.oy(var5)) {
               FeatherSourceFile198.lh(var1, FeatherSourceFile37.lh("feather.commands.feathermute.remove.success", var4));
            } else {
               FeatherSourceFile198.lh(var1, FeatherSourceFile37.lh("feather.commands.feathermute.remove.failure", var4));
            }

         }
      }
   }
}
