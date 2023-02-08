package net.digitalingot.feather.mixin.client;

import java.awt.Color;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Iterator;
import net.digitalingot.feather.FeatherSourceFile$lh100;
import net.digitalingot.feather.FeatherSourceFile$lh122;
import net.digitalingot.feather.FeatherSourceFile$lh75;
import net.digitalingot.feather.FeatherSourceFile198;
import net.digitalingot.feather.FeatherSourceFile201;
import net.digitalingot.feather.FeatherSourceFile225;
import net.digitalingot.feather.FeatherSourceFile358;
import net.digitalingot.feather.FeatherSourceFile465;
import net.digitalingot.feather.FeatherSourceFile597;
import net.digitalingot.feather.FeatherSourceFile665;
import net.digitalingot.feather.FeatherSourceFile851;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiGameOver;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({GuiGameOver.class})
public class FeatherSourceFile59 {
   @Unique
   private static final FeatherSourceFile465 VF = FeatherSourceFile665.nc(FeatherSourceFile597.class);
   @Unique
   private static final FeatherSourceFile465 VG = FeatherSourceFile665.nc(FeatherSourceFile358.class);
   @Unique
   private String VH;

   @Inject(
      method = {"<init>(Lnet/minecraft/util/IChatComponent;)V"},
      at = {@At("TAIL")}
   )
   public void oe(CallbackInfo var1) {
      Minecraft var2 = Minecraft.func_71410_x();
      FeatherSourceFile597 var3 = (FeatherSourceFile597)VF.ag();
      if (var2.field_71439_g != null && var3.uj()) {
         this.VH = String.format("%s: (%.2f, %.2f, %.2f).", net.digitalingot.feather.FeatherSourceFile37.nc("feather.modules.deathinfo.message"), var2.field_71439_g.field_70169_q, var2.field_71439_g.field_70167_r, var2.field_71439_g.field_70166_s);
         if (((FeatherSourceFile$lh75)var3.pr()).lG) {
            FeatherSourceFile198.lh(var2.field_71439_g, net.digitalingot.feather.FeatherSourceFile37.lh(this.VH));
         }
      }

      FeatherSourceFile358 var4 = (FeatherSourceFile358)VG.ag();
      if (var2.field_71439_g != null && var4.uj() && ((FeatherSourceFile$lh122)var4.pr()).MP) {
         Iterator var5 = ((FeatherSourceFile358)VG.ag()).gV().iterator();

         FeatherSourceFile201 var6;
         while(var5.hasNext()) {
            var6 = (FeatherSourceFile201)var5.next();
            if (Math.abs(var6.ei().ax() - (int)var2.field_71439_g.field_70169_q) < 3 && Math.abs(var6.ei().gR() - (int)var2.field_71439_g.field_70166_s) < 3) {
               return;
            }
         }

         DateTimeFormatter var7 = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
         var6 = new FeatherSourceFile201(var7.format(LocalDateTime.now()) + " Death", true, new FeatherSourceFile225(false, Color.RED), new FeatherSourceFile$lh100((int)var2.field_71439_g.field_70169_q, (int)var2.field_71439_g.field_70167_r, (int)var2.field_71439_g.field_70166_s));
         var6.hy(var4.gU());
         var6.ue(var4.gT());
         var4.lh(var6);
      }

   }

   @Inject(
      method = {"drawScreen"},
      at = {@At("TAIL")}
   )
   public void lh(int var1, int var2, float var3, CallbackInfo var4) {
      Minecraft var5 = Minecraft.func_71410_x();
      if (var5.field_71439_g != null && ((FeatherSourceFile597)VF.ag()).uj() && ((FeatherSourceFile$lh75)((FeatherSourceFile597)VF.ag()).pr()).lH) {
         var5.field_71456_v.func_73732_a(var5.field_71466_p, this.VH, FeatherSourceFile851.iL() / 2, (int)((double)FeatherSourceFile851.iM() * 0.75), 16777215);
      }

   }
}
