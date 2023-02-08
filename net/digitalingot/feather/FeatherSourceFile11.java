package net.digitalingot.feather;

import java.io.File;
import org.jetbrains.annotations.NotNull;

public class FeatherSourceFile11 {
   @NotNull
   private final @NotNull String name;
   @NotNull
   private final @NotNull File iZ;

   public FeatherSourceFile11(@NotNull @NotNull FeatherSourceFile82 var1, @NotNull @NotNull String var2) {
      if (var2.contains("\u0000")) {
         var2 = "default";
      }

      this.name = var2;
      this.iZ = var1.gz().resolve("profiles/" + var2 + ".json").toFile();
      if (this.iZ.getParentFile().mkdirs()) {
         FeatherSourceFile311.Sb.info("Created profiles directory under " + this.iZ.getAbsolutePath());
      }

   }

   @NotNull
   public @NotNull String getName() {
      return this.name;
   }

   @NotNull
   public @NotNull File gh() {
      return this.iZ;
   }
}
