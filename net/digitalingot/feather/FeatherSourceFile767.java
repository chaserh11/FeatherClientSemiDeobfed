package net.digitalingot.feather;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import net.digitalingot.vendor.javax.inject.Inject;
import org.jetbrains.annotations.NotNull;

public class FeatherSourceFile767 extends FeatherSourceFile791 {
   private static final Pattern GY = Pattern.compile("(:?(SHOUT|SPECTATOR|TEAM|) )?.+\\\\S{1,16}: .*(?:gg|gf|good game|good fight|good round).*", 2);

   @Inject
   FeatherSourceFile767(@NotNull @NotNull FeatherSourceFile428 var1) {
      super(var1);
   }

   public void ex() {
      FeatherSourceFile645.ws.oe((var1) -> {
         if (!this.uj()) {
            return var1;
         } else {
            Matcher var2 = GY.matcher(var1.func_150260_c());
            return var2.find(0) ? null : var1;
         }
      });
   }

   public boolean dE() {
      return this.dO().Hr;
   }
}
