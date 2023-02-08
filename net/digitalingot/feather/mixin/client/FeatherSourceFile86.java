package net.digitalingot.feather.mixin.client;

import net.digitalingot.feather.FeatherSourceFile$lh52;
import net.digitalingot.feather.FeatherSourceFile465;
import net.digitalingot.feather.FeatherSourceFile665;
import net.digitalingot.feather.FeatherSourceFile804;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;

@Mixin({Entity.class})
public class FeatherSourceFile86 implements FeatherSourceFile804 {
   @Unique
   private static final FeatherSourceFile465 PERFORMANCE = FeatherSourceFile665.nc(net.digitalingot.feather.FeatherSourceFile125.class);
   @Unique
   private boolean WW = false;
   @Unique
   private long WX = 0L;

   public boolean isCulled() {
      return ((FeatherSourceFile$lh52)((net.digitalingot.feather.FeatherSourceFile125)PERFORMANCE.ag()).pr()).pA && this.WW && Minecraft.func_71410_x().field_71474_y.field_74320_O == 0;
   }

   public boolean forceVisible() {
      return this.WX > System.currentTimeMillis();
   }

   public void setCulled(boolean var1) {
      this.WW = var1;
      if (!var1) {
         this.WX = System.currentTimeMillis() + 1000L;
      }

   }
}
