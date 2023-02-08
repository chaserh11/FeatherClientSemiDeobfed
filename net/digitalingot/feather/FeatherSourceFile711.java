package net.digitalingot.feather;

import java.util.Arrays;
import java.util.function.Consumer;
import net.digitalingot.vendor.javax.inject.Inject;
import net.digitalingot.vendor.javax.inject.Singleton;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiMainMenu;
import net.minecraft.client.gui.GuiMultiplayer;
import net.minecraft.client.gui.GuiOptions;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.gui.GuiSelectWorld;
import net.minecraft.client.gui.GuiShareToLan;

@Singleton
public class FeatherSourceFile711 implements FeatherSourceFile594 {
   private final Minecraft minecraft;
   private final FeatherSourceFile87 pg;
   private final FeatherSourceFile568 qt;
   private final FeatherSourceFile541 rd;
   private final FeatherSourceFile143 lk;
   private final FeatherSourceFile308 yz;
   private final FeatherSourceFile200 rn;

   @Inject
   FeatherSourceFile711(Minecraft var1, FeatherSourceFile87 var2, FeatherSourceFile568 var3, FeatherSourceFile541 var4, FeatherSourceFile143 var5, FeatherSourceFile308 var6, FeatherSourceFile200 var7) {
      this.minecraft = var1;
      this.pg = var2;
      this.qt = var3;
      this.rd = var4;
      this.lk = var5;
      this.yz = var6;
      this.rn = var7;
   }

   public void lh(FeatherSourceFile208 var1, Consumer var2, Consumer var3) {
      FeatherSourceFile112 var4 = (FeatherSourceFile112)Arrays.stream(FeatherSourceFile112.values()).filter((var1x) -> {
         return var1x.getSlug().equals(var1.xt());
      }).findAny().orElse((Object)null);
      if (var4 != null) {
         switch (var4) {
            case SINGLEPLAYER:
               this.minecraft.func_147108_a(new GuiSelectWorld(new GuiMainMenu()));
               break;
            case MULTIPLAYER:
               this.minecraft.func_147108_a(new GuiMultiplayer(new GuiMainMenu()));
               break;
            case COSMETICS:
               this.pg.gx();
               break;
            case QUIT_GAME:
               this.minecraft.func_71400_g();
               break;
            case FEATHER_SETTINGS:
               FeatherSourceFile788.xo();
               break;
            case BACK_TO_GAME:
               this.minecraft.func_147108_a((GuiScreen)null);
               break;
            case OPTIONS:
               this.be();
               break;
            case DISCONNECT:
            case SAVE_AND_QUIT:
               this.rd.disconnect();
               break;
            case OPEN_TO_LAN:
               this.minecraft.func_147108_a(new GuiShareToLan(this.minecraft.field_71462_r));
         }

         var2.accept(new FeatherSourceFile12("success"));
      } else {
         FeatherSourceFile259 var5 = (FeatherSourceFile259)Arrays.stream(FeatherSourceFile259.values()).filter((var1x) -> {
            return var1x.getSlug().equals(var1.xt());
         }).findAny().orElse((Object)null);
         if (var5 != null) {
            switch (var5) {
               case SOCIAL:
                  this.rn.vt(false);
                  this.yz.gs();
                  break;
               case MC_SETTINGS:
                  this.be();
                  break;
               case REALMS:
                  throw new IllegalStateException("Realms only supported on the latest minecraft version");
               case REPLAY_MOD:
                  FeatherSourceFile6.xx();
                  break;
               case MOD_MENU:
                  FeatherSourceFile390.gn();
                  break;
               case ORIGINAL_MENU:
                  this.qt.D();
                  break;
               case ORIGINAL_PAUSE_SCREEN:
                  this.rd.z();
                  break;
               case SERVER_LIST:
                  this.minecraft.func_147108_a(new GuiMultiplayer(this.ql()));
            }

            var2.accept(new FeatherSourceFile12("success"));
         } else {
            FeatherSourceFile219 var6 = (FeatherSourceFile219)Arrays.stream(FeatherSourceFile219.values()).filter((var1x) -> {
               return var1x.getSlug().equals(var1.xt());
            }).findAny().orElse((Object)null);
            if (var6 != null) {
               switch (var6) {
                  case HUD_EDITOR:
                     FeatherSourceFile788.xo();
                  default:
                     var2.accept(new FeatherSourceFile12("success"));
               }
            } else {
               throw new IllegalStateException("Selection not found");
            }
         }
      }
   }

   public FeatherSourceFile754 hc() {
      return FeatherSourceFile754.PRESS_BUTTON;
   }

   private void be() {
      this.minecraft.func_147108_a(new GuiOptions(this.ql(), this.minecraft.field_71474_y));
   }

   private GuiScreen ql() {
      return this.lk.kj() ? new GuiMainMenu() : null;
   }
}
