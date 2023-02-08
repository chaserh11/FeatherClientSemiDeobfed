package net.digitalingot.feather;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import javax.imageio.ImageIO;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.texture.DynamicTexture;
import net.minecraft.util.ResourceLocation;

public class FeatherSourceFile825 {
   private static final Minecraft Qf = Minecraft.func_71410_x();
   private static final List Qg = Lists.newArrayList();

   public static void lh(ResourceLocation var0, String var1) {
      int var2 = 0;
      int var3 = 0;

      try {
         InputStream var4 = Qf.func_110442_L().func_110536_a(var0).func_110527_b();

         try {
            BufferedImage var5 = ImageIO.read(var4);
            var2 = var5.getWidth();
            var3 = var5.getHeight();
         } catch (Throwable var8) {
            if (var4 != null) {
               try {
                  var4.close();
               } catch (Throwable var7) {
                  var8.addSuppressed(var7);
               }
            }

            throw var8;
         }

         if (var4 != null) {
            var4.close();
         }
      } catch (IOException var9) {
      }

      Qg.add(new FeatherSourceFile822(var1, var0, var2, var3));
   }

   public static FeatherSourceFile818 nh(String var0) {
      int var1 = (int)Math.ceil(Math.sqrt((double)Qg.size()));
      BufferedImage var2 = new BufferedImage(Qg.stream().mapToInt(FeatherSourceFile822::rl).limit((long)var1).sum(), Qg.stream().mapToInt(FeatherSourceFile822::fv).limit((long)var1).sum(), 2);
      int var3 = var2.getWidth();
      int var4 = var2.getHeight();
      Graphics var5 = var2.getGraphics();
      HashMap var6 = Maps.newHashMap();
      int var7 = 0;
      int var8 = 0;
      int var9 = 0;
      Iterator var10 = Qg.iterator();

      while(var10.hasNext()) {
         FeatherSourceFile822 var11 = (FeatherSourceFile822)var10.next();

         try {
            InputStream var12 = Qf.func_110442_L().func_110536_a(var11.df()).func_110527_b();

            try {
               if (var7 == var3) {
                  var7 = 0;
                  var8 += var11.fv();
               }

               var5.drawImage(ImageIO.read(var12), var7, var8, (ImageObserver)null);
               var6.put(var11.getName(), new FeatherSourceFile824(1.0F / (float)var3 * (float)var7, 1.0F / (float)var4 * (float)var8, 1.0F / (float)var3 * (float)(var7 + var11.rl()), 1.0F / (float)var4 * (float)(var8 + var11.fv()), var11.rl(), var11.fv()));
               var7 += var11.rl();
               ++var9;
            } catch (Throwable var16) {
               if (var12 != null) {
                  try {
                     var12.close();
                  } catch (Throwable var15) {
                     var16.addSuppressed(var15);
                  }
               }

               throw var16;
            }

            if (var12 != null) {
               var12.close();
            }
         } catch (Exception var17) {
         }
      }

      Qg.clear();
      FeatherSourceFile311.Sb.info("Generated {} atlas with size {}x{}", new Object[]{var0, var3, var4});
      int var18 = (new DynamicTexture(var2)).func_110552_b();
      FeatherSourceFile818 var19 = new FeatherSourceFile818(var6, var3, var4, var18);
      var5.dispose();
      return var19;
   }

   private static void lh(BufferedImage var0, String var1) {
      try {
         ImageIO.write(var0, "png", new File(Minecraft.func_71410_x().field_71412_D, "atlas$" + var1 + ".png"));
      } catch (IOException var3) {
         var3.printStackTrace();
      }

   }
}
