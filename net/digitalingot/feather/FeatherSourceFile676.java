package net.digitalingot.feather;

import java.util.ArrayList;
import java.util.List;
import net.digitalingot.vendor.javax.inject.Inject;
import net.digitalingot.vendor.javax.inject.Singleton;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Singleton
public class FeatherSourceFile676 {
   @NotNull
   private final @NotNull List MW = new ArrayList();
   @Nullable
   private @Nullable FeatherSourceFile628 MX;

   @Inject
   FeatherSourceFile676() {
   }

   @NotNull
   public @NotNull List hA() {
      return this.MW;
   }

   @Nullable
   public @Nullable FeatherSourceFile628 hB() {
      return this.MX;
   }

   public @Nullable void nc(@Nullable @Nullable FeatherSourceFile628 var1) {
      this.MX = var1;
   }
}
