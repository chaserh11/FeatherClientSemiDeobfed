package net.digitalingot.feather;

import com.google.common.reflect.TypeToken;
import java.io.File;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Vector;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import net.digitalingot.vendor.javax.inject.Inject;
import net.digitalingot.vendor.org.checkerframework.checker.nullness.qual.Nullable;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.client.gui.ChatLine;
import net.minecraft.client.gui.GuiNewChat;
import net.minecraft.client.gui.GuiUtilRenderComponents;
import net.minecraft.client.network.NetworkPlayerInfo;
import net.minecraft.util.IChatComponent;
import net.minecraft.util.MathHelper;
import org.jetbrains.annotations.NotNull;

@FeatherSourceFile3(
   jj = FeatherSourceFile243.CUSTOM_CHAT,
   kl = @FeatherSourceFile414(
   jc = "feather.modulename.customchat",
   jl = "https://assets.feathercdn.net/game/mods/customchat.svg",
   od = "feather.moduledescription.customchat",
   wr = {FeatherSourceFile$lh3.HUD}
)
)
@FeatherSourceFile629(
   jt = {@FeatherSourceFile503(
   al = FeatherSourceFile$nc6.class
)},
   ms = FeatherSourceFile$lh87.ONLY_HUD_ELEMENT
)
public class FeatherSourceFile39 extends FeatherSourceFile360 {
   private static NetworkPlayerInfo FE;
   private static boolean FF = false;
   private final FeatherSourceFile663 rC;
   private final FeatherSourceFile730 FG;
   private final FeatherSourceFile143 lk;
   private final FeatherSourceFile55 kQ;
   private long FH;
   private final Minecraft minecraft;
   private final FeatherSourceFile88 FI;
   private final FeatherSourceFile434 xj;
   private List FJ;
   @NotNull
   private final @NotNull File FK;
   private final List cN = new Vector();
   private @Nullable FeatherSourceFile527 FL = null;
   public int FM = 0;
   public int FN = 0;

   public int cT() {
      return (int)Math.ceil(55.0 * Math.min(5.0 / (double)this.cN.stream().filter(FeatherSourceFile527::cy).count(), 1.0));
   }

   public int cU() {
      return 4;
   }

   @Inject
   FeatherSourceFile39(Minecraft var1, FeatherSourceFile434 var2, FeatherSourceFile88 var3, @NotNull @NotNull FeatherSourceFile730 var4, @NotNull @NotNull FeatherSourceFile55 var5, FeatherSourceFile143 var6, @FeatherSourceFile$xj15 Path var7, @NotNull @NotNull FeatherSourceFile663 var8) {
      this.minecraft = var1;
      this.kQ = var5;
      this.rC = var8;
      this.FI = var3;
      this.xj = var2;
      this.FH = 0L;
      this.lk = var6;
      this.FG = var4;
      this.FK = var7.resolve("chat_tabs.json").toFile();
   }

   public void ml() {
      if (this.FK.exists()) {
         try {
            List var1 = (List)FeatherSourceFile815.ux(this.FK).lh((new TypeToken() {
            }).getType());
            this.cN.clear();
            this.cN.addAll(var1);
            this.cY();
         } catch (Exception var2) {
         }
      }

      this.FG.ux(this.cN);
   }

   public void cV() {
      this.cY();
      this.FK.getParentFile().mkdirs();
      FeatherSourceFile815.ux(this.FK).wU().wz(this.cN);
   }

   public void ex() {
      this.rC.lh(new FeatherSourceFile494(this));
      this.cW();
      FeatherSourceFile645.ws.oe((var1) -> {
         if (!((FeatherSourceFile$lh14)this.fS).Gm) {
            return var1;
         } else {
            boolean var2 = this.FJ.stream().anyMatch((var1x) -> {
               String var2 = var1.func_150260_c();
               Matcher var3 = var1x.matcher(var2);
               return var3.find();
            });
            return var2 ? null : var1;
         }
      });
      this.kQ.lh(() -> {
         return ((FeatherSourceFile$lh14)this.fS).FZ;
      }, () -> {
         if (this.uj()) {
            if (this.minecraft.field_71439_g != null) {
               this.minecraft.func_147108_a(this.lk);
               this.FG.ux(this.cN);
               this.FG.dA();
            }
         }
      });
      FeatherSourceFile461.ws.oe((var1) -> {
         if (this.uj()) {
            if (var1.equals("chatTabs")) {
               this.minecraft.func_147108_a(this.lk);
               this.FG.ux(this.cN);
               this.FG.dA();
            }

         }
      });
      FeatherSourceFile555.ws.oe((var1, var2) -> {
         if (this.uj()) {
            if (var1 == this.minecraft.field_71439_g) {
               this.FG.ux(this.cN);
            }

         }
      });
   }

   public void pu() {
      this.cW();
   }

   private void cW() {
      if (((FeatherSourceFile$lh14)this.fS).Gm) {
         String[] var1 = new String[]{((FeatherSourceFile$lh14)this.fS).Gn, ((FeatherSourceFile$lh14)this.fS).Go, ((FeatherSourceFile$lh14)this.fS).Gp, ((FeatherSourceFile$lh14)this.fS).Gq, ((FeatherSourceFile$lh14)this.fS).Gr, ((FeatherSourceFile$lh14)this.fS).Gs, ((FeatherSourceFile$lh14)this.fS).Gt, ((FeatherSourceFile$lh14)this.fS).Gu};
         this.FJ = (List)Arrays.stream(var1).filter((var0) -> {
            return !var0.isEmpty();
         }).map((var0) -> {
            return Pattern.compile(Pattern.quote(var0), 2);
         }).collect(Collectors.toList());
      }

   }

   public @Nullable FeatherSourceFile527 cX() {
      return this.FL;
   }

   public List sc() {
      return this.cN;
   }

   public void cY() {
      this.cN.sort((var0, var1) -> {
         return Math.max(Math.min(var0.Fx - var1.Fx, 1), -1);
      });
   }

   public void lh(FeatherSourceFile527 var1) {
      this.cN.add(var1);
      this.cY();
      this.cV();
   }

   public void nc(FeatherSourceFile527 var1) {
      if (this.FL == var1) {
         this.xj((FeatherSourceFile527)null);
      }

      this.cN.remove(var1);
      this.cY();
      this.cV();
   }

   public @Nullable void xj(@Nullable FeatherSourceFile527 var1) {
      this.FL = var1;
   }

   public static NetworkPlayerInfo cZ() {
      if (FF) {
         FF = false;
         return null;
      } else {
         return FE;
      }
   }

   public static void lh(NetworkPlayerInfo var0, boolean var1) {
      FE = var0;
      if (var1) {
         FF = true;
      }
   }

   public void ou(double var1, double var3) {
      ((FeatherSourceFile$lh14)this.pr()).FS = (int)var1;
      ((FeatherSourceFile$lh14)this.pr()).FT = (int)var3;
   }

   public void pq(double var1, double var3) {
      if (((FeatherSourceFile$lh14)this.fS).Gf) {
         long var5 = System.currentTimeMillis();
         if (var5 - this.FH >= 300L) {
            if (FeatherSourceFile845.kx(0)) {
               String var7 = this.xj(var1, var3);
               if (var7 != null) {
                  this.FH = var5;
                  this.xj.oe(() -> {
                     String var2 = this.FI.jv(var7);
                     if (var2 != null) {
                        this.xj.xj(() -> {
                           FeatherSourceFile198.lh((EntityPlayerSP)Objects.requireNonNull(this.minecraft.field_71439_g), FeatherSourceFile37.lh("§a[Translated] §b" + var2));
                        });
                     }
                  });
               }
            }
         }
      }
   }

   public void as(double var1, double var3) {
      if (((FeatherSourceFile$lh14)this.fS).FY) {
         if (FeatherSourceFile845.kx(0)) {
            List var5 = (List)this.cN.stream().filter(FeatherSourceFile527::cy).collect(Collectors.toList());
            int var6 = this.cT();
            int var7 = this.cU();
            int var8 = 1 + var5.size();
            if (var8 > 1) {
               int var9 = 0;

               for(int var10 = 0; var10 < var8; ++var10) {
                  int var11 = var7 + var9 + 2;
                  int var12 = var6 + var9 + 2;
                  var9 += var7 + var6;
                  int var13 = this.FM;
                  int var14 = this.FN;
                  if (var1 >= (double)var11 && var1 <= (double)var12 && var3 >= (double)var13 && var3 <= (double)var14) {
                     if (var10 == 0) {
                        this.xj((FeatherSourceFile527)null);
                     } else {
                        this.xj((FeatherSourceFile527)var5.get(var10 - 1));
                     }
                     break;
                  }
               }
            }

         }
      }
   }

   private String xj(double var1, double var3) {
      GuiNewChat var5 = this.minecraft.field_71456_v.func_146158_b();
      byte var6 = 4;
      double var7 = var1 / FeatherSourceFile851.iN() - 4.0;
      double var9 = var3 / FeatherSourceFile851.iN() - 40.0;
      var7 = (double)MathHelper.func_76128_c(var7 / (double)var5.func_146244_h());
      int var11 = MathHelper.func_76123_f((float)var5.func_146228_f() / var5.func_146244_h()) + var6 + 4;
      int var12 = MathHelper.func_76123_f((float)var5.func_146228_f() / var5.func_146244_h()) + var6 + 55;
      if (!(var7 < (double)var11) && !(var7 > (double)var12)) {
         var9 = (double)MathHelper.func_76128_c(var9 / ((double)var5.func_146244_h() * (FeatherSourceFile93.ly().yl().td() + 1.0)));
         int var13 = (int)(var9 / 9.0 + (double)((net.digitalingot.feather.mixin.core.FeatherSourceFile4)var5).getChatScrollbarPos());
         int var14 = 0;
         if (var13 < FeatherSourceFile506.lh(var5).size() && var13 >= 0) {
            int var15 = 0;
            List var16 = ((net.digitalingot.feather.mixin.core.FeatherSourceFile4)var5).getAllMessages();

            IChatComponent var17;
            for(var17 = null; var15 < var16.size(); ++var15) {
               var17 = ((ChatLine)var16.get(var15)).func_151461_a();
               if (((FeatherSourceFile$lh14)this.fS).Gb) {
                  int var18 = MathHelper.func_76128_c((double)((float)var5.func_146228_f() - 10.0F) / (double)var5.func_146244_h());
                  int var19 = GuiUtilRenderComponents.func_178908_a(var17, var18, this.minecraft.field_71466_p, false, false).size();
                  if (var14 + var19 < FeatherSourceFile506.lh(var5).size() && ((FeatherSourceFile539)FeatherSourceFile506.lh(var5).get(var14 + var19 - 1)).feather$getPlayerInfo() != null) {
                     var13 -= var19;
                     var14 += var19;
                  } else {
                     int var20 = MathHelper.func_76128_c((double)var5.func_146228_f() / (double)var5.func_146244_h());
                     int var21 = GuiUtilRenderComponents.func_178908_a(var17, var20, this.minecraft.field_71466_p, false, false).size();
                     var13 -= var21;
                     var14 += var21;
                  }
               }

               if (var13 < 0) {
                  break;
               }
            }

            return var17 == null ? null : FeatherSourceFile341.px(var17.func_150260_c());
         } else {
            return null;
         }
      } else {
         return null;
      }
   }

   // $FF: synthetic method
   static FeatherSourceFile136 lh(FeatherSourceFile39 var0) {
      return var0.fS;
   }

   // $FF: synthetic method
   static FeatherSourceFile136 nc(FeatherSourceFile39 var0) {
      return var0.fS;
   }

   // $FF: synthetic method
   static FeatherSourceFile136 xj(FeatherSourceFile39 var0) {
      return var0.fS;
   }
}
