package net.digitalingot.feather;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.nio.file.Path;
import java.util.Collections;
import java.util.Locale;
import net.digitalingot.vendor.javax.inject.Inject;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import org.apache.commons.io.IOUtils;
import org.jetbrains.annotations.NotNull;

public class FeatherSourceFile43 extends FeatherSourceFile735 {
   private final Minecraft minecraft;
   private final File uO;
   private FeatherSourceFile$oe uP = null;

   @Inject
   FeatherSourceFile43(Minecraft var1, @FeatherSourceFile$lh112 Path var2) {
      super("jfr", Collections.emptyList());
      this.minecraft = var1;
      this.uO = var2.resolve("jfr").toFile();
   }

   public void lh(@NotNull @NotNull String[] var1) {
      EntityPlayerSP var2 = this.minecraft.field_71439_g;
      if (var1.length == 0) {
         FeatherSourceFile198.lh(var2, FeatherSourceFile37.lh("feather.commands.jfr.usage"));
      } else if (FeatherSourceFile$xj1.p() && FeatherSourceFile$nc11.r()) {
         String var3 = var1[0].toLowerCase(Locale.ROOT);
         if (var3.equalsIgnoreCase("start")) {
            this.lh(var2);
         } else if (var3.equalsIgnoreCase("stop")) {
            this.nc(var2);
         } else {
            FeatherSourceFile198.lh(var2, FeatherSourceFile37.lh("feather.commands.jfr.usage"));
         }

      } else {
         FeatherSourceFile198.lh(var2, FeatherSourceFile37.lh("feather.commands.jfr.notAvailable"));
      }
   }

   private void lh(EntityPlayerSP var1) {
      if (this.uP == null) {
         FeatherSourceFile$oe var2;
         String var3;
         try {
            this.uO.mkdir();
            var2 = FeatherSourceFile$oe.nc(l());
            var3 = "recording-" + var2.t() + ".jfr";
            Path var4 = (new File(this.uO, var3)).toPath();
            var2.qy(var4);
            var2.xj();
         } catch (Exception var5) {
            FeatherSourceFile311.Sb.warn("Couldn't start JFR recording", var5);
            FeatherSourceFile198.lh(var1, FeatherSourceFile37.lh("feather.commands.jfr.internalError"));
            return;
         }

         this.uP = var2;
         FeatherSourceFile198.lh(var1, FeatherSourceFile37.lh("feather.commands.jfr.recordingStarted", var3));
      }
   }

   private void nc(EntityPlayerSP var1) {
      if (this.uP != null) {
         this.uP.u();
         this.uP.close();
         this.uP = null;
         FeatherSourceFile198.lh(var1, FeatherSourceFile37.lh("feather.commands.jfr.recordingStopped"));
      }
   }

   private static FeatherSourceFile$lh28 l() {
      FeatherSourceFile$lh28 var0 = null;

      InputStream var1;
      try {
         var1 = FeatherSourceFile43.class.getResourceAsStream("/flightrecorder-config.jfc");
      } catch (Exception var13) {
         var1 = null;
      }

      if (var1 != null) {
         try {
            BufferedReader var2 = new BufferedReader(new InputStreamReader(var1));

            try {
               var0 = FeatherSourceFile$lh28.lh((Reader)var2);
            } catch (Throwable var11) {
               try {
                  var2.close();
               } catch (Throwable var10) {
                  var11.addSuppressed(var10);
               }

               throw var11;
            }

            var2.close();
         } finally {
            IOUtils.closeQuietly(var1);
         }
      }

      if (var0 == null) {
         var0 = FeatherSourceFile$lh28.o();
      }

      return var0;
   }

   private static Constructor lh(Class var0, Class... var1) {
      Constructor var2 = var0.getConstructor(var1);
      var2.setAccessible(true);
      return var2;
   }

   private static Method lh(Class var0, String var1, Class... var2) {
      Method var3 = var0.getDeclaredMethod(var1, var2);
      var3.setAccessible(true);
      return var3;
   }

   // $FF: synthetic method
   static Method nc(Class var0, String var1, Class[] var2) {
      return lh(var0, var1, var2);
   }

   // $FF: synthetic method
   static Constructor nc(Class var0, Class[] var1) {
      return lh(var0, var1);
   }
}
