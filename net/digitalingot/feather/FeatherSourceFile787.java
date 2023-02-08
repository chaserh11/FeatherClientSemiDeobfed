package net.digitalingot.feather;

import java.time.format.DateTimeFormatter;
import net.digitalingot.vendor.com.google.inject.Singleton;

@Singleton
@FeatherSourceFile3(
   jj = FeatherSourceFile243.TIME,
   kl = @FeatherSourceFile414(
   jc = "feather.modulename.time",
   jl = "https://assets.feathercdn.net/game/mods/time.svg",
   od = "feather.moduledescription.time",
   wr = {FeatherSourceFile$lh3.HUD}
)
)
@FeatherSourceFile629(
   jt = {@FeatherSourceFile503(
   al = FeatherSourceFile$lh36.class
)}
)
public class FeatherSourceFile787 extends FeatherSourceFile360 {
   private static final DateTimeFormatter EP = DateTimeFormatter.ofPattern("hh:mm a");
   private static final DateTimeFormatter EQ = DateTimeFormatter.ofPattern("HH:mm");

   // $FF: synthetic method
   static FeatherSourceFile136 lh(FeatherSourceFile787 var0) {
      return var0.fS;
   }

   // $FF: synthetic method
   static DateTimeFormatter cF() {
      return EP;
   }

   // $FF: synthetic method
   static DateTimeFormatter cG() {
      return EQ;
   }

   // $FF: synthetic method
   static FeatherSourceFile136 nc(FeatherSourceFile787 var0) {
      return var0.fS;
   }
}
