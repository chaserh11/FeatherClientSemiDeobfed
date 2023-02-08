package net.digitalingot.feather;

import net.minecraft.client.entity.EntityPlayerSP;
import org.jetbrains.annotations.NotNull;

public abstract class FeatherSourceFile85 {
   @NotNull
   protected final @NotNull FeatherSourceFile700 ch;
   @NotNull
   protected final @NotNull FeatherSourceFile849 pv;
   @NotNull
   protected final @NotNull FeatherSourceFile100 xD;
   @NotNull
   private final @NotNull FeatherSourceFile$lh5 xH;

   protected FeatherSourceFile85(@NotNull @NotNull FeatherSourceFile700 var1, @NotNull @NotNull FeatherSourceFile849 var2, @NotNull @NotNull FeatherSourceFile100 var3) {
      this(var1, var3, var2, FeatherSourceFile$lh5.NONE);
   }

   protected FeatherSourceFile85(@NotNull @NotNull FeatherSourceFile700 var1, @NotNull @NotNull FeatherSourceFile100 var2, @NotNull @NotNull FeatherSourceFile849 var3, @NotNull @NotNull FeatherSourceFile$lh5 var4) {
      this.ch = var1;
      this.xD = var2;
      this.pv = var3;
      this.xH = var4;
   }

   public abstract void lh(EntityPlayerSP var1, String[] var2);

   @NotNull
   public @NotNull FeatherSourceFile$lh5 Q() {
      return this.xH;
   }
}
