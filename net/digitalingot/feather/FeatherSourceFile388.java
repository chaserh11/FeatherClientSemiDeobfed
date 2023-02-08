package net.digitalingot.feather;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import net.digitalingot.vendor.com.google.inject.Singleton;
import net.digitalingot.vendor.javax.inject.Inject;

@Singleton
@FeatherSourceFile3(
   jj = FeatherSourceFile243.TIME_CHANGER,
   kl = @FeatherSourceFile414(
   jc = "feather.modulename.timechanger",
   jl = "https://assets.feathercdn.net/game/mods/timechanger.svg",
   od = "feather.moduledescription.timechanger",
   wr = {}
)
)
public class FeatherSourceFile388 extends FeatherSourceFile495 {
   private static final int JI = 21000;
   private final FeatherSourceFile434 xj;
   private boolean JJ;
   private long JK = 21600L;
   private long JL = 64800L;
   private int JM;

   @Inject
   FeatherSourceFile388(FeatherSourceFile434 var1) {
      this.xj = var1;
   }

   public void ex() {
      if (((FeatherSourceFile$lh48)this.fS).JO) {
         this.xj.oe(this::eG);
      }

   }

   public void pu() {
      this.JM = 21000 - (int)((float)((FeatherSourceFile$lh48)this.fS).JN / 100.0F * 21000.0F);
      if (((FeatherSourceFile$lh48)this.fS).JO && !this.JJ) {
         this.xj.oe(this::eG);
      }

   }

   public void eG() {
      if (!this.JJ) {
         this.JJ = true;

         try {
            FeatherSourceFile621 var1 = FeatherSourceFile621.eD();
            String var2 = FeatherSourceFile815.xz("http://api.sunrise-sunset.org/json?lat=" + var1.eE() + "&lng=" + var1.eF() + "&formatted=0").wR();
            JsonParser var3 = new JsonParser();
            JsonElement var4 = var3.parse(var2);
            JsonObject var5 = var4.getAsJsonObject().get("results").getAsJsonObject();
            Calendar var6 = Calendar.getInstance();
            var6.set(11, 0);
            var6.set(12, 0);
            var6.set(13, 0);
            SimpleDateFormat var7 = new SimpleDateFormat("yyyy-MM-dd'T'hh:mm:ssX");
            Date var8 = var7.parse(var5.get("sunrise").getAsString());
            Date var9 = var7.parse(var5.get("sunset").getAsString());
            this.JK = (long)LocalTime.ofInstant(var8.toInstant(), ZoneId.systemDefault()).toSecondOfDay();
            this.JL = (long)LocalTime.ofInstant(var9.toInstant(), ZoneId.systemDefault()).toSecondOfDay();
         } catch (Exception var10) {
            FeatherSourceFile311.Sb.info("Failed to fetch sunrise & sunset time for TimeChanger", var10);
         }

      }
   }

   public long eH() {
      return ((FeatherSourceFile$lh48)this.fS).JO ? this.eI() : (long)this.JM;
   }

   public long eI() {
      long var1 = (long)LocalTime.now().toSecondOfDay();
      long var3;
      if (var1 < this.JK) {
         var3 = (long)(18000.0 + (double)var1 * (6000.0 / (double)this.JK));
      } else {
         long var5;
         long var7;
         if (var1 < this.JL) {
            var5 = Math.abs(this.JL - this.JK);
            var7 = var1 - this.JK;
            var3 = (long)(0.0 + (double)var7 * (12000.0 / (double)var5));
         } else {
            var5 = TimeUnit.DAYS.toSeconds(1L) - this.JL;
            var7 = var1 - this.JL;
            var3 = (long)(12000.0 + (double)var7 * (6000.0 / (double)var5));
         }
      }

      return var3;
   }
}
