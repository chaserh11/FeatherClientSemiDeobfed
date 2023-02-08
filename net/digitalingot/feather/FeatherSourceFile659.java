package net.digitalingot.feather;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Objects;
import javax.imageio.ImageIO;
import net.digitalingot.vendor.com.google.inject.Singleton;
import net.digitalingot.vendor.javax.inject.Inject;
import net.minecraft.util.ResourceLocation;
import org.apache.logging.log4j.Level;

@Singleton
@FeatherSourceFile3(
   jj = FeatherSourceFile243.SCREENSHOT,
   kl = @FeatherSourceFile414(
   jc = "feather.modulename.screenshot",
   jl = "https://assets.feathercdn.net/game/mods/screenshot.svg",
   od = "feather.moduledescription.screenshot",
   wr = {}
)
)
public class FeatherSourceFile659 extends FeatherSourceFile495 {
   private final FeatherSourceFile644 IP;
   private final FeatherSourceFile$nc41 IQ;
   private static final ResourceLocation IR = FeatherSourceFile420.gk("last_screenshot");
   private static final int IS = 24;
   private static final int IT = 4;

   @Inject
   FeatherSourceFile659(FeatherSourceFile644 var1, FeatherSourceFile420 var2) {
      this.IP = var1;
      this.IQ = new FeatherSourceFile$nc41(this, var2);
   }

   public void ex() {
      FeatherSourceFile519 var10000 = FeatherSourceFile653.ws;
      FeatherSourceFile644 var10001 = this.IP;
      Objects.requireNonNull(var10001);
      var10000.oe(var10001::lh);
      FeatherSourceFile618.je.oe((var1, var2) -> {
         if (!this.uj()) {
            return var2;
         } else {
            try {
               var1 = var1.getCanonicalFile();
            } catch (IOException var4) {
               throw new IllegalStateException(var4);
            }

            var1 = this.qy(var1);
            this.IQ.ou(var1);
            return FeatherSourceFile191.lh(var1, (FeatherSourceFile$lh99)this.fS);
         }
      });
      FeatherSourceFile564.ym.oe((var1) -> {
         if (((FeatherSourceFile$lh99)this.fS).IX) {
            this.IQ.render();
         }

      });
   }

   public File qy(File var1) {
      if (!((FeatherSourceFile$lh99)this.fS).Ji) {
         return var1;
      } else {
         try {
            FileInputStream var2 = new FileInputStream(var1);
            BufferedImage var3 = ImageIO.read(var2);
            BufferedImage var4 = new BufferedImage(var3.getWidth(), var3.getHeight(), 1);
            var4.createGraphics().drawImage(var3, 0, 0, Color.WHITE, (ImageObserver)null);
            var2.close();
            File var5 = new File(var1.getParentFile(), var1.getName().replaceFirst("png$", "jpeg"));
            var5.createNewFile();
            var1.delete();
            if (!ImageIO.write(var4, "JPEG", var5)) {
               FeatherSourceFile311.Sb.log(Level.WARN, "NO WRITER!");
            }

            return var5;
         } catch (IOException var6) {
            FeatherSourceFile311.Sb.log(Level.WARN, "IO Exception trying to compress screenshot! - \n" + var6.getMessage());
            return var1;
         }
      }
   }

   // $FF: synthetic method
   static ResourceLocation dW() {
      return IR;
   }

   // $FF: synthetic method
   static FeatherSourceFile136 lh(FeatherSourceFile659 var0) {
      return var0.fS;
   }

   // $FF: synthetic method
   static FeatherSourceFile136 nc(FeatherSourceFile659 var0) {
      return var0.fS;
   }

   // $FF: synthetic method
   static FeatherSourceFile136 xj(FeatherSourceFile659 var0) {
      return var0.fS;
   }

   // $FF: synthetic method
   static FeatherSourceFile136 oe(FeatherSourceFile659 var0) {
      return var0.fS;
   }

   // $FF: synthetic method
   static FeatherSourceFile136 qy(FeatherSourceFile659 var0) {
      return var0.fS;
   }

   // $FF: synthetic method
   static FeatherSourceFile136 ou(FeatherSourceFile659 var0) {
      return var0.fS;
   }

   // $FF: synthetic method
   static FeatherSourceFile136 pq(FeatherSourceFile659 var0) {
      return var0.fS;
   }

   // $FF: synthetic method
   static FeatherSourceFile136 as(FeatherSourceFile659 var0) {
      return var0.fS;
   }

   // $FF: synthetic method
   static FeatherSourceFile136 km(FeatherSourceFile659 var0) {
      return var0.fS;
   }

   // $FF: synthetic method
   static FeatherSourceFile136 mq(FeatherSourceFile659 var0) {
      return var0.fS;
   }

   // $FF: synthetic method
   static FeatherSourceFile136 mr(FeatherSourceFile659 var0) {
      return var0.fS;
   }

   // $FF: synthetic method
   static FeatherSourceFile136 ux(FeatherSourceFile659 var0) {
      return var0.fS;
   }

   // $FF: synthetic method
   static FeatherSourceFile136 si(FeatherSourceFile659 var0) {
      return var0.fS;
   }

   // $FF: synthetic method
   static FeatherSourceFile136 wz(FeatherSourceFile659 var0) {
      return var0.fS;
   }
}
