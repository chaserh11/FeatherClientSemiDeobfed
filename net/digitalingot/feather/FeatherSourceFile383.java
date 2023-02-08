package net.digitalingot.feather;

import com.google.common.collect.Lists;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GLAllocation;
import org.cache2k.Cache;
import org.cache2k.Cache2kBuilder;
import org.lwjgl.opengl.GL11;

public class FeatherSourceFile383 {
   private final Cache SY = Cache2kBuilder.of(Integer.class, FeatherSourceFile387.class).entryCapacity(7500L).addListener((var1x, var2) -> {
      this.Tb.add(((FeatherSourceFile387)var2.getValue()).yN());
   }).build();
   private final Cache SZ = Cache2kBuilder.of(String.class, Integer.class).entryCapacity(5000L).loader(this::fo).build();
   public final List Ta = Lists.newArrayList();
   public final Queue Tb = new ConcurrentLinkedQueue();
   private final String SS;
   public int Tc;

   public FeatherSourceFile383(String var1) {
      this.SS = var1;
   }

   public int yS() {
      ++this.Tc;
      return GLAllocation.func_74526_a(1);
   }

   public void ud(int var1) {
      GL11.glNewList(var1, 4865);
   }

   public void lh(int var1, FeatherSourceFile387 var2) {
      GL11.glEndList();
      if (var1 == -1) {
         this.Tb.add(var2.yN());
      } else {
         this.nc(var1, var2);
      }

   }

   public int lh(FeatherSourceFile$lh60 var1) {
      return var1.compute((Integer)this.Tb.poll());
   }

   public void nc(int var1, FeatherSourceFile387 var2) {
      this.SY.put(var1, var2);
   }

   public void uq() {
      this.Tb.clear();
      this.Tb.addAll(this.SY.keys());
      this.SY.clear();
      this.SZ.clear();
      this.Ta.clear();
   }

   public Cache yT() {
      return this.SY;
   }

   public Cache yU() {
      return this.SZ;
   }

   private int fo(String var1) {
      if (var1 == null) {
         return 0;
      } else {
         float var2 = 0.0F;
         boolean var3 = false;

         for(int var4 = 0; var4 < var1.length(); ++var4) {
            char var5 = var1.charAt(var4);
            float var6 = FeatherSourceFile385.qy(var5);
            if (var6 < 0.0F && var4 < var1.length() - 1) {
               ++var4;
               var5 = var1.charAt(var4);
               if (var5 != 'l' && var5 != 'L') {
                  if (var5 == 'r' || var5 == 'R') {
                     var3 = false;
                  }
               } else {
                  var3 = true;
               }

               var6 = 0.0F;
            }

            var2 += var6;
            if (var3 && var6 > 0.0F) {
               var2 += ((net.digitalingot.feather.mixin.client.FeatherSourceFile114)Minecraft.func_71410_x().field_71466_p).isUnicodeFlag() ? 1.0F : FeatherSourceFile385.getOffsetBold();
            }
         }

         return Math.round(var2);
      }
   }

   public float qy(char var1) {
      if (var1 == 167) {
         return -1.0F;
      } else if (var1 != ' ' && var1 != 160) {
         int var2 = this.SS.indexOf(var1);
         net.digitalingot.feather.mixin.client.FeatherSourceFile114 var3 = (net.digitalingot.feather.mixin.client.FeatherSourceFile114)Minecraft.func_71410_x().field_71466_p;
         if (var1 > 0 && var2 != -1 && !var3.isUnicodeFlag()) {
            return FeatherSourceFile385.xl(var2);
         } else {
            byte var4 = var3.getGlyphWidth()[var1];
            if (var4 != 0) {
               int var5 = var4 >>> 4;
               int var6 = var4 & 15;
               if (var6 > 7) {
                  var6 = 15;
                  var5 = 0;
               }

               ++var6;
               return (float)(var6 - var5) / 2.0F + 1.0F;
            } else {
               return 0.0F;
            }
         }
      } else {
         return FeatherSourceFile385.xl(32);
      }
   }
}
