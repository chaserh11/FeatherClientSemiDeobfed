package net.digitalingot.feather;

import com.google.common.collect.Queues;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Iterator;
import net.digitalingot.vendor.javax.inject.Singleton;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.util.ResourceLocation;

@Singleton
public class FeatherSourceFile249 {
   private static final int wN = 5;
   public static final ResourceLocation wO = new ResourceLocation("feather:ui/notification.png");
   public static final FeatherSourceFile528 wP;
   public static final long wQ = 2000L;
   public static final long wR = 250L;
   public static final long wS = 250L;
   private static final int wT = 5;
   private static final int wU = 4;
   private final Deque wV = Queues.newArrayDeque();
   private final ArrayList wW = new ArrayList(5);
   private final FeatherSourceFile445 wX = new FeatherSourceFile445();
   private float m;
   private boolean wY;
   private long wZ = -1L;

   FeatherSourceFile249() {
   }

   public void render() {
      FeatherSourceFile843.hS();
      long var1 = System.currentTimeMillis();
      FeatherSourceFile24 var3;
      if (this.wV.size() != 0 && this.wW.size() < 5) {
         var3 = (FeatherSourceFile24)this.wV.pollFirst();
         var3.lh(var1);
         var3.xj(var1);
         this.wW.add(var3);
      }

      if (this.wW.size() == 0) {
         FeatherSourceFile843.hT();
      } else {
         var3 = (FeatherSourceFile24)this.wW.get(0);
         if (this.wZ == -1L) {
            this.wZ = System.currentTimeMillis();
         }

         long var4 = var1 - this.wZ;
         if (!this.wY && var4 > var3.I()) {
            this.wX.lh(var1, 250L, this.m, (var0) -> {
               return var0;
            }, this.m + (float)var3.zn() + 5.0F);
            this.wX.RL = this::K;
            this.wY = true;
         }

         this.m = this.wX.lh(var1, this.m);
         if (!this.wY) {
            this.m = 0.0F;
         }

         FeatherSourceFile843.qy(0.0F, this.m, 0.0F);
         int var6 = (new ScaledResolution(Minecraft.func_71410_x())).func_78326_a() - var3.zb - 4;
         int var7 = (new ScaledResolution(Minecraft.func_71410_x())).func_78328_b();
         Iterator var8 = this.wW.iterator();

         while(var8.hasNext()) {
            FeatherSourceFile24 var9 = (FeatherSourceFile24)var8.next();
            long var10 = var1 - var9.J();
            var7 -= var9.zn() + 5;
            var9.lh(var6, var7, var1, var10);
         }

         FeatherSourceFile843.hT();
      }
   }

   public void lh(FeatherSourceFile24 var1) {
      this.wV.add(var1);
   }

   private void K() {
      this.wX.RI = null;
      this.wY = false;
      this.wZ = -1L;
      this.wW.remove(0);
   }

   static {
      wP = new FeatherSourceFile528(wO, 110, 104, 54, 54, 56, 50);
   }
}
