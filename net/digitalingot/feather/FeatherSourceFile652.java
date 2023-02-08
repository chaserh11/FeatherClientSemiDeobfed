package net.digitalingot.feather;

import net.digitalingot.vendor.javax.inject.Inject;
import net.digitalingot.vendor.javax.inject.Provider;
import net.minecraft.client.Minecraft;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class FeatherSourceFile652 {
   private static final long Kp = 100L;
   private final Minecraft minecraft;
   @NotNull
   private final @NotNull Provider Kq;
   private long Kr = -1L;

   @Inject
   FeatherSourceFile652(Minecraft var1, @NotNull @NotNull Provider var2) {
      this.minecraft = var1;
      this.Kq = var2;
   }

   @Nullable
   public @Nullable FeatherSourceFile$nc lh(byte[] var1) {
      if (((FeatherSourceFile$nc8)((FeatherSourceFile121)this.Kq.get()).pr()).Kg == FeatherSourceFile$nc$nc.OFF) {
         return null;
      } else if (!this.minecraft.field_71415_G) {
         return null;
      } else if (!this.nc(var1)) {
         return null;
      } else {
         switch (((FeatherSourceFile$nc8)((FeatherSourceFile121)this.Kq.get()).pr()).Kg) {
            case PROXIMITY:
               return FeatherSourceFile$nc.PROXIMITY;
            case PARTY:
               return FeatherSourceFile$nc.PARTY;
            default:
               return null;
         }
      }
   }

   private boolean nc(byte[] var1) {
      long var2 = System.currentTimeMillis();
      double var4 = FeatherSourceFile651.oe(var1);
      if (var4 > ((FeatherSourceFile$nc8)((FeatherSourceFile121)this.Kq.get()).pr()).Kh) {
         this.Kr = var2;
         return true;
      } else {
         return var2 - this.Kr < 100L;
      }
   }
}
