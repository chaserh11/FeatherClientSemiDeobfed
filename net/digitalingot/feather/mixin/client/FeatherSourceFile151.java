package net.digitalingot.feather.mixin.client;

import com.mojang.authlib.GameProfile;
import net.digitalingot.feather.FeatherSourceFile$nc33;
import net.digitalingot.feather.FeatherSourceFile410;
import net.digitalingot.feather.FeatherSourceFile465;
import net.digitalingot.feather.FeatherSourceFile665;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.AbstractClientPlayer;
import net.minecraft.client.resources.DefaultPlayerSkin;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin({AbstractClientPlayer.class})
public abstract class FeatherSourceFile151 extends EntityPlayer {
   @Unique
   private static final FeatherSourceFile465 WM = FeatherSourceFile665.nc(FeatherSourceFile410.class);

   public FeatherSourceFile151(World var1, GameProfile var2) {
      super(var1, var2);
   }

   @Inject(
      method = {"hasSkin()Z"},
      at = {@At("HEAD")},
      cancellable = true,
      require = 1,
      allow = 1
   )
   private void km(CallbackInfoReturnable var1) {
      FeatherSourceFile410 var2 = (FeatherSourceFile410)WM.ag();
      if (var2.uj() && !var2.hd()) {
         if (Minecraft.func_71410_x().field_71439_g == this) {
            FeatherSourceFile$nc33 var3 = (FeatherSourceFile$nc33)var2.pr();
            if (var3.oI) {
               var1.setReturnValue(var2.vg());
            } else if (var3.oH) {
               var1.setReturnValue(false);
            }
         } else if (((FeatherSourceFile$nc33)var2.pr()).oJ) {
            var1.setReturnValue(false);
         }

      }
   }

   @Inject(
      method = {"getLocationSkin()Lnet/minecraft/util/ResourceLocation;"},
      at = {@At("HEAD")},
      cancellable = true,
      require = 1,
      allow = 1
   )
   private void mq(CallbackInfoReturnable var1) {
      FeatherSourceFile410 var2 = (FeatherSourceFile410)WM.ag();
      if (var2.uj() && !var2.hd()) {
         if (Minecraft.func_71410_x().field_71439_g == this) {
            FeatherSourceFile$nc33 var3 = (FeatherSourceFile$nc33)var2.pr();
            if (var3.oI) {
               ResourceLocation var4 = var2.wm();
               if (var4 == null) {
                  var4 = DefaultPlayerSkin.func_177334_a(this.func_110124_au());
               }

               var1.setReturnValue(var4);
            } else if (var3.oH) {
               var1.setReturnValue(DefaultPlayerSkin.func_177334_a(this.func_110124_au()));
            }
         } else if (((FeatherSourceFile$nc33)var2.pr()).oJ) {
            var1.setReturnValue(DefaultPlayerSkin.func_177334_a(this.func_110124_au()));
         }

      }
   }

   @Inject(
      method = {"getLocationCape()Lnet/minecraft/util/ResourceLocation;"},
      at = {@At("HEAD")},
      cancellable = true,
      require = 1,
      allow = 1
   )
   private void mr(CallbackInfoReturnable var1) {
      FeatherSourceFile410 var2 = (FeatherSourceFile410)WM.ag();
      if (var2.uj() && !var2.hd()) {
         if (Minecraft.func_71410_x().field_71439_g == this) {
            FeatherSourceFile$nc33 var3 = (FeatherSourceFile$nc33)var2.pr();
            if (var3.oI) {
               var1.setReturnValue(var2.jd());
            } else if (var3.oH) {
               var1.setReturnValue((Object)null);
            }
         } else if (((FeatherSourceFile$nc33)var2.pr()).oJ) {
            var1.setReturnValue((Object)null);
         }

      }
   }

   @Inject(
      method = {"getSkinType()Ljava/lang/String;"},
      at = {@At("HEAD")},
      cancellable = true,
      require = 1,
      allow = 1
   )
   private void ux(CallbackInfoReturnable var1) {
      FeatherSourceFile410 var2 = (FeatherSourceFile410)WM.ag();
      if (var2.uj() && !var2.hd()) {
         if (Minecraft.func_71410_x().field_71439_g == this) {
            FeatherSourceFile$nc33 var3 = (FeatherSourceFile$nc33)var2.pr();
            if (var3.oI) {
               String var4 = var2.vq();
               if (var4 == null) {
                  var4 = DefaultPlayerSkin.func_177332_b(this.func_110124_au());
               }

               var1.setReturnValue(var4);
            } else if (var3.oH) {
               var1.setReturnValue(DefaultPlayerSkin.func_177332_b(this.func_110124_au()));
            }
         } else if (((FeatherSourceFile$nc33)var2.pr()).oJ) {
            var1.setReturnValue(DefaultPlayerSkin.func_177332_b(this.func_110124_au()));
         }

      }
   }
}
