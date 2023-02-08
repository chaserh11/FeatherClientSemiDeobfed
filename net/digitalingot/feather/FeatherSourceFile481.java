package net.digitalingot.feather;

import java.text.DecimalFormat;
import net.digitalingot.vendor.com.google.inject.Singleton;
import net.digitalingot.vendor.javax.inject.Inject;
import net.minecraft.client.Minecraft;

@Singleton
@FeatherSourceFile3(
   jj = FeatherSourceFile243.STOPWATCH,
   kl = @FeatherSourceFile414(
   jc = "feather.modulename.stopwatch",
   jl = "https://assets.feathercdn.net/game/mods/stopwatch.svg",
   od = "feather.moduledescription.stopwatch",
   wr = {FeatherSourceFile$lh3.HUD}
)
)
@FeatherSourceFile629(
   jt = {@FeatherSourceFile503(
   al = FeatherSourceFile$lh64.class
)}
)
public class FeatherSourceFile481 extends FeatherSourceFile360 {
   private final FeatherSourceFile55 kQ;
   private final Minecraft minecraft;
   private final DecimalFormat Ab = new DecimalFormat("00");
   private String EI = "00 : 00";
   private int EJ = 0;
   private FeatherSourceFile$xj4 EK;

   @Inject
   FeatherSourceFile481(Minecraft var1, FeatherSourceFile55 var2) {
      this.EK = FeatherSourceFile$xj4.READY;
      this.minecraft = var1;
      this.kQ = var2;
   }

   private String td(int var1) {
      int var2 = var1 % 60;
      int var3 = var1 % 3600 / 60;
      int var4 = var1 / 3600;
      return var1 > 3600 ? this.Ab.format((long)var4) + " : " + this.Ab.format((long)var3) + " : " + this.Ab.format((long)var2) : this.Ab.format((long)var3) + " : " + this.Ab.format((long)var2);
   }

   public void ex() {
      FeatherSourceFile149.oc.oe((var1) -> {
         if (var1 == FeatherSourceFile$xj20.END && this.minecraft.field_71439_g != null && this.uj() && this.EK == FeatherSourceFile$xj4.RUNNING) {
            if (this.EJ % 20 == 0) {
               int var2 = this.EJ / 20;
               this.EI = this.td(var2);
            }

            ++this.EJ;
         }
      });
      this.kQ.lh(() -> {
         return ((FeatherSourceFile$nc25)this.fS).EN;
      }, () -> {
         if (this.uj()) {
            if (this.minecraft.field_71439_g != null) {
               if (this.EK != FeatherSourceFile$xj4.READY && this.EK != FeatherSourceFile$xj4.PAUSED) {
                  this.EK = FeatherSourceFile$xj4.READY;
               } else {
                  this.EK = FeatherSourceFile$xj4.RUNNING;
               }

            }
         }
      });
      this.kQ.lh(() -> {
         return ((FeatherSourceFile$nc25)this.fS).EO;
      }, () -> {
         if (this.uj()) {
            if (this.minecraft.field_71439_g != null) {
               if (this.EK == FeatherSourceFile$xj4.RUNNING) {
                  this.EK = FeatherSourceFile$xj4.PAUSED;
               } else if (this.EK == FeatherSourceFile$xj4.PAUSED) {
                  this.EK = FeatherSourceFile$xj4.RUNNING;
               }

            }
         }
      });
      FeatherSourceFile357.ws.oe((var1, var2, var3) -> {
         if (this.uj()) {
            this.cC();
         }
      });
   }

   public void ml() {
      this.cC();
   }

   public void ze() {
      this.cC();
   }

   private void cC() {
      this.EJ = 0;
      this.EK = FeatherSourceFile$xj4.READY;
      this.EI = "00 : 00";
   }

   // $FF: synthetic method
   static String lh(FeatherSourceFile481 var0) {
      return var0.EI;
   }

   // $FF: synthetic method
   static FeatherSourceFile136 nc(FeatherSourceFile481 var0) {
      return var0.fS;
   }
}
