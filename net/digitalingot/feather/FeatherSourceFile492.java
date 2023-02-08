package net.digitalingot.feather;

import java.util.List;
import java.util.Objects;
import java.util.UUID;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import net.digitalingot.vendor.javax.inject.Inject;
import net.minecraft.client.Minecraft;
import org.jetbrains.annotations.NotNull;

public class FeatherSourceFile492 implements FeatherSourceFile594 {
   @NotNull
   private final @NotNull Minecraft minecraft;
   @NotNull
   private final @NotNull FeatherSourceFile336 ut;
   @NotNull
   private final @NotNull FeatherSourceFile636 we;
   @NotNull
   private final @NotNull FeatherSourceFile849 pv;

   @Inject
   FeatherSourceFile492(@NotNull @NotNull Minecraft var1, @NotNull @NotNull FeatherSourceFile336 var2, @NotNull @NotNull FeatherSourceFile636 var3, @NotNull @NotNull FeatherSourceFile849 var4) {
      this.minecraft = var1;
      this.ut = var2;
      this.we = var3;
      this.pv = var4;
   }

   public void lh(FeatherSourceFile513 var1, Consumer var2, Consumer var3) {
      FeatherSourceFile$lh72 var4 = var1.sr();
      if (var4 != null) {
         this.we.lh(var4.getSlug(), var4.fj());
      }

      FeatherSourceFile$nc28 var5 = var1.bi();
      if (var5 != null) {
         Stream var10000 = var5.values().stream().filter(Objects::nonNull);
         FeatherSourceFile336 var10001 = this.ut;
         Objects.requireNonNull(var10001);
         List var6 = (List)var10000.map(var10001::si).collect(Collectors.toList());
         UUID var7 = this.minecraft.func_110432_I().func_148256_e().getId();
         this.ut.qp().put(var7, var6);
         this.pv.iU().lt(var6);
      }

      var2.accept(new FeatherSourceFile12("success"));
   }

   public FeatherSourceFile754 hc() {
      return FeatherSourceFile754.UPDATE_COSMETICS;
   }
}
