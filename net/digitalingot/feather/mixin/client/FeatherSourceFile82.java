package net.digitalingot.feather.mixin.client;

import net.digitalingot.feather.FeatherSourceFile465;
import net.digitalingot.feather.FeatherSourceFile606;
import net.digitalingot.feather.FeatherSourceFile665;
import net.digitalingot.feather.FeatherSourceFile851;
import net.minecraft.client.gui.GuiChat;
import net.minecraft.client.gui.GuiScreen;
import org.lwjgl.input.Mouse;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({GuiChat.class})
public abstract class FeatherSourceFile82 extends GuiScreen {
   private static final FeatherSourceFile465 Vt = FeatherSourceFile665.nc(net.digitalingot.feather.FeatherSourceFile39.class);
   @Unique
   private static final FeatherSourceFile465 Vu = FeatherSourceFile665.nc(FeatherSourceFile606.class);

   @Inject(
      method = {"handleMouseInput"},
      at = {@At("HEAD")}
   )
   public void xj(CallbackInfo var1) {
      ((FeatherSourceFile606)Vu.ag()).nc((double)Mouse.getX(), (double)Mouse.getY());
      ((net.digitalingot.feather.FeatherSourceFile39)Vt.ag()).pq((double)Mouse.getX(), (double)Mouse.getY());
      double var2 = (double)Mouse.getX() / FeatherSourceFile851.iN();
      double var4 = (double)Mouse.getY() / FeatherSourceFile851.iN();
      ((net.digitalingot.feather.FeatherSourceFile39)Vt.ag()).as(var2, var4);
      int var6 = Mouse.getEventX() * this.field_146294_l / this.field_146297_k.field_71443_c;
      int var7 = this.field_146295_m - Mouse.getEventY() * this.field_146295_m / this.field_146297_k.field_71440_d - 1;
      ((net.digitalingot.feather.FeatherSourceFile39)Vt.ag()).ou((double)var6, (double)var7);
   }

   public void func_146282_l() {
      super.func_146282_l();
      ((FeatherSourceFile606)Vu.ag()).nc((double)Mouse.getX(), (double)Mouse.getY());
   }
}
