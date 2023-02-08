package net.digitalingot.feather;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import net.digitalingot.vendor.javax.inject.Inject;
import net.minecraft.client.Minecraft;
import org.jetbrains.annotations.NotNull;

public class FeatherSourceFile496 extends FeatherSourceFile791 {
   private static final Pattern Ha = Pattern.compile("§m----------------------------------------------------Friend request from (?:\\[.+] )?(?<name>[a-zA-Z0-9_]{1,16})\\[ACCEPT] - \\[DENY] - \\[IGNORE].*");
   private static final Pattern Hb = Pattern.compile("You are now friends with \\[?[a-zA-Z0-9_]{1,16}(:?] )?");
   private static final Pattern Hc = Pattern.compile("\\[?[a-zA-Z0-9_]{1,16}(:?] )? removed you from their friends list!");
   private final Minecraft minecraft;

   @Inject
   FeatherSourceFile496(@NotNull @NotNull FeatherSourceFile428 var1, Minecraft var2) {
      super(var1);
      this.minecraft = var2;
   }

   public boolean dE() {
      return this.dO().Hi;
   }

   public void ex() {
      FeatherSourceFile645.ws.oe((var1) -> {
         if (!this.uj()) {
            return var1;
         } else {
            String var2 = var1.func_150260_c().replace("\n", "");
            Matcher var3 = Ha.matcher(var2);
            if (var3.matches()) {
               String var4 = var3.group("name");
               FeatherSourceFile709.lh("/friend accept " + var4);
               if (!this.dO().Hj) {
                  return null;
               }
            }

            return this.dO().Hj || !var2.equals("-----------------------------------------------------") && !Hb.matcher(var2).matches() && !Hc.matcher(var2).matches() ? var1 : null;
         }
      });
   }
}
