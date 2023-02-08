package net.digitalingot.feather;

import java.util.Objects;
import net.digitalingot.vendor.javax.inject.Inject;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;

@FeatherSourceFile3(
   jj = FeatherSourceFile243.TITLE_TWEAKER,
   kl = @FeatherSourceFile414(
   jc = "feather.modulename.titletweaker",
   jl = "https://assets.feathercdn.net/game/mods/titletweaker.svg",
   od = "feather.moduledescription.titletweaker",
   wr = {FeatherSourceFile$lh3.HUD}
)
)
@FeatherSourceFile629(
   jt = {@FeatherSourceFile503(
   al = FeatherSourceFile$lh49.class
)},
   ms = FeatherSourceFile$lh87.ONLY_HUD_ELEMENT
)
public class FeatherSourceFile570 extends FeatherSourceFile360 {
   private final Minecraft minecraft;

   @Inject
   FeatherSourceFile570(Minecraft var1) {
      this.minecraft = var1;
   }

   public void ex() {
      FeatherSourceFile478.dq.oe((var1) -> {
         if (this.uj() && ((FeatherSourceFile$nc20)this.fS).EZ) {
            FeatherSourceFile198.lh((EntityPlayerSP)Objects.requireNonNull(this.minecraft.field_71439_g), FeatherSourceFile37.lh("§a[Title] §b" + var1));
         }

         return var1;
      });
      FeatherSourceFile157.nk.oe((var1) -> {
         if (this.uj() && ((FeatherSourceFile$nc20)this.fS).EZ) {
            FeatherSourceFile198.lh((EntityPlayerSP)Objects.requireNonNull(this.minecraft.field_71439_g), FeatherSourceFile37.lh("§a[Subtitle] §b" + var1));
         }

         return var1;
      });
      FeatherSourceFile197.bd.oe((var1) -> {
         if (this.uj() && ((FeatherSourceFile$nc20)this.fS).Fa) {
            FeatherSourceFile198.lh((EntityPlayerSP)Objects.requireNonNull(this.minecraft.field_71439_g), FeatherSourceFile37.lh("§a[ActionBar Message] §b" + var1));
         }

         return var1;
      });
   }

   // $FF: synthetic method
   static FeatherSourceFile136 lh(FeatherSourceFile570 var0) {
      return var0.fS;
   }

   // $FF: synthetic method
   static FeatherSourceFile136 nc(FeatherSourceFile570 var0) {
      return var0.fS;
   }

   // $FF: synthetic method
   static FeatherSourceFile136 xj(FeatherSourceFile570 var0) {
      return var0.fS;
   }

   // $FF: synthetic method
   static Minecraft oe(FeatherSourceFile570 var0) {
      return var0.minecraft;
   }
}
