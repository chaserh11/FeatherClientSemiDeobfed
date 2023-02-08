package net.digitalingot.feather;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.FloatControl;
import javax.sound.sampled.FloatControl.Type;
import net.digitalingot.vendor.javax.inject.Inject;
import net.minecraft.client.Minecraft;
import org.jetbrains.annotations.NotNull;

public class FeatherSourceFile13 extends FeatherSourceFile791 {
   private static final File HK;
   public static List HL;
   private final Minecraft minecraft;
   private final FeatherSourceFile207 hf;
   private Clip HM;
   private String HN;
   private Pattern HO;
   private Pattern HP;

   @Inject
   FeatherSourceFile13(@NotNull @NotNull FeatherSourceFile428 var1, Minecraft var2, FeatherSourceFile207 var3, String var4) {
      super(var1);
      this.minecraft = var2;
      this.hf = var3;
      this.HN = var4;
   }

   public boolean dE() {
      return this.dO().HH;
   }

   public void ex() {
      this.dL();
      FeatherSourceFile645.ws.oe((var1) -> {
         if (!this.uj()) {
            return var1;
         } else {
            if (!this.minecraft.func_110432_I().func_111285_a().equals(this.HN)) {
               this.dL();
            }

            String var2 = var1.func_150260_c();
            Matcher var3 = this.HO.matcher(var2);
            String[] var4 = var2.split(" ");
            Matcher var5 = this.HP.matcher(var4.length > 0 ? var4[0] : var2.trim());
            if (var5.matches() && var3.find()) {
               String var6 = var3.group(1);
               if (!var6.equals(this.HN)) {
                  this.dN();
               }
            }

            return var1;
         }
      });
      FeatherSourceFile524.ws.oe((var1) -> {
         if (this.dE()) {
            boolean var2 = var1.stream().anyMatch((var0) -> {
               return "MODS".equals(var0.name());
            });
            if (var2 && this.dK()) {
               this.hf.fy();
            }

         }
      });
      this.dJ();
   }

   private void dJ() {
      this.dM();
      if (this.HM != null) {
         this.HM.close();
      }

      try {
         AudioInputStream var1 = AudioSystem.getAudioInputStream(new File(HK, this.dO().HI));

         try {
            this.HM = AudioSystem.getClip();
            this.HM.open(var1);
            FloatControl var2 = (FloatControl)this.HM.getControl(Type.MASTER_GAIN);
            var2.setValue((float)this.dO().HJ - 30.0F);
         } catch (Throwable var5) {
            if (var1 != null) {
               try {
                  var1.close();
               } catch (Throwable var4) {
                  var5.addSuppressed(var4);
               }
            }

            throw var5;
         }

         if (var1 != null) {
            var1.close();
         }
      } catch (Exception var6) {
         this.HM = null;
         var6.printStackTrace();
      }

   }

   public void pu() {
      this.dJ();
   }

   @NotNull
   public static @NotNull List dI() {
      String[] var0 = HK.list();
      if (var0 == null) {
         return new ArrayList(Collections.singletonList("oof.wav"));
      } else {
         List var1 = (List)Arrays.stream(var0).filter((var0x) -> {
            return var0x.endsWith(".wav");
         }).collect(Collectors.toList());
         if (!var1.contains("oof.wav")) {
            var1.add("oof.wav");
         }

         return var1;
      }
   }

   private boolean dK() {
      return !(new HashSet(dI())).equals(new HashSet(HL));
   }

   private void dL() {
      this.HN = this.minecraft.func_110432_I().func_111285_a();
      String var1 = "(\\w{1,16}).+ (by|of|to|for|with) (" + this.HN + ")";
      String var2 = "^[a-zA-Z0-9_-]{3,16}$";
      this.HO = Pattern.compile(var1);
      this.HP = Pattern.compile("^[a-zA-Z0-9_-]{3,16}$");
   }

   private void dM() {
      File var1 = new File(HK, "oof.wav");
      if (!var1.exists()) {
         HK.mkdirs();
         FeatherSourceFile815.hm("/assets/feather/sounds/oof.wav").lh(FeatherSourceFile815.ux(var1).wU());
      }

   }

   private void dN() {
      if (this.HM != null) {
         this.HM.setFramePosition(0);
         this.HM.start();
      }

   }

   static {
      HK = new File(Minecraft.func_71410_x().field_71412_D, "feather/misc/oofmod");
   }
}
