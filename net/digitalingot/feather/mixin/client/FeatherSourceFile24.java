package net.digitalingot.feather.mixin.client;

import java.util.Iterator;
import net.minecraft.client.Minecraft;
import net.minecraft.client.settings.KeyBinding;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({Minecraft.class})
public class FeatherSourceFile24 {
   @Shadow
   @Final
   public static boolean field_142025_a;

   @Inject(
      method = {"setIngameFocus"},
      at = {@At(
   value = "INVOKE",
   target = "Lnet/minecraft/util/MouseHelper;grabMouseCursor()V"
)},
      require = 1,
      allow = 1
   )
   private void hb(CallbackInfo var1) {
      if (!field_142025_a) {
         try {
            Iterator var2 = FeatherSourceFile132.getKeybindArray().iterator();

            while(var2.hasNext()) {
               KeyBinding var3 = (KeyBinding)var2.next();
               boolean var4 = net.digitalingot.feather.FeatherSourceFile60.ck(var3.func_151463_i());
               KeyBinding.func_74510_a(var3.func_151463_i(), var4);
            }
         } catch (Exception var5) {
         }

      }
   }
}
