package net.digitalingot.feather;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.mojang.authlib.GameProfile;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.regex.Pattern;
import net.digitalingot.vendor.com.google.inject.Singleton;
import net.digitalingot.vendor.javax.inject.Inject;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.client.network.NetHandlerPlayClient;
import net.minecraft.client.network.NetworkPlayerInfo;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.ChatComponentTranslation;
import net.minecraft.util.IChatComponent;
import net.minecraft.util.ResourceLocation;
import org.jetbrains.annotations.NotNull;

@Singleton
@FeatherSourceFile3(
   jj = FeatherSourceFile243.NICK_HIDER,
   kl = @FeatherSourceFile414(
   jc = "feather.modulename.nickhider",
   jl = "https://assets.feathercdn.net/game/mods/nickhider.svg",
   od = "feather.moduledescription.nickhider",
   wr = {}
)
)
public class FeatherSourceFile410 extends FeatherSourceFile495 {
   private static final int nJ = 2;
   private static final long nK = 5000L;
   private static final int nL = 999999999;
   private static final String nM = "Player-";
   private static final String nN = "You";
   private final Minecraft minecraft;
   private int nO = 0;
   private final Map nP = Maps.newHashMap();
   private final List nQ = Lists.newArrayList();
   private final FeatherSourceFile$oe3 nR = new FeatherSourceFile$oe3(5000L, this::rt);
   private int nS = Integer.MAX_VALUE;
   private GameProfile nT = null;
   private FeatherSourceFile$xj5 nU = null;
   private boolean nV;
   private boolean nW;

   @Inject
   FeatherSourceFile410(Minecraft var1) {
      this.minecraft = var1;
   }

   public void ex() {
      super.ex();
      FeatherSourceFile725.ar.oe((var1, var2) -> {
         if (this.uj()) {
            this.nf();
         }

      });
      FeatherSourceFile725.wi.oe((var1, var2) -> {
         if (this.uj()) {
            this.uq();
         }

      });
      FeatherSourceFile572.uo.oe((var1) -> {
         if (this.uj()) {
            this.lh(var1);
         }

      });
      FeatherSourceFile572.um.oe((var1) -> {
         if (this.uj()) {
            this.qy(var1);
         }

      });
      FeatherSourceFile516.ws.oe(this::jr);
      FeatherSourceFile645.ws.oe((var1) -> {
         if (this.uj()) {
            this.lh(var1);
         }

         return var1;
      });
   }

   public void ml() {
      super.ml();
      this.nf();
      this.yx();
   }

   public void ze() {
      super.ze();
      this.uq();
   }

   public void pu() {
      super.pu();
      this.yx();
      this.nW = ((FeatherSourceFile$nc33)this.fS).oH || ((FeatherSourceFile$nc33)this.fS).oI || ((FeatherSourceFile$nc33)this.fS).oJ;
      this.nV = ((FeatherSourceFile$nc33)this.fS).oD || ((FeatherSourceFile$nc33)this.fS).oE || ((FeatherSourceFile$nc33)this.fS).oF;
   }

   public boolean vg() {
      return this.nU.cv();
   }

   public String vq() {
      return this.nU.vq();
   }

   public ResourceLocation wm() {
      return this.nU.ne();
   }

   public ResourceLocation jd() {
      return this.nU.ix();
   }

   public String sb(String var1) {
      if (!this.rw()) {
         return var1;
      } else {
         return var1 != null && var1.length() >= this.nS ? this.nR.yl(var1) : var1;
      }
   }

   private String jr(String var1) {
      if (!this.rw()) {
         return var1;
      } else if (var1 == null) {
         return null;
      } else {
         Iterator var2 = this.nQ.iterator();

         while(var2.hasNext()) {
            FeatherSourceFile$lh78 var3 = (FeatherSourceFile$lh78)var2.next();
            if (!this.pq(FeatherSourceFile$lh78.lh(var3))) {
               Pattern var4 = gy(FeatherSourceFile$lh78.nc(var3));
               var1 = var4.matcher(var1).replaceAll(FeatherSourceFile$lh78.xj(var3));
            }
         }

         return var1;
      }
   }

   @NotNull
   private @NotNull String rt(String var1) {
      String var2 = var1;

      FeatherSourceFile$lh78 var4;
      for(Iterator var3 = this.nQ.iterator(); var3.hasNext(); var2 = FeatherSourceFile$lh78.oe(var4).matcher(var2).replaceAll(FeatherSourceFile$lh78.nc(var4))) {
         var4 = (FeatherSourceFile$lh78)var3.next();
      }

      return var2;
   }

   private boolean lh(IChatComponent var1) {
      boolean var2 = false;
      if (var1 instanceof ChatComponentText) {
         String var3 = ((ChatComponentText)var1).func_150265_g();
         String var4 = this.sb(var3);
         ((net.digitalingot.feather.mixin.core.FeatherSourceFile1)var1).setText(var4);
      } else if (var1 instanceof ChatComponentTranslation) {
         Object[] var7 = ((ChatComponentTranslation)var1).func_150271_j();

         for(int var9 = 0; var9 < var7.length; ++var9) {
            Object var5 = var7[var9];
            if (var5 != var1) {
               if (var5 instanceof IChatComponent) {
                  var2 |= this.lh((IChatComponent)var5);
               } else if (var5 instanceof String) {
                  String var6 = this.sb((String)var5);
                  if (var6 != null) {
                     var7[var9] = var6;
                     var2 = true;
                  }
               }
            }
         }

         if (var2) {
            ((net.digitalingot.feather.mixin.core.FeatherSourceFile11)var1).setLastUpdate(-1L);
         }
      }

      Iterator var8 = var1.func_150253_a().iterator();

      while(var8.hasNext()) {
         IChatComponent var10 = (IChatComponent)var8.next();
         if (var10 != var1) {
            var2 |= this.lh(var10);
         }
      }

      return var2;
   }

   private void lh(GameProfile var1) {
      boolean var2 = this.nc(var1);
      if (var2) {
         this.nR.lf();
      }

   }

   private boolean nc(GameProfile var1) {
      if (this.pa()) {
         return false;
      } else {
         String var2 = var1.getName();
         if (var2 != null && var2.length() >= 2) {
            UUID var3 = var1.getId();
            boolean var4 = this.pq(var3);
            if (var4) {
               boolean var5 = !var1.getName().equalsIgnoreCase(var2);
               if (var5) {
                  if (!((FeatherSourceFile$nc33)this.fS).oD) {
                     return false;
                  }
               } else if (!((FeatherSourceFile$nc33)this.fS).oE) {
                  return false;
               }
            } else if (!((FeatherSourceFile$nc33)this.fS).oF) {
               return false;
            }

            FeatherSourceFile$lh78 var8 = (FeatherSourceFile$lh78)this.nP.get(var3);
            if (var8 != null) {
               if (FeatherSourceFile$lh78.xj(var8).equals(var2)) {
                  return false;
               }

               this.ou(var3);
            }

            String var9 = var4 ? "You" : "Player-" + this.os();
            FeatherSourceFile$lh78 var6 = new FeatherSourceFile$lh78(var3, var2, var9);
            this.nP.put(var3, var6);
            this.nQ.add(var6);
            int var7 = var2.length();
            if (var7 < this.nS) {
               this.nS = var7;
            }

            return true;
         } else {
            return false;
         }
      }
   }

   private void qy(UUID var1) {
      boolean var2 = this.ou(var1);
      if (var2) {
         this.nR.lf();
      }

   }

   private boolean ou(UUID var1) {
      if (this.pa()) {
         return false;
      } else {
         FeatherSourceFile$lh78 var2 = (FeatherSourceFile$lh78)this.nP.remove(var1);
         if (var2 != null) {
            this.nQ.remove(var2);
            return true;
         } else {
            return false;
         }
      }
   }

   private void vx() {
      NetHandlerPlayClient var1 = this.cz();
      if (var1 != null) {
         boolean var2 = false;

         NetworkPlayerInfo var4;
         for(Iterator var3 = var1.func_175106_d().iterator(); var3.hasNext(); var2 |= this.nc(var4.func_178845_a())) {
            var4 = (NetworkPlayerInfo)var3.next();
         }

         if (var2) {
            this.nR.lf();
         }
      }

   }

   private int os() {
      int var1 = this.nO++;
      if (this.nO > 999999999) {
         this.nO = 0;
      }

      return var1;
   }

   private void nf() {
      this.nT = this.minecraft.func_110432_I().func_148256_e();
      this.nU = new FeatherSourceFile$xj5(this.nT);
   }

   private void uq() {
      this.nO = 0;
      this.nP.clear();
      this.nQ.clear();
      this.nR.lf();
      this.nS = Integer.MAX_VALUE;
   }

   private void yx() {
      this.uq();
      this.vx();
   }

   private boolean rw() {
      if (!this.uj()) {
         return false;
      } else if (this.pa()) {
         return false;
      } else {
         return !this.nQ.isEmpty();
      }
   }

   private boolean pa() {
      return !this.nV;
   }

   public boolean hd() {
      return !this.nW;
   }

   public boolean nb(String var1) {
      return this.nT.getName().equalsIgnoreCase(var1);
   }

   private boolean pq(UUID var1) {
      return var1.equals(this.nT.getId());
   }

   private NetHandlerPlayClient cz() {
      EntityPlayerSP var1 = this.minecraft.field_71439_g;
      return var1 == null ? null : var1.field_71174_a;
   }

   private static Pattern gy(String var0) {
      return Pattern.compile(var0, 18);
   }

   // $FF: synthetic method
   static Pattern bh(String var0) {
      return gy(var0);
   }
}
