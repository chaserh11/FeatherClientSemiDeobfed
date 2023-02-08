package net.digitalingot.feather;

import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import org.jetbrains.annotations.NotNull;

class FeatherSourceFile$nc18 {
   @SerializedName("match")
   @NotNull
   private final @NotNull List Rs;
   @SerializedName("disabledMods")
   @NotNull
   private final @NotNull List Rr;

   public FeatherSourceFile$nc18(@NotNull @NotNull List var1, @NotNull @NotNull List var2) {
      this.Rs = var1;
      this.Rr = var2;
   }

   @NotNull
   public @NotNull FeatherSourceFile$lh38 xQ() {
      ArrayList var1 = new ArrayList(this.Rs.size());
      Iterator var2 = this.Rs.iterator();

      while(var2.hasNext()) {
         String var3 = (String)var2.next();
         var1.add(Pattern.compile(var3, 2));
      }

      return new FeatherSourceFile$lh38(var1, this.Rr);
   }
}
