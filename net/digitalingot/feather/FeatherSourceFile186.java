package net.digitalingot.feather;

import net.digitalingot.vendor.com.google.inject.Singleton;

@Singleton
@FeatherSourceFile3(
   jj = FeatherSourceFile243.WEATHER_CHANGER,
   kl = @FeatherSourceFile414(
   jc = "feather.modulename.weatherchanger",
   jl = "https://assets.feathercdn.net/game/mods/weatherchanger.svg",
   od = "feather.moduledescription.weatherchanger",
   wr = {}
)
)
public class FeatherSourceFile186 extends FeatherSourceFile495 {
   public boolean tf() {
      return ((FeatherSourceFile$lh35)this.pr()).qL == FeatherSourceFile$lh$lh3.DEFAULT;
   }

   public boolean na() {
      return ((FeatherSourceFile$lh35)this.pr()).qL == FeatherSourceFile$lh$lh3.RAIN;
   }

   public boolean wu() {
      return ((FeatherSourceFile$lh35)this.pr()).qL == FeatherSourceFile$lh$lh3.THUNDER;
   }

   public boolean cs() {
      return this.na() || this.wu();
   }
}
