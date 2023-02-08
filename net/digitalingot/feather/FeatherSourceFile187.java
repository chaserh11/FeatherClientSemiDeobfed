package net.digitalingot.feather;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.gson.JsonObject;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import net.digitalingot.vendor.javax.inject.Inject;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.entity.player.EntityPlayer;
import org.jetbrains.annotations.NotNull;

public class FeatherSourceFile187 extends FeatherSourceFile791 {
   private static final int HS = 20;
   private static final int HT = 100;
   private static final int HU = 500;
   private static final int HV = 100;
   private static final int HW = 5;
   private final Minecraft minecraft;
   private final FeatherSourceFile291 HX;
   private final FeatherSourceFile434 xj;
   private final Map HY = Maps.newHashMap();
   private final List HZ = Lists.newArrayList();
   private final Set Ia = new HashSet();
   private final Map Ib = Collections.synchronizedMap(new LinkedHashMap());
   private int Ic = 0;

   @Inject
   FeatherSourceFile187(@NotNull @NotNull FeatherSourceFile428 var1, Minecraft var2, FeatherSourceFile291 var3, FeatherSourceFile434 var4) {
      super(var1);
      this.minecraft = var2;
      this.HX = var3;
      this.xj = var4;
   }

   public boolean dE() {
      return this.dO().Hv;
   }

   public void ex() {
      FeatherSourceFile34.zw.oe((var1) -> {
         if (this.uj()) {
            if (var1 instanceof EntityPlayer) {
               UUID var2 = var1.func_110124_au();
               if (!this.HY.containsKey(var2)) {
                  FeatherSourceFile81 var3 = new FeatherSourceFile81(var2);
                  this.HY.put(var2, var3);
                  this.HZ.add(var3);
               }

            }
         }
      });
      FeatherSourceFile34.yv.oe((var1) -> {
         if (this.uj()) {
            if (var1 instanceof EntityPlayer) {
               UUID var2 = var1.func_110124_au();
               FeatherSourceFile81 var3 = (FeatherSourceFile81)this.HY.remove(var2);
               if (var3 != null) {
                  this.HZ.remove(var3);
                  this.Ia.remove(var2);
               }
            }
         }
      });
      FeatherSourceFile555.ws.oe((var1, var2) -> {
         if (this.uj()) {
            if (var1 == this.minecraft.field_71439_g) {
               this.HY.clear();
               this.HZ.clear();
               this.Ia.clear();
               this.uq();
            }
         }
      });
      FeatherSourceFile149.oc.oe((var1) -> {
         if (this.uj()) {
            if (var1 == FeatherSourceFile$xj20.END) {
               Iterator var2 = this.HZ.iterator();

               while(var2.hasNext()) {
                  FeatherSourceFile81 var3 = (FeatherSourceFile81)var2.next();
                  if (var3.dR() > 100) {
                     this.Ia.add(var3.dQ());
                     var2.remove();
                  }
               }

               this.Ic = 0;
            }
         }
      });
      FeatherSourceFile159.vi.oe((var1, var2) -> {
         if (this.uj()) {
            boolean var3 = var1.func_70093_af();
            if (!var3) {
               UUID var4 = var1.func_110124_au();
               boolean var5 = false;
               int var7 = var2.mi();
               if (var4 != this.minecraft.field_71439_g.func_110124_au()) {
                  if (!this.Ia.contains(var4)) {
                     return;
                  }
               } else if (!this.dO().Hw) {
                  return;
               }

               FeatherSourceFile127 var6 = (FeatherSourceFile127)this.Ib.get(var4);
               if (var6 == null) {
                  this.si(var4);
               } else if (var6 != FeatherSourceFile127.In) {
                  this.oe(var6.dP(), var7);
                  var2.pq(var7 - 9);
               }
            }
         }
      });
   }

   private void uq() {
      if (this.Ib.size() > 500) {
         Iterator var1 = this.Ib.keySet().iterator();

         for(int var2 = 0; var2 < 500 && var1.hasNext(); ++var2) {
            var1.next();
            var1.remove();
         }
      }

   }

   private void oe(String var1, int var2) {
      FeatherSourceFile$lh113 var3 = this.dO();
      String var4 = var3.Hz ? var3.HA.trim() + " " : "";
      String var5 = var3.HD ? " " + var3.HE.trim() : "";
      String var6 = var4 + var1 + var5;
      int var7 = FeatherSourceFile843.fo(var6);
      FeatherSourceFile843.hO();
      int var8 = var7 / 2;
      FeatherSourceFile443 var9 = FeatherSourceFile443.RM;
      var9.nc(7, DefaultVertexFormats.field_181706_f);
      var9.as((float)(-var8 - 1), (float)var2, 0.0F).qy(0.0F, 0.0F, 0.0F, 0.25F).xZ();
      var9.as((float)(-var8 - 1), (float)(9 + var2), 0.0F).qy(0.0F, 0.0F, 0.0F, 0.25F).xZ();
      var9.as((float)(var8 + 1), (float)(9 + var2), 0.0F).qy(0.0F, 0.0F, 0.0F, 0.25F).xZ();
      var9.as((float)(var8 + 1), (float)var2, 0.0F).qy(0.0F, 0.0F, 0.0F, 0.25F).xZ();
      var9.lx();
      FeatherSourceFile843.hP();
      int var10 = -var7 / 2;
      FeatherSourceFile843.hI();
      FeatherSourceFile843.ck(true);
      FeatherSourceFile841 var11 = FeatherSourceFile841.vK();
      if (var3.Hz) {
         var11.lh(var4, (float)var10, (float)(1 + var2), var3.HB.lm(), false, var3.HB.on());
         var10 += FeatherSourceFile843.fo(var4);
      }

      var11.lh(var1, (float)var10, (float)(1 + var2), var3.Hx.lm(), false, var3.Hx.on());
      var10 += FeatherSourceFile843.fo(var1);
      if (var3.HD) {
         var11.lh(var5, (float)var10, (float)(1 + var2), var3.HF.lm(), false, var3.HF.on());
      }

      FeatherSourceFile843.ck(false);
      FeatherSourceFile843.hJ();
   }

   private void si(UUID var1) {
      if (this.Ic < 5) {
         ++this.Ic;
         this.Ib.put(var1, FeatherSourceFile127.In);
         this.xj.oe(() -> {
            JsonObject var2 = this.HX.ux(var1);
            if (var2 != null) {
               int var3 = var2.get("networkExp").getAsInt();
               int var4 = (int)(Math.sqrt((double)(2 * var3 + 30625)) / 50.0 - 2.5);
               this.Ib.put(var1, new FeatherSourceFile127(String.valueOf(var4)));
            }
         });
      }
   }
}
