package net.digitalingot.feather;

import com.google.common.collect.Sets;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.Map.Entry;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import net.digitalingot.vendor.com.google.inject.Singleton;
import net.digitalingot.vendor.javax.inject.Inject;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.client.gui.ChatLine;
import net.minecraft.client.gui.GuiNewChat;
import net.minecraft.client.gui.GuiUtilRenderComponents;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.ChatComponentTranslation;
import net.minecraft.util.ChatStyle;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.IChatComponent;
import net.minecraft.util.MathHelper;

@Singleton
@FeatherSourceFile3(
   jj = FeatherSourceFile243.CHAT_OPTIONS,
   kl = @FeatherSourceFile414(
   jc = "feather.modulename.chatoptions",
   jl = "https://assets.feathercdn.net/game/sidebar/chat.svg",
   od = "feather.moduledescription.chatoptions",
   wr = {},
   ds = @FeatherSourceFile$lh55(
   jc = "Chat",
   jm = @FeatherSourceFile655(
   kz = 1
)
)
)
)
public final class FeatherSourceFile606 extends FeatherSourceFile495 {
   private final Minecraft minecraft;
   private final FeatherSourceFile55 kQ;
   private final Map rL = new LinkedHashMap(5);
   private final Set rM = Sets.newHashSet(new String[]{"-----------------------------------------------------"});
   private final Pattern[] rN = new Pattern[4];
   private final String[] rO = new String[4];
   private String rP;
   private long rQ;
   private static final FeatherSourceFile465 FEATHER$CUSTOM_CHAT_PROVIDER = FeatherSourceFile665.nc(FeatherSourceFile39.class);

   @Inject
   FeatherSourceFile606(Minecraft var1, FeatherSourceFile55 var2) {
      this.minecraft = var1;
      this.kQ = var2;
   }

   public void ex() {
      FeatherSourceFile45.yr();
      this.dr();
      FeatherSourceFile645.ws.oe(this::xj);
      FeatherSourceFile516.ws.oe((var1) -> {
         this.rP = var1.toLowerCase(Locale.ROOT);
         return var1;
      });
      FeatherSourceFile725.wi.oe((var1, var2) -> {
         this.rL.clear();
      });
      this.id();
   }

   public void pu() {
      this.dr();
   }

   private void id() {
      this.kQ.lh(() -> {
         return ((FeatherSourceFile$lh66)this.fS).rS;
      }, () -> {
         if (this.minecraft.field_71462_r == null) {
            ((FeatherSourceFile$lh66)this.fS).rT = !((FeatherSourceFile$lh66)this.fS).rT;
         }
      });
   }

   public void nc(double var1, double var3) {
      long var5 = System.currentTimeMillis();
      if (var5 - this.rQ >= 300L) {
         if (((FeatherSourceFile$lh66)this.fS).rV.eb()) {
            String var7 = this.xj(var1, var3);
            if (var7 != null) {
               this.rQ = var5;
               FeatherSourceFile198.lh((EntityPlayerSP)Objects.requireNonNull(this.minecraft.field_71439_g), FeatherSourceFile37.lh("feather.chat.copy"));
               FeatherSourceFile844.ik(var7);
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
      byte var11 = 0;
      int var12 = MathHelper.func_76123_f((float)var5.func_146228_f() / var5.func_146244_h()) + var6;
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
               int var18;
               if (((FeatherSourceFile39)FEATHER$CUSTOM_CHAT_PROVIDER.ag()).uj() && ((FeatherSourceFile$lh14)((FeatherSourceFile39)FEATHER$CUSTOM_CHAT_PROVIDER.ag()).pr()).Gb) {
                  var18 = MathHelper.func_76128_c((double)((float)var5.func_146228_f() - 10.0F) / (double)var5.func_146244_h());
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
               } else {
                  var18 = GuiUtilRenderComponents.func_178908_a(var17, MathHelper.func_76141_d((float)var5.func_146228_f() / var5.func_146244_h()), this.minecraft.field_71466_p, false, false).size();
                  var13 -= var18;
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

   private void dr() {
      String var1 = this.minecraft.func_110432_I().func_111285_a();
      this.rN[0] = Pattern.compile(var1, 2);
      this.rO[0] = this.cc(var1);
      if (((FeatherSourceFile$lh66)this.fS).sG) {
         String[] var2 = new String[]{((FeatherSourceFile$lh66)this.fS).sH, ((FeatherSourceFile$lh66)this.fS).sI, ((FeatherSourceFile$lh66)this.fS).sJ};

         for(int var3 = 0; var3 < 3; ++var3) {
            this.rN[var3 + 1] = var2[var3].isEmpty() ? null : Pattern.compile(Pattern.quote(var2[var3]), 2);
            this.rO[var3 + 1] = var2[var3].isEmpty() ? null : this.cc(var2[var3]);
         }
      }

   }

   private String cc(String var1) {
      StringBuilder var2 = new StringBuilder();
      var2.append(EnumChatFormatting.RESET);
      var2.append(((FeatherSourceFile$lh66)this.fS).sB.toString);
      if (((FeatherSourceFile$lh66)this.fS).sC) {
         var2.append(EnumChatFormatting.BOLD);
      }

      var2.append(var1);
      var2.append(EnumChatFormatting.RESET);
      return var2.toString();
   }

   private IChatComponent xj(IChatComponent var1) {
      String var2 = var1.func_150260_c();
      if (((FeatherSourceFile$lh66)this.fS).sA && (((FeatherSourceFile$lh66)this.fS).sD || this.rP == null || !FeatherSourceFile341.px(var2).toLowerCase(Locale.ROOT).contains(this.rP)) && this.oe(var1) && ((FeatherSourceFile$lh66)this.fS).sE) {
         this.wl();
      }

      if (((FeatherSourceFile$lh66)this.fS).rX) {
         if (var2.trim().isEmpty() || this.rM.contains(var2)) {
            return var1;
         }

         if (this.rL.size() > (((FeatherSourceFile$lh66)this.fS).rY ? 1 : 5)) {
            Iterator var3 = this.rL.entrySet().iterator();
            var3.next();
            var3.remove();
         }

         int var8 = this.rL.size();
         int var4 = -1;
         Iterator var5 = this.rL.entrySet().iterator();

         while(var5.hasNext()) {
            Entry var6 = (Entry)var5.next();
            --var8;
            String var7 = (String)var6.getKey();
            if (var7.equals(var2)) {
               var4 = (Integer)var6.getValue();
               break;
            }
         }

         if (var4 != -1 && this.ww()) {
            this.rt(var8);
            this.nc(var1, var4 + 1);
            this.rL.remove(var2);
            this.rL.put(var2, var4 + 1);
            if (var1 instanceof FeatherSourceFile581) {
               ((FeatherSourceFile581)var1).feather$setDuplicateMessage(true);
            }
         } else {
            this.rL.put(var2, 1);
         }
      }

      return var1;
   }

   private void wl() {
      FeatherSourceFile395.lh("random.orb", (float)((FeatherSourceFile$lh66)this.fS).sF / 100.0F);
   }

   private boolean oe(IChatComponent var1) {
      boolean var2 = false;
      ChatStyle var3 = var1.func_150256_b();
      if (var1 instanceof ChatComponentText) {
         String var4 = ((ChatComponentText)var1).func_150265_g();
         String var5 = this.lh(var4, var3);
         if (var5 != null) {
            ((net.digitalingot.feather.mixin.core.FeatherSourceFile1)var1).setText(var5);
            return true;
         }
      } else if (var1 instanceof ChatComponentTranslation) {
         Object[] var8 = ((ChatComponentTranslation)var1).func_150271_j();

         for(int var10 = 0; var10 < var8.length; ++var10) {
            Object var6 = var8[var10];
            if (var6 != var1) {
               if (var6 instanceof IChatComponent) {
                  var2 |= this.oe((IChatComponent)var6);
               } else if (var6 instanceof String) {
                  String var7 = this.lh((String)var6, var3);
                  if (var7 != null) {
                     var8[var10] = var7;
                     var2 = true;
                  }
               }
            }
         }

         if (var2) {
            ((net.digitalingot.feather.mixin.core.FeatherSourceFile11)var1).setLastUpdate(-1L);
         }
      }

      Iterator var9 = var1.func_150253_a().iterator();

      while(var9.hasNext()) {
         IChatComponent var11 = (IChatComponent)var9.next();
         if (var11 != var1) {
            var2 |= this.oe(var11);
         }
      }

      return var2;
   }

   private String lh(String var1, ChatStyle var2) {
      Matcher var3 = null;
      String var4 = null;
      boolean var5 = false;
      int var6 = 0;

      do {
         if (this.rN[var6] != null) {
            Matcher var7 = this.rN[var6].matcher(var1);
            boolean var8 = var7.find();
            if (var8) {
               var5 = true;
               var3 = var7;
               var4 = this.rO[var6];
               break;
            }
         }

         ++var6;
      } while(((FeatherSourceFile$lh66)this.fS).sG && var6 < 4);

      if (!var5) {
         return null;
      } else {
         FeatherSourceFile$lh76 var11 = FeatherSourceFile237.tq(var1);
         StringBuffer var12 = new StringBuffer();

         do {
            FeatherSourceFile$nc32 var9 = var11.fw(var3.end());
            String var10 = var9.yH();
            if (!var9.yI() && var2.func_150215_a() != null) {
               var10 = var10 + var2.func_150215_a().toString();
            }

            var3.appendReplacement(var12, var4 + var10);
            var5 = var3.find();
         } while(var5);

         var3.appendTail(var12);
         return var12.toString();
      }
   }

   private void rt(int var1) {
      GuiNewChat var2 = this.minecraft.field_71456_v.func_146158_b();
      int var3 = 0;
      int var4 = 0;

      for(int var5 = 0; var5 <= var1; ++var5) {
         var4 = GuiUtilRenderComponents.func_178908_a(((ChatLine)((net.digitalingot.feather.mixin.core.FeatherSourceFile4)var2).getAllMessages().get(var5)).func_151461_a(), MathHelper.func_76141_d((float)var2.func_146228_f() / var2.func_146244_h()), this.minecraft.field_71466_p, false, false).size();
         var3 += var4;
      }

      ((net.digitalingot.feather.mixin.core.FeatherSourceFile4)var2).getAllMessages().remove(var1);
      ((net.digitalingot.feather.mixin.core.FeatherSourceFile4)var2).getTrimmedMessages().subList(var3 - var4, var3).clear();
   }

   private boolean ww() {
      return !((net.digitalingot.feather.mixin.core.FeatherSourceFile4)this.minecraft.field_71456_v.func_146158_b()).getAllMessages().isEmpty();
   }

   private void nc(IChatComponent var1, int var2) {
      var1.func_150258_a(" [" + var2 + "]");
   }
}
