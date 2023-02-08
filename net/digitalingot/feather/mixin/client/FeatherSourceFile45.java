package net.digitalingot.feather.mixin.client;

import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Vector;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import net.digitalingot.feather.FeatherSourceFile$lh14;
import net.digitalingot.feather.FeatherSourceFile$lh66;
import net.digitalingot.feather.FeatherSourceFile443;
import net.digitalingot.feather.FeatherSourceFile465;
import net.digitalingot.feather.FeatherSourceFile506;
import net.digitalingot.feather.FeatherSourceFile527;
import net.digitalingot.feather.FeatherSourceFile539;
import net.digitalingot.feather.FeatherSourceFile581;
import net.digitalingot.feather.FeatherSourceFile606;
import net.digitalingot.feather.FeatherSourceFile665;
import net.digitalingot.feather.FeatherSourceFile843;
import net.digitalingot.feather.FeatherSourceFile851;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.ChatLine;
import net.minecraft.client.gui.Gui;
import net.minecraft.client.gui.GuiNewChat;
import net.minecraft.client.gui.GuiUtilRenderComponents;
import net.minecraft.client.network.NetHandlerPlayClient;
import net.minecraft.client.network.NetworkPlayerInfo;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.entity.player.EntityPlayer.EnumChatVisibility;
import net.minecraft.util.IChatComponent;
import net.minecraft.util.MathHelper;
import net.minecraft.util.ResourceLocation;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyConstant;
import org.spongepowered.asm.mixin.injection.ModifyVariable;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({GuiNewChat.class})
public abstract class FeatherSourceFile45 extends Gui implements FeatherSourceFile506 {
   @Unique
   private static final FeatherSourceFile465 Vv = FeatherSourceFile665.nc(FeatherSourceFile606.class);
   private static final FeatherSourceFile465 FEATHER$CUSTOM_CHAT_PROVIDER = FeatherSourceFile665.nc(net.digitalingot.feather.FeatherSourceFile39.class);
   private final Map Vw = new HashMap();
   private static final Pattern Vx = Pattern.compile("(§.)|\\W");
   private final Map Vy = new HashMap();
   @Unique
   private static long Vz = -1L;
   @Unique
   private static float VA = 0.0F;
   @Shadow
   @Final
   private Minecraft field_146247_f;
   @Shadow
   @Final
   private List field_146253_i;
   @Shadow
   private int field_146250_j;
   @Shadow
   private boolean field_146251_k;
   @Shadow
   @Final
   private List field_146252_h;
   private List VB = new Vector();

   @Shadow
   public abstract int func_146232_i();

   @Shadow
   public abstract boolean func_146241_e();

   @Shadow
   public abstract float func_146244_h();

   @Shadow
   public abstract int func_146228_f();

   @Shadow
   public abstract void func_146229_b(int var1);

   public List oe(FeatherSourceFile527 var1) {
      if (this.Vy.containsKey(var1)) {
         return (List)this.Vy.get(var1);
      } else {
         Vector var2 = new Vector();
         this.Vy.put(var1, var2);
         return var2;
      }
   }

   public List getUsedTrimmedMessages() {
      net.digitalingot.feather.FeatherSourceFile39 var1 = (net.digitalingot.feather.FeatherSourceFile39)FEATHER$CUSTOM_CHAT_PROVIDER.ag();
      FeatherSourceFile$lh14 var2 = (FeatherSourceFile$lh14)var1.pr();
      List var3 = this.field_146253_i;
      FeatherSourceFile527 var4 = var1.cX();
      if (var4 != null && var2.FY) {
         var3 = this.oe(var4);
      }

      return var3;
   }

   private void Al() {
      net.digitalingot.feather.FeatherSourceFile39 var1 = (net.digitalingot.feather.FeatherSourceFile39)FEATHER$CUSTOM_CHAT_PROVIDER.ag();
      FeatherSourceFile$lh66 var2 = (FeatherSourceFile$lh66)((FeatherSourceFile606)Vv.ag()).pr();
      FeatherSourceFile$lh14 var3 = (FeatherSourceFile$lh14)var1.pr();
      int var4 = var2.hH.getRGB();
      double var5 = (double)(var4 >> 24 & 255) / 255.0;
      int var7 = this.field_146247_f.field_71466_p.field_78288_b;
      byte var8 = 0;
      FeatherSourceFile527 var9 = var1.cX();
      List var10 = (List)var1.sc().stream().filter(FeatherSourceFile527::cy).collect(Collectors.toList());
      if (var10.size() > 0) {
         int var11 = var1.cU();
         String var12 = net.digitalingot.feather.FeatherSourceFile37.nc("feather.modules.customchat.allTab");
         int var13 = var1.cT();
         int var14 = 0;
         int var15 = var8 + (int)Math.floor((double)var7 / 2.0);
         int var16 = var8 + var7 + (int)Math.floor((double)var7 / 2.0);
         var15 += var7;
         var16 += var7;
         var1.FM = var15;
         var1.FN = var16;
         var1.FM += var7 + (int)Math.floor((double)var7 / 2.0);
         var1.FN += var7 + (int)Math.floor((double)var7 / 2.0);
         int var17 = var7 + 2 * var7;
         func_73734_a(var11, var16, var13, var15, var4 & 16777215 | (int)(255.0 * var5) << 24);
         if (var9 == null) {
            func_73734_a(var11, var16, var13, var16 - 1, -1);
         }

         GlStateManager.func_179094_E();
         int var18 = (int)Math.ceil((double)this.field_146247_f.field_71466_p.func_78256_a(var12) / 2.0) - (int)Math.floor((double)this.field_146247_f.field_71466_p.func_78256_a(var12.substring(0, 1)) / 2.0);
         float var19 = (float)Math.min((var13 - 2) / var18, 1);
         GlStateManager.func_179152_a(0.5F * var19, 0.5F * var19, 1.0F);
         this.field_146247_f.field_71466_p.func_78276_b(var12, 4 + var13 - var18, (int)Math.ceil((double)var8 * 2.0 / (double)var19) + (int)Math.ceil((double)var17 / (double)var19) + (int)Math.ceil((double)this.field_146247_f.field_71466_p.field_78288_b / 2.0 * (double)var19), -1);
         GlStateManager.func_179121_F();
         var14 += var11 + var13;

         for(Iterator var20 = var10.iterator(); var20.hasNext(); var14 += var11 + var13) {
            FeatherSourceFile527 var21 = (FeatherSourceFile527)var20.next();
            func_73734_a(var11 + var14, var16, var13 + var14, var15, var4 & 16777215 | (int)(255.0 * var5) << 24);
            if (var21 == var9) {
               func_73734_a(var11 + var14, var16, var13 + var14, var16 - 1, -1);
            }

            GlStateManager.func_179094_E();
            String var22 = var21.getName();
            if (var22.isEmpty()) {
               var22 = net.digitalingot.feather.FeatherSourceFile37.nc("feather.modules.customchat.newTab");
            }

            int var23 = (int)Math.floor((double)this.field_146247_f.field_71466_p.func_78256_a(var22) / 2.0) - (int)Math.floor((double)this.field_146247_f.field_71466_p.func_78256_a(var22.substring(0, 1)) / 2.0);
            float var24 = Math.min((float)(var13 - 2) / (float)var23, 1.0F);
            GlStateManager.func_179152_a(0.5F * var24, 0.5F * var24, 1.0F);
            this.field_146247_f.field_71466_p.func_78276_b(var22, (int)Math.ceil((double)var14 * (2.0 / (double)var24)) + (int)Math.ceil((double)var13 / (double)var24) + 4 - var23, (int)Math.ceil((double)var8 * 2.0 / (double)var24) + (int)Math.ceil((double)var17 / (double)var24) + (int)Math.ceil((double)this.field_146247_f.field_71466_p.field_78288_b / (2.0 * (double)var24)), -1);
            GlStateManager.func_179121_F();
         }
      }

   }

   @Inject(
      method = {"drawChat"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void lh(int var1, CallbackInfo var2) {
      var2.cancel();
      net.digitalingot.feather.FeatherSourceFile39 var3 = (net.digitalingot.feather.FeatherSourceFile39)FEATHER$CUSTOM_CHAT_PROVIDER.ag();
      FeatherSourceFile$lh14 var4 = (FeatherSourceFile$lh14)var3.pr();
      FeatherSourceFile$lh66 var5 = (FeatherSourceFile$lh66)((FeatherSourceFile606)FeatherSourceFile665.nc(FeatherSourceFile606.class).ag()).pr();
      if (var4.yT.gF && !this.func_146241_e()) {
         GlStateManager.func_179137_b((double)var4.FQ, (double)(-var4.FR), 0.0);
      }

      if (this.field_146247_f.field_71474_y.field_74343_n != EnumChatVisibility.HIDDEN && !var5.rT) {
         boolean var30 = this.func_146241_e();
         if (var4.FY && var30) {
            if (this.field_146253_i.isEmpty()) {
               this.Vy.clear();
            }

            this.Al();
         }

         List var7 = this.field_146253_i;
         FeatherSourceFile527 var8 = var3.cX();
         if (var8 != null && var4.FY) {
            var7 = this.oe(var8);
         }

         int var9 = var7.size();
         if (var9 > 0) {
            int var10 = this.func_146232_i();
            float var11 = this.func_146244_h();
            int var12 = MathHelper.func_76123_f((float)this.func_146228_f() / var11);
            GlStateManager.func_179094_E();
            if (!var30 && var4.FV) {
               lh(var4);
               float var13 = (8.0F - 8.0F * VA) * var11;
               GlStateManager.func_179109_b(4.0F, 8.0F + var13, 0.0F);
            } else {
               GlStateManager.func_179109_b(4.0F, 8.0F, 0.0F);
            }

            GlStateManager.func_179152_a(var11, var11, 1.0F);
            int var31 = var5.hH.getRGB();
            double var14 = (double)(var31 >> 24 & 255) / 255.0;
            float var16 = this.field_146247_f.field_71474_y.field_74357_r * 0.9F + 0.1F;
            int var17 = this.field_146247_f.field_71466_p.field_78288_b;
            int var18 = 0;
            int var19;
            if (var30 && var4.Gf) {
               var19 = this.rt((float)var4.FT);
               if (var19 > 0 && var19 < var10) {
                  var19 *= 9;
                  func_73734_a(var12 + 4 + 5, -var19 + var17, var12 + 4 + 55, -var19, var31 & 16777215 | (int)(255.0 * var14) << 24);
                  if (var5.hR) {
                     this.field_146247_f.field_71466_p.func_175063_a("Translate", (float)var12 + 4.0F + 5.0F, -((float)var19), -1);
                  } else {
                     this.field_146247_f.field_71466_p.func_78276_b("Translate", var12 + 4 + 5, var19, -1);
                  }
               }
            }

            int var21;
            int var24;
            for(var19 = 0; var19 + this.field_146250_j < var7.size() && var19 < var10; ++var19) {
               ChatLine var20 = (ChatLine)var7.get(var19 + this.field_146250_j);
               if (var20 != null) {
                  var21 = var1 - var20.func_74540_b();
                  if (var21 >= 200 && !var30) {
                     break;
                  }

                  double var22 = var30 ? 1.0 : vv(var21);
                  var24 = (int)(255.0 * var22 * (double)var16);
                  int var25 = (int)(255.0 * var22 * var14);
                  ++var18;
                  if (var24 <= 3) {
                     break;
                  }

                  int var26 = (int)((double)(-var19) * (double)var17);
                  if (var19 == 0 && !var30 && var4.FV) {
                     var24 = (int)(VA * (float)(var24 & 255));
                     var25 = (int)(VA * (float)(var25 & 255));
                  }

                  int var27 = 4;
                  if (var4.Gb) {
                     var27 += 16;
                  }

                  if (var25 > 3) {
                     int var28 = var31 & 16777215 | var25 << 24;
                     func_73734_a(-4, var26 - var17, var12 + var27, var26, var28);
                  }

                  GlStateManager.func_179147_l();
                  GlStateManager.func_179131_c(1.0F, 1.0F, 1.0F, (float)((var24 + 256) % 256) / 255.0F);
                  String var34 = var20.func_151461_a().func_150254_d();
                  NetworkPlayerInfo var29 = ((FeatherSourceFile539)var20).feather$getPlayerInfo();
                  if (var4.enabled && var4.Gb) {
                     this.lh(var29, var26);
                  }

                  if (var5.hR) {
                     this.field_146247_f.field_71466_p.func_175063_a(var34, (var29 != null || var4.Gd) && var4.enabled && var4.Gb ? 10.0F : 0.0F, (float)var26 - 8.0F, 16777215 + (var24 << 24));
                  } else {
                     this.field_146247_f.field_71466_p.func_78276_b(var34, (var29 != null || var4.Gd) && var4.enabled && var4.Gb ? 10 : 0, var26 - 8, 16777215 + (var24 << 24));
                  }

                  GlStateManager.func_179118_c();
                  GlStateManager.func_179084_k();
               }
            }

            if (var30) {
               var19 = var9 * var17;
               int var32 = var18 * var17;
               if (var19 != var32) {
                  var21 = this.field_146250_j * var32 / var9;
                  int var33 = var32 * var32 / var19;
                  int var23 = var21 > 0 ? 170 : 96;
                  var24 = this.field_146251_k ? 13382451 : 3355562;
                  GlStateManager.func_179109_b(-4.0F, 0.0F, 0.0F);
                  if (var4.Gb) {
                     GlStateManager.func_179109_b(-16.0F, 0.0F, 0.0F);
                  }

                  func_73734_a(0, -var21, 2, -var21 - var33, var24 + (var23 << 24));
                  func_73734_a(2, -var21, 1, -var21 - var33, 13421772 + (var23 << 24));
               }
            }

            GlStateManager.func_179121_F();
         }
      } else if (var5.rT) {
         if (this.func_146241_e()) {
            String var6 = ((FeatherSourceFile$lh66)((FeatherSourceFile606)Vv.ag()).pr()).rS.va().length < 1 ? "Warning: Chat is hidden. Bind a key under Chat Options to enable." : "Warning: Chat is hidden. Press \"" + ((FeatherSourceFile$lh66)((FeatherSourceFile606)Vv.ag()).pr()).rS.getName() + "\" to enable.";
            this.field_146247_f.field_71466_p.func_175063_a(var6, 0.0F, 1.0F, -30584);
         }

      }
   }

   @Inject(
      method = {"printChatMessage(Lnet/minecraft/util/IChatComponent;)V"},
      at = {@At("HEAD")},
      allow = 1
   )
   private void lh(IChatComponent var1, CallbackInfo var2) {
      FeatherSourceFile$lh14 var3 = (FeatherSourceFile$lh14)((net.digitalingot.feather.FeatherSourceFile39)FEATHER$CUSTOM_CHAT_PROVIDER.ag()).pr();
      if (var3.FV && (!(var1 instanceof FeatherSourceFile581) || !((FeatherSourceFile581)var1).feather$isDuplicateMessage())) {
         VA = 0.0F;
      }

   }

   @Inject(
      method = {"printChatMessageWithOptionalDeletion"},
      at = {@At("HEAD")}
   )
   private void lh(IChatComponent var1, int var2, CallbackInfo var3) {
      this.VB = new Vector(this.field_146253_i);
   }

   @Inject(
      method = {"printChatMessageWithOptionalDeletion"},
      at = {@At("RETURN")}
   )
   private void nc(IChatComponent var1, int var2, CallbackInfo var3) {
      net.digitalingot.feather.FeatherSourceFile39 var4 = (net.digitalingot.feather.FeatherSourceFile39)FEATHER$CUSTOM_CHAT_PROVIDER.ag();
      Iterator var5 = var4.sc().iterator();

      while(var5.hasNext()) {
         FeatherSourceFile527 var6 = (FeatherSourceFile527)var5.next();
         List var7 = this.oe(var6);
         if (var6.tm(var1.func_150260_c())) {
            var7.addAll(0, (Collection)this.field_146253_i.stream().filter((var1x) -> {
               return !this.VB.contains(var1x);
            }).collect(Collectors.toList()));
            if (var7.size() > 100) {
               var7.subList(99, var7.size()).clear();
            }
         }
      }

   }

   @ModifyConstant(
      method = {"setChatLine"},
      constant = {@Constant(
   intValue = 100
)},
      allow = 2
   )
   private int sd(int var1) {
      FeatherSourceFile606 var2 = (FeatherSourceFile606)Vv.ag();
      return ((FeatherSourceFile$lh66)var2.pr()).rU ? 100000 : var1;
   }

   @Unique
   private static void lh(FeatherSourceFile$lh14 var0) {
      if (Vz == -1L) {
         Vz = System.currentTimeMillis();
      }

      long var1 = System.currentTimeMillis() - Vz;
      if (VA < 1.0F) {
         VA += (float)var1 / (float)var0.FW;
         if (VA > 1.0F) {
            VA = 1.0F;
         }
      }

      Vz = System.currentTimeMillis();
   }

   @Unique
   private static double vv(int var0) {
      double var1 = (double)var0 / 200.0;
      var1 = 1.0 - var1;
      var1 *= 10.0;
      var1 = MathHelper.func_151237_a(var1, 0.0, 1.0);
      var1 *= var1;
      return var1;
   }

   @Redirect(
      method = {"getChatComponent"},
      at = @At(
   value = "INVOKE",
   target = "Ljava/util/List;size()I"
)
   )
   private int oy(List var1) {
      List var2 = var1;
      net.digitalingot.feather.FeatherSourceFile39 var3 = (net.digitalingot.feather.FeatherSourceFile39)FEATHER$CUSTOM_CHAT_PROVIDER.ag();
      FeatherSourceFile527 var4 = var3.cX();
      if (var4 != null && ((FeatherSourceFile$lh14)var3.pr()).FY) {
         var2 = this.oe(var4);
      }

      return var2.size();
   }

   @Redirect(
      method = {"getChatComponent"},
      at = @At(
   value = "INVOKE",
   target = "Ljava/util/List;get(I)Ljava/lang/Object;"
)
   )
   private Object lh(List var1, int var2) {
      List var3 = var1;
      net.digitalingot.feather.FeatherSourceFile39 var4 = (net.digitalingot.feather.FeatherSourceFile39)FEATHER$CUSTOM_CHAT_PROVIDER.ag();
      FeatherSourceFile527 var5 = var4.cX();
      if (var5 != null && ((FeatherSourceFile$lh14)var4.pr()).FY) {
         var3 = this.oe(var5);
      }

      return var3.get(var2);
   }

   @ModifyConstant(
      method = {"getChatComponent"},
      constant = {@Constant(
   intValue = 3,
   ordinal = 0
)},
      allow = 1
   )
   private int ys(int var1) {
      return 4;
   }

   @ModifyConstant(
      method = {"getChatComponent"},
      constant = {@Constant(
   intValue = 27,
   ordinal = 0
)},
      allow = 1
   )
   private int aq(int var1) {
      return 40;
   }

   @Inject(
      method = {"printChatMessage(Lnet/minecraft/util/IChatComponent;)V"},
      at = {@At("HEAD")}
   )
   private void nc(IChatComponent var1, CallbackInfo var2) {
      FeatherSourceFile$lh14 var3 = (FeatherSourceFile$lh14)((net.digitalingot.feather.FeatherSourceFile39)FEATHER$CUSTOM_CHAT_PROVIDER.ag()).pr();
      if (var3.Gb) {
         net.digitalingot.feather.FeatherSourceFile39.lh(this.pq(var1), false);
      }

   }

   @Unique
   private NetworkPlayerInfo pq(IChatComponent var1) {
      NetHandlerPlayClient var2 = Minecraft.func_71410_x().func_147114_u();
      NetworkPlayerInfo var3 = null;
      if (var2 == null) {
         return null;
      } else {
         String[] var4 = Vx.split(var1.func_150254_d());
         int var5 = var4.length;

         for(int var6 = 0; var6 < var5; ++var6) {
            String var7 = var4[var6];
            if (!var7.isEmpty()) {
               NetworkPlayerInfo var8 = var2.func_175104_a(var7);
               if (var8 != null) {
                  var3 = var8;
                  break;
               }

               var8 = this.lh(var7, var2);
               if (var8 != null) {
                  var3 = var8;
                  break;
               }
            }
         }

         return var3;
      }
   }

   @Unique
   private NetworkPlayerInfo lh(String var1, NetHandlerPlayClient var2) {
      NetworkPlayerInfo var3 = null;
      if (!this.Vw.isEmpty()) {
         var3 = (NetworkPlayerInfo)this.Vw.get(var1);
      }

      if (var3 == null) {
         Iterator var4 = var2.func_175106_d().iterator();

         while(var4.hasNext()) {
            NetworkPlayerInfo var5 = (NetworkPlayerInfo)var4.next();
            IChatComponent var6 = var5.func_178854_k();
            if (var6 != null) {
               String var7 = var6.func_150254_d();
               if (var1.equals(var7)) {
                  return var5;
               }

               this.Vw.put(var7, var5);
            }
         }
      }

      return var3;
   }

   @Unique
   private void lh(NetworkPlayerInfo var1, int var2) {
      FeatherSourceFile$lh14 var3 = (FeatherSourceFile$lh14)((net.digitalingot.feather.FeatherSourceFile39)FEATHER$CUSTOM_CHAT_PROVIDER.ag()).pr();
      if (var1 != null) {
         if (var3.Gc) {
            byte var4 = 32;
            float var5 = 4.0F;
            FeatherSourceFile843.hM();
            FeatherSourceFile443 var6 = FeatherSourceFile443.RM;
            ResourceLocation var7 = var1.func_178837_g();
            Minecraft.func_71410_x().func_110434_K().func_110577_a(var7);
            var6.nc(6, DefaultVertexFormats.field_181707_g);
            float var8 = 0.1875F;
            float var9 = 0.1875F;
            float var10 = 0.0625F;

            float var16;
            float var17;
            float var18;
            float var19;
            float var20;
            float var21;
            for(int var11 = 0; var11 <= var4; ++var11) {
               double var12 = (double)((float)var11 * 360.0F / (float)var4) * Math.PI / 180.0;
               float var14 = (float)Math.cos(var12);
               float var15 = (float)Math.sin(var12);
               var16 = 4.0F + var14 * 4.0F;
               var17 = 4.0F + var15 * 4.0F;
               var18 = var10 * var14;
               var19 = var10 * var15;
               var20 = var8 + var18;
               var21 = var9 + var19;
               var6.as(var16, var17 + (float)var2 - 8.0F, 0.0F).ou(var20, var21).xZ();
            }

            var6.lx();
            float var24 = 0.6875F;
            float var25 = 0.1875F;
            var6.nc(6, DefaultVertexFormats.field_181707_g);

            for(int var13 = 0; var13 <= var4; ++var13) {
               double var26 = (double)((float)var13 * 360.0F / (float)var4) * Math.PI / 180.0;
               var16 = (float)Math.cos(var26);
               var17 = (float)Math.sin(var26);
               var18 = 4.0F + var16 * 4.0F;
               var19 = 4.0F + var17 * 4.0F;
               var20 = var10 * var16;
               var21 = var10 * var17;
               float var22 = var24 + var20;
               float var23 = var25 + var21;
               var6.as(var18, var19 + (float)var2 - 8.0F, 0.0F).ou(var22, var23).xZ();
            }

            var6.lx();
         } else {
            Minecraft.func_71410_x().func_110434_K().func_110577_a(var1.func_178837_g());
            Gui.func_152125_a(0, var2 - 8, 8.0F, 8.0F, 8, 8, 8, 8, 64.0F, 64.0F);
            Gui.func_152125_a(0, var2 - 8, 40.0F, 8.0F, 8, 8, 8, 8, 64.0F, 64.0F);
         }
      }

   }

   @ModifyVariable(
      method = {"printChatMessageWithOptionalDeletion"},
      at = @At("LOAD"),
      index = 1,
      argsOnly = true
   )
   private IChatComponent as(IChatComponent var1) {
      FeatherSourceFile$lh14 var2 = (FeatherSourceFile$lh14)((net.digitalingot.feather.FeatherSourceFile39)FEATHER$CUSTOM_CHAT_PROVIDER.ag()).pr();
      if (var2.Gi && !var1.toString().trim().isEmpty()) {
         SimpleDateFormat var3 = new SimpleDateFormat(var2.Gj.pattern);
         String var4 = var3.format(new Date());
         return net.digitalingot.feather.FeatherSourceFile37.lh(var2.Gk.toString + "[" + var4 + "] ").func_150257_a(var1);
      } else {
         return var1;
      }
   }

   private int rt(float var1) {
      net.digitalingot.feather.FeatherSourceFile39 var2 = (net.digitalingot.feather.FeatherSourceFile39)FEATHER$CUSTOM_CHAT_PROVIDER.ag();
      FeatherSourceFile$lh14 var3 = (FeatherSourceFile$lh14)var2.pr();
      double var4 = (double)var1 / FeatherSourceFile851.iN() - 40.0;
      var4 = (double)MathHelper.func_76128_c(var4 / ((double)this.func_146244_h() * (net.digitalingot.feather.FeatherSourceFile93.ly().yl().td() + 1.0)));
      int var6 = (int)(var4 / 9.0 + (double)this.field_146250_j);
      int var7 = 0;
      List var9 = this.field_146253_i;
      FeatherSourceFile527 var10 = var2.cX();
      if (var10 != null && var3.FY) {
         var9 = this.oe(var10);
      }

      if (var6 < var9.size() && var6 >= 0) {
         int var8 = 0;

         for(List var11 = this.field_146252_h; var8 < var11.size(); ++var8) {
            IChatComponent var12 = ((ChatLine)var11.get(var8)).func_151461_a();
            if (((FeatherSourceFile$lh14)((net.digitalingot.feather.FeatherSourceFile39)FEATHER$CUSTOM_CHAT_PROVIDER.ag()).pr()).Gb) {
               int var13 = MathHelper.func_76128_c((double)((float)this.func_146228_f() - 10.0F) / (double)this.func_146244_h());
               int var14 = GuiUtilRenderComponents.func_178908_a(var12, var13, this.field_146247_f.field_71466_p, false, false).size();
               if (var7 + var14 < var9.size() && ((FeatherSourceFile539)var9.get(var7 + var14 - 1)).feather$getPlayerInfo() != null) {
                  var6 -= var14;
                  var7 += var14;
               } else {
                  int var15 = MathHelper.func_76128_c((double)this.func_146228_f() / (double)this.func_146244_h());
                  int var16 = GuiUtilRenderComponents.func_178908_a(var12, var15, this.field_146247_f.field_71466_p, false, false).size();
                  var6 -= var16;
                  var7 += var16;
               }
            }

            if (var6 < 0) {
               break;
            }
         }
      }

      return var7 - this.field_146250_j;
   }
}
