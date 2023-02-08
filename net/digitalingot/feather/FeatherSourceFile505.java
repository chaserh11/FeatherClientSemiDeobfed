package net.digitalingot.feather;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import net.digitalingot.vendor.javax.inject.Inject;
import org.jetbrains.annotations.NotNull;

public class FeatherSourceFile505 extends FeatherSourceFile791 {
   private static final Pattern GZ = Pattern.compile("^.*\\[.+] \\S{1,16} joined the lobby!.*$");

   @Inject
   FeatherSourceFile505(@NotNull @NotNull FeatherSourceFile428 var1) {
      super(var1);
   }

   public void ex() {
      FeatherSourceFile645.ws.oe((var1) -> {
         if (!this.uj()) {
            return var1;
         } else {
            Matcher var2 = GZ.matcher(FeatherSourceFile341.px(var1.func_150260_c()));
            return var2.matches() ? null : var1;
         }
      });
   }

   public boolean dE() {
      return this.dO().Ht;
   }
}
