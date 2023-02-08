package net.digitalingot.feather;

import net.digitalingot.vendor.com.google.inject.Singleton;
import net.digitalingot.vendor.javax.inject.Inject;
import net.minecraft.client.Minecraft;

@Singleton
@FeatherSourceFile3(
   jj = FeatherSourceFile243.TOAST_CONTROL,
   kl = @FeatherSourceFile414(
   jc = "feather.modulename.toastcontrol",
   jl = "https://assets.feathercdn.net/game/mods/toastcontrol.svg",
   od = "feather.moduledescription.toastcontrol",
   wr = {FeatherSourceFile$lh3.HUD, FeatherSourceFile$lh3.NEW}
)
)
public class FeatherSourceFile647 extends FeatherSourceFile495 {
   private final Minecraft minecraft;

   @Inject
   FeatherSourceFile647(Minecraft var1) {
      this.minecraft = var1;
   }
}
