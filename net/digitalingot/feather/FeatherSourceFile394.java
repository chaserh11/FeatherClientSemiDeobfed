package net.digitalingot.feather;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import java.util.Iterator;
import java.util.function.Consumer;
import net.digitalingot.vendor.javax.inject.Inject;
import org.jetbrains.annotations.NotNull;

public class FeatherSourceFile394 implements FeatherSourceFile594 {
   @NotNull
   private final @NotNull FeatherSourceFile336 ut;
   @NotNull
   private final @NotNull FeatherSourceFile636 we;
   @NotNull
   private final @NotNull Gson cf;

   @Inject
   FeatherSourceFile394(@NotNull @NotNull FeatherSourceFile336 var1, @NotNull @NotNull FeatherSourceFile636 var2, @FeatherSourceFile$lh10 @NotNull @NotNull Gson var3) {
      this.ut = var1;
      this.we = var2;
      this.cf = var3;
   }

   public void lh(FeatherSourceFile591 var1, Consumer var2, Consumer var3) {
      Iterator var4 = var1.jy().iterator();

      while(var4.hasNext()) {
         String var5 = (String)var4.next();
         FeatherSourceFile165 var6 = this.ut.si(var5);
         if (var6 == null) {
            throw new IllegalArgumentException("Cosmetic with specified slug \"" + var5 + "\" not found");
         }

         JsonElement var7 = var6.pg();
         if (var7 != null) {
            FeatherSourceFile406 var8 = (FeatherSourceFile406)this.cf.fromJson(var6.pg(), FeatherSourceFile406.class);
            this.we.qk().put(var5, var8);
         }
      }

      this.we.bj();
      var2.accept(new FeatherSourceFile12("success"));
   }

   public FeatherSourceFile754 hc() {
      return FeatherSourceFile754.RESET_COSMETICS_SETTINGS;
   }
}
