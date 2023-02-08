package net.digitalingot.feather;

import java.util.ArrayList;
import java.util.List;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Line;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.Mixer;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.TargetDataLine;
import javax.sound.sampled.AudioFormat.Encoding;
import javax.sound.sampled.DataLine.Info;
import net.digitalingot.vendor.javax.inject.Inject;
import net.digitalingot.vendor.javax.inject.Singleton;
import org.jetbrains.annotations.Nullable;

@Singleton
public class FeatherSourceFile698 {
   private static final AudioFormat Lf;
   private static final AudioFormat Lg;
   @Nullable
   private @Nullable String Lh;
   @Nullable
   private @Nullable String Li;

   @Inject
   FeatherSourceFile698() {
   }

   public @Nullable @Nullable void si(@Nullable @Nullable String var1, @Nullable @Nullable String var2) {
      this.Lh = var1 != null && !var1.isEmpty() ? var1 : null;
      this.Li = var2 != null && !var2.isEmpty() ? var2 : null;
   }

   @Nullable
   private @Nullable @Nullable TargetDataLine ez(@Nullable @Nullable String var1) {
      if (var1 != null && !var1.equals("Default")) {
         TargetDataLine var2 = this.om(var1);
         if (var2 != null) {
            return var2;
         }
      }

      return (TargetDataLine)this.pq(TargetDataLine.class);
   }

   @Nullable
   private @Nullable @Nullable SourceDataLine ty(@Nullable @Nullable String var1) {
      if (var1 != null && !var1.equals("Default")) {
         SourceDataLine var2 = this.tz(var1);
         if (var2 != null) {
            return var2;
         }
      }

      return (SourceDataLine)this.pq(SourceDataLine.class);
   }

   @Nullable
   private @Nullable Object pq(Class var1) {
      Info var2 = new Info(var1, (AudioFormat)null);

      try {
         return var1.cast(AudioSystem.getLine(var2));
      } catch (Exception var4) {
         return null;
      }
   }

   @Nullable
   private @Nullable TargetDataLine om(String var1) {
      return (TargetDataLine)this.lh(TargetDataLine.class, var1);
   }

   @Nullable
   private @Nullable SourceDataLine tz(String var1) {
      return (SourceDataLine)this.lh(SourceDataLine.class, var1);
   }

   @Nullable
   private @Nullable Line lh(Class var1, String var2) {
      javax.sound.sampled.Mixer.Info[] var3 = AudioSystem.getMixerInfo();
      javax.sound.sampled.Mixer.Info[] var4 = var3;
      int var5 = var3.length;

      for(int var6 = 0; var6 < var5; ++var6) {
         javax.sound.sampled.Mixer.Info var7 = var4[var6];
         Mixer var8 = AudioSystem.getMixer(var7);
         javax.sound.sampled.Line.Info var9 = new javax.sound.sampled.Line.Info(var1);
         if (var8.isLineSupported(var9) && var7.getName().equals(var2)) {
            Line var10;
            try {
               var10 = var8.getLine(var9);
            } catch (LineUnavailableException var12) {
               continue;
            }

            if (var1.isAssignableFrom(var10.getClass())) {
               return var10;
            }
         }
      }

      return null;
   }

   @Nullable
   public @Nullable TargetDataLine fO() {
      TargetDataLine var1 = this.ez(this.Li);
      if (var1 != null) {
         if (var1.isOpen()) {
            var1.close();
         }

         try {
            var1.open(Lf);
         } catch (LineUnavailableException var3) {
            FeatherSourceFile311.Sb.error("Couldn't access microphone line", var3);
            var1 = null;
         }
      }

      return var1;
   }

   @Nullable
   public @Nullable SourceDataLine fP() {
      SourceDataLine var1 = this.ty(this.Lh);
      if (var1 != null) {
         if (var1.isOpen()) {
            var1.close();
         }

         try {
            var1.open(Lg);
         } catch (LineUnavailableException var3) {
            FeatherSourceFile311.Sb.error("Couldn't access speaker line", var3);
            var1 = null;
         }
      }

      return var1;
   }

   public static List fQ() {
      return as(TargetDataLine.class);
   }

   public static List fR() {
      return as(SourceDataLine.class);
   }

   private static List as(Class var0) {
      ArrayList var1 = new ArrayList();
      javax.sound.sampled.Mixer.Info[] var2 = AudioSystem.getMixerInfo();
      javax.sound.sampled.Mixer.Info[] var3 = var2;
      int var4 = var2.length;

      for(int var5 = 0; var5 < var4; ++var5) {
         javax.sound.sampled.Mixer.Info var6 = var3[var5];
         Mixer var7 = AudioSystem.getMixer(var6);
         javax.sound.sampled.Line.Info var8 = new javax.sound.sampled.Line.Info(var0);
         if (var7.isLineSupported(var8)) {
            var1.add(var6.getName());
         }
      }

      return var1;
   }

   static {
      Lf = new AudioFormat(Encoding.PCM_SIGNED, 24000.0F, 16, 1, 2, 24000.0F, false);
      Lg = new AudioFormat(Encoding.PCM_SIGNED, 24000.0F, 16, 2, 4, 24000.0F, false);
   }
}
